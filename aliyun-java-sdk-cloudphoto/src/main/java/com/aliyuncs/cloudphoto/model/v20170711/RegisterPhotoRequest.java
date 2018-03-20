/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class RegisterPhotoRequest extends RpcAcsRequest<RegisterPhotoResponse> {
	
	public RegisterPhotoRequest() {
		super("CloudPhoto", "2017-07-11", "RegisterPhoto", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String libraryId;

	private Float latitude;

	private String photoTitle;

	private String storeName;

	private String isVideo;

	private String remark;

	private Long size;

	private Long takenAt;

	private Integer width;

	private String location;

	private Float longitude;

	private Integer height;

	private String md5;

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
		if(latitude != null){
			putQueryParameter("Latitude", latitude.toString());
		}
	}

	public String getPhotoTitle() {
		return this.photoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
		if(photoTitle != null){
			putQueryParameter("PhotoTitle", photoTitle);
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getIsVideo() {
		return this.isVideo;
	}

	public void setIsVideo(String isVideo) {
		this.isVideo = isVideo;
		if(isVideo != null){
			putQueryParameter("IsVideo", isVideo);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Long getTakenAt() {
		return this.takenAt;
	}

	public void setTakenAt(Long takenAt) {
		this.takenAt = takenAt;
		if(takenAt != null){
			putQueryParameter("TakenAt", takenAt.toString());
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
		if(longitude != null){
			putQueryParameter("Longitude", longitude.toString());
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putQueryParameter("Md5", md5);
		}
	}

	@Override
	public Class<RegisterPhotoResponse> getResponseClass() {
		return RegisterPhotoResponse.class;
	}

}
