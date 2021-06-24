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
public class OpsQueryCloudBoxSkuInfoRequest extends RpcAcsRequest<OpsQueryCloudBoxSkuInfoResponse> {
	   

	private String skuCabinetType;

	private String skuType;

	private String skuId;

	private String auditParamStr;
	public OpsQueryCloudBoxSkuInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryCloudBoxSkuInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSkuCabinetType() {
		return this.skuCabinetType;
	}

	public void setSkuCabinetType(String skuCabinetType) {
		this.skuCabinetType = skuCabinetType;
		if(skuCabinetType != null){
			putQueryParameter("SkuCabinetType", skuCabinetType);
		}
	}

	public String getSkuType() {
		return this.skuType;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
		if(skuType != null){
			putQueryParameter("SkuType", skuType);
		}
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
		if(skuId != null){
			putQueryParameter("SkuId", skuId);
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
	public Class<OpsQueryCloudBoxSkuInfoResponse> getResponseClass() {
		return OpsQueryCloudBoxSkuInfoResponse.class;
	}

}
