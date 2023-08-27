package service;

import kz.dar.universuty.post.core.api.domain.PostDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import static java.time.chrono.JapaneseEra.values;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

@Service
public class PostServiceImpl implements PostService {


   HashMap<String, PostDTO> pasts = new HashMap<>();
    @Override
    public void createPost(PostDTO postDTO) {
        pasts.put(postDTO.getPostId(),postDTO);

    }

    @Override
    public List<PostDTO> getAllPosts() {

        return pasts.values().stream().toList();
    }

    @Override
    public PostDTO getPostById(String postId) {
     return pasts.get(postId);

    }

    @Override
    public void updatePostById(PostDTO postDTO) {

     if (pasts.containsKey((postDTO).getPostId())){

      createPost(postDTO);
     }
    }

    @Override
    public void deletePostById(String postId) {
     pasts.remove(postId);

    }
}
