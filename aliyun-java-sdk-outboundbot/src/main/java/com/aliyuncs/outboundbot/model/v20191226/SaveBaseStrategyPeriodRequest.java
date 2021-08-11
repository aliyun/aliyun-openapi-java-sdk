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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveBaseStrategyPeriodRequest extends RpcAcsRequest<SaveBaseStrategyPeriodResponse> {
	   

	private Integer strategyLevel;

	private String entryId;

	private Boolean onlyWeekdays;

	private String workingTimeFramesJson;

	private List<String> workingTimes;
	public SaveBaseStrategyPeriodRequest() {
		super("OutboundBot", "2019-12-26", "SaveBaseStrategyPeriod", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getStrategyLevel() {
		return this.strategyLevel;
	}

	public void setStrategyLevel(Integer strategyLevel) {
		this.strategyLevel = strategyLevel;
		if(strategyLevel != null){
			putQueryParameter("StrategyLevel", strategyLevel.toString());
		}
	}

	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
		if(entryId != null){
			putQueryParameter("EntryId", entryId);
		}
	}

	public Boolean getOnlyWeekdays() {
		return this.onlyWeekdays;
	}

	public void setOnlyWeekdays(Boolean onlyWeekdays) {
		this.onlyWeekdays = onlyWeekdays;
		if(onlyWeekdays != null){
			putQueryParameter("OnlyWeekdays", onlyWeekdays.toString());
		}
	}

	public String getWorkingTimeFramesJson() {
		return this.workingTimeFramesJson;
	}

	public void setWorkingTimeFramesJson(String workingTimeFramesJson) {
		this.workingTimeFramesJson = workingTimeFramesJson;
		if(workingTimeFramesJson != null){
			putQueryParameter("WorkingTimeFramesJson", workingTimeFramesJson);
		}
	}

	public List<String> getWorkingTimes() {
		return this.workingTimes;
	}

	public void setWorkingTimes(List<String> workingTimes) {
		this.workingTimes = workingTimes;	
		if (workingTimes != null) {
			for (int i = 0; i < workingTimes.size(); i++) {
				putQueryParameter("WorkingTime." + (i + 1) , workingTimes.get(i));
			}
		}	
	}

	@Override
	public Class<SaveBaseStrategyPeriodResponse> getResponseClass() {
		return SaveBaseStrategyPeriodResponse.class;
	}

}
