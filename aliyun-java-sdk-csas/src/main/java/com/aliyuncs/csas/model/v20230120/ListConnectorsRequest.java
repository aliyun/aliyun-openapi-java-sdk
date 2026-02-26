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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListConnectorsRequest extends RpcAcsRequest<ListConnectorsResponse> {
	   

	private String switchStatus;

	private Integer pageSize;

	private Integer currentPage;

	private String name;

	private List<String> connectorIds;

	private String status;
	public ListConnectorsRequest() {
		super("csas", "2023-01-20", "ListConnectors");
		setMethod(MethodType.GET);
	}

	public String getSwitchStatus() {
		return this.switchStatus;
	}

	public void setSwitchStatus(String switchStatus) {
		this.switchStatus = switchStatus;
		if(switchStatus != null){
			putQueryParameter("SwitchStatus", switchStatus);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
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

	public List<String> getConnectorIds() {
		return this.connectorIds;
	}

	public void setConnectorIds(List<String> connectorIds) {
		this.connectorIds = connectorIds;	
		if (connectorIds != null) {
			for (int depth1 = 0; depth1 < connectorIds.size(); depth1++) {
				putQueryParameter("ConnectorIds." + (depth1 + 1) , connectorIds.get(depth1));
			}
		}	
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListConnectorsResponse> getResponseClass() {
		return ListConnectorsResponse.class;
	}

}
