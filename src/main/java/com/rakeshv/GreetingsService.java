package com.rakeshv;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsService {
    public static String greetings[] = { "Someday is not a day of the week", "Hire character. Train skill",
            "Your time is limited, so don't waste it living someone else's life", "Everyone lives by selling something",
            "If you cannot do great things, do small things in a great way",
            "Always do your best. What you plant now, you will harvest later",
            "The key to life is accepting challenges. Once someone stops doing this, he's dead",
            "I didn't get there by wishing for it or hoping for it, but by working for it.",
            "Don't let the fear of losing be greater than the excitement of winning",
            "Energy and persistence conquer all things.", "Perseverance is failing 19 times and succeeding the 20th",
            "Action is the foundational key to all success",
            "The ladder of success is best climbed by stepping on the rungs of opportunity",
            "Formula for success: rise early, work hard, strike oil",
            "Obstacles are those frightful things you see when you take your eyes off your goal",
            "It is your determination and persistence that will make you a successful person",
            "You can waste your lives drawing lines. Or you can live your life crossing them",
            "Done is better than perfect", "Don't ask if your dream is crazy, ask if it's crazy enough",
            "The act of doing something un-does the fear", "#1 make good decisions, #2 everything else",
            "Beautiful things happen when you distance yourself from negativity",
            "Yesterday is gone. Tomorrow has not yet come. We have only today. Let us begin",
            "The courage to continue is what distinguishes success from failure",
            "Never be too busy to meet someone new", "Confidence is something you create when you believe in yourself",
            "Dream your dreams with your eyes closed, but live your dreams with your eyes open.",
            "The better you feel about yourself, The less you feel the need to show off.",
            "If you want to achieve greatness stop asking for permission.",
            "A good head and a good heart are always a formidable combination",
            "Never be ashamed of your past. It’s all part of what made you the amazing person you are today",
            "Positive start will work better than a negative one!",
            "Don’t let small minds convince you that your dreams are too big",
            "Don’t be discouraged. It’s often the last key in the bunch that opens the lock",
            "Its meaning in your life that causes you to have ideas that will help people",
            "Man needs difficulties in life because they are necessary to enjoy the success",
            "Raise your words, not your voice. It is rain that grows flowers, not thunder",
            "Life is like a ten-speed bike. Most of us have gears we never use",
            "We’d achieve more if we chased our dreams instead of our competition",
            "A wise man gets more use from his enemies than a fool from his friends",
            "You may never know what results come of your actions, but if you do nothing, there will be no results",
            "Mistakes are the stairs we climb to reach success",
            "Success will not lower its standard to us. We must raise our standard to success.",
            "Don’t give other people permission to ruin your day.",
            "One Small positive thought in morning can change your whole day",
            "Celebrate the small things and our lives become bigger than ever.",
            "Your life is short. You have no clue when this ride will end. Stay present and live fearlessly",
            "Change your thoughts and you’ll change your world." };

    public String getGreetings() {
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        return greetings[index];
    }
}