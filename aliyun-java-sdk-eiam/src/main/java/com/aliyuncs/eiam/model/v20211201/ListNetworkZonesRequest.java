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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListNetworkZonesRequest extends RpcAcsRequest<ListNetworkZonesResponse> {
	   

	private List<String> networkZoneIds;

	private String nextToken;

	private String previousToken;

	private String instanceId;

	private Long maxResults;
	public ListNetworkZonesRequest() {
		super("Eiam", "2021-12-01", "ListNetworkZones", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getNetworkZoneIds() {
		return this.networkZoneIds;
	}

	public void setNetworkZoneIds(List<String> networkZoneIds) {
		this.networkZoneIds = networkZoneIds;	
		if (networkZoneIds != null) {
			for (int depth1 = 0; depth1 < networkZoneIds.size(); depth1++) {
				putQueryParameter("NetworkZoneIds." + (depth1 + 1) , networkZoneIds.get(depth1));
			}
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

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
		if(previousToken != null){
			putQueryParameter("PreviousToken", previousToken);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListNetworkZonesResponse> getResponseClass() {
		return ListNetworkZonesResponse.class;
	}

}
