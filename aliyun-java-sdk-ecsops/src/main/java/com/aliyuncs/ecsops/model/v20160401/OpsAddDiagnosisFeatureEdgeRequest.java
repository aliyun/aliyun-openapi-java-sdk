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
public class OpsAddDiagnosisFeatureEdgeRequest extends RpcAcsRequest<OpsAddDiagnosisFeatureEdgeResponse> {
	   

	private String regionNo;

	private List<FeatureGraphParamList> featureGraphParamLists;

	private String auditParamStr;
	public OpsAddDiagnosisFeatureEdgeRequest() {
		super("Ecsops", "2016-04-01", "OpsAddDiagnosisFeatureEdge", "ecsops");
		setMethod(MethodType.POST);
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

	public List<FeatureGraphParamList> getFeatureGraphParamLists() {
		return this.featureGraphParamLists;
	}

	public void setFeatureGraphParamLists(List<FeatureGraphParamList> featureGraphParamLists) {
		this.featureGraphParamLists = featureGraphParamLists;	
		if (featureGraphParamLists != null) {
			for (int depth1 = 0; depth1 < featureGraphParamLists.size(); depth1++) {
				putQueryParameter("FeatureGraphParamList." + (depth1 + 1) + ".FeatureNameFrom" , featureGraphParamLists.get(depth1).getFeatureNameFrom());
				putQueryParameter("FeatureGraphParamList." + (depth1 + 1) + ".FeatureNameTo" , featureGraphParamLists.get(depth1).getFeatureNameTo());
				putQueryParameter("FeatureGraphParamList." + (depth1 + 1) + ".ProblemClassification" , featureGraphParamLists.get(depth1).getProblemClassification());
				putQueryParameter("FeatureGraphParamList." + (depth1 + 1) + ".CorrelationByHuman" , featureGraphParamLists.get(depth1).getCorrelationByHuman());
				putQueryParameter("FeatureGraphParamList." + (depth1 + 1) + ".LogicalCorrelation" , featureGraphParamLists.get(depth1).getLogicalCorrelation());
			}
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

	public static class FeatureGraphParamList {

		private String featureNameFrom;

		private String featureNameTo;

		private String problemClassification;

		private Float correlationByHuman;

		private Float logicalCorrelation;

		public String getFeatureNameFrom() {
			return this.featureNameFrom;
		}

		public void setFeatureNameFrom(String featureNameFrom) {
			this.featureNameFrom = featureNameFrom;
		}

		public String getFeatureNameTo() {
			return this.featureNameTo;
		}

		public void setFeatureNameTo(String featureNameTo) {
			this.featureNameTo = featureNameTo;
		}

		public String getProblemClassification() {
			return this.problemClassification;
		}

		public void setProblemClassification(String problemClassification) {
			this.problemClassification = problemClassification;
		}

		public Float getCorrelationByHuman() {
			return this.correlationByHuman;
		}

		public void setCorrelationByHuman(Float correlationByHuman) {
			this.correlationByHuman = correlationByHuman;
		}

		public Float getLogicalCorrelation() {
			return this.logicalCorrelation;
		}

		public void setLogicalCorrelation(Float logicalCorrelation) {
			this.logicalCorrelation = logicalCorrelation;
		}
	}

	@Override
	public Class<OpsAddDiagnosisFeatureEdgeResponse> getResponseClass() {
		return OpsAddDiagnosisFeatureEdgeResponse.class;
	}

}
