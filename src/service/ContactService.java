package service;

import Repository.ContactRepository;
import state.ContactState;
import vo.Contact;

import java.util.Map;

public class ContactService {
 private final ContactRepository repository;
private final ContactState state;

    public ContactService(ContactRepository repository, ContactState state) {
        this.repository = repository;
        this.state = state;
    }

    public void insert(String name, int age, String phone){
    System.out.println("[ContactService.insert()]");
}
// Contact 를 받은 데이터를 갖고 만듬
    Long id = state.getNextId();
    Contact contact = new Contact(id, name, age, phone);

    // repository.ContactRepository.save() 를 호출해서
    // store 저장
    repository.save(id,contact);
    // 출력

    Map<Long, Contact> currStore = state.getStore();
    for(Long key : currStore.keySet()){
        System.out.println(currStore.get(key));
    }
}
