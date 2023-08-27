package service;

import kz.dar.universuty.post.core.api.domain.PostDTO;

import java.util.List;

public interface PostService {

    void createPost(PostDTO postDTO);

    List<PostDTO> getAllPosts();

    PostDTO getPostById(String postId);

    void updatePostById(PostDTO postDTO);

    void deletePostById(String postId);

}
