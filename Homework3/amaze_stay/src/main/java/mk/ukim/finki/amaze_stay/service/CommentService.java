package mk.ukim.finki.amaze_stay.service;


import mk.ukim.finki.amaze_stay.DTO.HotelCommentDTO;
import mk.ukim.finki.amaze_stay.model.Comment;
import mk.ukim.finki.amaze_stay.model.Hotel;
import mk.ukim.finki.amaze_stay.model.User;

import java.util.List;

public interface CommentService {
    List<Comment> findCommentsByHotel(Hotel hotel);
    List<Hotel> addNewComment(String comment, User user, Hotel hotel, float rating);
}