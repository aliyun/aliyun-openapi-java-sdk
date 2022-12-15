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

package com.aliyuncs.viapi_oxs_cross.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.viapi_oxs_cross.transform.v20200701.GetSDKInstanceDebugInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSDKInstanceDebugInfoResponse extends AcsResponse {

	private Boolean ok;

	private String code;

	private Integer httpCode;

	private String errorMessage;

	private String requestId;

	private Data data;

	public Boolean getOk() {
		return this.ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String latestBuild;

		private String validFromDate;

		private String validToDate;

		private String platform;

		private String createdAt;

		private String recipe;

		private String updatedAt;

		private String instanceId;

		private String bundleId;

		private List<Event> events;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLatestBuild() {
			return this.latestBuild;
		}

		public void setLatestBuild(String latestBuild) {
			this.latestBuild = latestBuild;
		}

		public String getValidFromDate() {
			return this.validFromDate;
		}

		public void setValidFromDate(String validFromDate) {
			this.validFromDate = validFromDate;
		}

		public String getValidToDate() {
			return this.validToDate;
		}

		public void setValidToDate(String validToDate) {
			this.validToDate = validToDate;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getRecipe() {
			return this.recipe;
		}

		public void setRecipe(String recipe) {
			this.recipe = recipe;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public List<Event> getEvents() {
			return this.events;
		}

		public void setEvents(List<Event> events) {
			this.events = events;
		}

		public static class Event {

			private String timeStamp;

			private Boolean success;

			private String content;

			private Long id;

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetSDKInstanceDebugInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSDKInstanceDebugInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
