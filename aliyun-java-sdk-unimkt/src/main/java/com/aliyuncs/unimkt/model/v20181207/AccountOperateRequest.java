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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AccountOperateRequest extends RpcAcsRequest<AccountOperateResponse> {
	   

	private String accountManagerNumber;

	private String fromUserId;

	private String toAccountNo;

	private String cataloguePrice;

	private String bpId;

	private String operateName;

	private String balance;

	private String actualAmount;

	private String proxyUserNick;

	private String fromAccountNo;

	private String priceVersion;

	private String createTime;

	private String amount;

	private String accountManagerName;

	private String toUserId;

	private Integer marketCount;

	private String proxyUserId;

	private String discountRate;

	private String accuActualAmount;

	private String flowId;

	private String preDebit;

	private String accuAmount;
	public AccountOperateRequest() {
		super("UniMkt", "2018-12-07", "AccountOperate", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountManagerNumber() {
		return this.accountManagerNumber;
	}

	public void setAccountManagerNumber(String accountManagerNumber) {
		this.accountManagerNumber = accountManagerNumber;
		if(accountManagerNumber != null){
			putBodyParameter("AccountManagerNumber", accountManagerNumber);
		}
	}

	public String getFromUserId() {
		return this.fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
		if(fromUserId != null){
			putBodyParameter("FromUserId", fromUserId);
		}
	}

	public String getToAccountNo() {
		return this.toAccountNo;
	}

	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
		if(toAccountNo != null){
			putBodyParameter("ToAccountNo", toAccountNo);
		}
	}

	public String getCataloguePrice() {
		return this.cataloguePrice;
	}

	public void setCataloguePrice(String cataloguePrice) {
		this.cataloguePrice = cataloguePrice;
		if(cataloguePrice != null){
			putBodyParameter("CataloguePrice", cataloguePrice);
		}
	}

	public String getBpId() {
		return this.bpId;
	}

	public void setBpId(String bpId) {
		this.bpId = bpId;
		if(bpId != null){
			putBodyParameter("BpId", bpId);
		}
	}

	public String getOperateName() {
		return this.operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
		if(operateName != null){
			putBodyParameter("OperateName", operateName);
		}
	}

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
		if(balance != null){
			putBodyParameter("Balance", balance);
		}
	}

	public String getActualAmount() {
		return this.actualAmount;
	}

	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
		if(actualAmount != null){
			putBodyParameter("ActualAmount", actualAmount);
		}
	}

	public String getProxyUserNick() {
		return this.proxyUserNick;
	}

	public void setProxyUserNick(String proxyUserNick) {
		this.proxyUserNick = proxyUserNick;
		if(proxyUserNick != null){
			putBodyParameter("ProxyUserNick", proxyUserNick);
		}
	}

	public String getFromAccountNo() {
		return this.fromAccountNo;
	}

	public void setFromAccountNo(String fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
		if(fromAccountNo != null){
			putBodyParameter("FromAccountNo", fromAccountNo);
		}
	}

	public String getPriceVersion() {
		return this.priceVersion;
	}

	public void setPriceVersion(String priceVersion) {
		this.priceVersion = priceVersion;
		if(priceVersion != null){
			putBodyParameter("PriceVersion", priceVersion);
		}
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putBodyParameter("CreateTime", createTime);
		}
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
		if(amount != null){
			putBodyParameter("Amount", amount);
		}
	}

	public String getAccountManagerName() {
		return this.accountManagerName;
	}

	public void setAccountManagerName(String accountManagerName) {
		this.accountManagerName = accountManagerName;
		if(accountManagerName != null){
			putBodyParameter("AccountManagerName", accountManagerName);
		}
	}

	public String getToUserId() {
		return this.toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
		if(toUserId != null){
			putBodyParameter("ToUserId", toUserId);
		}
	}

	public Integer getMarketCount() {
		return this.marketCount;
	}

	public void setMarketCount(Integer marketCount) {
		this.marketCount = marketCount;
		if(marketCount != null){
			putBodyParameter("MarketCount", marketCount.toString());
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putBodyParameter("ProxyUserId", proxyUserId);
		}
	}

	public String getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
		if(discountRate != null){
			putBodyParameter("DiscountRate", discountRate);
		}
	}

	public String getAccuActualAmount() {
		return this.accuActualAmount;
	}

	public void setAccuActualAmount(String accuActualAmount) {
		this.accuActualAmount = accuActualAmount;
		if(accuActualAmount != null){
			putBodyParameter("AccuActualAmount", accuActualAmount);
		}
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
		if(flowId != null){
			putBodyParameter("FlowId", flowId);
		}
	}

	public String getPreDebit() {
		return this.preDebit;
	}

	public void setPreDebit(String preDebit) {
		this.preDebit = preDebit;
		if(preDebit != null){
			putBodyParameter("PreDebit", preDebit);
		}
	}

	public String getAccuAmount() {
		return this.accuAmount;
	}

	public void setAccuAmount(String accuAmount) {
		this.accuAmount = accuAmount;
		if(accuAmount != null){
			putBodyParameter("AccuAmount", accuAmount);
		}
	}

	@Override
	public Class<AccountOperateResponse> getResponseClass() {
		return AccountOperateResponse.class;
	}

}
