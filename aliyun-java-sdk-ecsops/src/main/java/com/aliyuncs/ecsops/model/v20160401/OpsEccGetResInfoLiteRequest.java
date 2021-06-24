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
public class OpsEccGetResInfoLiteRequest extends RpcAcsRequest<OpsEccGetResInfoLiteResponse> {
	   

	private String resourceItems;

	private String sN;

	private String cgroupNames;

	private String ncIp;

	private String auditParamStr;
	public OpsEccGetResInfoLiteRequest() {
		super("Ecsops", "2016-04-01", "OpsEccGetResInfoLite", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getResourceItems() {
		return this.resourceItems;
	}

	public void setResourceItems(String resourceItems) {
		this.resourceItems = resourceItems;
		if(resourceItems != null){
			putQueryParameter("ResourceItems", resourceItems);
		}
	}

	public String getSN() {
		return this.sN;
	}

	public void setSN(String sN) {
		this.sN = sN;
		if(sN != null){
			putQueryParameter("SN", sN);
		}
	}

	public String getCgroupNames() {
		return this.cgroupNames;
	}

	public void setCgroupNames(String cgroupNames) {
		this.cgroupNames = cgroupNames;
		if(cgroupNames != null){
			putQueryParameter("CgroupNames", cgroupNames);
		}
	}

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("NcIp", ncIp);
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
	public Class<OpsEccGetResInfoLiteResponse> getResponseClass() {
		return OpsEccGetResInfoLiteResponse.class;
	}

}
