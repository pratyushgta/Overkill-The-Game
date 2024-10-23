package Overkill_Engine;

import java.util.Random;

public class AIEngine {

    private Random random;

    public AIEngine() {
        this.random = new Random();
    }

    // Simulate NPC behavior
    public String simulateNPCBehavior() {
        String[] behaviors = {"walking", "running", "attacking", "defending"};
        return behaviors[random.nextInt(behaviors.length)];
    }

    // Simulate decision-making
    public String makeDecision() {
        String[] decisions = {"attack", "defend", "flee", "negotiate"};
        return decisions[random.nextInt(decisions.length)];
    }

    // Simulate dynamic game events
    public String generateDynamicEvent() {
        String[] events = {"earthquake", "flood", "fire", "alien invasion"};
        return events[random.nextInt(events.length)];
    }

    // Integrate AI-driven interactions and challenges
    public String generateAIChallenge() {
        String[] challenges = {"solve puzzle", "defeat enemy", "find hidden item", "survive ambush"};
        return challenges[random.nextInt(challenges.length)];
    }
}
