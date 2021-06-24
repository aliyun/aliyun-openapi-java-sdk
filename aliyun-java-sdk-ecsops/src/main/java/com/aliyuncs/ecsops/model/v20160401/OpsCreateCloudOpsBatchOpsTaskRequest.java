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
public class OpsCreateCloudOpsBatchOpsTaskRequest extends RpcAcsRequest<OpsCreateCloudOpsBatchOpsTaskResponse> {
	   

	private String title;

	private String opsType;

	private String extendData;

	private String problemId;

	private String key;

	private String reasonType;

	private String resourceId;

	private String resourceType;

	private String regionNo;

	private String auditParamStr;
	public OpsCreateCloudOpsBatchOpsTaskRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateCloudOpsBatchOpsTask", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getOpsType() {
		return this.opsType;
	}

	public void setOpsType(String opsType) {
		this.opsType = opsType;
		if(opsType != null){
			putQueryParameter("OpsType", opsType);
		}
	}

	public String getExtendData() {
		return this.extendData;
	}

	public void setExtendData(String extendData) {
		this.extendData = extendData;
		if(extendData != null){
			putQueryParameter("ExtendData", extendData);
		}
	}

	public String getProblemId() {
		return this.problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
		if(problemId != null){
			putQueryParameter("ProblemId", problemId);
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

	public String getReasonType() {
		return this.reasonType;
	}

	public void setReasonType(String reasonType) {
		this.reasonType = reasonType;
		if(reasonType != null){
			putQueryParameter("ReasonType", reasonType);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
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
	public Class<OpsCreateCloudOpsBatchOpsTaskResponse> getResponseClass() {
		return OpsCreateCloudOpsBatchOpsTaskResponse.class;
	}

}
