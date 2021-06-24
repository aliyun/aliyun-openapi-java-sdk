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
public class OpsModifyHouyiDiskBpsIopsRequest extends RpcAcsRequest<OpsModifyHouyiDiskBpsIopsResponse> {
	   

	private Integer bpsR;

	private Integer bps;

	private String houyiDiskId;

	private Integer iopsR;

	private Integer iopsW;

	private Integer iops;

	private Long aliUid;

	private Integer bpsW;

	private String auditParamStr;
	public OpsModifyHouyiDiskBpsIopsRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyHouyiDiskBpsIops", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getBpsR() {
		return this.bpsR;
	}

	public void setBpsR(Integer bpsR) {
		this.bpsR = bpsR;
		if(bpsR != null){
			putQueryParameter("BpsR", bpsR.toString());
		}
	}

	public Integer getBps() {
		return this.bps;
	}

	public void setBps(Integer bps) {
		this.bps = bps;
		if(bps != null){
			putQueryParameter("Bps", bps.toString());
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

	public Integer getIopsR() {
		return this.iopsR;
	}

	public void setIopsR(Integer iopsR) {
		this.iopsR = iopsR;
		if(iopsR != null){
			putQueryParameter("IopsR", iopsR.toString());
		}
	}

	public Integer getIopsW() {
		return this.iopsW;
	}

	public void setIopsW(Integer iopsW) {
		this.iopsW = iopsW;
		if(iopsW != null){
			putQueryParameter("IopsW", iopsW.toString());
		}
	}

	public Integer getIops() {
		return this.iops;
	}

	public void setIops(Integer iops) {
		this.iops = iops;
		if(iops != null){
			putQueryParameter("Iops", iops.toString());
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

	public Integer getBpsW() {
		return this.bpsW;
	}

	public void setBpsW(Integer bpsW) {
		this.bpsW = bpsW;
		if(bpsW != null){
			putQueryParameter("BpsW", bpsW.toString());
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
	public Class<OpsModifyHouyiDiskBpsIopsResponse> getResponseClass() {
		return OpsModifyHouyiDiskBpsIopsResponse.class;
	}

}
