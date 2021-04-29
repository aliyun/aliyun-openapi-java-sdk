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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchTracesRequest extends RpcAcsRequest<SearchTracesResponse> {
	   

	private Long endTime;

	private Long startTime;

	private Boolean reverse;

	private Long minDuration;

	private String serviceIp;

	private List<ExclusionFilters> exclusionFilterss;

	private String operationName;

	private String serviceName;

	private List<Tag> tags;
	public SearchTracesRequest() {
		super("ARMS", "2019-08-08", "SearchTraces", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putQueryParameter("Reverse", reverse.toString());
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

	public String getServiceIp() {
		return this.serviceIp;
	}

	public void setServiceIp(String serviceIp) {
		this.serviceIp = serviceIp;
		if(serviceIp != null){
			putQueryParameter("ServiceIp", serviceIp);
		}
	}

	public List<ExclusionFilters> getExclusionFilterss() {
		return this.exclusionFilterss;
	}

	public void setExclusionFilterss(List<ExclusionFilters> exclusionFilterss) {
		this.exclusionFilterss = exclusionFilterss;	
		if (exclusionFilterss != null) {
			for (int depth1 = 0; depth1 < exclusionFilterss.size(); depth1++) {
				putQueryParameter("ExclusionFilters." + (depth1 + 1) + ".Value" , exclusionFilterss.get(depth1).getValue());
				putQueryParameter("ExclusionFilters." + (depth1 + 1) + ".Key" , exclusionFilterss.get(depth1).getKey());
			}
		}	
	}

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
		if(operationName != null){
			putQueryParameter("OperationName", operationName);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public static class ExclusionFilters {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SearchTracesResponse> getResponseClass() {
		return SearchTracesResponse.class;
	}

}
