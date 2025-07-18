package com.coursegrade.CourseGraderBackend.dto;

import com.coursegrade.CourseGraderBackend.model.VoteType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoteResponseDTO {
    private String reviewId;
    private Integer upvoteCount;
    private Integer downvoteCount;
    private VoteType userVote; // null if no vote by current user
}
