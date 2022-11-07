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
public class ListGroupAuthorizationRulesRequest extends RpcAcsRequest<ListGroupAuthorizationRulesResponse> {
	   

	private String wirelessCloudConnectorGroupId;

	private String destinationType;

	private String destination;

	private String type;

	private String protocol;

	private List<String> authorizationRuleIds;

	private String nextToken;

	private String policy;

	private Boolean dns;

	private String destinationPort;

	private List<String> names;

	private Long maxResults;

	private List<String> statuses;
	public ListGroupAuthorizationRulesRequest() {
		super("CC5G", "2022-03-14", "ListGroupAuthorizationRules", "fivegcc");
		setMethod(MethodType.GET);
	}

	public String getWirelessCloudConnectorGroupId() {
		return this.wirelessCloudConnectorGroupId;
	}

	public void setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
		this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
		if(wirelessCloudConnectorGroupId != null){
			putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
		}
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
		}
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public List<String> getAuthorizationRuleIds() {
		return this.authorizationRuleIds;
	}

	public void setAuthorizationRuleIds(List<String> authorizationRuleIds) {
		this.authorizationRuleIds = authorizationRuleIds;	
		if (authorizationRuleIds != null) {
			for (int depth1 = 0; depth1 < authorizationRuleIds.size(); depth1++) {
				putQueryParameter("AuthorizationRuleIds." + (depth1 + 1) , authorizationRuleIds.get(depth1));
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

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public Boolean getDns() {
		return this.dns;
	}

	public void setDns(Boolean dns) {
		this.dns = dns;
		if(dns != null){
			putQueryParameter("Dns", dns.toString());
		}
	}

	public String getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
		if(destinationPort != null){
			putQueryParameter("DestinationPort", destinationPort);
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
	public Class<ListGroupAuthorizationRulesResponse> getResponseClass() {
		return ListGroupAuthorizationRulesResponse.class;
	}

}
