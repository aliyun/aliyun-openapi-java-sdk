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
public class GetDWSJdbcwriterOverviewRequest extends RpcAcsRequest<GetDWSJdbcwriterOverviewResponse> {
	   

	private String orderByParam;

	private String clusterName;

	private String orderByType;

	private String jdbcwriterNames;

	private Long pageSize;

	private String destDbtype;

	private String instanceId;

	private Long pageNo;

	private String sourceDbtype;

	private String location;
	public GetDWSJdbcwriterOverviewRequest() {
		super("SOFA", "2019-08-15", "GetDWSJdbcwriterOverview", "ApplySidecarCert");
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

	public String getJdbcwriterNames() {
		return this.jdbcwriterNames;
	}

	public void setJdbcwriterNames(String jdbcwriterNames) {
		this.jdbcwriterNames = jdbcwriterNames;
		if(jdbcwriterNames != null){
			putBodyParameter("JdbcwriterNames", jdbcwriterNames);
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

	public String getDestDbtype() {
		return this.destDbtype;
	}

	public void setDestDbtype(String destDbtype) {
		this.destDbtype = destDbtype;
		if(destDbtype != null){
			putBodyParameter("DestDbtype", destDbtype);
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

	public String getSourceDbtype() {
		return this.sourceDbtype;
	}

	public void setSourceDbtype(String sourceDbtype) {
		this.sourceDbtype = sourceDbtype;
		if(sourceDbtype != null){
			putBodyParameter("SourceDbtype", sourceDbtype);
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
	public Class<GetDWSJdbcwriterOverviewResponse> getResponseClass() {
		return GetDWSJdbcwriterOverviewResponse.class;
	}

}
