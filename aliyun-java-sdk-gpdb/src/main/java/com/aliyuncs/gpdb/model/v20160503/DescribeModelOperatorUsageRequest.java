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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelOperatorUsageRequest extends RpcAcsRequest<DescribeModelOperatorUsageResponse> {
	   

	private List<String> keys;

	private String startTime;

	private Integer period;

	private String endTime;

	private String groupBy;

	private List<Integer> apiKeyIds;

	private List<String> modelNames;
	public DescribeModelOperatorUsageRequest() {
		super("gpdb", "2016-05-03", "DescribeModelOperatorUsage", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getKeys() {
		return this.keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;	
		if (keys != null) {
			String keysArrVal = "";
			for(int depth1 = 0; depth1 < keys.size(); depth1++) {
				keysArrVal += keys.get(depth1) + ",";
			}
			if (keysArrVal.length() > 0) {
				keysArrVal = keysArrVal.substring(0, keysArrVal.length() - 1);
			}
			putQueryParameter("Keys" , keysArrVal);
		}	
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getGroupBy() {
		return this.groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		if(groupBy != null){
			putQueryParameter("GroupBy", groupBy);
		}
	}

	public List<Integer> getApiKeyIds() {
		return this.apiKeyIds;
	}

	public void setApiKeyIds(List<Integer> apiKeyIds) {
		this.apiKeyIds = apiKeyIds;	
		if (apiKeyIds != null) {
			String apiKeyIdsArrVal = "";
			for(int depth1 = 0; depth1 < apiKeyIds.size(); depth1++) {
				apiKeyIdsArrVal += apiKeyIds.get(depth1) + ",";
			}
			if (apiKeyIdsArrVal.length() > 0) {
				apiKeyIdsArrVal = apiKeyIdsArrVal.substring(0, apiKeyIdsArrVal.length() - 1);
			}
			putQueryParameter("ApiKeyIds" , apiKeyIdsArrVal);
		}	
	}

	public List<String> getModelNames() {
		return this.modelNames;
	}

	public void setModelNames(List<String> modelNames) {
		this.modelNames = modelNames;	
		if (modelNames != null) {
			String modelNamesArrVal = "";
			for(int depth1 = 0; depth1 < modelNames.size(); depth1++) {
				modelNamesArrVal += modelNames.get(depth1) + ",";
			}
			if (modelNamesArrVal.length() > 0) {
				modelNamesArrVal = modelNamesArrVal.substring(0, modelNamesArrVal.length() - 1);
			}
			putQueryParameter("ModelNames" , modelNamesArrVal);
		}	
	}

	@Override
	public Class<DescribeModelOperatorUsageResponse> getResponseClass() {
		return DescribeModelOperatorUsageResponse.class;
	}

}
