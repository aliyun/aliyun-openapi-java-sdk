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
public class CreateTimerJobRequest extends RpcAcsRequest<CreateTimerJobResponse> {
	   

	private String sourceId;

	private List<String> cronExpressions;

	private String extraInfo;

	private String eventType;
	public CreateTimerJobRequest() {
		super("ecd", "2020-09-30", "CreateTimerJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public List<String> getCronExpressions() {
		return this.cronExpressions;
	}

	public void setCronExpressions(List<String> cronExpressions) {
		this.cronExpressions = cronExpressions;	
		if (cronExpressions != null) {
			for (int i = 0; i < cronExpressions.size(); i++) {
				putQueryParameter("CronExpression." + (i + 1) , cronExpressions.get(i));
			}
		}	
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
		if(extraInfo != null){
			putQueryParameter("ExtraInfo", extraInfo);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	@Override
	public Class<CreateTimerJobResponse> getResponseClass() {
		return CreateTimerJobResponse.class;
	}

}
