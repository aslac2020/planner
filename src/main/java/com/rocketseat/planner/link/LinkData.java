package com.rocketseat.planner.link;

import java.time.LocalDateTime;
import java.util.UUID;

public record LinkData(UUID id, String title, String url) {
}
