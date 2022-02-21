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

package com.aliyuncs.finance_rule.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryOuNationalRuleRequest extends RpcAcsRequest<QueryOuNationalRuleResponse> {
	   

	private String countryNameCn;

	private String countryNameEn;

	private String countryCode;

	private String bid;
	public QueryOuNationalRuleRequest() {
		super("Finance-Rule", "2018-08-08", "QueryOuNationalRule");
		setMethod(MethodType.POST);
	}

	public String getCountryNameCn() {
		return this.countryNameCn;
	}

	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn;
		if(countryNameCn != null){
			putQueryParameter("CountryNameCn", countryNameCn);
		}
	}

	public String getCountryNameEn() {
		return this.countryNameEn;
	}

	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
		if(countryNameEn != null){
			putQueryParameter("CountryNameEn", countryNameEn);
		}
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<QueryOuNationalRuleResponse> getResponseClass() {
		return QueryOuNationalRuleResponse.class;
	}

}
