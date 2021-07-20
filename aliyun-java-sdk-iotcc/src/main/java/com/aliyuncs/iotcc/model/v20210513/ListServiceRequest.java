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
public class ListServiceRequest extends RpcAcsRequest<ListServiceResponse> {
	   

	private List<String> serviceIdss;

	private List<String> resourceStatusess;

	private String nextToken;

	private List<String> serviceNamess;

	private String ioTCloudConnectorId;

	private Integer maxResults;
	public ListServiceRequest() {
		super("IoTCC", "2021-05-13", "ListService", "cciot");
		setMethod(MethodType.POST);
	}

	public List<String> getServiceIdss() {
		return this.serviceIdss;
	}

	public void setServiceIdss(List<String> serviceIdss) {
		this.serviceIdss = serviceIdss;	
		if (serviceIdss != null) {
			for (int i = 0; i < serviceIdss.size(); i++) {
				putQueryParameter("ServiceIds." + (i + 1) , serviceIdss.get(i));
			}
		}	
	}

	public List<String> getResourceStatusess() {
		return this.resourceStatusess;
	}

	public void setResourceStatusess(List<String> resourceStatusess) {
		this.resourceStatusess = resourceStatusess;	
		if (resourceStatusess != null) {
			for (int i = 0; i < resourceStatusess.size(); i++) {
				putQueryParameter("ResourceStatuses." + (i + 1) , resourceStatusess.get(i));
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

	public List<String> getServiceNamess() {
		return this.serviceNamess;
	}

	public void setServiceNamess(List<String> serviceNamess) {
		this.serviceNamess = serviceNamess;	
		if (serviceNamess != null) {
			for (int i = 0; i < serviceNamess.size(); i++) {
				putQueryParameter("ServiceNames." + (i + 1) , serviceNamess.get(i));
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

	@Override
	public Class<ListServiceResponse> getResponseClass() {
		return ListServiceResponse.class;
	}

}
