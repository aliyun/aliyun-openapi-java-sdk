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
public class OpsDescribeMaintenanceAttributesRequest extends RpcAcsRequest<OpsDescribeMaintenanceAttributesResponse> {
	   

	private String level;

	private Long resourceAliUid;

	private Integer pageNumber;

	private List<String> instanceIds;

	private Integer pageSize;

	private List<String> propertyIds;

	private String auditParamStr;
	public OpsDescribeMaintenanceAttributesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeMaintenanceAttributes", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public Long getResourceAliUid() {
		return this.resourceAliUid;
	}

	public void setResourceAliUid(Long resourceAliUid) {
		this.resourceAliUid = resourceAliUid;
		if(resourceAliUid != null){
			putQueryParameter("ResourceAliUid", resourceAliUid.toString());
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
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

	public List<String> getPropertyIds() {
		return this.propertyIds;
	}

	public void setPropertyIds(List<String> propertyIds) {
		this.propertyIds = propertyIds;	
		if (propertyIds != null) {
			for (int i = 0; i < propertyIds.size(); i++) {
				putQueryParameter("PropertyId." + (i + 1) , propertyIds.get(i));
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
	public Class<OpsDescribeMaintenanceAttributesResponse> getResponseClass() {
		return OpsDescribeMaintenanceAttributesResponse.class;
	}

}
