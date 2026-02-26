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

package com.aliyuncs.smartsales.model.v20220818;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadVoiceDataRequest extends RpcAcsRequest<UploadVoiceDataResponse> {
	   

	private String agentKey;

	@SerializedName("voiceDataList")
	private List<VoiceDataList> voiceDataList;
	public UploadVoiceDataRequest() {
		super("SmartSales", "2022-08-18", "UploadVoiceData");
		setMethod(MethodType.POST);
	}

	public String getAgentKey() {
		return this.agentKey;
	}

	public void setAgentKey(String agentKey) {
		this.agentKey = agentKey;
		if(agentKey != null){
			putQueryParameter("AgentKey", agentKey);
		}
	}

	public List<VoiceDataList> getVoiceDataList() {
		return this.voiceDataList;
	}

	public void setVoiceDataList(List<VoiceDataList> voiceDataList) {
		this.voiceDataList = voiceDataList;	
		if (voiceDataList != null) {
			putQueryParameter("VoiceDataList" , new Gson().toJson(voiceDataList));
		}	
	}

	public static class VoiceDataList {

		@SerializedName("CustomParamJson")
		private String customParamJson;

		@SerializedName("ClueStatusRemark")
		private String clueStatusRemark;

		@SerializedName("BeginTime")
		private Long beginTime;

		@SerializedName("CallChannel")
		private Integer callChannel;

		@SerializedName("BusinessResult")
		private Integer businessResult;

		@SerializedName("CustomCallId")
		private String customCallId;

		@SerializedName("SalesPersonId")
		private Long salesPersonId;

		@SerializedName("TeamId")
		private Long teamId;

		@SerializedName("CustomerId")
		private String customerId;

		@SerializedName("FileUrl")
		private String fileUrl;

		@SerializedName("ClientTrackNumber")
		private Integer clientTrackNumber;

		@SerializedName("CustomerName")
		private String customerName;

		@SerializedName("CallType")
		private Integer callType;

		@SerializedName("CalleeNumber")
		private String calleeNumber;

		@SerializedName("SalesPersonName")
		private String salesPersonName;

		@SerializedName("CallerNumber")
		private String callerNumber;

		public String getCustomParamJson() {
			return this.customParamJson;
		}

		public void setCustomParamJson(String customParamJson) {
			this.customParamJson = customParamJson;
		}

		public String getClueStatusRemark() {
			return this.clueStatusRemark;
		}

		public void setClueStatusRemark(String clueStatusRemark) {
			this.clueStatusRemark = clueStatusRemark;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Integer getCallChannel() {
			return this.callChannel;
		}

		public void setCallChannel(Integer callChannel) {
			this.callChannel = callChannel;
		}

		public Integer getBusinessResult() {
			return this.businessResult;
		}

		public void setBusinessResult(Integer businessResult) {
			this.businessResult = businessResult;
		}

		public String getCustomCallId() {
			return this.customCallId;
		}

		public void setCustomCallId(String customCallId) {
			this.customCallId = customCallId;
		}

		public Long getSalesPersonId() {
			return this.salesPersonId;
		}

		public void setSalesPersonId(Long salesPersonId) {
			this.salesPersonId = salesPersonId;
		}

		public Long getTeamId() {
			return this.teamId;
		}

		public void setTeamId(Long teamId) {
			this.teamId = teamId;
		}

		public String getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public Integer getClientTrackNumber() {
			return this.clientTrackNumber;
		}

		public void setClientTrackNumber(Integer clientTrackNumber) {
			this.clientTrackNumber = clientTrackNumber;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Integer getCallType() {
			return this.callType;
		}

		public void setCallType(Integer callType) {
			this.callType = callType;
		}

		public String getCalleeNumber() {
			return this.calleeNumber;
		}

		public void setCalleeNumber(String calleeNumber) {
			this.calleeNumber = calleeNumber;
		}

		public String getSalesPersonName() {
			return this.salesPersonName;
		}

		public void setSalesPersonName(String salesPersonName) {
			this.salesPersonName = salesPersonName;
		}

		public String getCallerNumber() {
			return this.callerNumber;
		}

		public void setCallerNumber(String callerNumber) {
			this.callerNumber = callerNumber;
		}
	}

	@Override
	public Class<UploadVoiceDataResponse> getResponseClass() {
		return UploadVoiceDataResponse.class;
	}

}
