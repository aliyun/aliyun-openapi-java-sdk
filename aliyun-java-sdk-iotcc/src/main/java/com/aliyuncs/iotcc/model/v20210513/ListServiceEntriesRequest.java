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
public class ListServiceEntriesRequest extends RpcAcsRequest<ListServiceEntriesResponse> {
	   

	private List<String> serviceEntryStatuss;

	private List<String> targetTypes;

	private List<String> serviceEntryIdss;

	private String nextToken;

	private List<String> serviceEntryNames;

	private List<String> targets;

	private String ioTCloudConnectorId;

	private Integer maxResults;

	private String serviceId;
	public ListServiceEntriesRequest() {
		super("IoTCC", "2021-05-13", "ListServiceEntries", "cciot");
		setMethod(MethodType.POST);
	}

	public List<String> getServiceEntryStatuss() {
		return this.serviceEntryStatuss;
	}

	public void setServiceEntryStatuss(List<String> serviceEntryStatuss) {
		this.serviceEntryStatuss = serviceEntryStatuss;	
		if (serviceEntryStatuss != null) {
			for (int i = 0; i < serviceEntryStatuss.size(); i++) {
				putQueryParameter("ServiceEntryStatus." + (i + 1) , serviceEntryStatuss.get(i));
			}
		}	
	}

	public List<String> getTargetTypes() {
		return this.targetTypes;
	}

	public void setTargetTypes(List<String> targetTypes) {
		this.targetTypes = targetTypes;	
		if (targetTypes != null) {
			for (int i = 0; i < targetTypes.size(); i++) {
				putQueryParameter("TargetType." + (i + 1) , targetTypes.get(i));
			}
		}	
	}

	public List<String> getServiceEntryIdss() {
		return this.serviceEntryIdss;
	}

	public void setServiceEntryIdss(List<String> serviceEntryIdss) {
		this.serviceEntryIdss = serviceEntryIdss;	
		if (serviceEntryIdss != null) {
			for (int i = 0; i < serviceEntryIdss.size(); i++) {
				putQueryParameter("ServiceEntryIds." + (i + 1) , serviceEntryIdss.get(i));
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

	public List<String> getServiceEntryNames() {
		return this.serviceEntryNames;
	}

	public void setServiceEntryNames(List<String> serviceEntryNames) {
		this.serviceEntryNames = serviceEntryNames;	
		if (serviceEntryNames != null) {
			for (int i = 0; i < serviceEntryNames.size(); i++) {
				putQueryParameter("ServiceEntryName." + (i + 1) , serviceEntryNames.get(i));
			}
		}	
	}

	public List<String> getTargets() {
		return this.targets;
	}

	public void setTargets(List<String> targets) {
		this.targets = targets;	
		if (targets != null) {
			for (int i = 0; i < targets.size(); i++) {
				putQueryParameter("Target." + (i + 1) , targets.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
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

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<ListServiceEntriesResponse> getResponseClass() {
		return ListServiceEntriesResponse.class;
	}

}
