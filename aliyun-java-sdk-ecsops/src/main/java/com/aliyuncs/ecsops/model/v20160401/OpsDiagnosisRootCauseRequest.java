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
public class OpsDiagnosisRootCauseRequest extends RpcAcsRequest<OpsDiagnosisRootCauseResponse> {
	   

	private Integer derivationPathCnt;

	private String startTime;

	private List<TargetList> targetLists;

	private String problemClassification;

	private String endTime;

	private Boolean asyncDetect;

	private String regionNo;

	private String auditParamStr;
	public OpsDiagnosisRootCauseRequest() {
		super("Ecsops", "2016-04-01", "OpsDiagnosisRootCause", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getDerivationPathCnt() {
		return this.derivationPathCnt;
	}

	public void setDerivationPathCnt(Integer derivationPathCnt) {
		this.derivationPathCnt = derivationPathCnt;
		if(derivationPathCnt != null){
			putQueryParameter("DerivationPathCnt", derivationPathCnt.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public List<TargetList> getTargetLists() {
		return this.targetLists;
	}

	public void setTargetLists(List<TargetList> targetLists) {
		this.targetLists = targetLists;	
		if (targetLists != null) {
			for (int depth1 = 0; depth1 < targetLists.size(); depth1++) {
				if (targetLists.get(depth1).getRelatedDetectIds() != null) {
					for (int i = 0; i < targetLists.get(depth1).getRelatedDetectIds().size(); i++) {
						putQueryParameter("TargetList." + (depth1 + 1) + ".RelatedDetectId." + (i + 1) , targetLists.get(depth1).getRelatedDetectIds().get(i));
					}
				}
				putQueryParameter("TargetList." + (depth1 + 1) + ".TargetId" , targetLists.get(depth1).getTargetId());
				putQueryParameter("TargetList." + (depth1 + 1) + ".TargetRegionId" , targetLists.get(depth1).getTargetRegionId());
			}
		}	
	}

	public String getProblemClassification() {
		return this.problemClassification;
	}

	public void setProblemClassification(String problemClassification) {
		this.problemClassification = problemClassification;
		if(problemClassification != null){
			putQueryParameter("ProblemClassification", problemClassification);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Boolean getAsyncDetect() {
		return this.asyncDetect;
	}

	public void setAsyncDetect(Boolean asyncDetect) {
		this.asyncDetect = asyncDetect;
		if(asyncDetect != null){
			putQueryParameter("AsyncDetect", asyncDetect.toString());
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class TargetList {

		private List<String> relatedDetectIds;

		private String targetId;

		private String targetRegionId;

		public List<String> getRelatedDetectIds() {
			return this.relatedDetectIds;
		}

		public void setRelatedDetectIds(List<String> relatedDetectIds) {
			this.relatedDetectIds = relatedDetectIds;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getTargetRegionId() {
			return this.targetRegionId;
		}

		public void setTargetRegionId(String targetRegionId) {
			this.targetRegionId = targetRegionId;
		}
	}

	@Override
	public Class<OpsDiagnosisRootCauseResponse> getResponseClass() {
		return OpsDiagnosisRootCauseResponse.class;
	}

}
