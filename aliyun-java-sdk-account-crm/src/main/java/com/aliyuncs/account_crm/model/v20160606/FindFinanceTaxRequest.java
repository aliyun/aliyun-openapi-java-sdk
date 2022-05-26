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
public class FindFinanceTaxRequest extends RpcAcsRequest<FindFinanceTaxResponse> {
	   

	private Long hId;

	private String taxVersion;
	public FindFinanceTaxRequest() {
		super("account-crm", "2016-06-06", "FindFinanceTax");
		setMethod(MethodType.POST);
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

	public String getTaxVersion() {
		return this.taxVersion;
	}

	public void setTaxVersion(String taxVersion) {
		this.taxVersion = taxVersion;
		if(taxVersion != null){
			putQueryParameter("TaxVersion", taxVersion);
		}
	}

	@Override
	public Class<FindFinanceTaxResponse> getResponseClass() {
		return FindFinanceTaxResponse.class;
	}

}
