package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChessBoardTest {

    @Test
    public void wayIs() {
        assertThat(ChessBoard.way(1, 4, 4, 7), is(3));
        assertThat(ChessBoard.way(1, 4, 0, 4), is(0));      //wrong step
        assertThat(ChessBoard.way(2, 7, 6, 3), is(4));

    }
}