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

package com.aliyuncs.rsimganalys.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rsimganalys.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTasksRequest extends RpcAcsRequest<ListTasksResponse> {
	   

	private String submitTime;

	private Integer runStatus;

	private Integer productType;

	private Integer pageNo;

	private Integer pageSize;

	private String appkey;

	private String jobName;
	public ListTasksRequest() {
		super("rsimganalys", "2019-08-01", "ListTasks", "rsimganalys");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
		if(submitTime != null){
			putQueryParameter("SubmitTime", submitTime);
		}
	}

	public Integer getRunStatus() {
		return this.runStatus;
	}

	public void setRunStatus(Integer runStatus) {
		this.runStatus = runStatus;
		if(runStatus != null){
			putQueryParameter("RunStatus", runStatus.toString());
		}
	}

	public Integer getProductType() {
		return this.productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
		if(appkey != null){
			putQueryParameter("Appkey", appkey);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	@Override
	public Class<ListTasksResponse> getResponseClass() {
		return ListTasksResponse.class;
	}

}
