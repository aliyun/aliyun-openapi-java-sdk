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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RunServiceScheduleRequest extends RpcAcsRequest<RunServiceScheduleResponse> {
	   

	private String directorys;

	private Integer preLockedTimeout;

	private String uuid;

	private String clientIp;

	private String podConfigName;

	private String serviceAction;

	private String serviceCommands;

	private String scheduleStrategy;

	private String appId;
	public RunServiceScheduleRequest() {
		super("Ens", "2017-11-10", "RunServiceSchedule", "ens");
		setMethod(MethodType.POST);
	}

	public String getDirectorys() {
		return this.directorys;
	}

	public void setDirectorys(String directorys) {
		this.directorys = directorys;
		if(directorys != null){
			putQueryParameter("Directorys", directorys);
		}
	}

	public Integer getPreLockedTimeout() {
		return this.preLockedTimeout;
	}

	public void setPreLockedTimeout(Integer preLockedTimeout) {
		this.preLockedTimeout = preLockedTimeout;
		if(preLockedTimeout != null){
			putQueryParameter("PreLockedTimeout", preLockedTimeout.toString());
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public String getPodConfigName() {
		return this.podConfigName;
	}

	public void setPodConfigName(String podConfigName) {
		this.podConfigName = podConfigName;
		if(podConfigName != null){
			putQueryParameter("PodConfigName", podConfigName);
		}
	}

	public String getServiceAction() {
		return this.serviceAction;
	}

	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
		if(serviceAction != null){
			putQueryParameter("ServiceAction", serviceAction);
		}
	}

	public String getServiceCommands() {
		return this.serviceCommands;
	}

	public void setServiceCommands(String serviceCommands) {
		this.serviceCommands = serviceCommands;
		if(serviceCommands != null){
			putQueryParameter("ServiceCommands", serviceCommands);
		}
	}

	public String getScheduleStrategy() {
		return this.scheduleStrategy;
	}

	public void setScheduleStrategy(String scheduleStrategy) {
		this.scheduleStrategy = scheduleStrategy;
		if(scheduleStrategy != null){
			putQueryParameter("ScheduleStrategy", scheduleStrategy);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<RunServiceScheduleResponse> getResponseClass() {
		return RunServiceScheduleResponse.class;
	}

}
