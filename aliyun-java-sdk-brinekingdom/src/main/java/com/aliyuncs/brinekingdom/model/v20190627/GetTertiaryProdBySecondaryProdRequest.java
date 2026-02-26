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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTertiaryProdBySecondaryProdRequest extends RpcAcsRequest<GetTertiaryProdBySecondaryProdResponse> {
	   

	private String productClass;

	private String productClassCN;
	public GetTertiaryProdBySecondaryProdRequest() {
		super("brinekingdom", "2019-06-27", "GetTertiaryProdBySecondaryProd");
		setMethod(MethodType.POST);
	}

	public String getProductClass() {
		return this.productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
		if(productClass != null){
			putQueryParameter("ProductClass", productClass);
		}
	}

	public String getProductClassCN() {
		return this.productClassCN;
	}

	public void setProductClassCN(String productClassCN) {
		this.productClassCN = productClassCN;
		if(productClassCN != null){
			putQueryParameter("ProductClassCN", productClassCN);
		}
	}

	@Override
	public Class<GetTertiaryProdBySecondaryProdResponse> getResponseClass() {
		return GetTertiaryProdBySecondaryProdResponse.class;
	}

}
