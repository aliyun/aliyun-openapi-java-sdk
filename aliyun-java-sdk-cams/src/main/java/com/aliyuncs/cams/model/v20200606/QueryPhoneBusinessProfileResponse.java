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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.QueryPhoneBusinessProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPhoneBusinessProfileResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String vertical;

		private String description;

		private String email;

		private String address;

		private String profilePictureUrl;

		private String about;

		private List<String> websites;

		public String getVertical() {
			return this.vertical;
		}

		public void setVertical(String vertical) {
			this.vertical = vertical;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getProfilePictureUrl() {
			return this.profilePictureUrl;
		}

		public void setProfilePictureUrl(String profilePictureUrl) {
			this.profilePictureUrl = profilePictureUrl;
		}

		public String getAbout() {
			return this.about;
		}

		public void setAbout(String about) {
			this.about = about;
		}

		public List<String> getWebsites() {
			return this.websites;
		}

		public void setWebsites(List<String> websites) {
			this.websites = websites;
		}
	}

	@Override
	public QueryPhoneBusinessProfileResponse getInstance(UnmarshallerContext context) {
		return	QueryPhoneBusinessProfileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
