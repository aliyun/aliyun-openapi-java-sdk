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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagRouteProtocolOspfResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagRouteProtocolOspfResponse extends AcsResponse {

	private String requestId;

	private String routerId;

	private String areaId;

	private String areaType;

	private Integer deadTime;

	private Integer helloTime;

	private String authenticationType;

	private Integer md5KeyId;

	private String md5Key;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaType() {
		return this.areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public Integer getDeadTime() {
		return this.deadTime;
	}

	public void setDeadTime(Integer deadTime) {
		this.deadTime = deadTime;
	}

	public Integer getHelloTime() {
		return this.helloTime;
	}

	public void setHelloTime(Integer helloTime) {
		this.helloTime = helloTime;
	}

	public String getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}

	public Integer getMd5KeyId() {
		return this.md5KeyId;
	}

	public void setMd5KeyId(Integer md5KeyId) {
		this.md5KeyId = md5KeyId;
	}

	public String getMd5Key() {
		return this.md5Key;
	}

	public void setMd5Key(String md5Key) {
		this.md5Key = md5Key;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class TaskState {

		private String state;

		private String errorCode;

		private String errorMessage;

		private String createTime;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeSagRouteProtocolOspfResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagRouteProtocolOspfResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
