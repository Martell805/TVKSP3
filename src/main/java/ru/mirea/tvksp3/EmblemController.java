package ru.mirea.tvksp3;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class EmblemController {
    @GetMapping(value = "/emblem")
    public ResponseEntity<byte[]> getImage() throws IOException {
        byte[] image = Files.readAllBytes(Path.of("/root/static/mirea/logo.png"));

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
}
