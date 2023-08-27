package kz.dar.universuty.post.core.api.controller;

import kz.dar.universuty.post.core.api.domain.PostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.PostService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public String check() {
        return "post-core-api is working";

    }

    @PostMapping
    public void createPost(@RequestBody @Valid PostDTO postDTO) {

    }

    @GetMapping("/all")
    public List<PostDTO> getAllPosts() {
        return postService.getAllPosts();

    }

    @GetMapping("/postId")
    public PostDTO getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);

    }

    @PutMapping("/{postId}")
    public void updatePostByid(@PathVariable String postId, @RequestBody PostDTO postDTO) {
        postDTO.setPostId(postId);
        postService.updatePostById(postDTO);
    }

    @DeleteMapping("{postId}")
    public void deletePostById(@PathVariable String postId) {
        postService.deletePostById(postId);

    }

}
