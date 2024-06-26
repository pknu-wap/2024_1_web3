package com.my.kde_db.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Data
public class LeftProfile {
    private String number;
    private String name;
    private String nickname;
    private String introduction;
    private String pagename;
    // byte[] 타입 이미지 데이터 게터와 세터
    private MultipartFile imageFile; // 파일 업로드 필드
    private byte[] image; // 이 필드는 직접 바인딩하지 않음



    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }}