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
public class OpsUpdateChangePlanStatusRequest extends RpcAcsRequest<OpsUpdateChangePlanStatusResponse> {
	   

	private List<String> failedLists;

	private Integer batchNo;

	private List<String> notGoodLists;

	private List<String> succeededLists;

	private List<String> ext1Lists;

	private String serviceVersion;

	private String planId;

	private String auditParamStr;

	private List<String> pausedLists;
	public OpsUpdateChangePlanStatusRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateChangePlanStatus", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getFailedLists() {
		return this.failedLists;
	}

	public void setFailedLists(List<String> failedLists) {
		this.failedLists = failedLists;	
		if (failedLists != null) {
			for (int i = 0; i < failedLists.size(); i++) {
				putQueryParameter("FailedList." + (i + 1) , failedLists.get(i));
			}
		}	
	}

	public Integer getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
		if(batchNo != null){
			putQueryParameter("BatchNo", batchNo.toString());
		}
	}

	public List<String> getNotGoodLists() {
		return this.notGoodLists;
	}

	public void setNotGoodLists(List<String> notGoodLists) {
		this.notGoodLists = notGoodLists;	
		if (notGoodLists != null) {
			for (int i = 0; i < notGoodLists.size(); i++) {
				putQueryParameter("NotGoodList." + (i + 1) , notGoodLists.get(i));
			}
		}	
	}

	public List<String> getSucceededLists() {
		return this.succeededLists;
	}

	public void setSucceededLists(List<String> succeededLists) {
		this.succeededLists = succeededLists;	
		if (succeededLists != null) {
			for (int i = 0; i < succeededLists.size(); i++) {
				putQueryParameter("SucceededList." + (i + 1) , succeededLists.get(i));
			}
		}	
	}

	public List<String> getExt1Lists() {
		return this.ext1Lists;
	}

	public void setExt1Lists(List<String> ext1Lists) {
		this.ext1Lists = ext1Lists;	
		if (ext1Lists != null) {
			for (int i = 0; i < ext1Lists.size(); i++) {
				putQueryParameter("Ext1List." + (i + 1) , ext1Lists.get(i));
			}
		}	
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
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

	public List<String> getPausedLists() {
		return this.pausedLists;
	}

	public void setPausedLists(List<String> pausedLists) {
		this.pausedLists = pausedLists;	
		if (pausedLists != null) {
			for (int i = 0; i < pausedLists.size(); i++) {
				putQueryParameter("PausedList." + (i + 1) , pausedLists.get(i));
			}
		}	
	}

	@Override
	public Class<OpsUpdateChangePlanStatusResponse> getResponseClass() {
		return OpsUpdateChangePlanStatusResponse.class;
	}

}
