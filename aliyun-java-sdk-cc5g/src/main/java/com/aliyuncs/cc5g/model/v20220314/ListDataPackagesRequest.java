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
public class ListDataPackagesRequest extends RpcAcsRequest<ListDataPackagesResponse> {
	   

	private String nextToken;

	private List<String> dataPackageIds;

	private List<String> names;

	private String wirelessCloudConnectorId;

	private Long maxResults;

	private List<String> statuses;
	public ListDataPackagesRequest() {
		super("CC5G", "2022-03-14", "ListDataPackages", "fivegcc");
		setMethod(MethodType.GET);
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

	public List<String> getDataPackageIds() {
		return this.dataPackageIds;
	}

	public void setDataPackageIds(List<String> dataPackageIds) {
		this.dataPackageIds = dataPackageIds;	
		if (dataPackageIds != null) {
			for (int depth1 = 0; depth1 < dataPackageIds.size(); depth1++) {
				putQueryParameter("DataPackageIds." + (depth1 + 1) , dataPackageIds.get(depth1));
			}
		}	
	}

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> names) {
		this.names = names;	
		if (names != null) {
			for (int depth1 = 0; depth1 < names.size(); depth1++) {
				putQueryParameter("Names." + (depth1 + 1) , names.get(depth1));
			}
		}	
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
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

	public List<String> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;	
		if (statuses != null) {
			for (int depth1 = 0; depth1 < statuses.size(); depth1++) {
				putQueryParameter("Statuses." + (depth1 + 1) , statuses.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListDataPackagesResponse> getResponseClass() {
		return ListDataPackagesResponse.class;
	}

}
