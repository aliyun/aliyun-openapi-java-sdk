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
public class QueryTmSbjProduceRequest extends RpcAcsRequest<QueryTmSbjProduceResponse> {
	   

	private String producerType;

	private String highPriorityMaterialNameStr;

	private String highPriorityOrderIdStr;

	private Long queryOrderPageSize;

	private String highPriorityUserIdStr;

	private String principalKey;

	private String highPriorityBizTypeStr;

	private String principalName;
	public QueryTmSbjProduceRequest() {
		super("Trademark", "2018-07-24", "QueryTmSbjProduce");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProducerType() {
		return this.producerType;
	}

	public void setProducerType(String producerType) {
		this.producerType = producerType;
		if(producerType != null){
			putQueryParameter("ProducerType", producerType);
		}
	}

	public String getHighPriorityMaterialNameStr() {
		return this.highPriorityMaterialNameStr;
	}

	public void setHighPriorityMaterialNameStr(String highPriorityMaterialNameStr) {
		this.highPriorityMaterialNameStr = highPriorityMaterialNameStr;
		if(highPriorityMaterialNameStr != null){
			putQueryParameter("HighPriorityMaterialNameStr", highPriorityMaterialNameStr);
		}
	}

	public String getHighPriorityOrderIdStr() {
		return this.highPriorityOrderIdStr;
	}

	public void setHighPriorityOrderIdStr(String highPriorityOrderIdStr) {
		this.highPriorityOrderIdStr = highPriorityOrderIdStr;
		if(highPriorityOrderIdStr != null){
			putQueryParameter("HighPriorityOrderIdStr", highPriorityOrderIdStr);
		}
	}

	public Long getQueryOrderPageSize() {
		return this.queryOrderPageSize;
	}

	public void setQueryOrderPageSize(Long queryOrderPageSize) {
		this.queryOrderPageSize = queryOrderPageSize;
		if(queryOrderPageSize != null){
			putQueryParameter("QueryOrderPageSize", queryOrderPageSize.toString());
		}
	}

	public String getHighPriorityUserIdStr() {
		return this.highPriorityUserIdStr;
	}

	public void setHighPriorityUserIdStr(String highPriorityUserIdStr) {
		this.highPriorityUserIdStr = highPriorityUserIdStr;
		if(highPriorityUserIdStr != null){
			putQueryParameter("HighPriorityUserIdStr", highPriorityUserIdStr);
		}
	}

	public String getPrincipalKey() {
		return this.principalKey;
	}

	public void setPrincipalKey(String principalKey) {
		this.principalKey = principalKey;
		if(principalKey != null){
			putQueryParameter("PrincipalKey", principalKey);
		}
	}

	public String getHighPriorityBizTypeStr() {
		return this.highPriorityBizTypeStr;
	}

	public void setHighPriorityBizTypeStr(String highPriorityBizTypeStr) {
		this.highPriorityBizTypeStr = highPriorityBizTypeStr;
		if(highPriorityBizTypeStr != null){
			putQueryParameter("HighPriorityBizTypeStr", highPriorityBizTypeStr);
		}
	}

	public String getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName);
		}
	}

	@Override
	public Class<QueryTmSbjProduceResponse> getResponseClass() {
		return QueryTmSbjProduceResponse.class;
	}

}
