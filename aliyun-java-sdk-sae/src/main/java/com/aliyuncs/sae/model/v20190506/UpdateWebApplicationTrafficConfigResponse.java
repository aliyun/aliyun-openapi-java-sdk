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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.UpdateWebApplicationTrafficConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateWebApplicationTrafficConfigResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

		private String authType;

		private Boolean disableInternetURL;

		private Map<Object,Object> revisionsTrafficWeight;

		private WebAclConfig webAclConfig;

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public Boolean getDisableInternetURL() {
			return this.disableInternetURL;
		}

		public void setDisableInternetURL(Boolean disableInternetURL) {
			this.disableInternetURL = disableInternetURL;
		}

		public Map<Object,Object> getRevisionsTrafficWeight() {
			return this.revisionsTrafficWeight;
		}

		public void setRevisionsTrafficWeight(Map<Object,Object> revisionsTrafficWeight) {
			this.revisionsTrafficWeight = revisionsTrafficWeight;
		}

		public WebAclConfig getWebAclConfig() {
			return this.webAclConfig;
		}

		public void setWebAclConfig(WebAclConfig webAclConfig) {
			this.webAclConfig = webAclConfig;
		}

		public static class WebAclConfig {

			private String aclDescription;

			private List<WebAclEntriesItem> webAclEntries;

			public String getAclDescription() {
				return this.aclDescription;
			}

			public void setAclDescription(String aclDescription) {
				this.aclDescription = aclDescription;
			}

			public List<WebAclEntriesItem> getWebAclEntries() {
				return this.webAclEntries;
			}

			public void setWebAclEntries(List<WebAclEntriesItem> webAclEntries) {
				this.webAclEntries = webAclEntries;
			}

			public static class WebAclEntriesItem {

				private String entry;

				private String description;

				public String getEntry() {
					return this.entry;
				}

				public void setEntry(String entry) {
					this.entry = entry;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}
		}
	}

	@Override
	public UpdateWebApplicationTrafficConfigResponse getInstance(UnmarshallerContext context) {
		return	UpdateWebApplicationTrafficConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
