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
public class BatchqueryODPOperationAuditRequest extends RpcAcsRequest<BatchqueryODPOperationAuditResponse> {
	   

	private String orderByField;

	private Long pageNum;

	private String filterKey;

	private Long pageSize;

	private String instanceId;

	private Boolean desc;
	public BatchqueryODPOperationAuditRequest() {
		super("SOFA", "2019-08-15", "BatchqueryODPOperationAudit", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderByField() {
		return this.orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
		if(orderByField != null){
			putBodyParameter("OrderByField", orderByField);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public String getFilterKey() {
		return this.filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
		if(filterKey != null){
			putBodyParameter("FilterKey", filterKey);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Boolean getDesc() {
		return this.desc;
	}

	public void setDesc(Boolean desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc.toString());
		}
	}

	@Override
	public Class<BatchqueryODPOperationAuditResponse> getResponseClass() {
		return BatchqueryODPOperationAuditResponse.class;
	}

}
