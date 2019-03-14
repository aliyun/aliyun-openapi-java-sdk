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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.GetSimilarPhotosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSimilarPhotosResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private List<Photo> photos;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizAction() {
		return this.action;
	}

	public void setBizAction(String action) {
		this.action = action;
	}

	/**
	 * @deprecated use getBizAction instead of this.
	 */
	@Deprecated
	public String getAction() {
		return this.action;
	}

	/**
	 * @deprecated use setBizAction instead of this.
	 */
	@Deprecated
	public void setAction(String action) {
		this.action = action;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public static class Photo {

		private Long id;

		private String idStr;

		private String title;

		private String fileId;

		private String location;

		private String state;

		private String md5;

		private Boolean isVideo;

		private String remark;

		private Long size;

		private Long width;

		private Long height;

		private Long ctime;

		private Long mtime;

		private Long takenAt;

		private Long inactiveTime;

		private Long shareExpireTime;

		private Long like;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIdStr() {
			return this.idStr;
		}

		public void setIdStr(String idStr) {
			this.idStr = idStr;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public Boolean getIsVideo() {
			return this.isVideo;
		}

		public void setIsVideo(Boolean isVideo) {
			this.isVideo = isVideo;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getCtime() {
			return this.ctime;
		}

		public void setCtime(Long ctime) {
			this.ctime = ctime;
		}

		public Long getMtime() {
			return this.mtime;
		}

		public void setMtime(Long mtime) {
			this.mtime = mtime;
		}

		public Long getTakenAt() {
			return this.takenAt;
		}

		public void setTakenAt(Long takenAt) {
			this.takenAt = takenAt;
		}

		public Long getInactiveTime() {
			return this.inactiveTime;
		}

		public void setInactiveTime(Long inactiveTime) {
			this.inactiveTime = inactiveTime;
		}

		public Long getShareExpireTime() {
			return this.shareExpireTime;
		}

		public void setShareExpireTime(Long shareExpireTime) {
			this.shareExpireTime = shareExpireTime;
		}

		public Long getLike() {
			return this.like;
		}

		public void setLike(Long like) {
			this.like = like;
		}
	}

	@Override
	public GetSimilarPhotosResponse getInstance(UnmarshallerContext context) {
		return	GetSimilarPhotosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
