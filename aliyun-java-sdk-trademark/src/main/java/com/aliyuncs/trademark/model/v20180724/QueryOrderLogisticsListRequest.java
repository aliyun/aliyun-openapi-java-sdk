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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderLogisticsListRequest extends RpcAcsRequest<QueryOrderLogisticsListResponse> {
	   

	private String produceOrderId;

	private Long pageNum;

	private Long pageSize;

	private String registerNumber;
	public QueryOrderLogisticsListRequest() {
		super("Trademark", "2018-07-24", "QueryOrderLogisticsList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduceOrderId() {
		return this.produceOrderId;
	}

	public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
		if(produceOrderId != null){
			putBodyParameter("ProduceOrderId", produceOrderId);
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		if(registerNumber != null){
			putBodyParameter("RegisterNumber", registerNumber);
		}
	}

	@Override
	public Class<QueryOrderLogisticsListResponse> getResponseClass() {
		return QueryOrderLogisticsListResponse.class;
	}

}
