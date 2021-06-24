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
public class OpsModifyInstanceConfigRequest extends RpcAcsRequest<OpsModifyInstanceConfigResponse> {
	   

	private String instanceTypeName;

	private String operator;

	private String releaseDiskId;

	private Integer cores;

	private Integer mem;

	private String modifyConfigItem;

	private Integer intranetTx;

	private Integer intranetRx;

	private String dataDisksJson;

	private Integer internetRx;

	private Integer internetTx;

	private Boolean forceModifyBandwidth;

	private Boolean async;

	private String workOrderId;

	private String instanceId;

	private String auditParamStr;
	public OpsModifyInstanceConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyInstanceConfig", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getInstanceTypeName() {
		return this.instanceTypeName;
	}

	public void setInstanceTypeName(String instanceTypeName) {
		this.instanceTypeName = instanceTypeName;
		if(instanceTypeName != null){
			putQueryParameter("InstanceTypeName", instanceTypeName);
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

	public String getReleaseDiskId() {
		return this.releaseDiskId;
	}

	public void setReleaseDiskId(String releaseDiskId) {
		this.releaseDiskId = releaseDiskId;
		if(releaseDiskId != null){
			putQueryParameter("ReleaseDiskId", releaseDiskId);
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("Mem", mem.toString());
		}
	}

	public String getModifyConfigItem() {
		return this.modifyConfigItem;
	}

	public void setModifyConfigItem(String modifyConfigItem) {
		this.modifyConfigItem = modifyConfigItem;
		if(modifyConfigItem != null){
			putQueryParameter("ModifyConfigItem", modifyConfigItem);
		}
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
		if(intranetTx != null){
			putQueryParameter("IntranetTx", intranetTx.toString());
		}
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
		if(intranetRx != null){
			putQueryParameter("IntranetRx", intranetRx.toString());
		}
	}

	public String getDataDisksJson() {
		return this.dataDisksJson;
	}

	public void setDataDisksJson(String dataDisksJson) {
		this.dataDisksJson = dataDisksJson;
		if(dataDisksJson != null){
			putQueryParameter("DataDisksJson", dataDisksJson);
		}
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
		if(internetRx != null){
			putQueryParameter("InternetRx", internetRx.toString());
		}
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
		if(internetTx != null){
			putQueryParameter("InternetTx", internetTx.toString());
		}
	}

	public Boolean getForceModifyBandwidth() {
		return this.forceModifyBandwidth;
	}

	public void setForceModifyBandwidth(Boolean forceModifyBandwidth) {
		this.forceModifyBandwidth = forceModifyBandwidth;
		if(forceModifyBandwidth != null){
			putQueryParameter("ForceModifyBandwidth", forceModifyBandwidth.toString());
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async.toString());
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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
	public Class<OpsModifyInstanceConfigResponse> getResponseClass() {
		return OpsModifyInstanceConfigResponse.class;
	}

}
