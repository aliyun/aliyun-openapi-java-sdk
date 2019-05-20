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
public class DescribeFlowTotalCountRequest extends RpcAcsRequest<DescribeFlowTotalCountResponse> {
	
	public DescribeFlowTotalCountRequest() {
		super("Yundun-ds", "2019-01-03", "DescribeFlowTotalCount", "sddp");
	}

	private String productCode;

	private Integer featureType;

	private Long departId;

	private String lang;

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

	public Long getDepartId() {
		return this.departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
		if(departId != null){
			putQueryParameter("DepartId", departId.toString());
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
	public Class<DescribeFlowTotalCountResponse> getResponseClass() {
		return DescribeFlowTotalCountResponse.class;
	}

}
