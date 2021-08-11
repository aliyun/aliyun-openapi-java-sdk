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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResetHotlineNumberRequest extends RpcAcsRequest<ResetHotlineNumberResponse> {
	   

	private Long inboundFlowId;

	private String description;

	private Boolean enableInboundEvaluation;

	private Boolean enableInbound;

	private Boolean enableOutboundEvaluation;

	private Integer evaluationLevel;

	private String instanceId;

	@SerializedName("outboundRangeList")
	private List<OutboundRangeList> outboundRangeList;

	private String hotlineNumber;

	private Boolean outboundAllDepart;

	private Boolean enableOutbound;
	public ResetHotlineNumberRequest() {
		super("aiccs", "2019-10-15", "ResetHotlineNumber");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getInboundFlowId() {
		return this.inboundFlowId;
	}

	public void setInboundFlowId(Long inboundFlowId) {
		this.inboundFlowId = inboundFlowId;
		if(inboundFlowId != null){
			putBodyParameter("InboundFlowId", inboundFlowId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Boolean getEnableInboundEvaluation() {
		return this.enableInboundEvaluation;
	}

	public void setEnableInboundEvaluation(Boolean enableInboundEvaluation) {
		this.enableInboundEvaluation = enableInboundEvaluation;
		if(enableInboundEvaluation != null){
			putBodyParameter("EnableInboundEvaluation", enableInboundEvaluation.toString());
		}
	}

	public Boolean getEnableInbound() {
		return this.enableInbound;
	}

	public void setEnableInbound(Boolean enableInbound) {
		this.enableInbound = enableInbound;
		if(enableInbound != null){
			putBodyParameter("EnableInbound", enableInbound.toString());
		}
	}

	public Boolean getEnableOutboundEvaluation() {
		return this.enableOutboundEvaluation;
	}

	public void setEnableOutboundEvaluation(Boolean enableOutboundEvaluation) {
		this.enableOutboundEvaluation = enableOutboundEvaluation;
		if(enableOutboundEvaluation != null){
			putBodyParameter("EnableOutboundEvaluation", enableOutboundEvaluation.toString());
		}
	}

	public Integer getEvaluationLevel() {
		return this.evaluationLevel;
	}

	public void setEvaluationLevel(Integer evaluationLevel) {
		this.evaluationLevel = evaluationLevel;
		if(evaluationLevel != null){
			putBodyParameter("EvaluationLevel", evaluationLevel.toString());
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

	public List<OutboundRangeList> getOutboundRangeList() {
		return this.outboundRangeList;
	}

	public void setOutboundRangeList(List<OutboundRangeList> outboundRangeList) {
		this.outboundRangeList = outboundRangeList;	
		if (outboundRangeList != null) {
			putBodyParameter("OutboundRangeList" , new Gson().toJson(outboundRangeList));
		}	
	}

	public String getHotlineNumber() {
		return this.hotlineNumber;
	}

	public void setHotlineNumber(String hotlineNumber) {
		this.hotlineNumber = hotlineNumber;
		if(hotlineNumber != null){
			putBodyParameter("HotlineNumber", hotlineNumber);
		}
	}

	public Boolean getOutboundAllDepart() {
		return this.outboundAllDepart;
	}

	public void setOutboundAllDepart(Boolean outboundAllDepart) {
		this.outboundAllDepart = outboundAllDepart;
		if(outboundAllDepart != null){
			putBodyParameter("OutboundAllDepart", outboundAllDepart.toString());
		}
	}

	public Boolean getEnableOutbound() {
		return this.enableOutbound;
	}

	public void setEnableOutbound(Boolean enableOutbound) {
		this.enableOutbound = enableOutbound;
		if(enableOutbound != null){
			putBodyParameter("EnableOutbound", enableOutbound.toString());
		}
	}

	public static class OutboundRangeList {

		@SerializedName("GroupIdList")
		private List<Long> groupIdList;

		@SerializedName("DepartmentId")
		private Long departmentId;

		public List<Long> getGroupIdList() {
			return this.groupIdList;
		}

		public void setGroupIdList(List<Long> groupIdList) {
			this.groupIdList = groupIdList;
		}

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}
	}

	@Override
	public Class<ResetHotlineNumberResponse> getResponseClass() {
		return ResetHotlineNumberResponse.class;
	}

}
