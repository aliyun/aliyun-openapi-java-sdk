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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateIMRobotRequest extends RpcAcsRequest<CreateOrUpdateIMRobotResponse> {
	   

	private Boolean dailyNoc;

	private String robotAddress;

	private String robotName;

	private Long robotId;

	private String type;

	private String dailyNocTime;

	private String token;

	private Boolean enableOutgoing;
	public CreateOrUpdateIMRobotRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateIMRobot", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDailyNoc() {
		return this.dailyNoc;
	}

	public void setDailyNoc(Boolean dailyNoc) {
		this.dailyNoc = dailyNoc;
		if(dailyNoc != null){
			putBodyParameter("DailyNoc", dailyNoc.toString());
		}
	}

	public String getRobotAddress() {
		return this.robotAddress;
	}

	public void setRobotAddress(String robotAddress) {
		this.robotAddress = robotAddress;
		if(robotAddress != null){
			putBodyParameter("RobotAddress", robotAddress);
		}
	}

	public String getRobotName() {
		return this.robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
		if(robotName != null){
			putBodyParameter("RobotName", robotName);
		}
	}

	public Long getRobotId() {
		return this.robotId;
	}

	public void setRobotId(Long robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putBodyParameter("RobotId", robotId.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getDailyNocTime() {
		return this.dailyNocTime;
	}

	public void setDailyNocTime(String dailyNocTime) {
		this.dailyNocTime = dailyNocTime;
		if(dailyNocTime != null){
			putBodyParameter("DailyNocTime", dailyNocTime);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public Boolean getEnableOutgoing() {
		return this.enableOutgoing;
	}

	public void setEnableOutgoing(Boolean enableOutgoing) {
		this.enableOutgoing = enableOutgoing;
		if(enableOutgoing != null){
			putBodyParameter("EnableOutgoing", enableOutgoing.toString());
		}
	}

	@Override
	public Class<CreateOrUpdateIMRobotResponse> getResponseClass() {
		return CreateOrUpdateIMRobotResponse.class;
	}

}
