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
public class OpsModifyDiskCategoryRequest extends RpcAcsRequest<OpsModifyDiskCategoryResponse> {
	   

	private String destDiskType;

	private Boolean needModifySpInfo;

	private Boolean needMigrateDisk;

	private String operator;

	private Boolean needModifyEcsdriverInfo;

	private String diskId;

	private String destStorageDomain;

	private Boolean needModifyEbsInfo;

	private String auditParamStr;
	public OpsModifyDiskCategoryRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyDiskCategory", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDestDiskType() {
		return this.destDiskType;
	}

	public void setDestDiskType(String destDiskType) {
		this.destDiskType = destDiskType;
		if(destDiskType != null){
			putQueryParameter("DestDiskType", destDiskType);
		}
	}

	public Boolean getNeedModifySpInfo() {
		return this.needModifySpInfo;
	}

	public void setNeedModifySpInfo(Boolean needModifySpInfo) {
		this.needModifySpInfo = needModifySpInfo;
		if(needModifySpInfo != null){
			putQueryParameter("NeedModifySpInfo", needModifySpInfo.toString());
		}
	}

	public Boolean getNeedMigrateDisk() {
		return this.needMigrateDisk;
	}

	public void setNeedMigrateDisk(Boolean needMigrateDisk) {
		this.needMigrateDisk = needMigrateDisk;
		if(needMigrateDisk != null){
			putQueryParameter("NeedMigrateDisk", needMigrateDisk.toString());
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

	public Boolean getNeedModifyEcsdriverInfo() {
		return this.needModifyEcsdriverInfo;
	}

	public void setNeedModifyEcsdriverInfo(Boolean needModifyEcsdriverInfo) {
		this.needModifyEcsdriverInfo = needModifyEcsdriverInfo;
		if(needModifyEcsdriverInfo != null){
			putQueryParameter("NeedModifyEcsdriverInfo", needModifyEcsdriverInfo.toString());
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

	public String getDestStorageDomain() {
		return this.destStorageDomain;
	}

	public void setDestStorageDomain(String destStorageDomain) {
		this.destStorageDomain = destStorageDomain;
		if(destStorageDomain != null){
			putQueryParameter("DestStorageDomain", destStorageDomain);
		}
	}

	public Boolean getNeedModifyEbsInfo() {
		return this.needModifyEbsInfo;
	}

	public void setNeedModifyEbsInfo(Boolean needModifyEbsInfo) {
		this.needModifyEbsInfo = needModifyEbsInfo;
		if(needModifyEbsInfo != null){
			putQueryParameter("NeedModifyEbsInfo", needModifyEbsInfo.toString());
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
	public Class<OpsModifyDiskCategoryResponse> getResponseClass() {
		return OpsModifyDiskCategoryResponse.class;
	}

}
