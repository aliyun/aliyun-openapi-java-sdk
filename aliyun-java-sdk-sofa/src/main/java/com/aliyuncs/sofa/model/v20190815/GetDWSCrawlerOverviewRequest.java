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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDWSCrawlerOverviewRequest extends RpcAcsRequest<GetDWSCrawlerOverviewResponse> {
	   

	private String orderByParam;

	private String crawlerDbtype;

	private String clusterName;

	private String orderByType;

	private Long pageSize;

	private String crawlerNames;

	private String instanceId;

	private Long pageNo;

	private String location;
	public GetDWSCrawlerOverviewRequest() {
		super("SOFA", "2019-08-15", "GetDWSCrawlerOverview", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderByParam() {
		return this.orderByParam;
	}

	public void setOrderByParam(String orderByParam) {
		this.orderByParam = orderByParam;
		if(orderByParam != null){
			putBodyParameter("OrderByParam", orderByParam);
		}
	}

	public String getCrawlerDbtype() {
		return this.crawlerDbtype;
	}

	public void setCrawlerDbtype(String crawlerDbtype) {
		this.crawlerDbtype = crawlerDbtype;
		if(crawlerDbtype != null){
			putBodyParameter("CrawlerDbtype", crawlerDbtype);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public String getOrderByType() {
		return this.orderByType;
	}

	public void setOrderByType(String orderByType) {
		this.orderByType = orderByType;
		if(orderByType != null){
			putBodyParameter("OrderByType", orderByType);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getCrawlerNames() {
		return this.crawlerNames;
	}

	public void setCrawlerNames(String crawlerNames) {
		this.crawlerNames = crawlerNames;
		if(crawlerNames != null){
			putBodyParameter("CrawlerNames", crawlerNames);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	@Override
	public Class<GetDWSCrawlerOverviewResponse> getResponseClass() {
		return GetDWSCrawlerOverviewResponse.class;
	}

}
