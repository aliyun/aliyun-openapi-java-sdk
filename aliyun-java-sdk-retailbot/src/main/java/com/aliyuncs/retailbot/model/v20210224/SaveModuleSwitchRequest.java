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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveModuleSwitchRequest extends RpcAcsRequest<SaveModuleSwitchResponse> {
	   

	private String robotCode;

	private String switchType;

	private Integer status;
	public SaveModuleSwitchRequest() {
		super("RetailBot", "2021-02-24", "SaveModuleSwitch");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getSwitchType() {
		return this.switchType;
	}

	public void setSwitchType(String switchType) {
		this.switchType = switchType;
		if(switchType != null){
			putBodyParameter("SwitchType", switchType);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<SaveModuleSwitchResponse> getResponseClass() {
		return SaveModuleSwitchResponse.class;
	}

}
