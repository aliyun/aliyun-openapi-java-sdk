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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.BatchAddFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchAddFacesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<InsertedFacesItem> insertedFaces;

		private List<FailedFacesItem> failedFaces;

		public List<InsertedFacesItem> getInsertedFaces() {
			return this.insertedFaces;
		}

		public void setInsertedFaces(List<InsertedFacesItem> insertedFaces) {
			this.insertedFaces = insertedFaces;
		}

		public List<FailedFacesItem> getFailedFaces() {
			return this.failedFaces;
		}

		public void setFailedFaces(List<FailedFacesItem> failedFaces) {
			this.failedFaces = failedFaces;
		}

		public static class InsertedFacesItem {

			private String imageURL;

			private String faceId;

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}
		}

		public static class FailedFacesItem {

			private String imageURL;

			private String code;

			private String message;

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

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
		}
	}

	@Override
	public BatchAddFacesResponse getInstance(UnmarshallerContext context) {
		return	BatchAddFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
