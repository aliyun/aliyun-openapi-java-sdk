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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetAutoScaleInstancePolicyListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoScaleInstancePolicyListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNo;

		private Long pageSize;

		private Long total;

		private List<AutoScaleInstancePolicy> list;

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<AutoScaleInstancePolicy> getList() {
			return this.list;
		}

		public void setList(List<AutoScaleInstancePolicy> list) {
			this.list = list;
		}

		public static class AutoScaleInstancePolicy {

			private String userId;

			private String instanceId;

			private String engine;

			private String classType;

			private String policyUuid;

			private Boolean onOff;

			private String scaleType;

			private String scaleSettings;

			private String instanceAlias;

			private String instanceClass;

			private String policyName;

			private String state;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getClassType() {
				return this.classType;
			}

			public void setClassType(String classType) {
				this.classType = classType;
			}

			public String getPolicyUuid() {
				return this.policyUuid;
			}

			public void setPolicyUuid(String policyUuid) {
				this.policyUuid = policyUuid;
			}

			public Boolean getOnOff() {
				return this.onOff;
			}

			public void setOnOff(Boolean onOff) {
				this.onOff = onOff;
			}

			public String getScaleType() {
				return this.scaleType;
			}

			public void setScaleType(String scaleType) {
				this.scaleType = scaleType;
			}

			public String getScaleSettings() {
				return this.scaleSettings;
			}

			public void setScaleSettings(String scaleSettings) {
				this.scaleSettings = scaleSettings;
			}

			public String getInstanceAlias() {
				return this.instanceAlias;
			}

			public void setInstanceAlias(String instanceAlias) {
				this.instanceAlias = instanceAlias;
			}

			public String getInstanceClass() {
				return this.instanceClass;
			}

			public void setInstanceClass(String instanceClass) {
				this.instanceClass = instanceClass;
			}

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}
		}
	}

	@Override
	public GetAutoScaleInstancePolicyListResponse getInstance(UnmarshallerContext context) {
		return	GetAutoScaleInstancePolicyListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
