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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.ListFaceSearchGroupImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFaceSearchGroupImagesResponse extends AcsResponse {

	private String requestId;

	private String nextMarker;

	private String groupName;

	private String groupId;

	private List<ImagesItem> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String user;

		private String imageId;

		private String imageUri;

		private String imageMd5;

		private Float roll;

		private String faceId;

		private Float yaw;

		private Float quality;

		private Integer glasses;

		private Integer hat;

		private Float pitch;

		private Integer age;

		private String gender;

		private List<String> axis;

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public String getImageMd5() {
			return this.imageMd5;
		}

		public void setImageMd5(String imageMd5) {
			this.imageMd5 = imageMd5;
		}

		public Float getRoll() {
			return this.roll;
		}

		public void setRoll(Float roll) {
			this.roll = roll;
		}

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public Float getYaw() {
			return this.yaw;
		}

		public void setYaw(Float yaw) {
			this.yaw = yaw;
		}

		public Float getQuality() {
			return this.quality;
		}

		public void setQuality(Float quality) {
			this.quality = quality;
		}

		public Integer getGlasses() {
			return this.glasses;
		}

		public void setGlasses(Integer glasses) {
			this.glasses = glasses;
		}

		public Integer getHat() {
			return this.hat;
		}

		public void setHat(Integer hat) {
			this.hat = hat;
		}

		public Float getPitch() {
			return this.pitch;
		}

		public void setPitch(Float pitch) {
			this.pitch = pitch;
		}

		public Integer getAge() {
			return this.age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public List<String> getAxis() {
			return this.axis;
		}

		public void setAxis(List<String> axis) {
			this.axis = axis;
		}
	}

	@Override
	public ListFaceSearchGroupImagesResponse getInstance(UnmarshallerContext context) {
		return	ListFaceSearchGroupImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
