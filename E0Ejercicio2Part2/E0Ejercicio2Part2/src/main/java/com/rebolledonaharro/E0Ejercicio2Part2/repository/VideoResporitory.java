package com.rebolledonaharro.E0Ejercicio2Part2.repository;

import com.rebolledonaharro.E0Ejercicio2Part2.modals.Video;
import com.rebolledonaharro.E0Ejercicio2Part2.modals.VideoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoResporitory extends JpaRepository<Video, VideoPK> {
}
