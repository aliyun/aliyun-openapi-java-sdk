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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer totalCount;

	private List<AppDetail> data;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AppDetail> getData() {
		return this.data;
	}

	public void setData(List<AppDetail> data) {
		this.data = data;
	}

	public static class AppDetail {

		private Long appId;

		private String title;

		private String description;

		private String language;

		private String operatingSystem;

		private String bizName;

		private String serviceType;

		private String deployType;

		private String bizTitle;

		private String appStateType;

		private List<MiddleWareInfo> middleWareList;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getOperatingSystem() {
			return this.operatingSystem;
		}

		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}

		public String getBizName() {
			return this.bizName;
		}

		public void setBizName(String bizName) {
			this.bizName = bizName;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getBizTitle() {
			return this.bizTitle;
		}

		public void setBizTitle(String bizTitle) {
			this.bizTitle = bizTitle;
		}

		public String getAppStateType() {
			return this.appStateType;
		}

		public void setAppStateType(String appStateType) {
			this.appStateType = appStateType;
		}

		public List<MiddleWareInfo> getMiddleWareList() {
			return this.middleWareList;
		}

		public void setMiddleWareList(List<MiddleWareInfo> middleWareList) {
			this.middleWareList = middleWareList;
		}

		public static class MiddleWareInfo {

			private Long appId;

			private Integer code;

			private String name;

			public Long getAppId() {
				return this.appId;
			}

			public void setAppId(Long appId) {
				this.appId = appId;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
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
	public ListAppResponse getInstance(UnmarshallerContext context) {
		return	ListAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
