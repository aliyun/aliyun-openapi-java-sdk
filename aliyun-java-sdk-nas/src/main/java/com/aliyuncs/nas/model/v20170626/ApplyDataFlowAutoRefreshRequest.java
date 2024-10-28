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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyDataFlowAutoRefreshRequest extends RpcAcsRequest<ApplyDataFlowAutoRefreshResponse> {
	   

	private String autoRefreshPolicy;

	private String clientToken;

	private List<AutoRefreshs> autoRefreshss;

	private String fileSystemId;

	private Boolean dryRun;

	private String dataFlowId;

	private Long autoRefreshInterval;
	public ApplyDataFlowAutoRefreshRequest() {
		super("NAS", "2017-06-26", "ApplyDataFlowAutoRefresh", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAutoRefreshPolicy() {
		return this.autoRefreshPolicy;
	}

	public void setAutoRefreshPolicy(String autoRefreshPolicy) {
		this.autoRefreshPolicy = autoRefreshPolicy;
		if(autoRefreshPolicy != null){
			putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<AutoRefreshs> getAutoRefreshss() {
		return this.autoRefreshss;
	}

	public void setAutoRefreshss(List<AutoRefreshs> autoRefreshss) {
		this.autoRefreshss = autoRefreshss;	
		if (autoRefreshss != null) {
			for (int depth1 = 0; depth1 < autoRefreshss.size(); depth1++) {
				putQueryParameter("AutoRefreshs." + (depth1 + 1) + ".RefreshPath" , autoRefreshss.get(depth1).getRefreshPath());
			}
		}	
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getDataFlowId() {
		return this.dataFlowId;
	}

	public void setDataFlowId(String dataFlowId) {
		this.dataFlowId = dataFlowId;
		if(dataFlowId != null){
			putQueryParameter("DataFlowId", dataFlowId);
		}
	}

	public Long getAutoRefreshInterval() {
		return this.autoRefreshInterval;
	}

	public void setAutoRefreshInterval(Long autoRefreshInterval) {
		this.autoRefreshInterval = autoRefreshInterval;
		if(autoRefreshInterval != null){
			putQueryParameter("AutoRefreshInterval", autoRefreshInterval.toString());
		}
	}

	public static class AutoRefreshs {

		private String refreshPath;

		public String getRefreshPath() {
			return this.refreshPath;
		}

		public void setRefreshPath(String refreshPath) {
			this.refreshPath = refreshPath;
		}
	}

	@Override
	public Class<ApplyDataFlowAutoRefreshResponse> getResponseClass() {
		return ApplyDataFlowAutoRefreshResponse.class;
	}

}
