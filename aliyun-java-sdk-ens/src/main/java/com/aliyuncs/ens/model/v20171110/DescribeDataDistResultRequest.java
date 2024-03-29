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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataDistResultRequest extends RpcAcsRequest<DescribeDataDistResultResponse> {
	   

	private String dataVersions;

	private String instanceIds;

	private String maxDate;

	private Integer pageNumber;

	private Integer pageSize;

	@SerializedName("ensRegionIds")
	private List<String> ensRegionIds;

	private String minDate;

	private String appId;

	private String dataNames;
	public DescribeDataDistResultRequest() {
		super("Ens", "2017-11-10", "DescribeDataDistResult", "ens");
		setMethod(MethodType.POST);
	}

	public String getDataVersions() {
		return this.dataVersions;
	}

	public void setDataVersions(String dataVersions) {
		this.dataVersions = dataVersions;
		if(dataVersions != null){
			putQueryParameter("DataVersions", dataVersions);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			putQueryParameter("EnsRegionIds" , new Gson().toJson(ensRegionIds));
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getDataNames() {
		return this.dataNames;
	}

	public void setDataNames(String dataNames) {
		this.dataNames = dataNames;
		if(dataNames != null){
			putQueryParameter("DataNames", dataNames);
		}
	}

	@Override
	public Class<DescribeDataDistResultResponse> getResponseClass() {
		return DescribeDataDistResultResponse.class;
	}

}
