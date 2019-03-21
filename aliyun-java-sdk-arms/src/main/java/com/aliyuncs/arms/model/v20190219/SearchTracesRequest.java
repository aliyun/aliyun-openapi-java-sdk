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

package com.aliyuncs.arms.model.v20190219;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SearchTracesRequest extends RpcAcsRequest<SearchTracesResponse> {
	
	public SearchTracesRequest() {
		super("ARMS", "2019-02-19", "SearchTraces");
	}

	private String operationName;

	private String appType;

	private Long endTime;

	private String serviceName;

	private Long startTime;

	private List<String> tagMaps;

	private Long minDuration;

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
		if(operationName != null){
			putQueryParameter("OperationName", operationName);
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public List<String> getTagMaps() {
		return this.tagMaps;
	}

	public void setTagMaps(List<String> tagMaps) {
		this.tagMaps = tagMaps;	
		if (tagMaps != null) {
			for (int i = 0; i < tagMaps.size(); i++) {
				putQueryParameter("TagMap." + (i + 1) , tagMaps.get(i));
			}
		}	
	}

	public Long getMinDuration() {
		return this.minDuration;
	}

	public void setMinDuration(Long minDuration) {
		this.minDuration = minDuration;
		if(minDuration != null){
			putQueryParameter("MinDuration", minDuration.toString());
		}
	}

	@Override
	public Class<SearchTracesResponse> getResponseClass() {
		return SearchTracesResponse.class;
	}

}
