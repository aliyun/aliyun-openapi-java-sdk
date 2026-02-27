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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataServiceAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceAppResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Integer appId;

		private String ipWhitelist;

		private String appKey;

		private String scenarios;

		private String appSecret;

		private String appGroup;

		private String appName;

		private Boolean ipWhitelistStatus;

		private List<Owner> ownerList;

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public String getIpWhitelist() {
			return this.ipWhitelist;
		}

		public void setIpWhitelist(String ipWhitelist) {
			this.ipWhitelist = ipWhitelist;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getScenarios() {
			return this.scenarios;
		}

		public void setScenarios(String scenarios) {
			this.scenarios = scenarios;
		}

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}

		public String getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(String appGroup) {
			this.appGroup = appGroup;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Boolean getIpWhitelistStatus() {
			return this.ipWhitelistStatus;
		}

		public void setIpWhitelistStatus(Boolean ipWhitelistStatus) {
			this.ipWhitelistStatus = ipWhitelistStatus;
		}

		public List<Owner> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<Owner> ownerList) {
			this.ownerList = ownerList;
		}

		public static class Owner {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetDataServiceAppResponse getInstance(UnmarshallerContext context) {
		return	GetDataServiceAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
