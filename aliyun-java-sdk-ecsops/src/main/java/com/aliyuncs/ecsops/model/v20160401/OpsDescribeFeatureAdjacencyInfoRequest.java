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
public class OpsDescribeFeatureAdjacencyInfoRequest extends RpcAcsRequest<OpsDescribeFeatureAdjacencyInfoResponse> {
	   

	private String problemClassification;

	private String regionNo;

	private String featureName;

	private String auditParamStr;
	public OpsDescribeFeatureAdjacencyInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeFeatureAdjacencyInfo", "ecsops");
		setMethod(MethodType.POST);
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

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
		if(featureName != null){
			putQueryParameter("FeatureName", featureName);
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
	public Class<OpsDescribeFeatureAdjacencyInfoResponse> getResponseClass() {
		return OpsDescribeFeatureAdjacencyInfoResponse.class;
	}

}
