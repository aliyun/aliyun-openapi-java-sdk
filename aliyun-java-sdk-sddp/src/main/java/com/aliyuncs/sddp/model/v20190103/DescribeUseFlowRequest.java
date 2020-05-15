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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUseFlowRequest extends RpcAcsRequest<DescribeUseFlowResponse> {
	   

	private String dateType;

	private Integer featureType;

	private Integer days;

	private String lang;
	public DescribeUseFlowRequest() {
		super("Sddp", "2019-01-03", "DescribeUseFlow", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDateType() {
		return this.dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
		if(dateType != null){
			putQueryParameter("DateType", dateType);
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

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
		if(days != null){
			putQueryParameter("Days", days.toString());
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

	@Override
	public Class<DescribeUseFlowResponse> getResponseClass() {
		return DescribeUseFlowResponse.class;
	}

}
