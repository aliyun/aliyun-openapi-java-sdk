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
import com.aliyuncs.imm.transform.v20170906.DetectImageCelebrityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageCelebrityResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<CelebrityItem> celebrity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<CelebrityItem> getCelebrity() {
		return this.celebrity;
	}

	public void setCelebrity(List<CelebrityItem> celebrity) {
		this.celebrity = celebrity;
	}

	public static class CelebrityItem {

		private String celebrityName;

		private String celebrityGender;

		private Float celebrityConfidence;

		private String celebrityLibraryName;

		private CelebrityBoundary celebrityBoundary;

		public String getCelebrityName() {
			return this.celebrityName;
		}

		public void setCelebrityName(String celebrityName) {
			this.celebrityName = celebrityName;
		}

		public String getCelebrityGender() {
			return this.celebrityGender;
		}

		public void setCelebrityGender(String celebrityGender) {
			this.celebrityGender = celebrityGender;
		}

		public Float getCelebrityConfidence() {
			return this.celebrityConfidence;
		}

		public void setCelebrityConfidence(Float celebrityConfidence) {
			this.celebrityConfidence = celebrityConfidence;
		}

		public String getCelebrityLibraryName() {
			return this.celebrityLibraryName;
		}

		public void setCelebrityLibraryName(String celebrityLibraryName) {
			this.celebrityLibraryName = celebrityLibraryName;
		}

		public CelebrityBoundary getCelebrityBoundary() {
			return this.celebrityBoundary;
		}

		public void setCelebrityBoundary(CelebrityBoundary celebrityBoundary) {
			this.celebrityBoundary = celebrityBoundary;
		}

		public static class CelebrityBoundary {

			private Integer left;

			private Integer top;

			private Integer width;

			private Integer height;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}
		}
	}

	@Override
	public DetectImageCelebrityResponse getInstance(UnmarshallerContext context) {
		return	DetectImageCelebrityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
