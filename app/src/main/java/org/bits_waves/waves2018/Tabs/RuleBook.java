package org.bits_waves.waves2018.Tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.bits_waves.waves2018.R;

public class RuleBook extends Fragment {
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
        View view = inflater.inflate(R.layout.activity_rule_book, container, false);
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
        about_event = (TextView) view.findViewById(R.id.rules);

        if (event_name_string.equals("Natyanjali")){
            about_event.setText("General Rules:  \n" +
                    "A minimum of 6 dancers need to be present on the stage at all times.  \n" +
                    "A college/institute can participate in both thematic and non-thematic but the same crew cannot perform in both.  \n" +
                    "Use of props is allowed and may fetch extra points. However, it is not necessary.  \n" +
                    "The Organizing Committee must be notified of the same at least 1 day prior to the performance by sending a mail to events@bits-waves.org. \n" +
                    "The subject of the mail should be “Request to use props for Natyanjali”.  \n" +
                    "A tiebreaker round might be introduced after the eliminations, only if found necessary by the judges and the event managers. \n" +
                    "The rules for the tie breaker (if necessary) will be disclosed at the end of the elimination round. \n" +
                    "Hence, at least one member from each group must stay back till the result of the elimination round is announced. \n" +
                    "Event Rules: \n" +
                    "Elimination Round:  \n" +
                    "Participants will be required to perform a prepared dance sequence.  The duration of this performance will be 6-10 minutes.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit.  Participants can incorporate any dance form into their performance as long as it is conveying a story or a message.  \n" +
                    "The elimination round is not open to watch, and will be held in a closed room. \n" +
                    "Only the judging panel will be viewing the team’s performance.\n" +
                    "Final Round:  \n" +
                    "The teams who qualify for the final will have to perform the same dance sequence as the elimination round. \n" +
                    "The final round will be held in the auditorium in front of a live audience.  Rules and guidelines will be same as those for the elimination round.  \n" +
                    "The auditorium screen shall not be used for any purpose (photos, videos, etc.)  \n" +
                    "Teams are not allowed to use any external lighting for their performance. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Costumes  \n" +
                    "Props used  \n" +
                    "Expressions  \n" +
                    "Choreography  \n" +
                    "Coordination/synchronization  \n" +
                    "Originality of idea \n" +
                    "Dramatic interpretation \n" +
                    "Choreography will be given the highest amount of priority while awarding points.\n");
        }
        if (event_name_string.equals("Sizzle")){
            about_event.setText("General Rules:   \n" +
                    "The soundtracks of the prepared sequences must be submitted to the event manager in a pen drive, prior to the event.  \n" +
                    "Semi-Final rounds 1 & 2 will be conducted one after the other.  \n" +
                    "\n" +
                    "Event Rules: \n" +
                    "\n" +
                    "Elimination Round:  \n" +
                    "Participants will be required to perform a 2-minute sequence out of their prepared 3-5 minutes' set.  \n" +
                    "The elimination round is not open to watch and will be held in a closed room. \n" +
                    "Only the judging panel will be viewing the performances.  \n" +
                    "Use of props is not allowed. \n" +
                    "Semi-Final Round 1:  \n" +
                    "Participants will be required to perform their entire prepared set of 3-5 minutes.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit. \n" +
                    "\n" +
                    "Semi-Final Round 2:  \n" +
                    "This is a theme/prop round.  \n" +
                    "Participants will be divided into groups of 3.  One group will perform at a time, where all 3 participants in that group dance simultaneously on the tune provided to them. \n" +
                    "Area corresponds to a particular theme/prop, and the participant will have to stick to the theme/prop assigned to him/her. At the signal of the judges, positions will be shuffled and the participants will have to continue in a new area with a new theme/prop. \n" +
                    "Each group will be shuffled thrice so that all the participants in the same group get to use all three themes/props. \n" +
                    "If a participant steps out of the area, he/she shall be warned once. If the offence is repeated, the participant shall be eliminated immediately. \n" +
                    "\n" +
                    "Final Round: \n" +
                    "1. This is the round of footloose. \n" +
                    "2. Two participants will be called on the stage simultaneously. The first participant dances to a song played on the spot while the other will stay still. 3. At the signal of the judges, the first participant will stop and the second participant will immediately begin dancing to the continuation of the same song. \n" +
                    "4. The process will be repeated every time the song is changed. The starting sequence for each song will be performed by participants 1 and 2 alternately. 5. In this way, the song will be changed several times while the participants dance in an alternating manner. \n" +
                    "\n" +
                    "Judging criteria: \n" +
                    "\n" +
                    "Elimination and Semi-Final Round 1: \n" +
                    "1. Choreography \n" +
                    "2. Expressions \n" +
                    "3. Stage presence \n" +
                    "\n" +
                    "Semi-Final Round 2: \n" +
                    "Creativity in using props \n" +
                    "\n" +
                    "Final Round: \n" +
                    "1. Entertainment Factor \n" +
                    "2. Spontaneity \n" +
                    "3. Creativity\n");
        }
        if (event_name_string.equals("Dancing Duo")){
            about_event.setText("Event Rules: \n" +
                    "Elimination Round: \n" +
                    "1. Teams can be formed with the same and opposite gender. Contestants have to perform a part of their prepared sequence in a closed room in front of the judges. \n" +
                    "2. The sequence can last for a maximum of 2 minutes. \n" +
                    "3. No additional time will be entertained. Therefore, contestants are advised to choose their best 2 minutes. \n" +
                    "\n" +
                    "Final Round 1: \n" +
                    "1. Prepared sequence of 3-5 minutes is to be performed in front of the judges and live audience. \n" +
                    "2. The sequence performed for the elimination round must be a part of his sequence. \n" +
                    "3. The judging criteria include choreography, sync, plot/theme, creativity. \n" +
                    "4. Additional props are allowed although they have to be notified beforehand. \n" +
                    "Final Round 2: \n" +
                    "1. The teams are provided with a prop as an obstacle. For e.g. Blindfold, one hand tied of each of the partners, etc. \n" +
                    "2. The obstacles will be provided to each team before the commencement of Final Round 1 (lottery based – chit selection) and then each team will be given additional 15 minutes after the Final round 1 to prepare a performance of about 2-3 minutes on the song of their choice. \n" +
                    "3. The teams will be judged on the basis of coordination and innovation. 18 \n" +
                    "\n" +
                    "\n" +
                    "Final Round 3:  \n" +
                    "The cumulative points tally of both the final rounds 1 and 2 will decide the qualification and will proceed for the final face off round.  \n" +
                    "Two teams will be called on the stage simultaneously. The first team dances to a song played on the spot while the other will stay.  \n" +
                    "At the signal of the judges, the first team will stop and the second one will immediately begin dancing to the continuation of the same song.  \n" +
                    "The process will be repeated every time the song is changed. The starting sequence for each song will be performed by team 1 and 2 alternately.  \n" +
                    "In this way, the song will be changed several times while the participants dance in an alternating manner.  \n" +
                    "The winners will be solely decided by the judges based on choreography, chemistry and innovation. \n" +
                    "\n" +
                    "Judging Criteria: \n" +
                    "Choreography  \n" +
                    "Technique  \n" +
                    "Execution  \n" +
                    "Expression  \n" +
                    "Entertainment value  \n" +
                    "Transitions  \n" +
                    "Timing\n");
        }

