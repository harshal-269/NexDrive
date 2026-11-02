package com.hdev.Drive_Service.dto;

import java.util.UUID;

public record FolderRequest(String name, UUID parentId) {
}
