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
public class ListGroupIpMappingRulesRequest extends RpcAcsRequest<ListGroupIpMappingRulesResponse> {
	   

	private List<String> mappingIpss;

	private List<String> ipMappingRuleIdss;

	private String nextToken;

	private List<String> ipMappingRuleStatusess;

	private String ioTCloudConnectorGroupId;

	private List<String> ipMappingRuleNamess;

	private List<String> destinationIpss;

	private Integer maxResults;
	public ListGroupIpMappingRulesRequest() {
		super("IoTCC", "2021-05-13", "ListGroupIpMappingRules", "IoTCC");
		setMethod(MethodType.POST);
	}

	public List<String> getMappingIpss() {
		return this.mappingIpss;
	}

	public void setMappingIpss(List<String> mappingIpss) {
		this.mappingIpss = mappingIpss;	
		if (mappingIpss != null) {
			for (int i = 0; i < mappingIpss.size(); i++) {
				putQueryParameter("MappingIps." + (i + 1) , mappingIpss.get(i));
			}
		}	
	}

	public List<String> getIpMappingRuleIdss() {
		return this.ipMappingRuleIdss;
	}

	public void setIpMappingRuleIdss(List<String> ipMappingRuleIdss) {
		this.ipMappingRuleIdss = ipMappingRuleIdss;	
		if (ipMappingRuleIdss != null) {
			for (int i = 0; i < ipMappingRuleIdss.size(); i++) {
				putQueryParameter("IpMappingRuleIds." + (i + 1) , ipMappingRuleIdss.get(i));
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

	public List<String> getIpMappingRuleStatusess() {
		return this.ipMappingRuleStatusess;
	}

	public void setIpMappingRuleStatusess(List<String> ipMappingRuleStatusess) {
		this.ipMappingRuleStatusess = ipMappingRuleStatusess;	
		if (ipMappingRuleStatusess != null) {
			for (int i = 0; i < ipMappingRuleStatusess.size(); i++) {
				putQueryParameter("IpMappingRuleStatuses." + (i + 1) , ipMappingRuleStatusess.get(i));
			}
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

	public List<String> getIpMappingRuleNamess() {
		return this.ipMappingRuleNamess;
	}

	public void setIpMappingRuleNamess(List<String> ipMappingRuleNamess) {
		this.ipMappingRuleNamess = ipMappingRuleNamess;	
		if (ipMappingRuleNamess != null) {
			for (int i = 0; i < ipMappingRuleNamess.size(); i++) {
				putQueryParameter("IpMappingRuleNames." + (i + 1) , ipMappingRuleNamess.get(i));
			}
		}	
	}

	public List<String> getDestinationIpss() {
		return this.destinationIpss;
	}

	public void setDestinationIpss(List<String> destinationIpss) {
		this.destinationIpss = destinationIpss;	
		if (destinationIpss != null) {
			for (int i = 0; i < destinationIpss.size(); i++) {
				putQueryParameter("DestinationIps." + (i + 1) , destinationIpss.get(i));
			}
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

	@Override
	public Class<ListGroupIpMappingRulesResponse> getResponseClass() {
		return ListGroupIpMappingRulesResponse.class;
	}

}
