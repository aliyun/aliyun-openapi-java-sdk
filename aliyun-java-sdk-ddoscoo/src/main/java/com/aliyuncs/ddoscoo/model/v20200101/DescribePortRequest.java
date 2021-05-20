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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePortRequest extends RpcAcsRequest<DescribePortResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String frontendProtocol;

	private String instanceId;

	private Integer frontendPort;
	public DescribePortRequest() {
		super("ddoscoo", "2020-01-01", "DescribePort");
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getFrontendProtocol() {
		return this.frontendProtocol;
	}

	public void setFrontendProtocol(String frontendProtocol) {
		this.frontendProtocol = frontendProtocol;
		if(frontendProtocol != null){
			putQueryParameter("FrontendProtocol", frontendProtocol);
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

	public Integer getFrontendPort() {
		return this.frontendPort;
	}

	public void setFrontendPort(Integer frontendPort) {
		this.frontendPort = frontendPort;
		if(frontendPort != null){
			putQueryParameter("FrontendPort", frontendPort.toString());
		}
	}

	@Override
	public Class<DescribePortResponse> getResponseClass() {
		return DescribePortResponse.class;
	}

}
