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
public class OpsDescribeFeaturePriorityRequest extends RpcAcsRequest<OpsDescribeFeaturePriorityResponse> {
	   

	private Integer priorityLevelFrom;

	private Integer priorityLevelTo;

	private Integer pageNumber;

	private List<String> featureNames;

	private Integer pageSize;

	private String lastModifiedUserName;

	private String createUserName;

	private String problemClassification;

	private String regionNo;

	private String auditParamStr;
	public OpsDescribeFeaturePriorityRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeFeaturePriority", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPriorityLevelFrom() {
		return this.priorityLevelFrom;
	}

	public void setPriorityLevelFrom(Integer priorityLevelFrom) {
		this.priorityLevelFrom = priorityLevelFrom;
		if(priorityLevelFrom != null){
			putQueryParameter("PriorityLevelFrom", priorityLevelFrom.toString());
		}
	}

	public Integer getPriorityLevelTo() {
		return this.priorityLevelTo;
	}

	public void setPriorityLevelTo(Integer priorityLevelTo) {
		this.priorityLevelTo = priorityLevelTo;
		if(priorityLevelTo != null){
			putQueryParameter("PriorityLevelTo", priorityLevelTo.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getFeatureNames() {
		return this.featureNames;
	}

	public void setFeatureNames(List<String> featureNames) {
		this.featureNames = featureNames;	
		if (featureNames != null) {
			for (int i = 0; i < featureNames.size(); i++) {
				putQueryParameter("FeatureName." + (i + 1) , featureNames.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLastModifiedUserName() {
		return this.lastModifiedUserName;
	}

	public void setLastModifiedUserName(String lastModifiedUserName) {
		this.lastModifiedUserName = lastModifiedUserName;
		if(lastModifiedUserName != null){
			putQueryParameter("LastModifiedUserName", lastModifiedUserName);
		}
	}

	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
		if(createUserName != null){
			putQueryParameter("CreateUserName", createUserName);
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

	@Override
	public Class<OpsDescribeFeaturePriorityResponse> getResponseClass() {
		return OpsDescribeFeaturePriorityResponse.class;
	}

}
