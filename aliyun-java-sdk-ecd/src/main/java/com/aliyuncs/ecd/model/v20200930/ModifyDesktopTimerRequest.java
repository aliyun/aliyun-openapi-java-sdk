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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopTimerRequest extends RpcAcsRequest<ModifyDesktopTimerResponse> {
	   

	private List<DesktopTimers> desktopTimerss;

	private List<String> desktopIds;

	private Boolean useDesktopTimers;
	public ModifyDesktopTimerRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopTimer");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DesktopTimers> getDesktopTimerss() {
		return this.desktopTimerss;
	}

	public void setDesktopTimerss(List<DesktopTimers> desktopTimerss) {
		this.desktopTimerss = desktopTimerss;	
		if (desktopTimerss != null) {
			for (int depth1 = 0; depth1 < desktopTimerss.size(); depth1++) {
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".CronExpression" , desktopTimerss.get(depth1).getCronExpression());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".TimerType" , desktopTimerss.get(depth1).getTimerType());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".AllowClientSetting" , desktopTimerss.get(depth1).getAllowClientSetting());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".ResetType" , desktopTimerss.get(depth1).getResetType());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".Enforce" , desktopTimerss.get(depth1).getEnforce());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".Interval" , desktopTimerss.get(depth1).getInterval());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".OperationType" , desktopTimerss.get(depth1).getOperationType());
			}
		}	
	}

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
			}
		}	
	}

	public Boolean getUseDesktopTimers() {
		return this.useDesktopTimers;
	}

	public void setUseDesktopTimers(Boolean useDesktopTimers) {
		this.useDesktopTimers = useDesktopTimers;
		if(useDesktopTimers != null){
			putQueryParameter("UseDesktopTimers", useDesktopTimers.toString());
		}
	}

	public static class DesktopTimers {

		private String cronExpression;

		private String timerType;

		private Boolean allowClientSetting;

		private String resetType;

		private Boolean enforce;

		private Integer interval;

		private String operationType;

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getTimerType() {
			return this.timerType;
		}

		public void setTimerType(String timerType) {
			this.timerType = timerType;
		}

		public Boolean getAllowClientSetting() {
			return this.allowClientSetting;
		}

		public void setAllowClientSetting(Boolean allowClientSetting) {
			this.allowClientSetting = allowClientSetting;
		}

		public String getResetType() {
			return this.resetType;
		}

		public void setResetType(String resetType) {
			this.resetType = resetType;
		}

		public Boolean getEnforce() {
			return this.enforce;
		}

		public void setEnforce(Boolean enforce) {
			this.enforce = enforce;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
	}

	@Override
	public Class<ModifyDesktopTimerResponse> getResponseClass() {
		return ModifyDesktopTimerResponse.class;
	}

}
