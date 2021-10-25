package com.capgemini.sga.next.hidalgo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ReaderServiceImpl implements ReaderService {


    @Override
    public void readBook() {
        printSentence();
    }

    @Override
    public void printSentence() {
        printFirstSentenceSalvador();
        printSecondSentenceSalvador();
    }

    private void printFirstSentenceSalvador(){
        log.info(Sentences.SENTENCE_2);
    }

    private void printSecondSentenceSalvador(){
        log.info(Sentences.SENTENCE_6);
    }

}
