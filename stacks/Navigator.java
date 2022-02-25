package stacks;

import java.util.Stack;
/*
The navigator class uses methods from the StackList with backLinks stack & forwardLinks stack to
navigate links given by the user.

public class Navigator {
    String currentLink;
    StackList<String> backLinks = new StackList<String>();
    StackList<String> forwardLinks = new StackList<String>();
    /*
    constructor for navigator to initialize the attributes
     */
    public Navigator() {
        currentLink = null;
        backLinks = new StackList<>("Back");
        forwardLinks = new StackList<>("forward");
    }

    /*
    Getter for currentlink. Returns the currentLink
     */
    public String getCurrentLink() {
        return currentLink;
    }
    /*
   Getter for backLink. Returns the backLink
    */
    public StackList<String> getBackLinks() {
       return backLinks;
    }
    /*
   Getter for forwardLink. Returns the backLink
    */
    public StackList<String> getForwardLinks() {
        return forwardLinks;
    }
    /*
    Sets up the links. If there's no Link, it sets
    up currentLink to the given address.
    Also updates backLinks & forwardLinks
    */
    public void setCurrentLink(String linkName) {
        if (currentLink == null) {
            currentLink = linkName;
        }
        else {
            backLinks.push(currentLink);
            currentLink = linkName;
            forwardLinks.clear();;
        }
        
    }
    /*
    This is the backLink button. pops the backLink
     */
    public void goBack() {
        if (backLinks.isEmpty()) {
            System.out.println("Sorry mate, there is no previous link");
        }
        else {
            forwardLinks.push(currentLink);
            currentLink = backLinks.pop();
        }

    }
    /*/
    This is the forwardLink button. pops the forwardLink
     */
    public void goForward() {
        if (forwardLinks.isEmpty()) {
            System.out.println("Sorry mate, there is no next link");
        }
        else {
            backLinks.push(currentLink);
            currentLink = forwardLinks.pop();
        }
    }

}
