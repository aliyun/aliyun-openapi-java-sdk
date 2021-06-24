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
public class OpsUpdateChangePlanHostListRequest extends RpcAcsRequest<OpsUpdateChangePlanHostListResponse> {
	   

	private Integer batchNo;

	private List<String> resources;

	private Integer batchSize;

	private Integer totalCnt;

	private String serviceVersion;

	private String planId;

	private Boolean lastBatchFlag;

	private String auditParamStr;
	public OpsUpdateChangePlanHostListRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateChangePlanHostList", "ecsops");
		setMethod(MethodType.POST);
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

	public List<String> getResources() {
		return this.resources;
	}

	public void setResources(List<String> resources) {
		this.resources = resources;	
		if (resources != null) {
			for (int i = 0; i < resources.size(); i++) {
				putQueryParameter("Resource." + (i + 1) , resources.get(i));
			}
		}	
	}

	public Integer getBatchSize() {
		return this.batchSize;
	}

	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
		if(batchSize != null){
			putQueryParameter("BatchSize", batchSize.toString());
		}
	}

	public Integer getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
		if(totalCnt != null){
			putQueryParameter("TotalCnt", totalCnt.toString());
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

	public Boolean getLastBatchFlag() {
		return this.lastBatchFlag;
	}

	public void setLastBatchFlag(Boolean lastBatchFlag) {
		this.lastBatchFlag = lastBatchFlag;
		if(lastBatchFlag != null){
			putQueryParameter("LastBatchFlag", lastBatchFlag.toString());
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
	public Class<OpsUpdateChangePlanHostListResponse> getResponseClass() {
		return OpsUpdateChangePlanHostListResponse.class;
	}

}
