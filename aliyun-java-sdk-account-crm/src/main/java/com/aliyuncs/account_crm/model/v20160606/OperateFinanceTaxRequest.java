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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateFinanceTaxRequest extends RpcAcsRequest<OperateFinanceTaxResponse> {
	   

	private String financeTaxCertificateImgUrl;

	private Long hId;

	private String secondFinanceTax;

	private String secondFinanceTaxCertificateImgName;

	private String secondFinanceTaxCertificateImgUrl;

	private String financeTax;

	private String financeTaxCertificateImgName;
	public OperateFinanceTaxRequest() {
		super("account-crm", "2016-06-06", "OperateFinanceTax");
		setMethod(MethodType.POST);
	}

	public String getFinanceTaxCertificateImgUrl() {
		return this.financeTaxCertificateImgUrl;
	}

	public void setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
		this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
		if(financeTaxCertificateImgUrl != null){
			putQueryParameter("financeTaxCertificateImgUrl", financeTaxCertificateImgUrl);
		}
	}

	public Long getHId() {
		return this.hId;
	}

	public void setHId(Long hId) {
		this.hId = hId;
		if(hId != null){
			putQueryParameter("HId", hId.toString());
		}
	}

	public String getSecondFinanceTax() {
		return this.secondFinanceTax;
	}

	public void setSecondFinanceTax(String secondFinanceTax) {
		this.secondFinanceTax = secondFinanceTax;
		if(secondFinanceTax != null){
			putQueryParameter("SecondFinanceTax", secondFinanceTax);
		}
	}

	public String getSecondFinanceTaxCertificateImgName() {
		return this.secondFinanceTaxCertificateImgName;
	}

	public void setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
		this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
		if(secondFinanceTaxCertificateImgName != null){
			putQueryParameter("SecondFinanceTaxCertificateImgName", secondFinanceTaxCertificateImgName);
		}
	}

	public String getSecondFinanceTaxCertificateImgUrl() {
		return this.secondFinanceTaxCertificateImgUrl;
	}

	public void setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
		this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
		if(secondFinanceTaxCertificateImgUrl != null){
			putQueryParameter("SecondFinanceTaxCertificateImgUrl", secondFinanceTaxCertificateImgUrl);
		}
	}

	public String getFinanceTax() {
		return this.financeTax;
	}

	public void setFinanceTax(String financeTax) {
		this.financeTax = financeTax;
		if(financeTax != null){
			putQueryParameter("FinanceTax", financeTax);
		}
	}

	public String getFinanceTaxCertificateImgName() {
		return this.financeTaxCertificateImgName;
	}

	public void setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
		this.financeTaxCertificateImgName = financeTaxCertificateImgName;
		if(financeTaxCertificateImgName != null){
			putQueryParameter("FinanceTaxCertificateImgName", financeTaxCertificateImgName);
		}
	}

	@Override
	public Class<OperateFinanceTaxResponse> getResponseClass() {
		return OperateFinanceTaxResponse.class;
	}

}
