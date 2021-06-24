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
public class OpsDescribeCloudOpsMaintenancesRequest extends RpcAcsRequest<OpsDescribeCloudOpsMaintenancesResponse> {
	   

	private Integer pageSize;

	private String key;

	private List<String> ncIpss;

	private Integer pageNo;

	private String auditParamStr;
	public OpsDescribeCloudOpsMaintenancesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeCloudOpsMaintenances", "ecsops");
		setMethod(MethodType.POST);
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public List<String> getNcIpss() {
		return this.ncIpss;
	}

	public void setNcIpss(List<String> ncIpss) {
		this.ncIpss = ncIpss;	
		if (ncIpss != null) {
			for (int i = 0; i < ncIpss.size(); i++) {
				putQueryParameter("NcIps." + (i + 1) , ncIpss.get(i));
			}
		}	
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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
	public Class<OpsDescribeCloudOpsMaintenancesResponse> getResponseClass() {
		return OpsDescribeCloudOpsMaintenancesResponse.class;
	}

}
