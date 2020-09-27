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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class HotlineSessionQueryRequest extends RpcAcsRequest<HotlineSessionQueryResponse> {
	   

	private List<String> memberIdLists;

	private List<Integer> callTypeLists;

	private String servicerId;

	private String acid;

	private List<Long> groupIdLists;

	private String calledNumber;

	private List<String> callResultLists;

	private String servicerName;

	private Integer pageSize;

	private String id;

	private Integer callType;

	private List<String> calledNumberLists;

	private List<String> acidLists;

	private Long groupId;

	private String params;

	private String groupName;

	private String callingNumber;

	private Long queryEndTime;

	private List<String> callingNumberLists;

	private String instanceId;

	private String requestId;

	private Integer pageNo;

	private Long queryStartTime;

	private String callResult;

	private List<String> servicerIdLists;

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

	public List<String> getMemberIdLists() {
		return this.memberIdLists;
	}

	public void setMemberIdLists(List<String> memberIdLists) {
		this.memberIdLists = memberIdLists;	
		if (memberIdLists != null) {
			for (int i = 0; i < memberIdLists.size(); i++) {
				putQueryParameter("MemberIdList." + (i + 1) , memberIdLists.get(i));
			}
		}	
	}

	public List<Integer> getCallTypeLists() {
		return this.callTypeLists;
	}

	public void setCallTypeLists(List<Integer> callTypeLists) {
		this.callTypeLists = callTypeLists;	
		if (callTypeLists != null) {
			for (int i = 0; i < callTypeLists.size(); i++) {
				putQueryParameter("CallTypeList." + (i + 1) , callTypeLists.get(i));
			}
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

	public String getAcid() {
		return this.acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
		if(acid != null){
			putQueryParameter("Acid", acid);
		}
	}

	public List<Long> getGroupIdLists() {
		return this.groupIdLists;
	}

	public void setGroupIdLists(List<Long> groupIdLists) {
		this.groupIdLists = groupIdLists;	
		if (groupIdLists != null) {
			for (int i = 0; i < groupIdLists.size(); i++) {
				putQueryParameter("GroupIdList." + (i + 1) , groupIdLists.get(i));
			}
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

	public List<String> getCallResultLists() {
		return this.callResultLists;
	}

	public void setCallResultLists(List<String> callResultLists) {
		this.callResultLists = callResultLists;	
		if (callResultLists != null) {
			for (int i = 0; i < callResultLists.size(); i++) {
				putQueryParameter("CallResultList." + (i + 1) , callResultLists.get(i));
			}
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
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

	public List<String> getCalledNumberLists() {
		return this.calledNumberLists;
	}

	public void setCalledNumberLists(List<String> calledNumberLists) {
		this.calledNumberLists = calledNumberLists;	
		if (calledNumberLists != null) {
			for (int i = 0; i < calledNumberLists.size(); i++) {
				putQueryParameter("CalledNumberList." + (i + 1) , calledNumberLists.get(i));
			}
		}	
	}

	public List<String> getAcidLists() {
		return this.acidLists;
	}

	public void setAcidLists(List<String> acidLists) {
		this.acidLists = acidLists;	
		if (acidLists != null) {
			for (int i = 0; i < acidLists.size(); i++) {
				putQueryParameter("AcidList." + (i + 1) , acidLists.get(i));
			}
		}	
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

	public List<String> getCallingNumberLists() {
		return this.callingNumberLists;
	}

	public void setCallingNumberLists(List<String> callingNumberLists) {
		this.callingNumberLists = callingNumberLists;	
		if (callingNumberLists != null) {
			for (int i = 0; i < callingNumberLists.size(); i++) {
				putQueryParameter("CallingNumberList." + (i + 1) , callingNumberLists.get(i));
			}
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

	public String getCallResult() {
		return this.callResult;
	}

	public void setCallResult(String callResult) {
		this.callResult = callResult;
		if(callResult != null){
			putQueryParameter("CallResult", callResult);
		}
	}

	public List<String> getServicerIdLists() {
		return this.servicerIdLists;
	}

	public void setServicerIdLists(List<String> servicerIdLists) {
		this.servicerIdLists = servicerIdLists;	
		if (servicerIdLists != null) {
			for (int i = 0; i < servicerIdLists.size(); i++) {
				putQueryParameter("ServicerIdList." + (i + 1) , servicerIdLists.get(i));
			}
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
