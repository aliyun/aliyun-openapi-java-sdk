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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsAddFeatureDataRequest extends RpcAcsRequest<OpsAddFeatureDataResponse> {
	   

	private String regionNo;

	private List<FeatureDataParam> featureDataParams;

	private String auditParamStr;
	public OpsAddFeatureDataRequest() {
		super("Ecsops", "2016-04-01", "OpsAddFeatureData", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<FeatureDataParam> getFeatureDataParams() {
		return this.featureDataParams;
	}

	public void setFeatureDataParams(List<FeatureDataParam> featureDataParams) {
		this.featureDataParams = featureDataParams;	
		if (featureDataParams != null) {
			for (int depth1 = 0; depth1 < featureDataParams.size(); depth1++) {
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".FeatureName" , featureDataParams.get(depth1).getFeatureName());
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".SourceData" , featureDataParams.get(depth1).getSourceData());
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".Extension" , featureDataParams.get(depth1).getExtension());
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".TargetId" , featureDataParams.get(depth1).getTargetId());
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".TargetRegionId" , featureDataParams.get(depth1).getTargetRegionId());
				putQueryParameter("FeatureDataParam." + (depth1 + 1) + ".MatchedTimestamp" , featureDataParams.get(depth1).getMatchedTimestamp());
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

	public static class FeatureDataParam {

		private String featureName;

		private String sourceData;

		private String extension;

		private String targetId;

		private String targetRegionId;

		private Long matchedTimestamp;

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getSourceData() {
			return this.sourceData;
		}

		public void setSourceData(String sourceData) {
			this.sourceData = sourceData;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
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

		public Long getMatchedTimestamp() {
			return this.matchedTimestamp;
		}

		public void setMatchedTimestamp(Long matchedTimestamp) {
			this.matchedTimestamp = matchedTimestamp;
		}
	}

	@Override
	public Class<OpsAddFeatureDataResponse> getResponseClass() {
		return OpsAddFeatureDataResponse.class;
	}

}
