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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsSreCreateOwnerProductRequest extends RpcAcsRequest<OpsSreCreateOwnerProductResponse> {
	   

	private String ownerProduct;

	private String ownerProductTagName;

	private String auditParamStr;
	public OpsSreCreateOwnerProductRequest() {
		super("Ecsops", "2016-04-01", "OpsSreCreateOwnerProduct", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getOwnerProduct() {
		return this.ownerProduct;
	}

	public void setOwnerProduct(String ownerProduct) {
		this.ownerProduct = ownerProduct;
		if(ownerProduct != null){
			putQueryParameter("OwnerProduct", ownerProduct);
		}
	}

	public String getOwnerProductTagName() {
		return this.ownerProductTagName;
	}

	public void setOwnerProductTagName(String ownerProductTagName) {
		this.ownerProductTagName = ownerProductTagName;
		if(ownerProductTagName != null){
			putQueryParameter("OwnerProductTagName", ownerProductTagName);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsSreCreateOwnerProductResponse> getResponseClass() {
		return OpsSreCreateOwnerProductResponse.class;
	}

}
