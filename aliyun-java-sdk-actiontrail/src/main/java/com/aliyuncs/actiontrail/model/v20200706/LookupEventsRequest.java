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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.actiontrail.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LookupEventsRequest extends RpcAcsRequest<LookupEventsResponse> {
	   

	private String endTime;

	private String startTime;

	private String nextToken;

	private List<LookupAttribute> lookupAttributes;

	private String maxResults;

	private String direction;
	public LookupEventsRequest() {
		super("Actiontrail", "2020-07-06", "LookupEvents", "actiontrail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<LookupAttribute> getLookupAttributes() {
		return this.lookupAttributes;
	}

	public void setLookupAttributes(List<LookupAttribute> lookupAttributes) {
		this.lookupAttributes = lookupAttributes;	
		if (lookupAttributes != null) {
			for (int depth1 = 0; depth1 < lookupAttributes.size(); depth1++) {
				putQueryParameter("LookupAttribute." + (depth1 + 1) + ".Value" , lookupAttributes.get(depth1).getValue());
				putQueryParameter("LookupAttribute." + (depth1 + 1) + ".Key" , lookupAttributes.get(depth1).getKey());
			}
		}	
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public static class LookupAttribute {

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
	public Class<LookupEventsResponse> getResponseClass() {
		return LookupEventsResponse.class;
	}

}
