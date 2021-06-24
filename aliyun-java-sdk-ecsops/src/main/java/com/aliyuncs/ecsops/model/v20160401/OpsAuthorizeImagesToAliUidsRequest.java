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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsAuthorizeImagesToAliUidsRequest extends RpcAcsRequest<OpsAuthorizeImagesToAliUidsResponse> {
	   

	private List<String> imageIds;

	private String operator;

	private String mode;

	private List<String> aliUids;

	private Boolean dryRun;

	private String auditParamStr;
	public OpsAuthorizeImagesToAliUidsRequest() {
		super("Ecsops", "2016-04-01", "OpsAuthorizeImagesToAliUids", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public List<String> getAliUids() {
		return this.aliUids;
	}

	public void setAliUids(List<String> aliUids) {
		this.aliUids = aliUids;	
		if (aliUids != null) {
			for (int i = 0; i < aliUids.size(); i++) {
				putQueryParameter("AliUid." + (i + 1) , aliUids.get(i));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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
	public Class<OpsAuthorizeImagesToAliUidsResponse> getResponseClass() {
		return OpsAuthorizeImagesToAliUidsResponse.class;
	}

}
