package com.web.fashion.fashion.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name = "listImage")
@Builder
public class Image {
}
