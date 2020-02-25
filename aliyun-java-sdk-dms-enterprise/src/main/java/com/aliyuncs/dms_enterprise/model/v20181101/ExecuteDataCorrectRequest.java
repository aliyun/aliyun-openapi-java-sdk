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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteDataCorrectRequest extends RpcAcsRequest<ExecuteDataCorrectResponse> {
	   

	private Map<Object,Object> actionDetail;

	private Long orderId;

	private String tid;
	public ExecuteDataCorrectRequest() {
		super("dms-enterprise", "2018-11-01", "ExecuteDataCorrect");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<Object,Object> getActionDetail() {
		return this.actionDetail;
	}

	public void setActionDetail(Map<Object,Object> actionDetail) {
		this.actionDetail = actionDetail;
		if(actionDetail != null){
			putQueryParameter("ActionDetail", new Gson().toJson(actionDetail));
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid);
		}
	}

	@Override
	public Class<ExecuteDataCorrectResponse> getResponseClass() {
		return ExecuteDataCorrectResponse.class;
	}

}
