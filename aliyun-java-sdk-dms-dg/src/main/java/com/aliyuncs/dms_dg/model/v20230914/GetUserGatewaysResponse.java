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

package com.aliyuncs.dms_dg.model.v20230914;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_dg.transform.v20230914.GetUserGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserGatewaysResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMsg;

	private Integer count;

	private List<Gateway> gatewayList;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Gateway> getGatewayList() {
		return this.gatewayList;
	}

	public void setGatewayList(List<Gateway> gatewayList) {
		this.gatewayList = gatewayList;
	}

	public static class Gateway {

		private String gatewayDesc;

		private String gatewayName;

		private String regionId;

		private String gatewayId;

		private String status;

		private String userId;

		private String creatorId;

		private String dgVersion;

		private String exceptionMsg;

		private Integer numOfExceptionInstance;

		private Integer numOfRunningInstance;

		public String getGatewayDesc() {
			return this.gatewayDesc;
		}

		public void setGatewayDesc(String gatewayDesc) {
			this.gatewayDesc = gatewayDesc;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getDgVersion() {
			return this.dgVersion;
		}

		public void setDgVersion(String dgVersion) {
			this.dgVersion = dgVersion;
		}

		public String getExceptionMsg() {
			return this.exceptionMsg;
		}

		public void setExceptionMsg(String exceptionMsg) {
			this.exceptionMsg = exceptionMsg;
		}

		public Integer getNumOfExceptionInstance() {
			return this.numOfExceptionInstance;
		}

		public void setNumOfExceptionInstance(Integer numOfExceptionInstance) {
			this.numOfExceptionInstance = numOfExceptionInstance;
		}

		public Integer getNumOfRunningInstance() {
			return this.numOfRunningInstance;
		}

		public void setNumOfRunningInstance(Integer numOfRunningInstance) {
			this.numOfRunningInstance = numOfRunningInstance;
		}
	}

	@Override
	public GetUserGatewaysResponse getInstance(UnmarshallerContext context) {
		return	GetUserGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
