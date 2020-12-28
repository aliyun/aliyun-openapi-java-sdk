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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSlbAPsRequest extends RpcAcsRequest<ListSlbAPsResponse> {
	   

	private List<String> protocolLists;

	private String slbId;

	private Long appId;

	private String name;

	private Integer pageSize;

	private Long envId;

	private String networkMode;

	private Integer pageNumber;
	public ListSlbAPsRequest() {
		super("retailcloud", "2018-03-13", "ListSlbAPs", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getProtocolLists() {
		return this.protocolLists;
	}

	public void setProtocolLists(List<String> protocolLists) {
		this.protocolLists = protocolLists;	
		if (protocolLists != null) {
			for (int i = 0; i < protocolLists.size(); i++) {
				putBodyParameter("ProtocolList." + (i + 1) , protocolLists.get(i));
			}
		}	
	}

	public String getSlbId() {
		return this.slbId;
	}

	public void setSlbId(String slbId) {
		this.slbId = slbId;
		if(slbId != null){
			putQueryParameter("SlbId", slbId);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
		if(networkMode != null){
			putQueryParameter("NetworkMode", networkMode);
		}
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

	@Override
	public Class<ListSlbAPsResponse> getResponseClass() {
		return ListSlbAPsResponse.class;
	}

}
