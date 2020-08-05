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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UnsignWithholdAgreementRequest extends RpcAcsRequest<UnsignWithholdAgreementResponse> {
	   

	private String outRequestNo;

	private String externalAgreementNo;

	private String merchantId;

	private String agreementNo;
	public UnsignWithholdAgreementRequest() {
		super("linkedmall", "2018-01-16", "UnsignWithholdAgreement", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
		if(outRequestNo != null){
			putBodyParameter("OutRequestNo", outRequestNo);
		}
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}

	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
		if(externalAgreementNo != null){
			putBodyParameter("ExternalAgreementNo", externalAgreementNo);
		}
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putBodyParameter("MerchantId", merchantId);
		}
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
		if(agreementNo != null){
			putBodyParameter("AgreementNo", agreementNo);
		}
	}

	@Override
	public Class<UnsignWithholdAgreementResponse> getResponseClass() {
		return UnsignWithholdAgreementResponse.class;
	}

}
