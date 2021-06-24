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
public class OpsMigrateDiskRequest extends RpcAcsRequest<OpsMigrateDiskResponse> {
	   

	private String destZoneId;

	private String destDiskType;

	private String destStorageClusterName;

	private String houyiUserId;

	private String houyiDiskId;

	private Integer destDiskIops;

	private String destStorageDomain;

	private Integer destDiskBps;

	private String auditParamStr;
	public OpsMigrateDiskRequest() {
		super("Ecsops", "2016-04-01", "OpsMigrateDisk", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDestZoneId() {
		return this.destZoneId;
	}

	public void setDestZoneId(String destZoneId) {
		this.destZoneId = destZoneId;
		if(destZoneId != null){
			putQueryParameter("DestZoneId", destZoneId);
		}
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

	public String getDestStorageClusterName() {
		return this.destStorageClusterName;
	}

	public void setDestStorageClusterName(String destStorageClusterName) {
		this.destStorageClusterName = destStorageClusterName;
		if(destStorageClusterName != null){
			putQueryParameter("DestStorageClusterName", destStorageClusterName);
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

	public String getHouyiDiskId() {
		return this.houyiDiskId;
	}

	public void setHouyiDiskId(String houyiDiskId) {
		this.houyiDiskId = houyiDiskId;
		if(houyiDiskId != null){
			putQueryParameter("HouyiDiskId", houyiDiskId);
		}
	}

	public Integer getDestDiskIops() {
		return this.destDiskIops;
	}

	public void setDestDiskIops(Integer destDiskIops) {
		this.destDiskIops = destDiskIops;
		if(destDiskIops != null){
			putQueryParameter("DestDiskIops", destDiskIops.toString());
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

	public Integer getDestDiskBps() {
		return this.destDiskBps;
	}

	public void setDestDiskBps(Integer destDiskBps) {
		this.destDiskBps = destDiskBps;
		if(destDiskBps != null){
			putQueryParameter("DestDiskBps", destDiskBps.toString());
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
	public Class<OpsMigrateDiskResponse> getResponseClass() {
		return OpsMigrateDiskResponse.class;
	}

}
