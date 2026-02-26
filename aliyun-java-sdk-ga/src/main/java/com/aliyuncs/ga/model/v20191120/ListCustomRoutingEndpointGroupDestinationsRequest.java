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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCustomRoutingEndpointGroupDestinationsRequest extends RpcAcsRequest<ListCustomRoutingEndpointGroupDestinationsResponse> {
	   

	private Integer pageNumber;

	private String listenerId;

	private Integer fromPort;

	private Integer pageSize;

	private String acceleratorId;

	private List<String> protocolss;

	private Integer toPort;

	private String endpointGroupId;
	public ListCustomRoutingEndpointGroupDestinationsRequest() {
		super("Ga", "2019-11-20", "ListCustomRoutingEndpointGroupDestinations", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public Integer getFromPort() {
		return this.fromPort;
	}

	public void setFromPort(Integer fromPort) {
		this.fromPort = fromPort;
		if(fromPort != null){
			putQueryParameter("FromPort", fromPort.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public List<String> getProtocolss() {
		return this.protocolss;
	}

	public void setProtocolss(List<String> protocolss) {
		this.protocolss = protocolss;	
		if (protocolss != null) {
			for (int i = 0; i < protocolss.size(); i++) {
				putQueryParameter("Protocols." + (i + 1) , protocolss.get(i));
			}
		}	
	}

	public Integer getToPort() {
		return this.toPort;
	}

	public void setToPort(Integer toPort) {
		this.toPort = toPort;
		if(toPort != null){
			putQueryParameter("ToPort", toPort.toString());
		}
	}

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
		if(endpointGroupId != null){
			putQueryParameter("EndpointGroupId", endpointGroupId);
		}
	}

	@Override
	public Class<ListCustomRoutingEndpointGroupDestinationsResponse> getResponseClass() {
		return ListCustomRoutingEndpointGroupDestinationsResponse.class;
	}

}