        if (event_name_string.equals("Rangmanch")){
            about_event.setText("Registration Details:  \n" +
                    "Teams should email a copy of their script (full play not teaser) to events@bits-waves.org, with the subject “Script for Rangmanch at Waves – 2017” post registration.  \n" +
                    "The email should mention the approximate duration of the performance, as well as a list of props used.  \n" +
                    "Teams will not be considered for the event if the script is not submitted.  The deadline for script submission is 6th October, 2017. \n" +
                    "\n" +
                    "General rules:  \n" +
                    "The team must perform a stage play of one or more acts.  The play must be in English/Hindi only.  \n" +
                    "Only table and chairs will be provided by the organisers.  \n" +
                    "Teams should minimize the use of props.  \n" +
                    "Sound can be provided only through sound clips, which should be made available on a pen drive well before the event. No arrangements will be made for live music.  \n" +
                    "A total of up to four members allowed to work backstage per team, with a maximum of one participant working with each of sound and lights. The remaining members may work on stage setup and help with other incidental needs on stage.  \n" +
                    "The number of participants entering the final round will be decided on the basis of the number of entries, on fest.\n" +
                    "\n" +
                    "Event Rules:  \n" +
                    "The final play must be performed.  \n" +
                    "The duration of the performance should not exceed 60 minutes, including the stage setup and clearance time.  \n" +
                    "2 minutes shall be allotted to each team for technical check.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Script - 15  \n" +
                    "Production - 15  \n" +
                    "Acting - 35  \n" +
                    "Direction – 35\n" );
        }
        if (event_name_string.equals("Nukkad Natak")){
            about_event.setText("General Rules:  \n" +
                    "The play should deliver a social message.  \n" +
                    "No pre-recorded voices or music is allowed.  \n" +
                    "The play must only be in English/Hindi.  \n" +
                    "Teams should minimise their use of props.  \n" +
                    "The organisers are not liable for procuring any props for the participants. The teams are expected to carry their own props. \n" +
                    "\n" +
                    "Event Rules: \n" +
                    "Elimination Round:  \n" +
                    "Team should perform the entire playing the elimination round.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit.  \n" +
                    "The duration of the performance should not exceed 20 minutes.  \n" +
                    "Use of profanity or vulgarity will result to deduction of points. \n" +
                    "\n" +
                    "Final Round:  \n" +
                    "This round will be conducted in the streets.  \n" +
                    "The remaining rules are same as that of the elimination round. \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Content and topic - 20  \n" +
                    "Direction and coherence - 35  \n" +
                    "Performance - 45\n" );
        }
        if (event_name_string.equals("Skime")){
            about_event.setText("General rules:  \n" +
                    "Skime is not conventional mime. \n" +
                    "No other rules of conventional mime need to be followed.  \n" +
                    "No recognisable human voices and dialogues can be used by the participants.  \n" +
                    "Sounds like animal voices, human voices and nature sounds are allowed in the background track.  \n" +
                    "Use of a synthesizer or any other musical instrument is allowed.  \n" +
                    "Any sort of vulgarity will lead to disqualification.  \n" +
                    "Use of costumes of different kind, apart from the general costume of the participants, shall also be considered as props.  \n" +
                    "Each different kind of costume shall be considered as a prop.  \n" +
                    "A costume of the same kind but of different colour will not be considered as an additional prop. \n" +
                    "\n" +
                    "Event Rules:  \n" +
                    "A maximum of 8 members are allowed to perform in the event.  \n" +
                    "2 other members need to be off stage to manage sound and PowerPoint if required in the act.  \n" +
                    "The duration of the performance should not exceed 10 minutes.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit.  \n" +
                    "The teams may use movie songs/tunes and slideshows to support their plot.  \n" +
                    "All the various background tracks and slides need to be made available in a pen drive before the event begins. \n" +
                    "\n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Poise  \n" +
                    "Facial Expression  \n" +
                    "Entertainment \n" +
                    "Value  \n" +
                    "Content  \n" +
                    "Characterization \n");
        }
        if (event_name_string.equals("Indian Rock")){
            about_event.setText("General Rules:  \n" +
                    "There will be a single round.  \n" +
                    "The time limit is 15 minutes, including set up and clearance. \n" +
                    "Extra time taken beyond the limit will lead to a reduction of points  \n" +
                    "The songs should have lyrics in Indian languages  \n" +
                    "For original compositions and/or lyrics in languages excluding Hindi and English, the lyrics should be submitted at the time of registration. They will be checked for profanity  \n" +
                    "Percussions and vocals are mandatory  \n" +
                    "There should be a minimum of three performing members at any point of time  \n" +
                    "A minimum of two songs have to be performed  \n" +
                    "No Pre-recorded music will be allowed under any circumstances  \n" +
                    "The vocalists may choose to hum, whistle, sing Taranaas, Sargamor in Aakar  \n" +
                    "Under unforeseen circumstances, the event manager’s decision will be final \n" +
                    "Judging Criteria:  \n" +
                    "Rhythm  \n" +
                    "Sur(Melody)  \n" +
                    "Pitching  \n" +
                    "Choice of Songs  \n" +
                    "Overall Performance  \n" +
                    "Entertainment value");
        }
        if (event_name_string.equals("Silence Of The Amps")){
            about_event.setText("General Rules:  \n" +
                    "There will be a single round  \n" +
                    "A minimum of two songs should be performed  \n" +
                    "The participants have to perform acoustic renditions of songs of any genre or original compositions  \n" +
                    "A minimum of one vocalist is mandatory  \n" +
                    "There should be a minimum of three performing members on stage at any point of time  \n" +
                    "Acapella performances are allowed  \n" +
                    "The time limit is 12 minutes. \n" +
                    "Extra time will lead to a deduction in points  \n" +
                    "Only Acoustic instruments may be used  \n" +
                    "Availability of an electric bass, a keyboard and a Congo is assured (if needed)  \n" +
                    "Under unforeseen circumstances, the event manager’s decision will be final \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Rhythm  \n" +
                    "Arrangement  \n" +
                    "Quality of cover  \n" +
                    "Creativity  \n" +
                    "Quality of vocals  \n" +
                    "Entertainment value ");
        }

