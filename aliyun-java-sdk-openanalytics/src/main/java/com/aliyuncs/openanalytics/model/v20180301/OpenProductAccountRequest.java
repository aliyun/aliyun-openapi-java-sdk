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

package com.aliyuncs.openanalytics.model.v20180301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OpenProductAccountRequest extends RpcAcsRequest<OpenProductAccountResponse> {
	
	public OpenProductAccountRequest() {
		super("openanalytics", "2018-03-01", "OpenProductAccount", "openanalytics");
	}

	private String productCode;

	private String productAccessKey;

	private String targetUid;

	private String targetArnRole;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getProductAccessKey() {
		return this.productAccessKey;
	}

	public void setProductAccessKey(String productAccessKey) {
		this.productAccessKey = productAccessKey;
		if(productAccessKey != null){
			putBodyParameter("ProductAccessKey", productAccessKey);
		}
	}

	public String getTargetUid() {
		return this.targetUid;
	}

	public void setTargetUid(String targetUid) {
		this.targetUid = targetUid;
		if(targetUid != null){
			putBodyParameter("TargetUid", targetUid);
		}
	}

	public String getTargetArnRole() {
		return this.targetArnRole;
	}

	public void setTargetArnRole(String targetArnRole) {
		this.targetArnRole = targetArnRole;
		if(targetArnRole != null){
			putBodyParameter("TargetArnRole", targetArnRole);
		}
	}

	@Override
	public Class<OpenProductAccountResponse> getResponseClass() {
		return OpenProductAccountResponse.class;
	}

}
