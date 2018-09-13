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

package com.aliyuncs.trademark_inner.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SbjOperateRequest extends RpcAcsRequest<SbjOperateResponse> {
	
	public SbjOperateRequest() {
		super("Trademark-inner", "2018-08-01", "SbjOperate", "trademark", "innerAPI");
	}

	private String amount;

	private String orderNo;

	private Boolean submittedSuccess;

	private String bizId;

	private String tmNumber;

	private String operateType;

	private String message;

	private String receiptOssKey;

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount);
		}
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
		if(orderNo != null){
			putQueryParameter("OrderNo", orderNo);
		}
	}

	public Boolean getSubmittedSuccess() {
		return this.submittedSuccess;
	}

	public void setSubmittedSuccess(Boolean submittedSuccess) {
		this.submittedSuccess = submittedSuccess;
		if(submittedSuccess != null){
			putQueryParameter("SubmittedSuccess", submittedSuccess.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
		if(tmNumber != null){
			putQueryParameter("TmNumber", tmNumber);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getReceiptOssKey() {
		return this.receiptOssKey;
	}

	public void setReceiptOssKey(String receiptOssKey) {
		this.receiptOssKey = receiptOssKey;
		if(receiptOssKey != null){
			putQueryParameter("ReceiptOssKey", receiptOssKey);
		}
	}

	@Override
	public Class<SbjOperateResponse> getResponseClass() {
		return SbjOperateResponse.class;
	}

}
