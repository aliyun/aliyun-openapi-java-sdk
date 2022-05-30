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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListGroupDNSServiceRulesRequest extends RpcAcsRequest<ListGroupDNSServiceRulesResponse> {
	   

	private List<String> destinations;

	private List<String> sources;

	private List<String> dNSServiceRuleStatuss;

	private String nextToken;

	private String ioTCloudConnectorGroupId;

	private String serviceType;

	private Integer maxResults;

	private List<String> dNSServiceRuleIdss;

	private List<String> dNSServiceRuleNames;
	public ListGroupDNSServiceRulesRequest() {
		super("IoTCC", "2021-05-13", "ListGroupDNSServiceRules", "IoTCC");
		setMethod(MethodType.POST);
	}

	public List<String> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(List<String> destinations) {
		this.destinations = destinations;	
		if (destinations != null) {
			for (int i = 0; i < destinations.size(); i++) {
				putQueryParameter("Destination." + (i + 1) , destinations.get(i));
			}
		}	
	}

	public List<String> getSources() {
		return this.sources;
	}

	public void setSources(List<String> sources) {
		this.sources = sources;	
		if (sources != null) {
			for (int i = 0; i < sources.size(); i++) {
				putQueryParameter("Source." + (i + 1) , sources.get(i));
			}
		}	
	}

	public List<String> getDNSServiceRuleStatuss() {
		return this.dNSServiceRuleStatuss;
	}

	public void setDNSServiceRuleStatuss(List<String> dNSServiceRuleStatuss) {
		this.dNSServiceRuleStatuss = dNSServiceRuleStatuss;	
		if (dNSServiceRuleStatuss != null) {
			for (int i = 0; i < dNSServiceRuleStatuss.size(); i++) {
				putQueryParameter("DNSServiceRuleStatus." + (i + 1) , dNSServiceRuleStatuss.get(i));
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

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getDNSServiceRuleIdss() {
		return this.dNSServiceRuleIdss;
	}

	public void setDNSServiceRuleIdss(List<String> dNSServiceRuleIdss) {
		this.dNSServiceRuleIdss = dNSServiceRuleIdss;	
		if (dNSServiceRuleIdss != null) {
			for (int i = 0; i < dNSServiceRuleIdss.size(); i++) {
				putQueryParameter("DNSServiceRuleIds." + (i + 1) , dNSServiceRuleIdss.get(i));
			}
		}	
	}

	public List<String> getDNSServiceRuleNames() {
		return this.dNSServiceRuleNames;
	}

	public void setDNSServiceRuleNames(List<String> dNSServiceRuleNames) {
		this.dNSServiceRuleNames = dNSServiceRuleNames;	
		if (dNSServiceRuleNames != null) {
			for (int i = 0; i < dNSServiceRuleNames.size(); i++) {
				putQueryParameter("DNSServiceRuleName." + (i + 1) , dNSServiceRuleNames.get(i));
			}
		}	
	}

	@Override
	public Class<ListGroupDNSServiceRulesResponse> getResponseClass() {
		return ListGroupDNSServiceRulesResponse.class;
	}

}
