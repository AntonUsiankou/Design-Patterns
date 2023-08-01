package social_networks;

import iterators.FacebookIterator;
import iterators.LinkedInIterator;
import iterators.ProfileIterator;
import profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork{
    private List<Profile> contatcts;

    public LinkedIn(List<Profile> cache){
        if(cache != null) {
            this.contatcts = cache;
        }else{
            this.contatcts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail){
        //Here would be a POST request to one of the Facebook API endpoints.
        //Instead, we emulates long network connection, which you would expect
        //In real life...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "'over the network...");

        // ...and return test data.
        return findContact(profileEmail);

    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType){
        //Here would be a POST request to one of the Facebook API endpoints.
        //Instead, we emulates long network connection, which you would expect
        //In real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "'list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findContact(profileEmail);
        if(profile != null){
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail){
        for(Profile profile : contatcts){
            if(profile.getEmail().equals(profileEmail)){
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency(){
        try{
            Thread.sleep(2500);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
