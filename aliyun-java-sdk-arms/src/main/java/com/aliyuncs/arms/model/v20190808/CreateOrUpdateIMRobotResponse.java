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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateIMRobotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateIMRobotResponse extends AcsResponse {

	private String requestId;

	private AlertRobot alertRobot;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlertRobot getAlertRobot() {
		return this.alertRobot;
	}

	public void setAlertRobot(AlertRobot alertRobot) {
		this.alertRobot = alertRobot;
	}

	public static class AlertRobot {

		private Float robotId;

		private String robotName;

		private String type;

		private String robotAddress;

		private Boolean dailyNoc;

		private String dailyNocTime;

		private String token;

		private Boolean enableOutgoing;

		public Float getRobotId() {
			return this.robotId;
		}

		public void setRobotId(Float robotId) {
			this.robotId = robotId;
		}

		public String getRobotName() {
			return this.robotName;
		}

		public void setRobotName(String robotName) {
			this.robotName = robotName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRobotAddress() {
			return this.robotAddress;
		}

		public void setRobotAddress(String robotAddress) {
			this.robotAddress = robotAddress;
		}

		public Boolean getDailyNoc() {
			return this.dailyNoc;
		}

		public void setDailyNoc(Boolean dailyNoc) {
			this.dailyNoc = dailyNoc;
		}

		public String getDailyNocTime() {
			return this.dailyNocTime;
		}

		public void setDailyNocTime(String dailyNocTime) {
			this.dailyNocTime = dailyNocTime;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Boolean getEnableOutgoing() {
			return this.enableOutgoing;
		}

		public void setEnableOutgoing(Boolean enableOutgoing) {
			this.enableOutgoing = enableOutgoing;
		}
	}

	@Override
	public CreateOrUpdateIMRobotResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateIMRobotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
