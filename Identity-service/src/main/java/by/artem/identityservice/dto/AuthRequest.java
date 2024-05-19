package by.artem.identityservice.dto;

import jakarta.persistence.Entity;


public record AuthRequest(String username,
                          String password) {
}
