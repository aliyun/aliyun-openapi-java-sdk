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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListWirelessCloudConnectorGroupsRequest extends RpcAcsRequest<ListWirelessCloudConnectorGroupsResponse> {
	   

	private List<String> wirelessCloudConnectorGroupStatus;

	private List<String> wirelessCloudConnectorGroupIds;

	private String nextToken;

	private List<String> wirelessCloudConnectorGroupNames;

	private Long maxResults;
	public ListWirelessCloudConnectorGroupsRequest() {
		super("CC5G", "2022-03-14", "ListWirelessCloudConnectorGroups", "fivegcc");
		setMethod(MethodType.GET);
	}

	public List<String> getWirelessCloudConnectorGroupStatus() {
		return this.wirelessCloudConnectorGroupStatus;
	}

	public void setWirelessCloudConnectorGroupStatus(List<String> wirelessCloudConnectorGroupStatus) {
		this.wirelessCloudConnectorGroupStatus = wirelessCloudConnectorGroupStatus;	
		if (wirelessCloudConnectorGroupStatus != null) {
			for (int depth1 = 0; depth1 < wirelessCloudConnectorGroupStatus.size(); depth1++) {
				putQueryParameter("WirelessCloudConnectorGroupStatus." + (depth1 + 1) , wirelessCloudConnectorGroupStatus.get(depth1));
			}
		}	
	}

	public List<String> getWirelessCloudConnectorGroupIds() {
		return this.wirelessCloudConnectorGroupIds;
	}

	public void setWirelessCloudConnectorGroupIds(List<String> wirelessCloudConnectorGroupIds) {
		this.wirelessCloudConnectorGroupIds = wirelessCloudConnectorGroupIds;	
		if (wirelessCloudConnectorGroupIds != null) {
			for (int depth1 = 0; depth1 < wirelessCloudConnectorGroupIds.size(); depth1++) {
				putQueryParameter("WirelessCloudConnectorGroupIds." + (depth1 + 1) , wirelessCloudConnectorGroupIds.get(depth1));
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

	public List<String> getWirelessCloudConnectorGroupNames() {
		return this.wirelessCloudConnectorGroupNames;
	}

	public void setWirelessCloudConnectorGroupNames(List<String> wirelessCloudConnectorGroupNames) {
		this.wirelessCloudConnectorGroupNames = wirelessCloudConnectorGroupNames;	
		if (wirelessCloudConnectorGroupNames != null) {
			for (int depth1 = 0; depth1 < wirelessCloudConnectorGroupNames.size(); depth1++) {
				putQueryParameter("WirelessCloudConnectorGroupNames." + (depth1 + 1) , wirelessCloudConnectorGroupNames.get(depth1));
			}
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
	public Class<ListWirelessCloudConnectorGroupsResponse> getResponseClass() {
		return ListWirelessCloudConnectorGroupsResponse.class;
	}

}
