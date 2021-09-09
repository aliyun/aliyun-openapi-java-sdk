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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PrintAcctgTransRequest extends RpcAcsRequest<PrintAcctgTransResponse> {
	   

	private Boolean showCustomComments;

	private String printStyle;

	private String bizId;

	private String printCount;

	private String voucherIds;
	public PrintAcctgTransRequest() {
		super("companyreg", "2020-10-22", "PrintAcctgTrans", "companyreg");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getShowCustomComments() {
		return this.showCustomComments;
	}

	public void setShowCustomComments(Boolean showCustomComments) {
		this.showCustomComments = showCustomComments;
		if(showCustomComments != null){
			putQueryParameter("ShowCustomComments", showCustomComments.toString());
		}
	}

	public String getPrintStyle() {
		return this.printStyle;
	}

	public void setPrintStyle(String printStyle) {
		this.printStyle = printStyle;
		if(printStyle != null){
			putQueryParameter("PrintStyle", printStyle);
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

	public String getPrintCount() {
		return this.printCount;
	}

	public void setPrintCount(String printCount) {
		this.printCount = printCount;
		if(printCount != null){
			putQueryParameter("PrintCount", printCount);
		}
	}

	public String getVoucherIds() {
		return this.voucherIds;
	}

	public void setVoucherIds(String voucherIds) {
		this.voucherIds = voucherIds;
		if(voucherIds != null){
			putQueryParameter("VoucherIds", voucherIds);
		}
	}

	@Override
	public Class<PrintAcctgTransResponse> getResponseClass() {
		return PrintAcctgTransResponse.class;
	}

}
