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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateResourceReconciliationRequest extends RpcAcsRequest<OpsCreateResourceReconciliationResponse> {
	   

	private String errorMessage;

	private String resourceId;

	private String ycInfo;

	private Integer type;

	private String hyInfo;

	private Boolean done;

	private String ds;

	private String vpcInfo;

	private Long aliUid;

	private String errorCode;

	private String auditParamStr;
	public OpsCreateResourceReconciliationRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateResourceReconciliation", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		if(errorMessage != null){
			putQueryParameter("ErrorMessage", errorMessage);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getYcInfo() {
		return this.ycInfo;
	}

	public void setYcInfo(String ycInfo) {
		this.ycInfo = ycInfo;
		if(ycInfo != null){
			putQueryParameter("YcInfo", ycInfo);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getHyInfo() {
		return this.hyInfo;
	}

	public void setHyInfo(String hyInfo) {
		this.hyInfo = hyInfo;
		if(hyInfo != null){
			putQueryParameter("HyInfo", hyInfo);
		}
	}

	public Boolean getDone() {
		return this.done;
	}

	public void setDone(Boolean done) {
		this.done = done;
		if(done != null){
			putQueryParameter("Done", done.toString());
		}
	}

	public String getDs() {
		return this.ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
		if(ds != null){
			putQueryParameter("Ds", ds);
		}
	}

	public String getVpcInfo() {
		return this.vpcInfo;
	}

	public void setVpcInfo(String vpcInfo) {
		this.vpcInfo = vpcInfo;
		if(vpcInfo != null){
			putQueryParameter("VpcInfo", vpcInfo);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
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
	public Class<OpsCreateResourceReconciliationResponse> getResponseClass() {
		return OpsCreateResourceReconciliationResponse.class;
	}

}
