package state;

import vo.Contact;

import java.util.HashMap;
import java.util.Map;

// 연락처를 저장할 Map 저장 공간과 id 자동증가 할 변수
public class ContactState {
    // 연락처를 저장할 Map
    Map<Long, Contact> store = new HashMap<>();

        // id 자동증가시킬 변수
        private  Long nextId = 1L;

        // Getter
        public Map<Long, Contact> getStore(){
            return store;
        }
        public Long getNextId(){
            return nextId;
    }
        // Setter
        public void setStore(Map<Long,Contact> store){
            this.store = store;
        }
        public void increaseId(){
            nextId ++;
        }
}
