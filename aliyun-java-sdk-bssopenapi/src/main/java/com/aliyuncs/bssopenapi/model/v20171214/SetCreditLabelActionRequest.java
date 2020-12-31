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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetCreditLabelActionRequest extends RpcAcsRequest<SetCreditLabelActionResponse> {
	   

	private String actionType;

	private String isNeedSaveNotifyRule;

	private String isNeedAdjustCreditAccount;

	private Boolean newCreateMode;

	private String description;

	private String source;

	private String currencyCode;

	private String dailyCycle;

	private String operator;

	private String uid;

	private String siteCode;

	private String clearCycle;

	private Boolean needNotice;

	private String requestId;

	private String isNeedSetCreditAmount;

	private String creditAmount;

	private String isNeedAddSettleLabel;
	public SetCreditLabelActionRequest() {
		super("BssOpenApi", "2017-12-14", "SetCreditLabelAction");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
		}
	}

	public String getIsNeedSaveNotifyRule() {
		return this.isNeedSaveNotifyRule;
	}

	public void setIsNeedSaveNotifyRule(String isNeedSaveNotifyRule) {
		this.isNeedSaveNotifyRule = isNeedSaveNotifyRule;
		if(isNeedSaveNotifyRule != null){
			putQueryParameter("IsNeedSaveNotifyRule", isNeedSaveNotifyRule);
		}
	}

	public String getIsNeedAdjustCreditAccount() {
		return this.isNeedAdjustCreditAccount;
	}

	public void setIsNeedAdjustCreditAccount(String isNeedAdjustCreditAccount) {
		this.isNeedAdjustCreditAccount = isNeedAdjustCreditAccount;
		if(isNeedAdjustCreditAccount != null){
			putQueryParameter("IsNeedAdjustCreditAccount", isNeedAdjustCreditAccount);
		}
	}

	public Boolean getNewCreateMode() {
		return this.newCreateMode;
	}

	public void setNewCreateMode(Boolean newCreateMode) {
		this.newCreateMode = newCreateMode;
		if(newCreateMode != null){
			putQueryParameter("NewCreateMode", newCreateMode.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		if(currencyCode != null){
			putQueryParameter("CurrencyCode", currencyCode);
		}
	}

	public String getDailyCycle() {
		return this.dailyCycle;
	}

	public void setDailyCycle(String dailyCycle) {
		this.dailyCycle = dailyCycle;
		if(dailyCycle != null){
			putQueryParameter("DailyCycle", dailyCycle);
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

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
		if(siteCode != null){
			putQueryParameter("SiteCode", siteCode);
		}
	}

	public String getClearCycle() {
		return this.clearCycle;
	}

	public void setClearCycle(String clearCycle) {
		this.clearCycle = clearCycle;
		if(clearCycle != null){
			putQueryParameter("ClearCycle", clearCycle);
		}
	}

	public Boolean getNeedNotice() {
		return this.needNotice;
	}

	public void setNeedNotice(Boolean needNotice) {
		this.needNotice = needNotice;
		if(needNotice != null){
			putQueryParameter("NeedNotice", needNotice.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getIsNeedSetCreditAmount() {
		return this.isNeedSetCreditAmount;
	}

	public void setIsNeedSetCreditAmount(String isNeedSetCreditAmount) {
		this.isNeedSetCreditAmount = isNeedSetCreditAmount;
		if(isNeedSetCreditAmount != null){
			putQueryParameter("IsNeedSetCreditAmount", isNeedSetCreditAmount);
		}
	}

	public String getCreditAmount() {
		return this.creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
		if(creditAmount != null){
			putQueryParameter("CreditAmount", creditAmount);
		}
	}

	public String getIsNeedAddSettleLabel() {
		return this.isNeedAddSettleLabel;
	}

	public void setIsNeedAddSettleLabel(String isNeedAddSettleLabel) {
		this.isNeedAddSettleLabel = isNeedAddSettleLabel;
		if(isNeedAddSettleLabel != null){
			putQueryParameter("IsNeedAddSettleLabel", isNeedAddSettleLabel);
		}
	}

	@Override
	public Class<SetCreditLabelActionResponse> getResponseClass() {
		return SetCreditLabelActionResponse.class;
	}

}
