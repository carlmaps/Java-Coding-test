package com.coding.test.service;

import com.coding.test.model.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DogService {

//    @Autowired
//    private DogRepository dogRepository;

    public Dog getAll(){
        Dog dog = new Dog();
        dog.setWolfhound(new ArrayList<String>(Arrays.asList("irish")));
        dog.setWaterdog(new ArrayList<String>(Arrays.asList("spanish")));
        dog.setTerrier(new ArrayList<String>(Arrays.asList("american", "australian", "bedlington", "border",
                                                            "dandie", "fox", "irish", "kerryblue", "lakeland","norfolk",
                                                            "norwich", "patterdale", "russell", "scottish", "sealyham", "silky",
                                                            "tibetan", "toy", "westhighland", "wheaten", "yorkshire")));
        dog.setSpringer(new ArrayList<String>(Arrays.asList("english")));
        dog.setSpaniel(new ArrayList<String>(Arrays.asList("blenheim", "brittany", "cocker", "irish", "japanese", "sussex", "welsh")));
        dog.setSheepdog(new ArrayList<String>(Arrays.asList("english", "shetland")));
        dog.setSetter(new ArrayList<String>(Arrays.asList("english", "gordon", "irish")));
        dog.setSchnauzer(new ArrayList<String>(Arrays.asList("giant", "miniature")));
        dog.setRidgeback(new ArrayList<String>(Arrays.asList("giant", "rhodesian")));
        dog.setRetriever(new ArrayList<String>(Arrays.asList("chesapeake", "curly", "flatcoated", "golden")));
        dog.setPoodle(new ArrayList<String>(Arrays.asList("miniature", "standard", "toy")));
        dog.setPointer(new ArrayList<String>(Arrays.asList("german", "germanlonghair")));
        dog.setPinscher(new ArrayList<String>(Arrays.asList("miniature")));
        dog.setDeerhound(new ArrayList<String>(Arrays.asList("scottish")));
        dog.setDane(new ArrayList<String>(Arrays.asList("great")));
        dog.setCorgi(new ArrayList<String>(Arrays.asList("cardigan")));
        dog.setCollie(new ArrayList<String>(Arrays.asList("border")));
        dog.setCattledog(new ArrayList<String>(Arrays.asList("australian")));
        dog.setCattledog(new ArrayList<String>(Arrays.asList("australian")));
        dog.setBullterrier(new ArrayList<String>(Arrays.asList("staffordshire")));
        dog.setAustralian(new ArrayList<String>(Arrays.asList("shepherd")));
        dog.setBuhund(new ArrayList<String>(Arrays.asList("norwegian")));
        dog.setAustralian(new ArrayList<String>(Arrays.asList("shepherd")));
        dog.setBulldog(new ArrayList<String>(Arrays.asList("boston", "english", "french")));
        dog.setElkhound(new ArrayList<String>(Arrays.asList("norwegian")));
        dog.setFinnish(new ArrayList<String>(Arrays.asList("lapphund")));
        dog.setFrise(new ArrayList<String>(Arrays.asList("bichon")));
        dog.setGreyhound(new ArrayList<String>(Arrays.asList("italian")));
        dog.setHound(new ArrayList<String>(Arrays.asList("afghan","basset","blood","english","ibizan", "plott","walker")));
        dog.setFrise(new ArrayList<String>(Arrays.asList("bichon")));
        dog.setMastiff(new ArrayList<String>(Arrays.asList("bull","english","tibetan")));
        dog.setMountain(new ArrayList<String>(Arrays.asList("bernese", "swiss")));
        dog.setOvcharka(new ArrayList<String>(Arrays.asList("caucasian")));

        return dog;
    }



}
