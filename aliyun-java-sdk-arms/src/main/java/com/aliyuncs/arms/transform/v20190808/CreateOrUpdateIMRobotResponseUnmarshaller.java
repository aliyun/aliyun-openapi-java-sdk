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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateIMRobotResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateIMRobotResponse.AlertRobot;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateIMRobotResponseUnmarshaller {

	public static CreateOrUpdateIMRobotResponse unmarshall(CreateOrUpdateIMRobotResponse createOrUpdateIMRobotResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateIMRobotResponse.setRequestId(_ctx.stringValue("CreateOrUpdateIMRobotResponse.RequestId"));

		AlertRobot alertRobot = new AlertRobot();
		alertRobot.setRobotId(_ctx.floatValue("CreateOrUpdateIMRobotResponse.AlertRobot.RobotId"));
		alertRobot.setRobotName(_ctx.stringValue("CreateOrUpdateIMRobotResponse.AlertRobot.RobotName"));
		alertRobot.setType(_ctx.stringValue("CreateOrUpdateIMRobotResponse.AlertRobot.Type"));
		alertRobot.setRobotAddress(_ctx.stringValue("CreateOrUpdateIMRobotResponse.AlertRobot.RobotAddress"));
		alertRobot.setDailyNoc(_ctx.booleanValue("CreateOrUpdateIMRobotResponse.AlertRobot.DailyNoc"));
		alertRobot.setDailyNocTime(_ctx.stringValue("CreateOrUpdateIMRobotResponse.AlertRobot.DailyNocTime"));
		alertRobot.setToken(_ctx.stringValue("CreateOrUpdateIMRobotResponse.AlertRobot.Token"));
		alertRobot.setEnableOutgoing(_ctx.booleanValue("CreateOrUpdateIMRobotResponse.AlertRobot.EnableOutgoing"));
		createOrUpdateIMRobotResponse.setAlertRobot(alertRobot);
	 
	 	return createOrUpdateIMRobotResponse;
	}
}