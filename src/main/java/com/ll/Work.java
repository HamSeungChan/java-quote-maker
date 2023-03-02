package com.ll;

import com.ll.domain.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Work {

    private static final int ID_INIT = 1;

    private List<WiseSaying> wiseSayings;
    private int id = ID_INIT;

    Work() {
        wiseSayings = new ArrayList<>();
    }

    public void register(String content, String authorName) {
        wiseSayings.add(new WiseSaying(id, content, authorName));
        id++;
    }

    public List<String> showList(){
        return wiseSayings
                .stream()
                .map(e -> e.getId()+" / "+e.getContent()+" / "+e.getAuthorName())
                .collect(Collectors.toList());
    }

    public int getWiseSayingSize(){
        return wiseSayings.size();
    }

    public boolean deleteWiseSaying(int id) {
        for(int i=0;i<wiseSayings.size();i++){
            if(isSameId(wiseSayings.get(i),id)){
                wiseSayings.remove(i);
                return true;
            }
        }
        return false;
    }

    private boolean isSameId(WiseSaying wiseSaying, int id){
        return wiseSaying.getId() == id;
    }
}
