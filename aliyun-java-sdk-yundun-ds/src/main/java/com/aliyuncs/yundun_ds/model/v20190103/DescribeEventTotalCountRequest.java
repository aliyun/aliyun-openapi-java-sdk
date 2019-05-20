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
public class DescribeEventTotalCountRequest extends RpcAcsRequest<DescribeEventTotalCountResponse> {
	
	public DescribeEventTotalCountRequest() {
		super("Yundun-ds", "2019-01-03", "DescribeEventTotalCount", "sddp");
	}

	private String typeCode;

	private Integer featureType;

	private Integer countType;

	private String lang;

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
		if(typeCode != null){
			putQueryParameter("TypeCode", typeCode);
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

	public Integer getCountType() {
		return this.countType;
	}

	public void setCountType(Integer countType) {
		this.countType = countType;
		if(countType != null){
			putQueryParameter("CountType", countType.toString());
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
	public Class<DescribeEventTotalCountResponse> getResponseClass() {
		return DescribeEventTotalCountResponse.class;
	}

}
