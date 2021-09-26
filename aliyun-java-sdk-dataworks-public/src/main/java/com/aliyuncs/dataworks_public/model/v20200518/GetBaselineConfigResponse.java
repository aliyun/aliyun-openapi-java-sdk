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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetBaselineConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBaselineConfigResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private String hourSlaDetail;

		private Boolean isDefault;

		private String owner;

		private Long projectId;

		private Integer priority;

		private Integer slaMinu;

		private Integer slaHour;

		private Long baselineId;

		private String baselineName;

		private String hourExpDetail;

		private Boolean useFlag;

		private Integer expHour;

		private String baselineType;

		private Integer expMinu;

		public String getHourSlaDetail() {
			return this.hourSlaDetail;
		}

		public void setHourSlaDetail(String hourSlaDetail) {
			this.hourSlaDetail = hourSlaDetail;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getSlaMinu() {
			return this.slaMinu;
		}

		public void setSlaMinu(Integer slaMinu) {
			this.slaMinu = slaMinu;
		}

		public Integer getSlaHour() {
			return this.slaHour;
		}

		public void setSlaHour(Integer slaHour) {
			this.slaHour = slaHour;
		}

		public Long getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(Long baselineId) {
			this.baselineId = baselineId;
		}

		public String getBaselineName() {
			return this.baselineName;
		}

		public void setBaselineName(String baselineName) {
			this.baselineName = baselineName;
		}

		public String getHourExpDetail() {
			return this.hourExpDetail;
		}

		public void setHourExpDetail(String hourExpDetail) {
			this.hourExpDetail = hourExpDetail;
		}

		public Boolean getUseFlag() {
			return this.useFlag;
		}

		public void setUseFlag(Boolean useFlag) {
			this.useFlag = useFlag;
		}

		public Integer getExpHour() {
			return this.expHour;
		}

		public void setExpHour(Integer expHour) {
			this.expHour = expHour;
		}

		public String getBaselineType() {
			return this.baselineType;
		}

		public void setBaselineType(String baselineType) {
			this.baselineType = baselineType;
		}

		public Integer getExpMinu() {
			return this.expMinu;
		}

		public void setExpMinu(Integer expMinu) {
			this.expMinu = expMinu;
		}
	}

	@Override
	public GetBaselineConfigResponse getInstance(UnmarshallerContext context) {
		return	GetBaselineConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
