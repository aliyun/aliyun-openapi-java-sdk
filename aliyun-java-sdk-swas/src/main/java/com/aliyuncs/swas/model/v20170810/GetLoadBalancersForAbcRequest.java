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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLoadBalancersForAbcRequest extends RpcAcsRequest<GetLoadBalancersForAbcResponse> {
	   

	private String businessStatus;

	private String loadBalancerStatus;

	private Long queryUser;

	private String loadBalancerId;

	private String querySite;

	private Integer pageNo;

	private Integer pageSize;
	public GetLoadBalancersForAbcRequest() {
		super("SWAS", "2017-08-10", "GetLoadBalancersForAbc", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
		if(businessStatus != null){
			putQueryParameter("BusinessStatus", businessStatus);
		}
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
		if(loadBalancerStatus != null){
			putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
		}
	}

	public Long getQueryUser() {
		return this.queryUser;
	}

	public void setQueryUser(Long queryUser) {
		this.queryUser = queryUser;
		if(queryUser != null){
			putQueryParameter("QueryUser", queryUser.toString());
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getQuerySite() {
		return this.querySite;
	}

	public void setQuerySite(String querySite) {
		this.querySite = querySite;
		if(querySite != null){
			putQueryParameter("QuerySite", querySite);
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

	@Override
	public Class<GetLoadBalancersForAbcResponse> getResponseClass() {
		return GetLoadBalancersForAbcResponse.class;
	}

}
