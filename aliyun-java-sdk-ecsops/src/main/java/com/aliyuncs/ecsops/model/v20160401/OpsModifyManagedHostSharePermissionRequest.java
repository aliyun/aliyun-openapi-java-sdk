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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyManagedHostSharePermissionRequest extends RpcAcsRequest<OpsModifyManagedHostSharePermissionResponse> {
	   

	private String productCode;

	private List<String> addManagedHostIdss;

	private String managedPrivateSpaceId;

	private String zoneId;

	private Long ownerUid;

	private List<String> removeManagedHostIdss;

	private String auditParamStr;
	public OpsModifyManagedHostSharePermissionRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyManagedHostSharePermission", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public List<String> getAddManagedHostIdss() {
		return this.addManagedHostIdss;
	}

	public void setAddManagedHostIdss(List<String> addManagedHostIdss) {
		this.addManagedHostIdss = addManagedHostIdss;	
		if (addManagedHostIdss != null) {
			for (int i = 0; i < addManagedHostIdss.size(); i++) {
				putQueryParameter("AddManagedHostIds." + (i + 1) , addManagedHostIdss.get(i));
			}
		}	
	}

	public String getManagedPrivateSpaceId() {
		return this.managedPrivateSpaceId;
	}

	public void setManagedPrivateSpaceId(String managedPrivateSpaceId) {
		this.managedPrivateSpaceId = managedPrivateSpaceId;
		if(managedPrivateSpaceId != null){
			putQueryParameter("ManagedPrivateSpaceId", managedPrivateSpaceId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Long getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(Long ownerUid) {
		this.ownerUid = ownerUid;
		if(ownerUid != null){
			putQueryParameter("OwnerUid", ownerUid.toString());
		}
	}

	public List<String> getRemoveManagedHostIdss() {
		return this.removeManagedHostIdss;
	}

	public void setRemoveManagedHostIdss(List<String> removeManagedHostIdss) {
		this.removeManagedHostIdss = removeManagedHostIdss;	
		if (removeManagedHostIdss != null) {
			for (int i = 0; i < removeManagedHostIdss.size(); i++) {
				putQueryParameter("RemoveManagedHostIds." + (i + 1) , removeManagedHostIdss.get(i));
			}
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
	public Class<OpsModifyManagedHostSharePermissionResponse> getResponseClass() {
		return OpsModifyManagedHostSharePermissionResponse.class;
	}

}
