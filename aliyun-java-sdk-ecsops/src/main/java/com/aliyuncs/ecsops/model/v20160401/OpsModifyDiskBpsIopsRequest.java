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
public class OpsModifyDiskBpsIopsRequest extends RpcAcsRequest<OpsModifyDiskBpsIopsResponse> {
	   

	private Integer bpsR;

	private Integer bps;

	private String operator;

	private Integer iopsR;

	private Integer iopsW;

	private Integer iops;

	private String diskId;

	private Integer bpsW;

	private String auditParamStr;
	public OpsModifyDiskBpsIopsRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyDiskBpsIops", "ecsops");
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
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
	public Class<OpsModifyDiskBpsIopsResponse> getResponseClass() {
		return OpsModifyDiskBpsIopsResponse.class;
	}

}
