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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDesktopGroupTimerRequest extends RpcAcsRequest<SetDesktopGroupTimerResponse> {
	   

	private String cronExpression;

	private Integer timerType;

	private Integer resetType;

	private String desktopGroupId;

	private Boolean force;
	public SetDesktopGroupTimerRequest() {
		super("ecd", "2020-09-30", "SetDesktopGroupTimer");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
		if(cronExpression != null){
			putQueryParameter("CronExpression", cronExpression);
		}
	}

	public Integer getTimerType() {
		return this.timerType;
	}

	public void setTimerType(Integer timerType) {
		this.timerType = timerType;
		if(timerType != null){
			putQueryParameter("TimerType", timerType.toString());
		}
	}

	public Integer getResetType() {
		return this.resetType;
	}

	public void setResetType(Integer resetType) {
		this.resetType = resetType;
		if(resetType != null){
			putQueryParameter("ResetType", resetType.toString());
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	@Override
	public Class<SetDesktopGroupTimerResponse> getResponseClass() {
		return SetDesktopGroupTimerResponse.class;
	}

}
