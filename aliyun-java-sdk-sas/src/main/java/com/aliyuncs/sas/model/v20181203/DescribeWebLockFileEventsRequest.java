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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebLockFileEventsRequest extends RpcAcsRequest<DescribeWebLockFileEventsResponse> {
	   

	private String remark;

	private Integer pageSize;

	private Long tsEnd;

	private String processName;

	private Integer currentPage;

	private String dealed;

	private Long tsBegin;
	public DescribeWebLockFileEventsRequest() {
		super("Sas", "2018-12-03", "DescribeWebLockFileEvents");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
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

	public Long getTsEnd() {
		return this.tsEnd;
	}

	public void setTsEnd(Long tsEnd) {
		this.tsEnd = tsEnd;
		if(tsEnd != null){
			putQueryParameter("TsEnd", tsEnd.toString());
		}
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putQueryParameter("ProcessName", processName);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public Long getTsBegin() {
		return this.tsBegin;
	}

	public void setTsBegin(Long tsBegin) {
		this.tsBegin = tsBegin;
		if(tsBegin != null){
			putQueryParameter("TsBegin", tsBegin.toString());
		}
	}

	@Override
	public Class<DescribeWebLockFileEventsResponse> getResponseClass() {
		return DescribeWebLockFileEventsResponse.class;
	}

}
