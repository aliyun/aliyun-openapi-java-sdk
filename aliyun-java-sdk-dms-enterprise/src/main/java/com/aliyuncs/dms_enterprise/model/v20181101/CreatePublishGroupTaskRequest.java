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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePublishGroupTaskRequest extends RpcAcsRequest<CreatePublishGroupTaskResponse> {
	   

	private Long orderId;

	private Integer dbId;

	private String planTime;

	private Boolean logic;

	private Long tid;

	private String publishStrategy;
	public CreatePublishGroupTaskRequest() {
		super("dms-enterprise", "2018-11-01", "CreatePublishGroupTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getDbId() {
		return this.dbId;
	}

	public void setDbId(Integer dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId.toString());
		}
	}

	public String getPlanTime() {
		return this.planTime;
	}

	public void setPlanTime(String planTime) {
		this.planTime = planTime;
		if(planTime != null){
			putQueryParameter("PlanTime", planTime);
		}
	}

	public Boolean getLogic() {
		return this.logic;
	}

	public void setLogic(Boolean logic) {
		this.logic = logic;
		if(logic != null){
			putQueryParameter("Logic", logic.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getPublishStrategy() {
		return this.publishStrategy;
	}

	public void setPublishStrategy(String publishStrategy) {
		this.publishStrategy = publishStrategy;
		if(publishStrategy != null){
			putQueryParameter("PublishStrategy", publishStrategy);
		}
	}

	@Override
	public Class<CreatePublishGroupTaskResponse> getResponseClass() {
		return CreatePublishGroupTaskResponse.class;
	}

}
