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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInvocationResultsRequest extends RpcAcsRequest<ListInvocationResultsResponse> {
	   

	private List<Instance> instances;

	private String clusterId;

	private String commandId;

	private Integer pageNumber;

	private String invokeRecordStatus;

	private Integer pageSize;
	public ListInvocationResultsRequest() {
		super("EHPC", "2018-04-12", "ListInvocationResults", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;	
		if (instances != null) {
			for (int depth1 = 0; depth1 < instances.size(); depth1++) {
				putQueryParameter("Instance." + (depth1 + 1) + ".Id" , instances.get(depth1).getId());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
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

	public String getInvokeRecordStatus() {
		return this.invokeRecordStatus;
	}

	public void setInvokeRecordStatus(String invokeRecordStatus) {
		this.invokeRecordStatus = invokeRecordStatus;
		if(invokeRecordStatus != null){
			putQueryParameter("InvokeRecordStatus", invokeRecordStatus);
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

	public static class Instance {

		private String id;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<ListInvocationResultsResponse> getResponseClass() {
		return ListInvocationResultsResponse.class;
	}

}
