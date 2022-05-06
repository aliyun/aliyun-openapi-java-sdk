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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.educloud.transform.v20220202.DescribeLabTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLabTokenResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Long code;

	private String message;

	private Data data;

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

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private String labId;

		private String orderId;

		private String url;

		private String createTime;

		private Long finishStatus;

		private Long resourceStatus;

		private String resourceActualReleaseTime;

		private String resourcePlanedReleaseTime;

		public String getLabId() {
			return this.labId;
		}

		public void setLabId(String labId) {
			this.labId = labId;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getFinishStatus() {
			return this.finishStatus;
		}

		public void setFinishStatus(Long finishStatus) {
			this.finishStatus = finishStatus;
		}

		public Long getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(Long resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getResourceActualReleaseTime() {
			return this.resourceActualReleaseTime;
		}

		public void setResourceActualReleaseTime(String resourceActualReleaseTime) {
			this.resourceActualReleaseTime = resourceActualReleaseTime;
		}

		public String getResourcePlanedReleaseTime() {
			return this.resourcePlanedReleaseTime;
		}

		public void setResourcePlanedReleaseTime(String resourcePlanedReleaseTime) {
			this.resourcePlanedReleaseTime = resourcePlanedReleaseTime;
		}
	}

	@Override
	public DescribeLabTokenResponse getInstance(UnmarshallerContext context) {
		return	DescribeLabTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
