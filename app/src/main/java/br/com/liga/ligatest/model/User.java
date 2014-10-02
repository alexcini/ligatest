package br.com.liga.ligatest.model;

/**
 * Created by heiderlopes on 02/10/14.
 */
public class User {
    private String identifier;
    private String name;
    private String username;
    private String birthDate;
    private String email;
    private double anonymous;
    private String profilePicture;
    private String termsAcceptedVersion;
    private int timezone;
    private boolean active;
    private String locationDateTime;
    private double latitude;
    private double longitude;
    private String dateTime;
    private int privileges;
    private boolean hidden;
    private String gender;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(double anonymous) {
        this.anonymous = anonymous;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getTermsAcceptedVersion() {
        return termsAcceptedVersion;
    }

    public void setTermsAcceptedVersion(String termsAcceptedVersion) {
        this.termsAcceptedVersion = termsAcceptedVersion;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLocationDateTime() {
        return locationDateTime;
    }

    public void setLocationDateTime(String locationDateTime) {
        this.locationDateTime = locationDateTime;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getPrivileges() {
        return privileges;
    }

    public void setPrivileges(int privileges) {
        this.privileges = privileges;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
