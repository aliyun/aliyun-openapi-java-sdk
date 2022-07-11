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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventListRequest extends RpcAcsRequest<DescribeAlarmEventListResponse> {
	   

	private String timeEnd;

	private String alarmEventType;

	private String remark;

	private String alarmEventName;

	private String sourceIp;

	private String pageSize;

	private String from;

	private Long id;

	private String tacticId;

	private String lang;

	private String uniqueInfo;

	private String groupId;

	private String dealed;

	private Integer currentPage;

	private String operateTimeEnd;

	private List<String> operateErrorCodeLists;

	private String operateTimeStart;

	private String timeStart;

	private String levels;

	private String uuids;
	public DescribeAlarmEventListRequest() {
		super("Sas", "2018-12-03", "DescribeAlarmEventList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
		if(timeEnd != null){
			putQueryParameter("TimeEnd", timeEnd);
		}
	}

	public String getAlarmEventType() {
		return this.alarmEventType;
	}

	public void setAlarmEventType(String alarmEventType) {
		this.alarmEventType = alarmEventType;
		if(alarmEventType != null){
			putQueryParameter("AlarmEventType", alarmEventType);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getAlarmEventName() {
		return this.alarmEventName;
	}

	public void setAlarmEventName(String alarmEventName) {
		this.alarmEventName = alarmEventName;
		if(alarmEventName != null){
			putQueryParameter("AlarmEventName", alarmEventName);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getTacticId() {
		return this.tacticId;
	}

	public void setTacticId(String tacticId) {
		this.tacticId = tacticId;
		if(tacticId != null){
			putQueryParameter("TacticId", tacticId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getUniqueInfo() {
		return this.uniqueInfo;
	}

	public void setUniqueInfo(String uniqueInfo) {
		this.uniqueInfo = uniqueInfo;
		if(uniqueInfo != null){
			putQueryParameter("UniqueInfo", uniqueInfo);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getOperateTimeEnd() {
		return this.operateTimeEnd;
	}

	public void setOperateTimeEnd(String operateTimeEnd) {
		this.operateTimeEnd = operateTimeEnd;
		if(operateTimeEnd != null){
			putQueryParameter("OperateTimeEnd", operateTimeEnd);
		}
	}

	public List<String> getOperateErrorCodeLists() {
		return this.operateErrorCodeLists;
	}

	public void setOperateErrorCodeLists(List<String> operateErrorCodeLists) {
		this.operateErrorCodeLists = operateErrorCodeLists;	
		if (operateErrorCodeLists != null) {
			for (int i = 0; i < operateErrorCodeLists.size(); i++) {
				putQueryParameter("OperateErrorCodeList." + (i + 1) , operateErrorCodeLists.get(i));
			}
		}	
	}

	public String getOperateTimeStart() {
		return this.operateTimeStart;
	}

	public void setOperateTimeStart(String operateTimeStart) {
		this.operateTimeStart = operateTimeStart;
		if(operateTimeStart != null){
			putQueryParameter("OperateTimeStart", operateTimeStart);
		}
	}

	public String getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
		if(timeStart != null){
			putQueryParameter("TimeStart", timeStart);
		}
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
		if(levels != null){
			putQueryParameter("Levels", levels);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<DescribeAlarmEventListResponse> getResponseClass() {
		return DescribeAlarmEventListResponse.class;
	}

}
