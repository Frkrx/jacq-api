package com.m2i.jacqapi.model;

import javax.persistence.*;
import java.time.LocalTime;

import static java.time.LocalTime.now;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private LocalTime createdAt;

    @Column
    private LocalTime modifiedAt;

    public Message() {
        this.createdAt = now();
    }

    public Message(Message message) {
        this.id = message.id;
        this.text = message.text;
        this.channel = message.channel;
        this.user = message.user;
        this.createdAt = message.createdAt;
        this.modifiedAt = message.modifiedAt;
    }

    public Message(Long id, String text, Channel channel, User user, LocalTime createdAt, LocalTime modifiedAt) {
        this.id = id;
        this.text = text;
        this.channel = channel;
        this.user = user;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Message(String text, Channel channel, User user, LocalTime createdAt, LocalTime modifiedAt) {
        this.text = text;
        this.channel = channel;
        this.user = user;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
