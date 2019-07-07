package edu.western.cs.matchinggame;

import android.content.res.Resources;
import android.util.Log;

import java.util.ArrayList;

import edu.western.cs.matchinggame.Model.Animal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by diana on 3/27/2018.
 */

public class CatData {

    public static final ArrayList<Animal> mCatList = new ArrayList<>();

//    public static Animal random(){
//        Random r = new Random();
//        return mCatList.get(r.nextInt(mCatList.size()));
//    }
    public static Animal random(){
        Random r = new Random();
        return data2.get(r.nextInt(data2.size()));
    }
    public static List<Animal> pickTwoRandom() {
        List<Animal> copy = new LinkedList<Animal>(data2);
        for(int i=0; i<data2.size(); i++){
        }
        Collections.shuffle(copy);
        return copy.subList(0, 2);
    }
    public static final ArrayList<Animal> data2 = buildData();
//    public static final ArrayList<Animal> data2 = new ArrayList<>();

    private static ArrayList<Animal> buildData(){
        ArrayList<Animal> data2 = new ArrayList<>();

        Animal allie = new Animal();
        allie.setImgName("allie");
        allie.setGender("female");
        allie.setName("Allie");
        allie.setSpecies("Tiger");
        allie.setNickname("");
        allie.setFunfact("");
        allie.setStory("Allie is very high-spirited, beautiful and agile! CARE agreed to give a home to Allie, unaware that one rescue would soon become a rescue of five. A short time after Allie’s custody, in mid 2006, she gave birth to four beautiful baby tiger cubs. Allie's cubs, Allucia, Jakey, Luca and JP, are now fully grown and happy residents of CARE. She and her mate Archie are now neutered and spayed.");
        data2.add(allie);

        Animal allucia = new Animal();
        allucia.setImgName("allucia");
        allucia.setGender("female");
        allucia.setName("Allucia");
        allucia.setSpecies("Tiger");
        allucia.setFunfact("");
        allucia.setNickname("");
        allucia.setStory("Allucia was somewhat of a miracle baby. CARE had spayed, neutered or separated all big cats that could produce offspring. Therefore on April 1, 2006, when sounds of a newborn tiger resonated through the sanctuary, we thought someone was playing an April fools joke. Then to our surprise, sounds of babies came from Alley and Archie’s enclosure (two tigers we had gotten custody of a couple of months before). Although Archie had been neutered, soon after custody, we had been too late.\n" +
                "\n" +
                "Four baby tigers. What a nightmare for the CARE staff, who were overwhelmed already. The commitment of a possible 20 years (times 4) now awaited us and was an overwhelming thought. We all tried to make the best of the situation.\n" +
                "\n" +
                "Allucia was a small baby, like her brother Jakey, who paled in comparison to the giants JP and Luca. Things have not changed much. Allucia remains tiny in comparison to her brothers, now including Jakey. Don’t let her size surprise you. What she lacks in size she makes up for with her stealth and agility. She definitely rules the roost. Although she is independent, she enjoys any love she can get past her brothers who normally push her away with their massive bodies. The best time to be with Allucia is when the boys are asleep.");
        data2.add(allucia);

        Animal archie = new Animal();
        archie.setImgName("archie");
        archie.setGender("male");
        archie.setName("Archie");
        archie.setSpecies("Tiger");
        archie.setNickname("");
        archie.setStory("Archie, and his mate Allie, found a permanent home at CARE in mid 2006. Archie was neutered soon after custody was arranged. Unfortunately it was too late. Allie gave birth to Allucia, Jakey, JP, and Luca. The proud father helped tend to his new offspring.\n" +
                "\n" +
                "Archie is an easy-going guy who usually lets Allie be the boss!");
        archie.setFunfact("");
        data2.add(archie);

        Animal bonnie = new Animal();
        bonnie.setImgName("bonnie");
        bonnie.setGender("female");
        bonnie.setName("Bonnie");
        bonnie.setSpecies("Tiger");
        bonnie.setNickname("Bonnie boo");
        bonnie.setFunfact("Likes to pee on Derek");
        bonnie.setStory("Bonnie is one of the smallest and most feminine tigers at CARE, but makes up for her size in heart. Bonnie and Clyde, her brother, were a prizefighters prize. Like many pet owners, when the novelty and money runs out a new home must be found.\n" +
                "\n" +
                "Bonnie has lived with some of the largest males at CARE and has always held her own. But, she has a sweet spirit and always gives a welcoming snuffle to her CAREkeepers.");
        data2.add(bonnie);

        Animal boomer = new Animal();
        boomer.setImgName("boomer");
        boomer.setGender("male");
        boomer.setName("Boomer");
        boomer.setSpecies("Tiger");
        boomer.setNickname("Bewmbewm, Boomachoo");
        boomer.setFunfact("");
        boomer.setStory("Boomer and Slade are two VERY rambunctious tigers who came to live at CARE in the Fall of 2014. They belonged to a private owner in Florida who was looking for a good home for them to grow up and live their rest of their lives. The owner contacted us to see if we would be able to care for them, and we gladly said yes.\n" +
                "\n" +
                "Since they arrived, the brothers have been getting into types of trouble! Boomer was usually the calmer of the two, if there even is a calm one, and Slade was constantly going, he never slows down! As they have gotten older Slade has mellowed out a little bit. They both spend their time wrestling, snuffling at people trying to get attention, stalking tour groups, and eating a ton!\n" +
                "\n" +
                "We have so enjoyed watching them grow and seeing their individual personalities come out! They are big, healthy boys with a long, loved life ahead of them!");
        data2.add(boomer);

        Animal chompers = new Animal();
        chompers.setImgName("chompers");
        chompers.setGender("male");
        chompers.setName("Chompers");
        chompers.setSpecies("Tiger");
        chompers.setNickname("Monsieur Chompers");
        chompers.setStory("");
        chompers.setFunfact("Chompers is CARE’s Gentle Giant. He is one of the largest Big Cats at the sanctuary. In his prime, his weight reached nearly 700 pounds! His gigantic teeth and dark black stripes are intimidating, but he has the spirit of a butterfly. He gets along well with others, animal and human. Although it is forbidden at CARE, it is easy to develop an overwhelming desire to walk in the enclosure and rub his belly or cuddle up with him and go to sleep.");
        data2.add(chompers);


        Animal divali = new Animal();
        divali.setImgName("divali");
        divali.setName("Divali");
        divali.setGender("male");
        divali.setSpecies("Tiger");
        divali.setNickname("Val-val");
        divali.setStory("");
        divali.setFunfact("In December, 2016, CARE welcomed 4 new tigers to the facility. Brothers Divali and Nadal and (unrelated to the boys) sisters Naya and Shaanti all came from a facility in Florida that was unable to keep up with their care.\n" +
                "\n" +
                "We found out about the tigers only weeks before, and after talking to the owner and the authorities, we agreed to take them....with only days to prepare for their arrival.\n" +
                "\n" +
                "We were told that all of the cats were between 2 and 3 years old. But, when they showed up, we found out that was not the case. The boys were tiny, and we later confirmed that they were just over a year old. And, they were perfect!\n" +
                "\n" +
                "The brothers entered their new home and immediately began running and playing, and have not stopped since. They are very ACTIVE boys and so obviously at home and happy here, it is a beautiful thing to see!\n" +
                "\n" +
                "Because of their new start here at CARE, all of the cats were renamed to have special meaning. Divali's name means Festival of Lights - and he is a bright light that shines on everything around him!");
        data2.add(divali);

        Animal fire = new Animal();
        fire.setImgName("fire");
        fire.setName("Fire");
        fire.setGender("female");
        fire.setSpecies("Tiger");
        fire.setNickname("Firebug");
        fire.setStory("Fire is a very special tiger. She was born from Donya and Rascal, two tigers that had been boarded at the facility before it was CARE.\n" +
                "\n" +
                "Fire was a perfect little baby. She was growing well with no apparent abnormal development. When she was 8 weeks old she was administered the normal vaccinations for big cats of that age. Within hours she was totally unresponsive. She remained this way for 46 hours. She then began to wake from this apparent coma. But, there was bad news...Fire was blind. As we scrambled for answers an angel from California stepped forward. Gerard Van De Merghel helped to ensure that Fire got the best medical care possible. Fire had a special animal ophthalmologist and neurologist to care for her along with her PCP, Dr. Bill. She slowly began to see better and better. After a year of medication and lots of love Fire became somewhat normal.\n" +
                "\n" +
                "She will remain to be one of the most spoiled-rotten tigers of CARE. Fire is a testament to what CARE’s loving donors and CAREgivers can do for big cats in need. It is a true miracle that the tiny, fuzzy, blind baby ever made it to adulthood. Please come and visit CARE and see our miracle in person.");
        fire.setFunfact("");
        data2.add(fire);

        Animal jakey = new Animal();
        jakey.setImgName("jakey");
        jakey.setName("Jakey");
        jakey.setGender("male");
        jakey.setSpecies("Tiger");
        jakey.setStory("");
        jakey.setFunfact("");
        jakey.setNickname("");
        data2.add(jakey);

        Animal jp = new Animal();
        jp.setImgName("jp");
        jp.setName("JP");
        jp.setGender("male");
        jp.setSpecies("Tiger");
        jp.setNickname("Peezer, Peezerpants");
        jp.setFunfact("");
        jp.setStory("");
        data2.add(jp);

        Animal kannapalli = new Animal();
        kannapalli.setImgName("kannapalli");
        kannapalli.setName("Kannapalli");
        kannapalli.setGender("male");
        kannapalli.setSpecies("Tiger");
        kannapalli.setNickname("Pawi");
        kannapalli.setStory("");
        kannapalli.setFunfact("Is famous for his 'whisper moos'.");
        data2.add(kannapalli);

        Animal luca = new Animal();
        luca.setImgName("luca");
        luca.setName("Luca");
        luca.setGender("male");
        luca.setSpecies("Tiger");
        luca.setNickname("");
        luca.setFunfact("");
        luca.setStory("");
        data2.add(luca);

        Animal melita = new Animal();
        melita.setImgName("melita");
        melita.setName("Melita");
        melita.setGender("female");
        melita.setSpecies("Tiger");
        melita.setNickname("Mita, Mita-pita, Pita");
        melita.setStory("");
        melita.setFunfact("");
        data2.add(melita);

        Animal mika = new Animal();
        mika.setImgName("mika");
        mika.setName("Mika");
        mika.setGender("female");
        mika.setSpecies("Tiger");
        mika.setNickname("");
        mika.setFunfact("");
        mika.setStory("");
        data2.add(mika);

        Animal nadal = new Animal();
        nadal.setImgName("nadal");
        nadal.setName("Nadal");
        nadal.setGender("male");
        nadal.setSpecies("Tiger");
        nadal.setNickname("");
        nadal.setFunfact("");
        nadal.setStory("");
        data2.add(nadal);

        Animal naya = new Animal();
        naya.setImgName("naya");
        naya.setName("Naya");
        naya.setGender("female");
        naya.setSpecies("Tiger");
        naya.setFunfact("");
        naya.setStory("");
        naya.setNickname("");
        data2.add(naya);

        Animal rasa = new Animal();
        rasa.setImgName("rasa");
        rasa.setName("Rasa");
        rasa.setGender("female");
        rasa.setSpecies("Tiger");
        rasa.setStory("");
        rasa.setNickname("");
        rasa.setFunfact("");
        data2.add(rasa);

        Animal savanna = new Animal();
        savanna.setImgName("savanna");
        savanna.setName("Savanna");
        savanna.setGender("female");
        savanna.setSpecies("Tiger");
        savanna.setNickname("Nano");
        savanna.setFunfact("");
        savanna.setStory("");
        data2.add(savanna);

        Animal selena = new Animal();
        selena.setImgName("selena");
        selena.setName("Selena");
        selena.setGender("female");
        selena.setSpecies("Tiger");
        selena.setFunfact("");
        selena.setStory("");
        selena.setNickname("");
        data2.add(selena);

        Animal shaanti = new Animal();
        shaanti.setImgName("shaanti");
        shaanti.setName("Shaanti");
        shaanti.setGender("female");
        shaanti.setSpecies("Tiger");
        shaanti.setNickname("");
        shaanti.setStory("");
        shaanti.setFunfact("");
        data2.add(shaanti);

        Animal slade = new Animal();
        slade.setImgName("slade");
        slade.setName("Slade");
        slade.setGender("male");
        slade.setSpecies("Tiger");
        slade.setNickname("Slade-o potato");
        slade.setFunfact("");
        slade.setStory("");
        data2.add(slade);

        Animal solano = new Animal();
        solano.setImgName("solano");
        solano.setName("Solano");
        solano.setGender("male");
        solano.setSpecies("Tiger");
        solano.setNickname("Yano");
        solano.setStory("");
        solano.setFunfact("");
        data2.add(solano);

        Animal sydney = new Animal();
        sydney.setImgName("sydney");
        sydney.setName("Sydney");
        sydney.setGender("female");
        sydney.setSpecies("Tiger");
        sydney.setFunfact("");
        sydney.setStory("");
        sydney.setNickname("");
        data2.add(sydney);

        Animal tess = new Animal();
        tess.setImgName("tess");
        tess.setName("Tess");
        tess.setGender("female");
        tess.setSpecies("Tiger");
        tess.setStory("");
        tess.setNickname("");
        tess.setFunfact("");
        data2.add(tess);

        Animal zara = new Animal();
        zara.setImgName("zara");
        zara.setName("Zara");
        zara.setGender("female");
        zara.setSpecies("Tiger");
        zara.setFunfact("");
        zara.setNickname("");
        zara.setStory("");
        data2.add(zara);

        Animal ace = new Animal();
        ace.setImgName("ace");
        ace.setName("Ace");
        ace.setGender("male");
        ace.setSpecies("Black Leopard");
        ace.setFunfact("hates Derek");
        ace.setNickname("");
        ace.setStory("");
        data2.add(ace);

        Animal akisa = new Animal();
        akisa.setImgName("akisa");
        akisa.setName("Akisa");
        akisa.setGender("female");
        akisa.setSpecies("Lemur");
        akisa.setStory("");
        akisa.setNickname("");
        akisa.setFunfact("");
        data2.add(akisa);

        Animal baggy = new Animal();
        baggy.setImgName("baggy");
        baggy.setName("Sheriff Baggy");
        baggy.setGender("female");
        baggy.setSpecies("Housemeow");
        baggy.setNickname("");
        baggy.setStory("");
        baggy.setFunfact("was in a viral video: brave housecat challenges LION");
        data2.add(baggy);

        Animal bindi = new Animal();
        bindi.setImgName("bindi");
        bindi.setName("Bindi");
        bindi.setGender("female");
        bindi.setSpecies("Coatimundi");
        bindi.setNickname("");
        bindi.setFunfact("");
        bindi.setStory("");
        data2.add(bindi);

        Animal bobbie = new Animal();
        bobbie.setImgName("bobbie");
        bobbie.setName("Bobbie");
        bobbie.setGender("female");
        bobbie.setSpecies("Bobcat");
        bobbie.setFunfact("");
        bobbie.setNickname("");
        bobbie.setStory("");
        data2.add(bobbie);

        Animal cassie = new Animal();
        cassie.setSpecies("Cougar");
        cassie.setGender("female");
        cassie.setName("Cassie");
        cassie.setImgName("cassie");
        cassie.setFunfact("Is famous for her squeaks");
        cassie.setNickname("Sass, Sassumfrass");
        cassie.setStory("");
        data2.add(cassie);

        Animal dahlia = new Animal();
        dahlia.setImgName("dahlia");
        dahlia.setName("Dahlia");
        dahlia.setGender("female");
        dahlia.setSpecies("Guanaco");
        dahlia.setStory("");
        dahlia.setNickname("");
        dahlia.setFunfact("");
        data2.add(dahlia);

        Animal jaker = new Animal();
        jaker.setImgName("jaker");
        jaker.setName("Jaker");
        jaker.setGender("male");
        jaker.setSpecies("Lemur");
        jaker.setNickname("");
        jaker.setFunfact("");
        jaker.setStory("");
        data2.add(jaker);

        Animal layla = new Animal();
        layla.setImgName("layla");
        layla.setName("Layla");
        layla.setGender("female");
        layla.setSpecies("Lion");
        layla.setFunfact("");
        layla.setStory("");
        layla.setNickname("");
        data2.add(layla);

        Animal max = new Animal();
        max.setImgName("max");
        max.setName("Max");
        max.setGender("male");
        max.setSpecies("Bobcat");
        max.setStory("");
        max.setNickname("");
        max.setFunfact("");
        data2.add(max);

        Animal mia = new Animal();
        mia.setImgName("mia");
        mia.setName("Mia");
        mia.setGender("female");
        mia.setSpecies("Bobcat");
        mia.setStory("");
        mia.setNickname("");
        mia.setFunfact("");
        data2.add(mia);

        Animal milo = new Animal();
        milo.setImgName("milo");
        milo.setName("Milo");
        milo.setGender("male");
        milo.setSpecies("Leopard");
        milo.setStory("");
        milo.setFunfact("");
        milo.setNickname("");
        data2.add(milo);

        Animal missStewart = new Animal();
        missStewart.setImgName("missstewart");
        missStewart.setName("Miss Stewart");
        missStewart.setGender("female");
        missStewart.setSpecies("Lemur");
        missStewart.setFunfact("");
        missStewart.setNickname("");
        missStewart.setStory("");
        data2.add(missStewart);

        Animal momo = new Animal();
        momo.setImgName("momo");
        momo.setName("Momo");
        momo.setGender("female");
        momo.setSpecies("Lemur");
        momo.setNickname("");
        momo.setStory("");
        momo.setFunfact("");
        data2.add(momo);

        Animal mort = new Animal();
        mort.setImgName("mort");
        mort.setName("Mort");
        mort.setGender("male");
        mort.setSpecies("Lemur");
        mort.setStory("");
        mort.setNickname("");
        mort.setFunfact("");
        data2.add(mort);

        Animal mrStinks = new Animal();
        mrStinks.setImgName("mrstinks");
        mrStinks.setName("Mr. Stinks");
        mrStinks.setGender("male");
        mrStinks.setSpecies("Dog");
        mrStinks.setNickname("Poopy");
        mrStinks.setFunfact("");
        mrStinks.setStory("");
        data2.add(mrStinks);

        Animal noel = new Animal();
        noel.setSpecies("Lion");
        noel.setGender("female");
        noel.setImgName("noel");
        noel.setName("Noel");
        noel.setNickname("Noey");
        noel.setFunfact("");
        noel.setStory("");
        data2.add(noel);

        Animal raven = new Animal();
        raven.setImgName("raven");
        raven.setName("Raven");
        raven.setGender("female");
        raven.setSpecies("Black Leopard");
        raven.setStory("");
        raven.setNickname("");
        raven.setFunfact("");
        data2.add(raven);

        Animal richardParker = new Animal();
        richardParker.setImgName("richardparker");
        richardParker.setName("Richard Parker");
        richardParker.setGender("male");
        richardParker.setSpecies("Housemeow");
        richardParker.setFunfact("currently likes to wear vests");
        richardParker.setNickname("");
        richardParker.setStory("");
        data2.add(richardParker);

        Animal rikku = new Animal();
        rikku.setImgName("rikku");
        rikku.setName("Rikku");
        rikku.setGender("female");
        rikku.setSpecies("Housemeow");
        rikku.setNickname("");
        rikku.setStory("");
        rikku.setFunfact("");
        data2.add(rikku);

        Animal rita = new Animal();
        rita.setImgName("rita");
        rita.setName("Rita");
        rita.setGender("female");
        rita.setSpecies("Lemur");
        rita.setStory("");
        rita.setFunfact("");
        rita.setNickname("");
        data2.add(rita);

        Animal roscoe = new Animal();
        roscoe.setImgName("roscoe");
        roscoe.setName("Roscoe");
        roscoe.setGender("male");
        roscoe.setSpecies("Lemur");
        roscoe.setNickname("");
        roscoe.setFunfact("");
        roscoe.setStory("");
        data2.add(roscoe);

        Animal ruth = new Animal();
        ruth.setImgName("ruth");
        ruth.setName("Ruth");
        ruth.setGender("female");
        ruth.setSpecies("Lemur");
        ruth.setFunfact("");
        ruth.setStory("");
        ruth.setNickname("");
        data2.add(ruth);

        Animal stella = new Animal();
        stella.setImgName("stella");
        stella.setName("Stella");
        stella.setGender("female");
        stella.setSpecies("Lemur");
        stella.setNickname("");
        stella.setFunfact("");
        stella.setStory("");
        data2.add(stella);

        Animal yolo = new Animal();
        yolo.setImgName("yolo");
        yolo.setName("Yolo");
        yolo.setGender("female");
        yolo.setSpecies("Llama");
        yolo.setFunfact("");
        yolo.setStory("");
        yolo.setNickname("");
        data2.add(yolo);






        return data2;
    }

String data = "[{\n" +
        "\"image\":\"Allie.png\",\n" +
        " \n" +
        " \"name\":\"Allie\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Allucia.png\",\n" +
        " \n" +
        " \"name\":\"Allucia\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Archie.png\",\n" +
        " \n" +
        " \"name\":\"Archie\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Bonnie.png\",\n" +
        " \n" +
        " \"name\":\"Bonnie\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Boomer.png\",\n" +
        " \n" +
        " \"name\":\"Boomer\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Chompers.png\",\n" +
        " \n" +
        " \"name\":\"Chompers\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Divali.png\",\n" +
        " \n" +
        " \"name\":\"Divali\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Fire.png\",\n" +
        " \n" +
        " \"name\":\"Fire\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Jakey.png\",\n" +
        " \n" +
        " \"name\":\"Jakey\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"JP.png\",\n" +
        " \n" +
        " \"name\":\"JP\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Kannapalli.png\",\n" +
        " \n" +
        " \"name\":\"Kannapalli\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Luca.png\",\n" +
        " \n" +
        " \"name\":\"Luca\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Melita.png\",\n" +
        " \n" +
        " \"name\":\"Melita\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Mika.png\",\n" +
        " \n" +
        " \"name\":\"Mika\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Nadal.png\",\n" +
        " \n" +
        " \"name\":\"Nadal\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Naya.png\",\n" +
        " \n" +
        " \"name\":\"Naya\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Rasa.png\",\n" +
        " \n" +
        " \"name\":\"Rasa\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Savanna.png\",\n" +
        " \n" +
        " \"name\":\"Savanna\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Selena.png\",\n" +
        " \n" +
        " \"name\":\"Selena\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Shaanti.png\",\n" +
        " \n" +
        " \"name\":\"Shaanti\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Slade.png\",\n" +
        " \n" +
        " \"name\":\"Slade\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Solano.png\",\n" +
        " \n" +
        " \"name\":\"Solano\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Sydney.png\",\n" +
        " \n" +
        " \"name\":\"Sydney\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Tess.png\",\n" +
        " \n" +
        " \"name\":\"Tess\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Zara.png\",\n" +
        " \n" +
        " \"name\":\"Zara\",\n" +
        "\n" +
        " \"species\":\"Tiger\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Araali.png\",\n" +
        " \n" +
        " \"name\":\"Araali\",\n" +
        "\n" +
        " \"species\":\"Lion\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Noel.png\",\n" +
        " \n" +
        " \"name\":\"Noel\",\n" +
        "\n" +
        " \"species\":\"Lion\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Layla.png\",\n" +
        " \n" +
        " \"name\":\"Layla\",\n" +
        "\n" +
        " \"species\":\"Lion\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Zuberi.png\",\n" +
        " \n" +
        " \"name\":\"Zuberi\",\n" +
        "\n" +
        " \"species\":\"Lion\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Apollo.png\",\n" +
        " \n" +
        " \"name\":\"Apollo\",\n" +
        "\n" +
        " \"species\":\"Cougar\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Cassie.png\",\n" +
        " \n" +
        " \"name\":\"Cassie\",\n" +
        "\n" +
        " \"species\":\"Cougar\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Lakai.png\",\n" +
        " \n" +
        " \"name\":\"Lakai\",\n" +
        "\n" +
        " \"species\":\"Cougar\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Ace.png\",\n" +
        " \n" +
        " \"name\":\"Ace\",\n" +
        "\n" +
        " \"species\":\"Leopard\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Milo.png\",\n" +
        " \n" +
        " \"name\":\"Milo\",\n" +
        "\n" +
        " \"species\":\"Leopard\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Raven.png\",\n" +
        " \n" +
        " \"name\":\"Raven\",\n" +
        "\n" +
        " \"species\":\"Leopard\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Akisa.png\",\n" +
        " \n" +
        " \"name\":\"Akisa\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Jaker.png\",\n" +
        " \n" +
        " \"name\":\"Jaker\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"MissStewart.png\",\n" +
        " \n" +
        " \"name\":\"MissStewart\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Momo.png\",\n" +
        " \n" +
        " \"name\":\"Momo\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Mort.png\",\n" +
        " \n" +
        " \"name\":\"Mort\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Rita.png\",\n" +
        " \n" +
        " \"name\":\"Rita\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Roscoe.png\",\n" +
        " \n" +
        " \"name\":\"Roscoe\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Ruth.png\",\n" +
        " \n" +
        " \"name\":\"Ruth\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Stella.png\",\n" +
        " \n" +
        " \"name\":\"Stella\",\n" +
        "\n" +
        " \"species\":\"Lemur\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Bobbie.png\",\n" +
        " \n" +
        " \"name\":\"Bobbie\",\n" +
        "\n" +
        " \"species\":\"Bobcat\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Max.png\",\n" +
        " \n" +
        " \"name\":\"Max\",\n" +
        "\n" +
        " \"species\":\"Bobcat\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Mia.png\",\n" +
        " \n" +
        " \"name\":\"Mia\",\n" +
        "\n" +
        " \"species\":\"Bobcat\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Bindi.png\",\n" +
        " \n" +
        " \"name\":\"Bindi\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Dahlia.png\",\n" +
        " \n" +
        " \"name\":\"Dahlia\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Yolo.png\",\n" +
        " \n" +
        " \"name\":\"Yolo\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"MrStinks.png\",\n" +
        " \n" +
        " \"name\":\"MrStinks\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Rikku.png\",\n" +
        " \n" +
        " \"name\":\"Rikku\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Baggy.png\",\n" +
        " \n" +
        " \"name\":\"Baggy\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"RichardParker.png\",\n" +
        " \n" +
        " \"name\":\"RichardParker\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"male\",\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "\"image\":\"Piper.png\",\n" +
        " \n" +
        " \"name\":\"Piper\",\n" +
        "\n" +
        " \"species\":\"other\",\n" +
        "\n" +
        " \"gender\":\"female\",\n" +
        "}]";

}