        if (event_name_string.equals("Jukebox")){
            about_event.setText("General Rules:  \n" +
                    "There will be two rounds. A maximum of 10 people (maximum of 5 from the Western category and 5 from the Indian category) will be selected from the elimination round to the final round.  \n" +
                    "Western and Indian participants will be judged separately and the winners will be announced for both the categories separately.  \n" +
                    "Out of the 10 (maximum possible) participants from each college, a maximum of 5 can participate in Western and Indian categories respectively.  The song can be in English (Western) OR in any Indian language (Indian). In case the song is not in Hindi, the participants must e-mail one copy of the lyrics, translated to Hindi/English, at events@bitswaves.org.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit.  \n" +
                    "A participant can take part in either Western or Indian category.  \n" +
                    "Participants are allowed to use either of the following to accompany their song:  \n" +
                    "Instruments: Only one accompanying instrument is allowed. The instrument can be played by the singer themselves, or by someone else.  \n" +
                    "Backing track: In case the participant wishes to use a backing track, they should provide the organisers with the same in a pen-drive.  \n" +
                    "\n" +
                    "Availability of the following instruments (if required) is assured: \n" +
                    "1. A Keyboard (in Piano tune) \n" +
                    "2. An Acoustic Guitar \n" +
                    "\n" +
                    "Event Rules: \n" +
                    "Elimination Round:  \n" +
                    "The time limit for this round is 5 minutes.  \n" +
                    "Participants will have to perform only one song.  \n" +
                    "No marks from the elimination round will be carried forward to the finals. \n" +
                    "\n" +
                    "Final Round:  \n" +
                    "The time limit for this round is 10 minutes, including setup time.  \n" +
                    "Participants have to perform two songs, depending upon their category.  \n" +
                    "Songs sung in the finals should be different from those sung in the eliminations.\n" +
                    "\n" +
                    "Judging criteria:  \n" +
                    "Rhythm  \n" +
                    "Sur  \n" +
                    "Pitching  \n" +
                    "Choice of Songs  \n" +
                    "Overall Performance");
        }

        if (event_name_string.equals("Solonote")){
            about_event.setText("Event Rules: \n" +
                    "\n" +
                    "Round 1:  \n" +
                    "There will be two categories: Non-percussion instruments and Percussion instruments.  \n" +
                    "Participants are allowed to use ONLY ONE instrument to play anything of their choice.  \n" +
                    "The time limit for this round is 6 minutes, including setup time.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit  \n" +
                    "Availability of the following instruments is assured (if required):\n" +
                    "o A Keyboard (in Piano tune) \n" +
                    "o Acoustic Guitar \n" +
                    "o Tabla \n" +
                    "o Congo \n" +
                    "o Drum Set  \n" +
                    "\n" +
                    "The first part will be a solo performance and then the winner of each category will be decided by a face-off.  \n" +
                    "50% marks of the solo performance will be carried over to the face-off round. \n" +
                    "\n" +
                    "Face-off Round(percussion and melody instruments):  \n" +
                    "First, the highest scores for each individual instrument will be declared in both the categories.  \n" +
                    "As a final face off, for the percussions category, each selected participant will be given a melody track to play on, and vice versa.  \n" +
                    "The melody track or the percussion track will be same for every participant in the respective categories. \n" +
                    "In this way, the judges will come down to one winner in each category. \n" +
                    "If there is only one participant for an instrument, a normalization process will be followed to decide if that instrumentalist qualifies for the faceoff. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Rhythm  \n" +
                    "Entertainment Value  \n" +
                    "Melody  \n" +
                    "Clarity of Tone  \n" +
                    "Mastery of Piece  \n" +
                    "Dynamics  \n" +
                    "Expression\n");
        }

