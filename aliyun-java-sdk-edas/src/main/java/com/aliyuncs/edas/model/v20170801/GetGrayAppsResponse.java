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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetGrayAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGrayAppsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Result result;

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

			private String appId;

			private String applicationType;

			private String appname;

			private String defaultGroupId;

			private String packageVersion;

			private String regionId;

			private String developType;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getApplicationType() {
				return this.applicationType;
			}

			public void setApplicationType(String applicationType) {
				this.applicationType = applicationType;
			}

			public String getAppname() {
				return this.appname;
			}

			public void setAppname(String appname) {
				this.appname = appname;
			}

			public String getDefaultGroupId() {
				return this.defaultGroupId;
			}

			public void setDefaultGroupId(String defaultGroupId) {
				this.defaultGroupId = defaultGroupId;
			}

			public String getPackageVersion() {
				return this.packageVersion;
			}

			public void setPackageVersion(String packageVersion) {
				this.packageVersion = packageVersion;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDevelopType() {
				return this.developType;
			}

			public void setDevelopType(String developType) {
				this.developType = developType;
			}
		}
	}

	@Override
	public GetGrayAppsResponse getInstance(UnmarshallerContext context) {
		return	GetGrayAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
