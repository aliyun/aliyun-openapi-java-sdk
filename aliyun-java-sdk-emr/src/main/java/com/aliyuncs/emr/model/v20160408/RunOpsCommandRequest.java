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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunOpsCommandRequest extends RpcAcsRequest<RunOpsCommandResponse> {
	
	public RunOpsCommandRequest() {
		super("Emr", "2016-04-08", "RunOpsCommand", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String opsCommandName;

	private String comment;

	private String customParams;

	private String clusterId;

	private List<String> hostIdLists;

	private String dimension;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOpsCommandName() {
		return this.opsCommandName;
	}

	public void setOpsCommandName(String opsCommandName) {
		this.opsCommandName = opsCommandName;
		if(opsCommandName != null){
			putQueryParameter("OpsCommandName", opsCommandName);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public String getCustomParams() {
		return this.customParams;
	}

	public void setCustomParams(String customParams) {
		this.customParams = customParams;
		if(customParams != null){
			putQueryParameter("CustomParams", customParams);
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

	public List<String> getHostIdLists() {
		return this.hostIdLists;
	}

	public void setHostIdLists(List<String> hostIdLists) {
		this.hostIdLists = hostIdLists;	
		if (hostIdLists != null) {
			for (int i = 0; i < hostIdLists.size(); i++) {
				putQueryParameter("HostIdList." + (i + 1) , hostIdLists.get(i));
			}
		}	
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension);
		}
	}

	@Override
	public Class<RunOpsCommandResponse> getResponseClass() {
		return RunOpsCommandResponse.class;
	}

}
