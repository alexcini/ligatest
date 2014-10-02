package br.com.liga.ligatest.model;

/**
 * Created by heiderlopes on 02/10/14.
 */
public class TypeOccurrence {
    private String identifier;
    private String iconURL;
    private String title;
    private String description;
    private int dangerLevel;
    private int expireTimeInterval;
    private String friendlyPrefix;
    private String humanDescription;
    private String key;
    private String order;
    private String dateTime;
    private boolean active;
    private String excludeVersions;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public int getExpireTimeInterval() {
        return expireTimeInterval;
    }

    public void setExpireTimeInterval(int expireTimeInterval) {
        this.expireTimeInterval = expireTimeInterval;
    }

    public String getFriendlyPrefix() {
        return friendlyPrefix;
    }

    public void setFriendlyPrefix(String friendlyPrefix) {
        this.friendlyPrefix = friendlyPrefix;
    }

    public String getHumanDescription() {
        return humanDescription;
    }

    public void setHumanDescription(String humanDescription) {
        this.humanDescription = humanDescription;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getExcludeVersions() {
        return excludeVersions;
    }

    public void setExcludeVersions(String excludeVersions) {
        this.excludeVersions = excludeVersions;
    }
}
