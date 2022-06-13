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
public class ListOrdersRequest extends RpcAcsRequest<ListOrdersResponse> {
	   

	private String nextToken;

	private String orderAction;

	private String wirelessCloudConnectorId;

	private List<String> orderIds;

	private Long maxResults;

	private List<String> statuses;
	public ListOrdersRequest() {
		super("CC5G", "2022-03-14", "ListOrders", "fivegcc");
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

	public String getOrderAction() {
		return this.orderAction;
	}

	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
		if(orderAction != null){
			putQueryParameter("OrderAction", orderAction);
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

	public List<String> getOrderIds() {
		return this.orderIds;
	}

	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;	
		if (orderIds != null) {
			for (int depth1 = 0; depth1 < orderIds.size(); depth1++) {
				putQueryParameter("OrderIds." + (depth1 + 1) , orderIds.get(depth1));
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
	public Class<ListOrdersResponse> getResponseClass() {
		return ListOrdersResponse.class;
	}

}
