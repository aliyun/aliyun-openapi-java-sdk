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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeConditionsRequest extends RpcAcsRequest<DescribeConditionsResponse> {
	
	public DescribeConditionsRequest() {
		super("Yundun-ds", "2019-01-03", "DescribeConditions", "sddp");
	}

	private String productCode;

	private Integer featureType;

	private Integer searchType;

	private String lang;

	private Integer queryType;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
		}
	}

	public Integer getSearchType() {
		return this.searchType;
	}

	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("SearchType", searchType.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getQueryType() {
		return this.queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType.toString());
		}
	}

	@Override
	public Class<DescribeConditionsResponse> getResponseClass() {
		return DescribeConditionsResponse.class;
	}

}
