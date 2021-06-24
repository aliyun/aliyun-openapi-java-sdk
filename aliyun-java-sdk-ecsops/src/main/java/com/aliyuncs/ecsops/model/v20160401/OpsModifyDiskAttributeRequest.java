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
public class OpsModifyDiskAttributeRequest extends RpcAcsRequest<OpsModifyDiskAttributeResponse> {
	   

	private Boolean enableAutoSnapshot;

	private String operator;

	private String diskName;

	private Boolean deleteAutoSnapshot;

	private String diskId;

	private String diskDesc;

	private Boolean deleteWithInstance;

	private String auditParamStr;
	public OpsModifyDiskAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyDiskAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getEnableAutoSnapshot() {
		return this.enableAutoSnapshot;
	}

	public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
		this.enableAutoSnapshot = enableAutoSnapshot;
		if(enableAutoSnapshot != null){
			putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public Boolean getDeleteAutoSnapshot() {
		return this.deleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
		this.deleteAutoSnapshot = deleteAutoSnapshot;
		if(deleteAutoSnapshot != null){
			putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot.toString());
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public String getDiskDesc() {
		return this.diskDesc;
	}

	public void setDiskDesc(String diskDesc) {
		this.diskDesc = diskDesc;
		if(diskDesc != null){
			putQueryParameter("DiskDesc", diskDesc);
		}
	}

	public Boolean getDeleteWithInstance() {
		return this.deleteWithInstance;
	}

	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		this.deleteWithInstance = deleteWithInstance;
		if(deleteWithInstance != null){
			putQueryParameter("DeleteWithInstance", deleteWithInstance.toString());
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
	public Class<OpsModifyDiskAttributeResponse> getResponseClass() {
		return OpsModifyDiskAttributeResponse.class;
	}

}
