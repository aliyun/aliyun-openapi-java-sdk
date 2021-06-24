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
public class OpsDeleteDiagnosticPluginItemRequest extends RpcAcsRequest<OpsDeleteDiagnosticPluginItemResponse> {
	   

	private String itemCategory;

	private String operator;

	private String pluginCode;

	private String pluginVersion;

	private String workOrderId;

	private String itemCode;

	private String auditParamStr;
	public OpsDeleteDiagnosticPluginItemRequest() {
		super("Ecsops", "2016-04-01", "OpsDeleteDiagnosticPluginItem", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
		if(itemCategory != null){
			putQueryParameter("ItemCategory", itemCategory);
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

	public String getPluginCode() {
		return this.pluginCode;
	}

	public void setPluginCode(String pluginCode) {
		this.pluginCode = pluginCode;
		if(pluginCode != null){
			putQueryParameter("PluginCode", pluginCode);
		}
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
		if(pluginVersion != null){
			putQueryParameter("PluginVersion", pluginVersion);
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

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
		if(itemCode != null){
			putQueryParameter("ItemCode", itemCode);
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
	public Class<OpsDeleteDiagnosticPluginItemResponse> getResponseClass() {
		return OpsDeleteDiagnosticPluginItemResponse.class;
	}

}
