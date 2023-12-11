package com.api.uploaddownload.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
  private String fileName;
  private String fileType;
  private String downloadURL;
  private long fileSize;
}
