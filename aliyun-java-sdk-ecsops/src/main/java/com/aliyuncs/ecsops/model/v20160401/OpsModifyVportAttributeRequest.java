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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyVportAttributeRequest extends RpcAcsRequest<OpsModifyVportAttributeResponse> {
	   

	private String eniNames;

	private String vmNames;

	private Boolean asyncResponse;

	private String groupNos;

	private String value;

	private String key;

	private String auditParamStr;
	public OpsModifyVportAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyVportAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getEniNames() {
		return this.eniNames;
	}

	public void setEniNames(String eniNames) {
		this.eniNames = eniNames;
		if(eniNames != null){
			putQueryParameter("EniNames", eniNames);
		}
	}

	public String getVmNames() {
		return this.vmNames;
	}

	public void setVmNames(String vmNames) {
		this.vmNames = vmNames;
		if(vmNames != null){
			putQueryParameter("VmNames", vmNames);
		}
	}

	public Boolean getAsyncResponse() {
		return this.asyncResponse;
	}

	public void setAsyncResponse(Boolean asyncResponse) {
		this.asyncResponse = asyncResponse;
		if(asyncResponse != null){
			putQueryParameter("AsyncResponse", asyncResponse.toString());
		}
	}

	public String getGroupNos() {
		return this.groupNos;
	}

	public void setGroupNos(String groupNos) {
		this.groupNos = groupNos;
		if(groupNos != null){
			putQueryParameter("GroupNos", groupNos);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsModifyVportAttributeResponse> getResponseClass() {
		return OpsModifyVportAttributeResponse.class;
	}

}
