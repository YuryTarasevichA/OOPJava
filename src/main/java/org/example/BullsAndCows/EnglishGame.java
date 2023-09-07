package org.example.BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public class EnglishGame extends AbstractGame{

    /**
     * @return
     */
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add(String.valueOf((char)i));
        }
        return list;
    }
}
