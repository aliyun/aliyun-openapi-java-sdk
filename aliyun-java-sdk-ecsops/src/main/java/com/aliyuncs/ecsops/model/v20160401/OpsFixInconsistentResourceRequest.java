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
public class OpsFixInconsistentResourceRequest extends RpcAcsRequest<OpsFixInconsistentResourceResponse> {
	   

	private Boolean forceCheck;

	private String fixRule;

	private String regionNo;

	private Long aliUid;

	private String auditParamStr;

	private List<String> resourceIdss;
	public OpsFixInconsistentResourceRequest() {
		super("Ecsops", "2016-04-01", "OpsFixInconsistentResource", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getForceCheck() {
		return this.forceCheck;
	}

	public void setForceCheck(Boolean forceCheck) {
		this.forceCheck = forceCheck;
		if(forceCheck != null){
			putQueryParameter("ForceCheck", forceCheck.toString());
		}
	}

	public String getFixRule() {
		return this.fixRule;
	}

	public void setFixRule(String fixRule) {
		this.fixRule = fixRule;
		if(fixRule != null){
			putQueryParameter("FixRule", fixRule);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public List<String> getResourceIdss() {
		return this.resourceIdss;
	}

	public void setResourceIdss(List<String> resourceIdss) {
		this.resourceIdss = resourceIdss;	
		if (resourceIdss != null) {
			for (int i = 0; i < resourceIdss.size(); i++) {
				putQueryParameter("ResourceIds." + (i + 1) , resourceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<OpsFixInconsistentResourceResponse> getResponseClass() {
		return OpsFixInconsistentResourceResponse.class;
	}

}
