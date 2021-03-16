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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsRequest extends RpcAcsRequest<ListApplicationsResponse> {
	   

	private String clusterNames;

	private String level;

	private String outAppInfoParams;

	private String maxDate;

	private Integer pageNumber;

	private String appVersions;

	private Integer pageSize;

	private String minDate;
	public ListApplicationsRequest() {
		super("Ens", "2017-11-10", "ListApplications");
		setMethod(MethodType.POST);
	}

	public String getClusterNames() {
		return this.clusterNames;
	}

	public void setClusterNames(String clusterNames) {
		this.clusterNames = clusterNames;
		if(clusterNames != null){
			putQueryParameter("ClusterNames", clusterNames);
		}
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

	public String getOutAppInfoParams() {
		return this.outAppInfoParams;
	}

	public void setOutAppInfoParams(String outAppInfoParams) {
		this.outAppInfoParams = outAppInfoParams;
		if(outAppInfoParams != null){
			putQueryParameter("OutAppInfoParams", outAppInfoParams);
		}
	}

	public String getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
		if(maxDate != null){
			putQueryParameter("MaxDate", maxDate);
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

	public String getAppVersions() {
		return this.appVersions;
	}

	public void setAppVersions(String appVersions) {
		this.appVersions = appVersions;
		if(appVersions != null){
			putQueryParameter("AppVersions", appVersions);
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

	public String getMinDate() {
		return this.minDate;
	}

	public void setMinDate(String minDate) {
		this.minDate = minDate;
		if(minDate != null){
			putQueryParameter("MinDate", minDate);
		}
	}

	@Override
	public Class<ListApplicationsResponse> getResponseClass() {
		return ListApplicationsResponse.class;
	}

}
