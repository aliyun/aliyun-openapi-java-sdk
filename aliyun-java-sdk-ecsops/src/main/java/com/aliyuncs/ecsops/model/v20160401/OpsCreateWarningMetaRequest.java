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
public class OpsCreateWarningMetaRequest extends RpcAcsRequest<OpsCreateWarningMetaResponse> {
	   

	private String diagnoseCategory;

	private Integer triggerDiagnosis;

	private String phoneNumber;

	private String ownerTeam;

	private String sourceSystem;

	private String productName;

	private String app;

	private String owner;

	private String mMnitorTitle;

	private String level;

	private String ownerName;

	private Integer triggerWarning;

	private String auditParamStr;
	public OpsCreateWarningMetaRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateWarningMeta", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDiagnoseCategory() {
		return this.diagnoseCategory;
	}

	public void setDiagnoseCategory(String diagnoseCategory) {
		this.diagnoseCategory = diagnoseCategory;
		if(diagnoseCategory != null){
			putQueryParameter("DiagnoseCategory", diagnoseCategory);
		}
	}

	public Integer getTriggerDiagnosis() {
		return this.triggerDiagnosis;
	}

	public void setTriggerDiagnosis(Integer triggerDiagnosis) {
		this.triggerDiagnosis = triggerDiagnosis;
		if(triggerDiagnosis != null){
			putQueryParameter("TriggerDiagnosis", triggerDiagnosis.toString());
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getOwnerTeam() {
		return this.ownerTeam;
	}

	public void setOwnerTeam(String ownerTeam) {
		this.ownerTeam = ownerTeam;
		if(ownerTeam != null){
			putQueryParameter("OwnerTeam", ownerTeam);
		}
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
		if(sourceSystem != null){
			putQueryParameter("SourceSystem", sourceSystem);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
		}
	}

	public String getMMnitorTitle() {
		return this.mMnitorTitle;
	}

	public void setMMnitorTitle(String mMnitorTitle) {
		this.mMnitorTitle = mMnitorTitle;
		if(mMnitorTitle != null){
			putQueryParameter("mMnitorTitle", mMnitorTitle);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		if(ownerName != null){
			putQueryParameter("OwnerName", ownerName);
		}
	}

	public Integer getTriggerWarning() {
		return this.triggerWarning;
	}

	public void setTriggerWarning(Integer triggerWarning) {
		this.triggerWarning = triggerWarning;
		if(triggerWarning != null){
			putQueryParameter("TriggerWarning", triggerWarning.toString());
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
	public Class<OpsCreateWarningMetaResponse> getResponseClass() {
		return OpsCreateWarningMetaResponse.class;
	}

}