        if (event_name_string.equals("Alaap")){
            about_event.setText(" General Rules:  \n" +
                    "There will be a single round  \n" +
                    "It is a solo vocal competition and will be conducted in 2 categories, Carnatic and Hindustani  \n" +
                    "The time limit for the round is 8 minutes, including setup time.  \n" +
                    "5% of the total score will be deducted for each minute above the time limit.  \n" +
                    "No accompaniment will be provided by us but participants can bring their own accompaniment if required.  \n" +
                    "The decision of the judges will be final. \n" +
                    "\n" +
                    "Judging criteria:  \n" +
                    "Improvisation  \n" +
                    "Authenticity  \n" +
                    "Sur  \n" +
                    "Taal  \n" +
                    "Pakad  \n" +
                    "Composition \n" +
                    "Overall Impression/performance \n" +
                    "Swar Sankalp  \n" +
                    "Raag Varnan");
        }

        if (event_name_string.equals("Best Out Of Waste")){
            about_event.setText("Event Rules:  \n" +
                    "Waste material will be provided to all the teams along with a “Mystery Box” (This needs to be the highlight of the design). Each team have to design a fashion entity (which will be described in detail on-fest) using the waste material and mystery box provided.  \n" +
                    "The fashion entity made by the participant should incorporate the theme of WAVES’17.  \n" +
                    "Stationery to be brought by the participants. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Incorporation of theme.  \n" +
                    "Creativity.  \n" +
                    "How well is the mystery box used.  \n" +
                    "Other parameters and weightage to be decided by the judges.");
        }

