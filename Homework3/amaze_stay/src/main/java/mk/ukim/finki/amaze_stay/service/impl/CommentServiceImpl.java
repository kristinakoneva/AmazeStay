package mk.ukim.finki.amaze_stay.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import mk.ukim.finki.amaze_stay.DTO.HotelCommentDTO;
import mk.ukim.finki.amaze_stay.model.Comment;
import mk.ukim.finki.amaze_stay.model.Hotel;
import mk.ukim.finki.amaze_stay.model.User;
import mk.ukim.finki.amaze_stay.repository.mongorep.CommentRepository;
import mk.ukim.finki.amaze_stay.repository.mongorep.HotelRepository;
import mk.ukim.finki.amaze_stay.service.CommentService;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final HotelRepository hotelsRepository;

    @Override
    public List<Comment> findCommentsByHotel(Hotel hotel) {
        return this.commentRepository.findCommentsByHotel(hotel);
    }

    @Override
    public List<Hotel> addNewComment(String comm, User user, Hotel hotel, float rating) {
        Comment comment = new Comment(comm, user, hotel, rating);
        this.commentRepository.save(comment);
        return this.hotelsRepository.findAll();
    }
}