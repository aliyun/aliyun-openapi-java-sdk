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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class HotlineSessionQueryRequest extends RpcAcsRequest<HotlineSessionQueryResponse> {
	   

	private Long groupId;

	private String callEndReason;

	private String servicerId;

	private String params;

	private String groupName;

	private String acid;

	private String callingNumber;

	private Long queryEndTime;

	private String instanceId;

	private String calledNumber;

	private String requestId;

	private Integer pageNo;

	private Long queryStartTime;

	private String servicerName;

	private Integer pageSize;

	private Integer callType;

	private String memberName;

	private String memberId;
	public HotlineSessionQueryRequest() {
		super("aiccs", "2019-10-15", "HotlineSessionQuery", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getCallEndReason() {
		return this.callEndReason;
	}

	public void setCallEndReason(String callEndReason) {
		this.callEndReason = callEndReason;
		if(callEndReason != null){
			putQueryParameter("CallEndReason", callEndReason);
		}
	}

	public String getServicerId() {
		return this.servicerId;
	}

	public void setServicerId(String servicerId) {
		this.servicerId = servicerId;
		if(servicerId != null){
			putQueryParameter("ServicerId", servicerId);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getAcid() {
		return this.acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
		if(acid != null){
			putQueryParameter("Acid", acid);
		}
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
		}
	}

	public Long getQueryEndTime() {
		return this.queryEndTime;
	}

	public void setQueryEndTime(Long queryEndTime) {
		this.queryEndTime = queryEndTime;
		if(queryEndTime != null){
			putQueryParameter("QueryEndTime", queryEndTime.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
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

	public Long getQueryStartTime() {
		return this.queryStartTime;
	}

	public void setQueryStartTime(Long queryStartTime) {
		this.queryStartTime = queryStartTime;
		if(queryStartTime != null){
			putQueryParameter("QueryStartTime", queryStartTime.toString());
		}
	}

	public String getServicerName() {
		return this.servicerName;
	}

	public void setServicerName(String servicerName) {
		this.servicerName = servicerName;
		if(servicerName != null){
			putQueryParameter("ServicerName", servicerName);
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

	public Integer getCallType() {
		return this.callType;
	}

	public void setCallType(Integer callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType.toString());
		}
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
		if(memberName != null){
			putQueryParameter("MemberName", memberName);
		}
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId);
		}
	}

	@Override
	public Class<HotlineSessionQueryResponse> getResponseClass() {
		return HotlineSessionQueryResponse.class;
	}

}
