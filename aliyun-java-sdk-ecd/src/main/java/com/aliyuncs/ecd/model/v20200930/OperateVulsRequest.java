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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateVulsRequest extends RpcAcsRequest<OperateVulsResponse> {
	   

	private String reason;

	private Integer precondition;

	private String type;

	private List<String> vulNames;

	private List<String> desktopIds;

	private String operateType;
	public OperateVulsRequest() {
		super("ecd", "2020-09-30", "OperateVuls", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public Integer getPrecondition() {
		return this.precondition;
	}

	public void setPrecondition(Integer precondition) {
		this.precondition = precondition;
		if(precondition != null){
			putQueryParameter("Precondition", precondition.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<String> getVulNames() {
		return this.vulNames;
	}

	public void setVulNames(List<String> vulNames) {
		this.vulNames = vulNames;	
		if (vulNames != null) {
			for (int i = 0; i < vulNames.size(); i++) {
				putQueryParameter("VulName." + (i + 1) , vulNames.get(i));
			}
		}	
	}

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
			}
		}	
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	@Override
	public Class<OperateVulsResponse> getResponseClass() {
		return OperateVulsResponse.class;
	}

}
