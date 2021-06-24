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
public class OpsBatchUpdateFeaturePriorityRequest extends RpcAcsRequest<OpsBatchUpdateFeaturePriorityResponse> {
	   

	private String regionNo;

	private List<OperateFeaturePriorityParam> operateFeaturePriorityParams;

	private String auditParamStr;
	public OpsBatchUpdateFeaturePriorityRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchUpdateFeaturePriority", "ecsops");
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

	public List<OperateFeaturePriorityParam> getOperateFeaturePriorityParams() {
		return this.operateFeaturePriorityParams;
	}

	public void setOperateFeaturePriorityParams(List<OperateFeaturePriorityParam> operateFeaturePriorityParams) {
		this.operateFeaturePriorityParams = operateFeaturePriorityParams;	
		if (operateFeaturePriorityParams != null) {
			for (int depth1 = 0; depth1 < operateFeaturePriorityParams.size(); depth1++) {
				putQueryParameter("OperateFeaturePriorityParam." + (depth1 + 1) + ".FeatureName" , operateFeaturePriorityParams.get(depth1).getFeatureName());
				putQueryParameter("OperateFeaturePriorityParam." + (depth1 + 1) + ".ModifiedUser" , operateFeaturePriorityParams.get(depth1).getModifiedUser());
				putQueryParameter("OperateFeaturePriorityParam." + (depth1 + 1) + ".PriorityLevel" , operateFeaturePriorityParams.get(depth1).getPriorityLevel());
				putQueryParameter("OperateFeaturePriorityParam." + (depth1 + 1) + ".ProblemClassification" , operateFeaturePriorityParams.get(depth1).getProblemClassification());
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

	public static class OperateFeaturePriorityParam {

		private String featureName;

		private String modifiedUser;

		private Integer priorityLevel;

		private String problemClassification;

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getModifiedUser() {
			return this.modifiedUser;
		}

		public void setModifiedUser(String modifiedUser) {
			this.modifiedUser = modifiedUser;
		}

		public Integer getPriorityLevel() {
			return this.priorityLevel;
		}

		public void setPriorityLevel(Integer priorityLevel) {
			this.priorityLevel = priorityLevel;
		}

		public String getProblemClassification() {
			return this.problemClassification;
		}

		public void setProblemClassification(String problemClassification) {
			this.problemClassification = problemClassification;
		}
	}

	@Override
	public Class<OpsBatchUpdateFeaturePriorityResponse> getResponseClass() {
		return OpsBatchUpdateFeaturePriorityResponse.class;
	}

}
