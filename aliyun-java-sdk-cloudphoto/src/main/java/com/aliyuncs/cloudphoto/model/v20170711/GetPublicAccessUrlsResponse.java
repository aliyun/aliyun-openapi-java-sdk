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
import com.aliyuncs.cloudphoto.transform.v20170711.GetPublicAccessUrlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPublicAccessUrlsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private List<Result> results;

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

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public static class Result {

		private String code;

		private String message;

		private Long photoId;

		private String photoIdStr;

		private String accessUrl;

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

		public Long getPhotoId() {
			return this.photoId;
		}

		public void setPhotoId(Long photoId) {
			this.photoId = photoId;
		}

		public String getPhotoIdStr() {
			return this.photoIdStr;
		}

		public void setPhotoIdStr(String photoIdStr) {
			this.photoIdStr = photoIdStr;
		}

		public String getAccessUrl() {
			return this.accessUrl;
		}

		public void setAccessUrl(String accessUrl) {
			this.accessUrl = accessUrl;
		}
	}

	@Override
	public GetPublicAccessUrlsResponse getInstance(UnmarshallerContext context) {
		return	GetPublicAccessUrlsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
