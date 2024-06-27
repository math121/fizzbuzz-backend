package org.demo.fizzbuzzbackend.dtos;

import java.time.LocalDateTime;

public record ScoreboardDTO(String userName, LocalDateTime time, int score) {
}
