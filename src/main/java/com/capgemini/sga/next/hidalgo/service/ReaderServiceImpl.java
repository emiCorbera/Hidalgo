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
        /*
        TODO
         Create so many methods as needed with the pattern 'printORDINAL-NUMER_YOUR-NAME()',
         ex. printFirstSentenceEmiliano(), printSecondSentenceEmiliano()

        printFirstSentenceEmiliano();
        printSecondSentenceEmiliano()

        private void printFirstSentenceEmiliano(){
            log.info(Sentences.SENTENCE_1);
        }

        private void printSecondSentenceEmiliano(){
            log.info(Sentences.SENTENCE_5);
        }

         */
    }

}
