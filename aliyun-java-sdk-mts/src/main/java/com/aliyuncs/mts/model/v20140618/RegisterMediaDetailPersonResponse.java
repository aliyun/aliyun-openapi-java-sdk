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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.RegisterMediaDetailPersonResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterMediaDetailPersonResponse extends AcsResponse {

	private String requestId;

	private List<RegisteredPersonage> registeredPersonages;

	private List<FailedImage> failedImages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegisteredPersonage> getRegisteredPersonages() {
		return this.registeredPersonages;
	}

	public void setRegisteredPersonages(List<RegisteredPersonage> registeredPersonages) {
		this.registeredPersonages = registeredPersonages;
	}

	public List<FailedImage> getFailedImages() {
		return this.failedImages;
	}

	public void setFailedImages(List<FailedImage> failedImages) {
		this.failedImages = failedImages;
	}

	public static class RegisteredPersonage {

		private String quality;

		private String personName;

		private String gender;

		private String faceId;

		private String target;

		private String imageId;

		private ImageFile imageFile;

		public String getQuality() {
			return this.quality;
		}

		public void setQuality(String quality) {
			this.quality = quality;
		}

		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public ImageFile getImageFile() {
			return this.imageFile;
		}

		public void setImageFile(ImageFile imageFile) {
			this.imageFile = imageFile;
		}

		public static class ImageFile {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}
	}

	public static class FailedImage {

		private String success;

		private String code;

		private ImageFile1 imageFile1;

		public String getSuccess() {
			return this.success;
		}

		public void setSuccess(String success) {
			this.success = success;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public ImageFile1 getImageFile1() {
			return this.imageFile1;
		}

		public void setImageFile1(ImageFile1 imageFile1) {
			this.imageFile1 = imageFile1;
		}

		public static class ImageFile1 {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}
	}

	@Override
	public RegisterMediaDetailPersonResponse getInstance(UnmarshallerContext context) {
		return	RegisterMediaDetailPersonResponseUnmarshaller.unmarshall(this, context);
	}
}
