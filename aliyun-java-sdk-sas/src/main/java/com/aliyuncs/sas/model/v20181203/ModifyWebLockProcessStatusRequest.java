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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyWebLockProcessStatusRequest extends RpcAcsRequest<ModifyWebLockProcessStatusResponse> {
	   

	private List<String> processPaths;

	private String uuid;

	private Integer dealAll;

	private String operateInfo;

	private Integer status;
	public ModifyWebLockProcessStatusRequest() {
		super("Sas", "2018-12-03", "ModifyWebLockProcessStatus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getProcessPaths() {
		return this.processPaths;
	}

	public void setProcessPaths(List<String> processPaths) {
		this.processPaths = processPaths;	
		if (processPaths != null) {
			for (int i = 0; i < processPaths.size(); i++) {
				putQueryParameter("ProcessPath." + (i + 1) , processPaths.get(i));
			}
		}	
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public Integer getDealAll() {
		return this.dealAll;
	}

	public void setDealAll(Integer dealAll) {
		this.dealAll = dealAll;
		if(dealAll != null){
			putQueryParameter("DealAll", dealAll.toString());
		}
	}

	public String getOperateInfo() {
		return this.operateInfo;
	}

	public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
		if(operateInfo != null){
			putQueryParameter("OperateInfo", operateInfo);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ModifyWebLockProcessStatusResponse> getResponseClass() {
		return ModifyWebLockProcessStatusResponse.class;
	}

}