        if (event_name_string.equals("Courture")){
            about_event.setText("Elimination Round:  \n" +
                    "Each team will get 60 minutes to design and paint their Tshirts. \n" +
                    "8 teams will be shortlisted for the next round.  \n" +
                    "Only fabric paint are allowed to be used on the T shirts.  \n" +
                    "Stationery to be brought by the participants.  \n" +
                    "T-shirts will be provided by us according to the sizes required. \n" +
                    "\n" +
                    "\n" +
                    "Judging Criteria for Elimination Round:  \n" +
                    "Aesthetic Appeal.  \n" +
                    "Creativity. \n" +
                    "Other parameters and weightage to be decided by the judges and they will be communicated to the participants before the event commences. \n" +
                    "\n" +
                    "Final Round:  \n" +
                    "Teams have to model the T-shirt designed in the first round on one of their team members and present it to the judges. \n" +
                    "\n" +
                    "Judging Criteria for Round2 : \n" +
                    "1. Presentation of the model. \n" +
                    "2. Incorporation of the theme. \n" +
                    "3. Other parameters and weightage to be decided by the judges and they will be communicated to the participants before the event commences.");
        }
        if (event_name_string.equals("Artathon")){
            about_event.setText("Event Rules :\n" +
                    "\n" +
                    "The event shall consist of 3 rounds testing the different art skills of participants.  \n" +
                    "A team can proceed to next round only after completing the tasks of the previous rounds. \n" +
                    "Final evaluation will be done on the basis of all 3 rounds. \n" +
                    "All other details will be given on the spot.  \n" +
                    "Required colouring material will be provided.");
        }
        if (event_name_string.equals("CariCreatures")){
            about_event.setText("“Event Rules:  \n" +
                    "Participant has to create a caricature of a famous personality on the condition that it should not depict that person’s real profession. \n" +
                    "It should, in some way depict him/her in some other profession.  \n" +
                    "The contest begins on August 1st week and the closing date for receipt of entries is extended to October 2nd week \n" +
                    "All dates are subject to change.  \n" +
                    "To enter the contest, send the entries to the email id announced through our social media platforms. \n" +
                    "Only one entry per participant will be entertained.  \n" +
                    "The participant should mention their name and college name in the mail. \n" +
                    "\n" +
                    "Judging criteria:\n" +
                    "Drawing skills  \n" +
                    "Creativity \n" +
                    "The transformation that has been brought to the person’s personality/profession.");
        }
        if (event_name_string.equals("Let's Doodle")){
            about_event.setText("Event Rules:  \n" +
                    "The Contest begins on August 1st week and the closing date for receipt of entries is extended to October2nd week (“Contest Period”). All dates are subject to change.  \n" +
                    "The contestant is required to use the Waves official logo in their doodle art (logo of any year would do).  \n" +
                    "To enter the Contest, send the entries by scanning them and posting them to the email id announced through our social media platforms.  \n" +
                    "Only one entry per participant will be entertained.  \n" +
                    "The participant should mention their name and college name in the mail. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Drawing skills  \n" +
                    "Creativity  \n" +
                    "Originality - considering use of the Waves logo, as well as the unique and novel approach to the Doodle.");
        }
        if (event_name_string.equals("Affiche")){
            about_event.setText("Round 1: (ONLINE):  \n" +
                    "The theme for the poster will be released through our social media platforms  \n" +
                    "Individual entries. Link for registration and further instructions will be up on our social media platforms.\n" +
                    "\n" +
                    "Round 2: (OFFLINE)  \n" +
                    "This is an on-fest event.  \n" +
                    "Topics on which the poster has to be made will be given on spot.  \n" +
                    "Time Duration is 120 minutes \n" +
                    "A-4 size sheets will be provided by us.  \n" +
                    "Participants are supposed to carry their own paints, brushes etc. \n" +
                    "\n" +
                    "Judging Criteria: \n" +
                    "Creativity  \n" +
                    "Caption  \n" +
                    "Other parameters and weightage to be decided by the judges and they will be communicated to the participants before the event commences. ");
        }
        if (event_name_string.equals("Portrature")){
            about_event.setText("Event Rules:  \n" +
                    "\n" +
                    "Each participant is required to make a sketch of the live model provided.  \n" +
                    "Participants shall be provided with some drawing and colouring material.  \n" +
                    "Participants should use only the materials provided to them. \n" +
                    "Use of other material may lead to disqualification. \n" +
                    "Other instructions shall be given on the spot.\n");
        }
        if (event_name_string.equals("Blind Art")){
            about_event.setText("Event Rules:  \n" +
                    "The event requires one member (handcuffed) to describe a given drawing/painting to the other member (blindfolded) who will have to draw it. \n" +
                    "Required drawing material will be provided.  \n" +
                    "Judging will be based on the resemblance to the given drawing/painting.  \n" +
                    "Other instructions will be given on the spot");
        }
        if (event_name_string.equals("Inverse")){
            about_event.setText("General Rules:  \n" +
                    "This event is all about presenting the spoken word. Blank verses or meters, first love or breakup poem, humorous poems or melancholic ones, we are on the lookout for all styles of poetry.  \n" +
                    "Regionals for InVerse, the Waves Poetry Slam, will be held in Pune, Mumbai, Goa and Bangalore.  \n" +
                    "The contestants will have to perform in the English language.  \n" +
                    "The contestants will have to perform in the English language.  \n" +
                    "Each poet must perform only original work that he/she has created.  \n" +
                    "The poet may not use props, costumes, or musical instruments.  \n" +
                    "Vulgarity for vulgarity's sake will be penalised.\n" +
                    "\n" +
                    "Event Rules\n" +
                    " \n" +
                    "Elimination Round  \n" +
                    "At the time of online registration, which will open a few weeks before the event, the participant will have to submit their poems online. \n" +
                    "Not more than 20 will be selected from each city.  \n" +
                    "Each poet gets 3 minutes to read out their poems. A 10 second grace period after the 3:00 mark will be given.  \n" +
                    "After 3:10 mark, a penalty of -0.5 is added to the score for every 10 seconds over time.  \n" +
                    "The number of contestants chosen to go through to the Finals will depend on the total number of contestants in the city. \n" +
                    "\n" +
                    "Final round  \n" +
                    "The finals will be held in BITS Goa during Waves 2017.  \n" +
                    "Each poet gets 3 minutes to read out their poems. A 10 second grace period after the 3:00 mark will be given.  \n" +
                    "After 3:10 mark, a penalty of -0.5 is added to the score for every 10 seconds over time. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "The judges will give each poem a score from 0 to 10, with 10 being the highest or “perfect” score. \n" +
                    "They will be encouraged to use one decimal place in order to preclude the likelihood of a tie.  \n" +
                    "The decision of the judging panel is final and absolute.");
        }
        if (event_name_string.equals("Cultural Gauntlet")){
            about_event.setText("Event Rules : \n" +
                    "\n" +
                    "Round 1 : JAM  \n" +
                    "Participants will be grouped into sets of 6, by the judges  \n" +
                    "Each group shall go through at least one round of regular JAM and one round of special JAM like Alphabet JAM or Disconnect JAM, the rules for which shall be explained in detail on the spot.  \n" +
                    "Points will be awarded based on the duration for which a contestant speaks without slurring or making grammatical errors.  \n" +
                    "The 15 best JAMmers will move on to the next round  \n" +
                    "It is not necessary that one JAMmer is selected from every set. \n" +
                    "\n" +
                    "Time- 120 to 150 minutes \n" +
                    "\n" +
                    "Round 2 SHIPWRECK  \n" +
                    "Contestants are allotted a famous personality and placed on a hypothetical sinking ship (there is a potential 'Waves' pun in there somewhere).  \n" +
                    "They have to try to convince the judges (who will be acting as the captain of the ship) to give them the sole life jacket on the ship, roleplaying as this person.  \n" +
                    "Points are given for creativity and humour and the judge's decision will be final \n" +
                    "\n" +
                    "BLOCK AND TACKLE  \n" +
                    "Contestants are given specific topics by the judges.  \n" +
                    "The judges will give them commands (in any order and frequency) - \n" +
                    "'Block'- Where the contestants defend the topic and \n" +
                    "'Tackle' - Where they oppose the topic.  \n" +
                    "Points to be given on transition, humour, creativity, and smoothness of the performance. \n" +
                    "Time - 90 to 120 minutes");
        }
        if (event_name_string.equals("Mela Quiz")){
            about_event.setText("General Rules :  \n" +
                    "As the name indicates, the theme of the quiz will be 'Music, Entertainment, Literature and Art'  \n" +
                    "A 30 question elimination round will be held first, with the 6 highest scoring teams moving on to the Finals.  \n" +
                    "A number of different types of Quiz rounds will be held in the Finals");
        }
        if (event_name_string.equals("Word Games")){
            about_event.setText(" General Rules :  \n" +
                    "A general question paper will be given to the participants (lonewolf or teams of two) comprising standard word games like (but not limited to)- \n" +
                    "1. Puns \n" +
                    "2. Anagrams \n" +
                    "3. Rebuses \n" +
                    "4. Crossword \n" +
                    "5. Pangrams  \n" +
                    "\n" +
                    "Participant with highest points wins the competition.");
        }
        if (event_name_string.equals("Sho(r)t")){
            about_event.setText("Event Rules:  \n" +
                    "The short film should not exceed 7 minutes in duration including titles and credits.  \n" +
                    "Films should not have been previously published in any media.  \n" +
                    "Participation in this competition grants Waves to show the entered film on the Internet.  \n" +
                    "The video must be in MP4 or avi format.  \n" +
                    "Include a short synopsis for the entry.  \n" +
                    "Entries in other languages must have English subtitles  \n" +
                    "This is an online event. \n" +
                    "The registered teams will have to submit their work before the given deadline.  \n" +
                    "The theme for the movie will be released through our social media platforms. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Direction  \n" +
                    "Acting  \n" +
                    "Editing  \n" +
                    "Cinematography  \n" +
                    "Story  \n" +
                    "Script  \n" +
                    "Audio");
        }
        if (event_name_string.equals("Oh Snap!")){
            about_event.setText("Event Rules:  \n" +
                    "Photos must meet the following requirements: JPG or JPEG file format, 72dpi. Ideally, the photo dimensions should be 1024x768 pixels.  \n" +
                    "Photographs should not have been previously published in any print and digital media.  \n" +
                    "Minimal photo editing is permissible, but altering the photograph is not allowed. \n" +
                    "We assume that every photo submission is legitimate. \n" +
                    "However, if a photo is suspected of alteration, it will be rejected. \n" +
                    "The final decision rests with the Waves Controls.  \n" +
                    "By submitting your photographs you accept that you are the copyright owner of the photograph and that you agree to our terms and conditions. \n" +
                    "Every picture should have a suitable caption pertaining to the theme  \n" +
                    "No camera restriction.  \n" +
                    "Theme for the event will be released through our social media platform. \n" +
                    "\n" +
                    "\n" +
                    "Judging Criteria: \n" +
                    "Creativity  \n" +
                    "Aesthetic Appeal  \n" +
                    "Technical Skills displayed  \n" +
                    "Theme representation");
        }
        if (event_name_string.equals("Waves Open")){
            about_event.setText("General Rules :  \n" +
                    "It is an open event.\n" +
                    "Hence, cross college teams and non-college participation is also allowed.  \n" +
                    "The eliminations will be held in a standard written format  \n" +
                    "The top 6 teams shall proceed to an interactive final.  \n" +
                    "The final will consist of numerous rounds that will be conducted by the quizmaster on the spot.  \n" +
                    "The quizmaster’s decision is final and binding");
        }
        if (event_name_string.equals("Wipro Quiz")){
            about_event.setText("General Rules:  \n" +
                    "It is an open event. Hence, cross college teams and non-college participation is also allowed.  \n" +
                    "The eliminations will be held in a standard written format  \n" +
                    "The top 6 teams shall proceed to an interactive final.  \n" +
                    "The final will consist of numerous rounds that will be conducted by the quizmaster on the spot.  \n" +
                    "The quizmaster’s decision is final and binding.");
        }
        if (event_name_string.equals("Vice Quiz")){
            about_event.setText("General Rules:\n" +
                    "The quiz shall be based on vices, a BITS Goa special  \n" +
                    "Everything under the banner of simply wrong and outright immoral can be included.  \n" +
                    "The eliminations will be held in a standard written format.  \n" +
                    "The top 6 teams shall proceed to an interactive final");
        }
        if (event_name_string.equals("Quiz In Two Shades")){
            about_event.setText("General Rules:  \n" +
                    "The eliminations will be held in a standard written format.  \n" +
                    "The top 6 teams shall proceed to an interactive final.  \n" +
                    "The quizmaster’s decision is final and binding");
        }
        if (event_name_string.equals("Lonewolf")){
            about_event.setText("General Rules:  \n" +
                    "The quiz shall be based on a general theme  \n" +
                    "The eliminations will be held in a standard written format.  \n" +
                    "The top 6 quizzers shall proceed to an interactive final.  \n" +
                    "The final will consist of numerous rounds that will be conducted by the quizmaster on the spot.  \n" +
                    "The quizmaster’s decision is final and binding." );
        }
        if (event_name_string.equals("Contention")){
            about_event.setText("General Rules:  \n" +
                    "There is no institutional team cap; however, an institution may be asked to register only a specified number of teams if the overall team cap of the tournament is being crossed.  \n" +
                    "The number of pre break rounds will be subject to the number of participating teams.  \n" +
                    "Pre break Rounds will be followed by 16 teams breaking into the next round.  \n" +
                    "A novice break will occur depending on the number of novice teams in the tournament.  \n" +
                    "The tournament will run throughout the duration of the festival. Hence, the participants are requested to refrain from participating in other events.\n" +
                    "For more details and updates on the registration process, visit : https://www.facebook.com/ldcbitsg regularly  \n" +
                    "If you feel that you are an experienced adjudicator, write a mail to us at contention@bitswaves.org with your previous tournament experience and other necessary details. \n" +
                    "If you have a query, write to us at events@bits-waves.org \n" +
                    "\n" +
                    "Event Rules:  \n" +
                    "The Debate will follow the British Parliamentary format.  \n" +
                    "Each team will consist of two participants  \n" +
                    "The debate follows the n-1 rule where every n teams belonging to an institutional contingent must accompanied by n-1 adjudicators  \n" +
                    "The tournament will run on all three days of the festival  \n" +
                    "The adjudication test will be held on day 0 of the tournament. \n" +
                    "The format of the adjudication test will be decided by the adjudication core of the tournament  \n" +
                    "Institutional cross teams are allowed.  \n" +
                    "Independent adjudicators are welcome to participate. However, one must have attended an educational institution sometime in the past 6 months  \n" +
                    "Subsidies will be provided to selected adjudicators. \n" +
                    "This judge subsidy will depend on previous debating and adjudication experience  \n" +
                    "There is an overall team cap of 52 teams. The first 52 teams to register for the tournament will be given the first preference, while the following teams will be put up in a wait list \n" +
                    "\n" +
                    "\n" +
                    "Judging Criteria: \n" +
                    "Independent external adjudicators have been invited to judge the event.");
        }
        if (event_name_string.equals("FashP")){
            about_event.setText("General Rules:  \n" +
                    "Background tracks are a must for each performance.  \n" +
                    "Any deviation from a fashion related choreography will lead to deduction in score. \n" +
                    "The backstage crew must not exceed 5 people and the crew members should be declared before the eliminations starts.  \n" +
                    "Use of water, fire or any kind of fireworks(party poppers included) will lead to immediate disqualification.  \n" +
                    "Points will be deducted for any form vulgarity or dance movements in the act.  \n" +
                    "\n" +
                    "Elimination Round:  \n" +
                    "This round is impromptu and the focus is on the presentation. The choreography and soundtrack are not relevant in this round.  \n" +
                    "Teams should submit a write up containing information regarding duration, number of participants and props used etc. before the elimination round commences.  \n" +
                    "Teams must also submit their background tracks(Pen drives) before the elimination round begins.  \n" +
                    "The judging criteria for this round is how well you present the theme of the act. A preview of the line-up and basic portrayal of the theme will suffice. In simple terms it is to verify that the theme of the show has been portrayed properly. \n" +
                    "Final Round:  \n" +
                    "Each team has to perform their act on the lines of the theme portrayed in the eliminations.  \n" +
                    "Emphasis will be on clothing, the walk , the use of props and music to enhance the act and its originality");
        }
        if (event_name_string.equals("Moot Court")){
            about_event.setText("Event Rules:  \n" +
                    "Participating teams should consist of two mooters and two researchers.  \n" +
                    "Participants must be regular bonafide students of their institution and enrolled in either undergraduate 5-year integrated L.L.B or 3- year Degree Law Programmes. \n" +
                    "Invitation for the competition shall be subject to a maximum participation of 36 teams on an elimination based on the memorials.  \n" +
                    "The event will consist of Preliminary Rounds, Quarter Finals, Semi Finals and the Final.  \n" +
                    "Each team shall compulsorily present oral arguments for both sides – claimant and respondent in the preliminary rounds.  \n" +
                    "The top 8 teams from the oral rounds will be selected for the quarter finals provided the team has won both preliminary rounds.  \n" +
                    "The quarter finals and the semi finals will be knockout rounds.\n" +
                    "\n" +
                    "Timings of the Event:  \n" +
                    "Day 0: Orientation.  \n" +
                    "Day 1: All day Preliminary Rounds.  \n" +
                    "Day 2: All day Advanced Rounds.  \n" +
                    "Day 3: 3-hour Final Round. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Marking Criteria for memorials will be provided in the Lex Omnia Rulebook.  \n" +
                    "Judging criteria for Oral Rounds will be announced during orientation. NOTE: Detailed rules regarding eligibility and other event rules are provided in the Lex Omnia Rulebook.");
        }
        if (event_name_string.equals("Mr and Ms Waves")){
            about_event.setText("Event Rules:\n" +
                    "• Candidates can register either on day 1 of the fest or online. \n" +
                    "• No registrations will be allowed past the deadline. \n" +
                    "• The deadline for the registrations will be announced at a later stage. \n" +
                    "• The event will be conducted in multiple rounds.\n" +
                    "• There will be 4 on-fest rounds spanning over the 3 days of the festival.\n" +
                    "• Candidates will be eliminated at the end of each round, based upon the points they scored in the previous rounds. \n" +
                    "• The on-fest rounds will try and evaluate the participant's personality, talent, appeal, wit, humor and presence of mind during various rounds. \n" +
                    "• The various rounds: \n" +
                    "    o Day1- Written Rounds/Personal Interview/Group Discussion. \n" +
                    "    o Day2- Series of tasks. \n" +
                    "    o Day3- Final auditorium round. \n" +
                    "• The validity of all the tasks performed would be witnessed by an organizer at all times. \n" +
                    "• In case of any discrepancies, the final decision will rest in the hands of the organizing committee. \n" +
                    "• The most enigmatic duo would become the next face of Waves.");
        }
        if (event_name_string.equals("SpinOff")){
            about_event.setText("Event Rules: \n" +
                    "\n" +
                    "Eliminations :  \n" +
                    "Each Contestant will be given 10 minutes to mix his/her tracks on stage. Pre Mixed tracks will not be considered and may result in disqualification of the contestant.  \n" +
                    "The Participants are allowed to use their own Headphones if required and allowed by the Honourable Judges.  \n" +
                    "Contestants may not use any external aid once his/her time begins on stage.  \n" +
                    "Winners shall qualify to participate in the finals during Waves 2017 at Goa.  \n" +
                    "Failure to abide by the Judges, Organising Committee and the rules set forth will result in immediate disqualification from the event.\n" +
                    "\n" +
                    "Semi-Finals and Finals :  \n" +
                    "Each Contestant will be given 10 minutes to mix his/her tracks on stage. Pre Mixed tracks will not be considered and may result in disqualification of the contestant.  \n" +
                    "The Participants are allowed to use their own Headphones if required and allowed by the Honourable Judges.  \n" +
                    "Contestants may not use any external aid once his/her time begins on stage.  \n" +
                    "Winner of Spin-off will get to perform on the EDM night of Waves  \n" +
                    "Failure to abide by the Judges, Waves Control and the rules set forth will result in immediate disqualification from the event. \n" +
                    "\n" +
                    "Judging Criteria: \n" +
                    "Contestants will be judged on the following factors out of a score of 10 (5+5). \n" +
                    "A score out of 5 based on the following (5):  \n" +
                    "    Mixing Techniques and Track Selection  \n" +
                    "    Response from the audience \n" +
                    "\n" +
                    "and another out of 5 based on (5)  \n" +
                    "    Micing (Mic Use)  \n" +
                    "    Body Language  \n" +
                    "    Appearance");
        }
        if (event_name_string.equals("Show Me The Funny")){
            about_event.setText("Event Rules:  \n" +
                    "The participants must strictly adhere to the allotted time(3-4 mins per person) , exceeding time limit may result in decrease of points.  \n" +
                    "Excessive use of vulgar language may result in decrease of points.  \n" +
                    "Plagiarised content shall result in disqualification.  \n" +
                    "Comedians must perform their act in Hindi or English only.  \n" +
                    "The judge’s decision shall be final in all cases. \n" +
                    "\n" +
                    "Judging Criteria:  \n" +
                    "Quality of Content  \n" +
                    "Audience response  \n" +
                    "Showmanship  \n" +
                    "Confidence " );
        }
        if (event_name_string.equals("Strangely Familiar")){
            about_event.setText("General Rules : \n" +
                    "Each participant will be allotted BITSIANS during registration and will be given the whole night to interact with each other. \n" +
                    "\n" +
                    "Event Rules: \n" +
                    "Round 1: \n" +
                    "Screen test (pen paper) \n" +
                    "General questions will be asked and you'll have to fill your answer and your partners answer. \n" +
                    "This round will check how well you know your partner.\n" +
                    "Based on most matched answers, Points will be allotted for each team. \n" +
                    "\n" +
                    "Round 2: \n" +
                    "Task round: \n" +
                    "Various team tasks will be given to check coordination and team work of the pair. The teams will be judged based on their speed of completion of tasks. \n" +
                    "\n" +
                    "Top 5 teams go to finals \n" +
                    "\n" +
                    "Final round \n" +
                    "Different rounds will be held with pair vs pair focusing on how well the team works in front of a crowd. Eliminations take place until 3 teams are left who compete for the title. Each team is scored according to their performance.");
        }
        if (event_name_string.equals("Searock")){
            about_event.setText(
                    "1) Bands selected for the City Eliminations agree to publicise the event through their online reach using the template sent to them by Searock.\n" +
                    "2) The decision made by Searock will be final and binding.\n" +
                    "3) Searock will not be responsible for any loss of property in any of the eliminations or the finals. The owner must take care of his/her belongings.\n" +
                    "4) Searock requires the participants to comply with the registration fee requirements (if any, depends from city to city).\n" +
                    "5) Searock will not provide any sort of travel or accommodation reimbursements or sponsorship. Bands are expected to manage their own expenses.\n" +
                    "6) Searock prize money is displayed as a total of winners' prize money and not only for the participant that comes first. The prize will be split amongst the winners in a ratio deemed fit by the organizers. In case of Sponsorship back out Searock organizing committee holds the right to decrease prize money by a certain percentage as deemed required.\n" +
                    "7) Searock will set strict rules regarding the time limits of performing for each band. Failure to comply with the timing rules being provided will result in the sound being cut from the console.\n" +
                    "8) The winning bands will get to play at the stage where the English act and the coheadlining act will perform, prior to their performance, in the finals. All rules briefed before getting on to the Main Stage in Goa should be followed strictly.\n" +
                    "9) The Searock organizers reserve the right to cancel the registration of any band if it is deemed fit. This may include misbehaviour with the organizing committee, judges or defamation of the sponsors, partners and associates during any Searock event. Searock may blacklist such bands from participating in Searock in any future editions as well.\n" +
                    "10) No one except the band members will be allowed free entry to the fest in Goa. Band managers wonâ€™t be counted as a band member and will have to pay the entry fee as mentioned at the gate by Department of Registration and Hospitality, BITS Pilani, Goa Campus.\n" +
                    "11) Any change in the rules and regulations, along with the drafting of these rules, will be done by the Searock organizers and based on their discretion. Notice to which will be provided well in advance.\n" +
                    "12) In no circumstance can the members of Searock Organizing committee, Council for Students Affairs BITS Pilani Goa Campus, Waves Organizing committee, or any partner/sponsor be sued over any Searock specific conflict. Decision of Searock Organizing committee shall be final and binding.\n" +
                    "13) Any band selected for city eliminations must inform Searock team if it is unable to participate in not less than two days prior to the event. If it fails to do so, the band will be disqualified from registering in any future Searock editions.\n" +
                    "14) No band will be given any relaxation to any of the aforementioned rules. ");
        }
        if (event_name_string.equals("Inauguration")){
            about_event.setText("No Rules Here Really. Just sit back and enjoy");
        }
        if (event_name_string.equals("Spin Off")){
            about_event.setText("Eliminations :\n" +
                    "\uF0B7 Each Contestant will be given 10 minutes to mix his/her tracks on\n" +
                    "stage. Pre Mixed tracks will not be considered and may result in\n" +
                    "disqualification of the contestant.\n" +
                    "\uF0B7 The Participants are allowed to use their own Headphones if required\n" +
                    "and allowed by the Honourable Judges.\n" +
                    "\uF0B7 Contestants may not use any external aid once his/her time begins on\n" +
                    "stage.\n" +
                    "\uF0B7 Winners shall qualify to participate in the finals during Waves 2017 at\n" +
                    "Goa.\n" +
                    "\uF0B7 Failure to abide by the Judges, Organising Committee and the rules set\n" +
                    "forth will result in immediate disqualification from the event.\n" +
                    "68Semi-Finals and Finals :\n" +
                    "\uF0B7 Each Contestant will be given 10 minutes to mix his/her tracks on stage.\n" +
                    "Pre Mixed tracks will not be considered and may result in disqualification\n" +
                    "of the contestant.\n" +
                    "\uF0B7 The Participants are allowed to use their own Headphones if required and\n" +
                    "allowed by the Honourable Judges.\n" +
                    "\uF0B7 Contestants may not use any external aid once his/her time begins on\n" +
                    "stage.\n" +
                    "\uF0B7 Winner of Spin-off will get to perform on the EDM night of Waves\n" +
                    "\uF0B7 Failure to abide by the Judges, Waves Control and the rules set forth will\n" +
                    "result in immediate disqualification from the event.\n" +
                    "Judging Criteria:\n" +
                    "Contestants will be judged on the following factors out of a score of 10\n" +
                    "(5+5).\n" +
                    "A score out of 5 based on the following (5):\n" +
                    "\uF0B7 Mixing Techniques and Track Selection\n" +
                    "\uF0B7 Response from the audience\n" +
                    "and another out of 5 based on (5)\n" +
                    "\uF0B7 Micing (Mic Use)\n" +
                    "\uF0B7 Body Language\n" +
                    "\uF0B7 Appearance");
        }
        return view;
    }
}

