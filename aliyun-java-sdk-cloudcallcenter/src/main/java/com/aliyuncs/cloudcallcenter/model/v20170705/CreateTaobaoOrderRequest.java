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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTaobaoOrderRequest extends RpcAcsRequest<CreateTaobaoOrderResponse> {
	
	public CreateTaobaoOrderRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateTaobaoOrder", "CloudCallCenter", "innerAPI");
	}

	private String taobaoNick;

	private Float prodFee;

	private Long orderId;

	private Long orderRecordId;

	private Long taobaoUid;

	private Integer type;

	private Long startDate;

	private Long payDate;

	private Long parentOrderId;

	private String articleCode;

	private Long expiresIn;

	private Float factMoney;

	private Integer outcomingAccount;

	private String articleItemCode;

	private Integer incomingAccount;

	private Long planId;

	private Integer status;

	public String getTaobaoNick() {
		return this.taobaoNick;
	}

	public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
		if(taobaoNick != null){
			putQueryParameter("TaobaoNick", taobaoNick);
		}
	}

	public Float getProdFee() {
		return this.prodFee;
	}

	public void setProdFee(Float prodFee) {
		this.prodFee = prodFee;
		if(prodFee != null){
			putQueryParameter("ProdFee", prodFee.toString());
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public Long getOrderRecordId() {
		return this.orderRecordId;
	}

	public void setOrderRecordId(Long orderRecordId) {
		this.orderRecordId = orderRecordId;
		if(orderRecordId != null){
			putQueryParameter("OrderRecordId", orderRecordId.toString());
		}
	}

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("TaobaoUid", taobaoUid.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("type", type.toString());
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate.toString());
		}
	}

	public Long getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Long payDate) {
		this.payDate = payDate;
		if(payDate != null){
			putQueryParameter("PayDate", payDate.toString());
		}
	}

	public Long getParentOrderId() {
		return this.parentOrderId;
	}

	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
		if(parentOrderId != null){
			putQueryParameter("ParentOrderId", parentOrderId.toString());
		}
	}

	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
		if(articleCode != null){
			putQueryParameter("ArticleCode", articleCode);
		}
	}

	public Long getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
		if(expiresIn != null){
			putQueryParameter("ExpiresIn", expiresIn.toString());
		}
	}

	public Float getFactMoney() {
		return this.factMoney;
	}

	public void setFactMoney(Float factMoney) {
		this.factMoney = factMoney;
		if(factMoney != null){
			putQueryParameter("FactMoney", factMoney.toString());
		}
	}

	public Integer getOutcomingAccount() {
		return this.outcomingAccount;
	}

	public void setOutcomingAccount(Integer outcomingAccount) {
		this.outcomingAccount = outcomingAccount;
		if(outcomingAccount != null){
			putQueryParameter("OutcomingAccount", outcomingAccount.toString());
		}
	}

	public String getArticleItemCode() {
		return this.articleItemCode;
	}

	public void setArticleItemCode(String articleItemCode) {
		this.articleItemCode = articleItemCode;
		if(articleItemCode != null){
			putQueryParameter("articleItemCode", articleItemCode);
		}
	}

	public Integer getIncomingAccount() {
		return this.incomingAccount;
	}

	public void setIncomingAccount(Integer incomingAccount) {
		this.incomingAccount = incomingAccount;
		if(incomingAccount != null){
			putQueryParameter("IncomingAccount", incomingAccount.toString());
		}
	}

	public Long getPlanId() {
		return this.planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status.toString());
		}
	}

	@Override
	public Class<CreateTaobaoOrderResponse> getResponseClass() {
		return CreateTaobaoOrderResponse.class;
	}

}
