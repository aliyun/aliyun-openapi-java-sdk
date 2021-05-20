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
import com.aliyuncs.smartag.transform.v20180313.DescribeSagStaticRouteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagStaticRouteListResponse extends AcsResponse {

	private String requestId;

	private List<TaskState> taskStates;

	private List<StaticRoute> staticRoutes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public List<StaticRoute> getStaticRoutes() {
		return this.staticRoutes;
	}

	public void setStaticRoutes(List<StaticRoute> staticRoutes) {
		this.staticRoutes = staticRoutes;
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

	public static class StaticRoute {

		private String nextHop;

		private String vlan;

		private String portName;

		private String destinationCidr;

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getVlan() {
			return this.vlan;
		}

		public void setVlan(String vlan) {
			this.vlan = vlan;
		}

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public String getDestinationCidr() {
			return this.destinationCidr;
		}

		public void setDestinationCidr(String destinationCidr) {
			this.destinationCidr = destinationCidr;
		}
	}

	@Override
	public DescribeSagStaticRouteListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagStaticRouteListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
