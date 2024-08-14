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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportCorpNumbersRequest extends RpcAcsRequest<ImportCorpNumbersResponse> {
	   

	private String city;

	private String numberList;

	private String tagList;

	private String province;

	private String provider;

	private String corpName;
	public ImportCorpNumbersRequest() {
		super("CCC", "2020-07-01", "ImportCorpNumbers", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getNumberList() {
		return this.numberList;
	}

	public void setNumberList(String numberList) {
		this.numberList = numberList;
		if(numberList != null){
			putQueryParameter("NumberList", numberList);
		}
	}

	public String getTagList() {
		return this.tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
		if(tagList != null){
			putQueryParameter("TagList", tagList);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	@Override
	public Class<ImportCorpNumbersResponse> getResponseClass() {
		return ImportCorpNumbersResponse.class;
	}

}
