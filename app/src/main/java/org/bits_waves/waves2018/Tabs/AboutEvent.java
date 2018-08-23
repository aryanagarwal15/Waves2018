package org.bits_waves.waves2018.Tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.bits_waves.waves2018.R;

public class AboutEvent extends Fragment {
    private String event_name_string;
    private int event_name_int;
    private TextView about_event;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_about_event, container, false);
        if (savedInstanceState == null) {
            Bundle extras = getActivity().getIntent().getExtras();
            if (extras == null) {
                event_name_string = null;
            } else {
                event_name_int = extras.getInt("event_name");
                event_name_string = getString(event_name_int);
            }
        } else {
            event_name_string = (String) savedInstanceState.getSerializable("event_name");
        }
        about_event = (TextView) view.findViewById(R.id.about_event);
        if (event_name_string.equals("Spin Off")){
            about_event.setText("Do you have it in you to win the ultimate band title?\n" +
                    "This is the intercollegiate band event. The bands may use a range of " +
                    "Indian/Western instruments and play songs in any Indian language to\n" +
                    "compete for the title.\n" +
                    "Team composition: 3-10 members\n" +
                    "Teams per college: 2\n" +
                    "Registration: On the spot");
        }
        if (event_name_string.equals("Natyanjali")){
            about_event.setText(" “The feverous hunt for the best dance troupe” \n" +
                    "THEMATIC \n" +
                    "“Art in motion”\n" +
                    "Team composition:8-15 members+ 3 (backstage) \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 6-10 minutes\n" +
                    "\n" +
                    "NON-THEMATIC \n" +
                    "“The ultimate battle for bragging rights” \n" +
                    "Team composition :8-15 members+ 3 (backstage) \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 6-10 minutes \n");
        }
        if (event_name_string.equals("Sizzle")){
            about_event.setText(" “Set the streets ablaze” \n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: \n" +
                    "Eliminations: 2-3 minutes \n" +
                    "Finals: 3-5 minutes ");
        }
        if (event_name_string.equals("Dancing Duo")){
            about_event.setText(" “Duo think you can dance!” \n" +
                    "Team composition:2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: \n" +
                    "Eliminations: 2 minutes \n" +
                    "Finals: 3-5 minutes \n");
        }

        if (event_name_string.equals("Rangmanch")){
            about_event.setText(" “Set the stage alive at the stage play event, Rangmanch” \n" +
                    "\n" +
                    "Team composition: 2– 8 members + 4 (backstage) \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: \n" +
                    "Eliminations: 10– 12 minutes \n" +
                    "Finals: 40-60 minute");
        }
        if (event_name_string.equals("Nukkad Natak")){
            about_event.setText("“Support your cause, bring out the message, captivate the masses with your enthusiasm in this street play event” \n" +
                    "\n" +
                    "Team composition: 8-20 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 20 minutes \n");
        }
        if (event_name_string.equals("Skime")){
            about_event.setText("Actions speak louder than words. Witness the symphony of silence at the Waves mime event, Skime.\n" +
                    " \n" +
                    "Team composition: 6 – 8 members + 2 (backstage) \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 8-10 minutes excluding the time to get ready ");
        }
        if (event_name_string.equals("Indian Rock")){
            about_event.setText("“A Musical Delight”\n" +
                    "\n" +
                    "Do you have it in you to win the ultimate band title? This is the intercollegiate band event. The bands may use a range of Indian/Western instruments and play songs in any Indian language to compete for the title.\n" +

                    "Team composition: 3-10 members \n" +
                    "Teams per college: 2 \n" +
                    "Registration: On the spot \n" +
                    "Time limit: 15 min (subject to change) \n");
        }
        if (event_name_string.equals("Silence Of The Amps")){
            about_event.setText("“Music at its Roots” \n" +
                    "\n" +
                    "There’s nothing like a soulful acoustic song. We bring you the Acoustic counterpart of Indian Rock. This is an acoustic band event. The participating bands have to play original or acoustic renditions of songs of any genre. \n" +
                    "\n" +
                    "Team composition: 3-6 members \n" +
                    "Teams per college: No limit \n" +
                    "Registration: On the spot \n" +
                    "Time limit: 12 min (subject to change) ");
        }

        if (event_name_string.equals("Jukebox")){
            about_event.setText("“Pitch perfect”\n" +
                    "\n" +
                    "Team Composition: 1 member \n" +
                    "Teams per College: 1-10 \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: \n" +
                    "Eliminations: 5 minutes \n" +
                    "Finals: 10 minutes\n");
        }

        if (event_name_string.equals("Solonote")){
            about_event.setText("“Let the notes do the talking”\n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: 2 \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time limit: 6 minutes (Round 1)");
        }

        if (event_name_string.equals("Alaap")){
            about_event.setText(" “Rewind Raaga”\n" +
                    "\n" +
                    "Want to listen to music in its purest form? Come forth and indulge in the world of classical music. Alaap brings you a classical music event with ragas, gamakas and swaras. \n" +
                    "\n" +
                    "Team composition: 1 Member \n" +
                    "Teams per college: 1-15 \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time limit: 8 min\n");
        }

        if (event_name_string.equals("Best Out Of Waste")){
            about_event.setText(" “Design the best outfit with quirky material” \n" +
                    "\n" +
                    "Team Composition: 2-4 members \n" +
                    "Teams per college: 4 (max) \n" +
                    "Time Limit: 90 minutes \n" +
                    "Registration: online/ on-fest \n");
        }

        if (event_name_string.equals("Courture")){
            about_event.setText("“T-shirt designing event” \n" +
                    "\n" +
                    "Team Composition: 1-3 members \n" +
                    "Teams per college: 4 (max) \n" +
                    "Time Limit: Round 1: 60 minutes \n" +
                    "Registration: online/ on-fest\n");
        }
        if (event_name_string.equals("Artathon")){
            about_event.setText("“Run a marathon of art, completing various tasks to express your thoughts without words.“ \n" +
                    "\n" +
                    "Team composition:2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot\n" +
                    " \n" +
                    "Time limit: \n" +
                    "Round 1: 2 hours \n" +
                    "Round 2: 2 hours\n" +
                    "Round 3: 2 hours \n");
        }
        if (event_name_string.equals("CariCreatures")){
            about_event.setText("“Caricatures look cool but we're gonna make them look cooler. !This waves, get ready to make famous personalities lose their jobs and bring forth the creative side in you. “\n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: unlimited \n" +
                    "Registration: online \n" +
                    "Time Limit: Entry must be submitted before deadline.");
        }
        if (event_name_string.equals("Let's Doodle")){
            about_event.setText("“Doodle your way towards Waves!”\n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: unlimited \n" +
                    "Registration: online \n" +
                    "Time Limit: Entry must be submitted before deadline. \n");
        }
        if (event_name_string.equals("Affiche")){
            about_event.setText("“Poster designing event”\n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time limit: 2 hours (Round 2) ");
        }
        if (event_name_string.equals("Portrature")){
            about_event.setText("“A live subject brought to life on a paper through sheer artistry” \n" +
                    "\n" +
                    "Team composition:1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 2 hours \n");
        }
        if (event_name_string.equals("Blind Art")){
            about_event.setText("“Show your team spirit by recreating an artwork blindfolded with your partner being your eyes” \n" +
                    "\n" +
                    "Team composition:2 members \n" +
                    "Teams per college: Unlimited\n" +
                    "Registration: Online/On the spot \n" +
                    "Time limit: 1 hour ");
        }
        if (event_name_string.equals("Inverse")){
            about_event.setText("“The Poetry Slam Event” \n" +
                    "\n" +
                    "Team Composition: 1 member \n" +
                    "Teams per college : Unlimited \n" +
                    "Registration : Online / On Fest \n" +
                    "Time limit :3-4 minutes");
        }
        if (event_name_string.equals("Cultural Gauntlet")){
            about_event.setText("“Put your creativity and linguistic skills to the test.” \n" +
                    "\n" +
                    "Team Composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration : Online / On Fest ");
        }
        if (event_name_string.equals("Mela Quiz")){
            about_event.setText("“Who would've ever thought binge watching TV shows and stalking celebs would come in handy someday?” \n" +
                    "\n" +
                    "Team Composition:1-2 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration : Online / On Fest \n" +
                    "Time limit :120 to 150 minutes \n");
        }
        if (event_name_string.equals("Word Games")){
            about_event.setText("“Welcome to the witty world of amusing anagrams and peculiar puns” \n" +
                    "\n" +
                    "Team Composition:1-2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration : Online / On Fest \n" +
                    "Time limit : 60 to 90 minutes \n");
        }
        if (event_name_string.equals("Sho(r)t")){
            about_event.setText("“Transport us into you reel world.” \n" +
                    "\n" +
                    "Team composition: 7 members (max, excluding cast) \n" +
                    "Teams per college: unlimited \n" +
                    "Registration: online \n" +
                    "Time Limit: 3 to 7 minutes \n");
        }
        if (event_name_string.equals("Oh Snap!")){
            about_event.setText("“Ae please click my photo na, I want something DP worthy” \n" +
                    "Have your friends plagued you with such requests? Are you usually the official photographer of all birthday parties, anniversary celebrations and sometimes your mom’s kitty gatherings? \n" +
                    "\n" +
                    "Team composition: 3 members (max) \n" +
                    "Teams per college: unlimited \n" +
                    "Registration: online/ on-fest \n" +
                    "Time limit: Entry must be submitted before deadline");
        }
        if (event_name_string.equals("Waves Open")){
            about_event.setText("“No rules, no restrictions. Come one, come all to the Waves Open Quiz. “\n" +
                    "\n" +
                    "Team composition: 1 – 2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time Limit : 3 hours \n" +
                    "\n");
        }
        if (event_name_string.equals("Wipro Quiz")){
            about_event.setText("“Test your green know-how.” \n" +
                    "\n" +
                    "Team composition: 1 – 2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time Limit : 3 hours\n");
        }
        if (event_name_string.equals("Vice Quiz")){
            about_event.setText("“Pick Your Poison” \n" +
                    "\n" +
                    "Team composition: 1-3 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot ");
        }
        if (event_name_string.equals("Quiz In Two Shades")){
            about_event.setText(" “Choose your side. “\n" +
                    "\n" +
                    "Team composition: 1-2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot\n" +
                    "\n");
        }
        if (event_name_string.equals("Lonewolf")){
            about_event.setText("“Stand alone, stand strong to face the questions thrown at you in this lonewolf event.” \n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/ On the spot \n" +
                    "Time Limit : 3 hours \n");
        }
        if (event_name_string.equals("Contention")){
            about_event.setText("“Sparring for the verbally combative. The Waves British Parliamentary Debate.” \n" +
                    "\n" +
                    "Team composition: 2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/Pre-fest");
        }
        if (event_name_string.equals("FashP")){
            about_event.setText("“Fire up the ramp with your style and confidence in this battle of beauty and style \n" +
                    "\n" +
                    "Team composition: 12 – 18 (including backstage crew) \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: online/ on-fest \n" +
                    "Time Limit: 4-12 minutes");
        }
        if (event_name_string.equals("Moot Court")){
            about_event.setText("“Contend with the best in Law” \n" +
                    "\n" +
                    "Waves conducts its own Moot Court Competition called Lex Omnia where students from Law Colleges take part in a competition of simulated court proceedings. \n");
        }
        if (event_name_string.equals("Mr and Ms Waves")){
            about_event.setText("Can your glamour leave the audiences awestruck? Do you have it in you to make it through without batting an eye? \n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online/on the spot   ");
        }
        if (event_name_string.equals("SpinOff")){
            about_event.setText("“The Music will never stop. The Heartbeat will never fade. The Party will never End”\n" +
                    "\n" +
                    "Spin-off is a DJing Event which primarily focuses on bringing upcoming Djs of the nation together to compete and showcase their skills on one of the best platforms in the Country judged by the Gurus of the cultures themselves. The festive Goan Atmosphere and an audience from all across the nation is bound to create an intoxicating and ecstatic “never has been before” experience that a DJ could ask for. The Winner of the event Gets a once in a lifetime chance to perform on the Iconic EDM Night of Waves.  \n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online\n");
        }
        if (event_name_string.equals("Show Me The Funny")){
            about_event.setText(" “Laugh your troubles away in this stand up comedy competition” \n" +
                    "\n" +
                    "Show Me The Funny is a stand up comedy competition .The eliminations shall be held in the respective cities where participants shall perform a stand up comedy act in the allotted time . Two upo finalists shall be selected from each city to perform at the finals(the number is subject to change) .18 finalists shall perform in a venue with an audience of about 300. The winner shall open for the waves comedy night and win prize money of an amount that shall be disclosed at a later stage. \n" +
                    "\n" +
                    "Team composition: 1 member \n" +
                    "Teams per college: Unlimited\n" +
                    "Registration: Online \n");
        }
        if (event_name_string.equals("Strangely Familiar")){
            about_event.setText("“ Find your BITSIAN pair” \n" +
                    "\n" +
                    "Team composition: 2 members \n" +
                    "Teams per college: Unlimited \n" +
                    "Registration: Online / On the Spot \n" +
                    "  \n");
        }
        if (event_name_string.equals("Inauguration")){
            about_event.setText("Experiance Inauguration of Waves first hand jam packed with awesome performances.");
        }
        if (event_name_string.equals("Searock")){
            about_event.setText(" Searock is an all-India semi-pro band competition hosted as part of the BITS Goa's three-day long cultural festival, \"Waves\". With performances ready to set fire and make the crowd go wild, the Goan atmosphere is just right to set the adrenaline rushing! In its thirteenth edition, Searock aims to progress further into the underground realm of music in the country with eliminations in nine cities which include Mumbai, Delhi, Bangalore, Kolkata, Ahmedabad, Goa, Chennai , Hyderabad and Kochi. The best of bands to feature in these eliminations will battle it out in the overnight semifinal event to be held in Goa during Waves 2017 for a spot in the final. The finalists will perform the next day at the English Nite of Waves 2017 and their performances will be judged by the yet to revealed headlining Act. The best act of the night will take home the coveted title of \"Winners of Searock 2017\". With the likes of Zygnema and Family Cheese being amongst the illustrious alumni, Searock has become one of the largest band competitions in India. If you have what it takes to be a true rocker, then this is your place! Let your music breathe life!!\n" +
                    "Searock Team.\n" +
                    "Searock 2017.\n" +
                    "Where Music breathes Life. ");
        }
        return view;
    }
}

