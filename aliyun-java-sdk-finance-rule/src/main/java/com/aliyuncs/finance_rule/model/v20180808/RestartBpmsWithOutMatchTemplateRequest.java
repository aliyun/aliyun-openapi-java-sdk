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
public class RestartBpmsWithOutMatchTemplateRequest extends RpcAcsRequest<RestartBpmsWithOutMatchTemplateResponse> {
	   

	private String goodsCode;

	private String empId;
	public RestartBpmsWithOutMatchTemplateRequest() {
		super("Finance-Rule", "2018-08-08", "RestartBpmsWithOutMatchTemplate");
		setMethod(MethodType.POST);
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
		if(goodsCode != null){
			putQueryParameter("GoodsCode", goodsCode);
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putQueryParameter("EmpId", empId);
		}
	}

	@Override
	public Class<RestartBpmsWithOutMatchTemplateResponse> getResponseClass() {
		return RestartBpmsWithOutMatchTemplateResponse.class;
	}

}
