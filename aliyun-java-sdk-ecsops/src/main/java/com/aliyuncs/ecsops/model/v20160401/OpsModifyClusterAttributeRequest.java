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
public class OpsModifyClusterAttributeRequest extends RpcAcsRequest<OpsModifyClusterAttributeResponse> {
	   

	private Boolean useEcsOpsDownMigration;

	private String houyiClusterId;

	private Boolean downMigrationFlag;

	private String houyiUserId;

	private Boolean useRegionMasterDownMigration;

	private String auditParamStr;
	public OpsModifyClusterAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyClusterAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getUseEcsOpsDownMigration() {
		return this.useEcsOpsDownMigration;
	}

	public void setUseEcsOpsDownMigration(Boolean useEcsOpsDownMigration) {
		this.useEcsOpsDownMigration = useEcsOpsDownMigration;
		if(useEcsOpsDownMigration != null){
			putQueryParameter("UseEcsOpsDownMigration", useEcsOpsDownMigration.toString());
		}
	}

	public String getHouyiClusterId() {
		return this.houyiClusterId;
	}

	public void setHouyiClusterId(String houyiClusterId) {
		this.houyiClusterId = houyiClusterId;
		if(houyiClusterId != null){
			putQueryParameter("HouyiClusterId", houyiClusterId);
		}
	}

	public Boolean getDownMigrationFlag() {
		return this.downMigrationFlag;
	}

	public void setDownMigrationFlag(Boolean downMigrationFlag) {
		this.downMigrationFlag = downMigrationFlag;
		if(downMigrationFlag != null){
			putQueryParameter("DownMigrationFlag", downMigrationFlag.toString());
		}
	}

	public String getHouyiUserId() {
		return this.houyiUserId;
	}

	public void setHouyiUserId(String houyiUserId) {
		this.houyiUserId = houyiUserId;
		if(houyiUserId != null){
			putQueryParameter("HouyiUserId", houyiUserId);
		}
	}

	public Boolean getUseRegionMasterDownMigration() {
		return this.useRegionMasterDownMigration;
	}

	public void setUseRegionMasterDownMigration(Boolean useRegionMasterDownMigration) {
		this.useRegionMasterDownMigration = useRegionMasterDownMigration;
		if(useRegionMasterDownMigration != null){
			putQueryParameter("UseRegionMasterDownMigration", useRegionMasterDownMigration.toString());
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
	public Class<OpsModifyClusterAttributeResponse> getResponseClass() {
		return OpsModifyClusterAttributeResponse.class;
	}

}
