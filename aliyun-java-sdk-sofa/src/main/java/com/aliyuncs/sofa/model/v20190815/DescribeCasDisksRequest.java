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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasDisksRequest extends RpcAcsRequest<DescribeCasDisksResponse> {
	   

	private String workspace;

	private String type;

	private Long pageSize;

	private Long currentPage;

	private Long minSize;

	private String name;

	private List<String> workspaceIdsRepeatLists;

	private Long maxSize;

	private List<String> computerIdsRepeatLists;

	private List<String> devicesRepeatLists;

	private List<String> statusesRepeatLists;
	public DescribeCasDisksRequest() {
		super("SOFA", "2019-08-15", "DescribeCasDisks", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getMinSize() {
		return this.minSize;
	}

	public void setMinSize(Long minSize) {
		this.minSize = minSize;
		if(minSize != null){
			putBodyParameter("MinSize", minSize.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<String> getWorkspaceIdsRepeatLists() {
		return this.workspaceIdsRepeatLists;
	}

	public void setWorkspaceIdsRepeatLists(List<String> workspaceIdsRepeatLists) {
		this.workspaceIdsRepeatLists = workspaceIdsRepeatLists;	
		if (workspaceIdsRepeatLists != null) {
			for (int i = 0; i < workspaceIdsRepeatLists.size(); i++) {
				putBodyParameter("WorkspaceIdsRepeatList." + (i + 1) , workspaceIdsRepeatLists.get(i));
			}
		}	
	}

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putBodyParameter("MaxSize", maxSize.toString());
		}
	}

	public List<String> getComputerIdsRepeatLists() {
		return this.computerIdsRepeatLists;
	}

	public void setComputerIdsRepeatLists(List<String> computerIdsRepeatLists) {
		this.computerIdsRepeatLists = computerIdsRepeatLists;	
		if (computerIdsRepeatLists != null) {
			for (int i = 0; i < computerIdsRepeatLists.size(); i++) {
				putBodyParameter("ComputerIdsRepeatList." + (i + 1) , computerIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getDevicesRepeatLists() {
		return this.devicesRepeatLists;
	}

	public void setDevicesRepeatLists(List<String> devicesRepeatLists) {
		this.devicesRepeatLists = devicesRepeatLists;	
		if (devicesRepeatLists != null) {
			for (int i = 0; i < devicesRepeatLists.size(); i++) {
				putBodyParameter("DevicesRepeatList." + (i + 1) , devicesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getStatusesRepeatLists() {
		return this.statusesRepeatLists;
	}

	public void setStatusesRepeatLists(List<String> statusesRepeatLists) {
		this.statusesRepeatLists = statusesRepeatLists;	
		if (statusesRepeatLists != null) {
			for (int i = 0; i < statusesRepeatLists.size(); i++) {
				putBodyParameter("StatusesRepeatList." + (i + 1) , statusesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeCasDisksResponse> getResponseClass() {
		return DescribeCasDisksResponse.class;
	}

}
