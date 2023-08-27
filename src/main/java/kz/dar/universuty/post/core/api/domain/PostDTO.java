package kz.dar.universuty.post.core.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDTO {
    private String postId;
    @NotNull(message = "ClientID can not be null")
    private String clientId;
    @NotNull(message = "Post  Recipient Id can not be null")
    private String postRecipientId;
    @NotNull(message = "Post item can not be null")
    private String postItem;
    private String status;
}
