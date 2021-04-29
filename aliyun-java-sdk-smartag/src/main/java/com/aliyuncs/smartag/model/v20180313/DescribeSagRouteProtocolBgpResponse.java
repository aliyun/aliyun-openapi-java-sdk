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
import com.aliyuncs.smartag.transform.v20180313.DescribeSagRouteProtocolBgpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagRouteProtocolBgpResponse extends AcsResponse {

	private Integer holdTime;

	private String advertiseIps;

	private String requestId;

	private Integer keepAlive;

	private String routerId;

	private Integer localAs;

	private List<TaskState> taskStates;

	public Integer getHoldTime() {
		return this.holdTime;
	}

	public void setHoldTime(Integer holdTime) {
		this.holdTime = holdTime;
	}

	public String getAdvertiseIps() {
		return this.advertiseIps;
	}

	public void setAdvertiseIps(String advertiseIps) {
		this.advertiseIps = advertiseIps;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getKeepAlive() {
		return this.keepAlive;
	}

	public void setKeepAlive(Integer keepAlive) {
		this.keepAlive = keepAlive;
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
	}

	public Integer getLocalAs() {
		return this.localAs;
	}

	public void setLocalAs(Integer localAs) {
		this.localAs = localAs;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class TaskState {

		private String state;

		private String createTime;

		private String errorCode;

		private String errorMessage;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
	}

	@Override
	public DescribeSagRouteProtocolBgpResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagRouteProtocolBgpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
