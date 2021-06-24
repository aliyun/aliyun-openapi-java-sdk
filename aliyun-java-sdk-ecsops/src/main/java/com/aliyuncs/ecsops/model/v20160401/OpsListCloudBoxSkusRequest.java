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
public class OpsListCloudBoxSkusRequest extends RpcAcsRequest<OpsListCloudBoxSkusResponse> {
	   

	private String nextToken;

	private List<String> cloudBoxSkuIds;

	private String bizType;

	private Integer maxResults;

	private List<String> skuTypes;

	private String auditParamStr;
	public OpsListCloudBoxSkusRequest() {
		super("Ecsops", "2016-04-01", "OpsListCloudBoxSkus", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getCloudBoxSkuIds() {
		return this.cloudBoxSkuIds;
	}

	public void setCloudBoxSkuIds(List<String> cloudBoxSkuIds) {
		this.cloudBoxSkuIds = cloudBoxSkuIds;	
		if (cloudBoxSkuIds != null) {
			for (int i = 0; i < cloudBoxSkuIds.size(); i++) {
				putQueryParameter("CloudBoxSkuId." + (i + 1) , cloudBoxSkuIds.get(i));
			}
		}	
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getSkuTypes() {
		return this.skuTypes;
	}

	public void setSkuTypes(List<String> skuTypes) {
		this.skuTypes = skuTypes;	
		if (skuTypes != null) {
			for (int i = 0; i < skuTypes.size(); i++) {
				putQueryParameter("SkuType." + (i + 1) , skuTypes.get(i));
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

	@Override
	public Class<OpsListCloudBoxSkusResponse> getResponseClass() {
		return OpsListCloudBoxSkusResponse.class;
	}

}
