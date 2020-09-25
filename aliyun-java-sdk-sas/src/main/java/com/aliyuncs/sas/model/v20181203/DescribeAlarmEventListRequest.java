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
	   

	private String targetType;

	private String alarmEventType;

	private String remark;

	private String containerFieldName;

	private String alarmEventName;

	private String sourceIp;

	private String containerFieldValue;

	private String pageSize;

	private String from;

	private String lang;

	private String groupId;

	private String dealed;

	private Integer currentPage;

	private String clusterId;

	private List<String> operateErrorCodeLists;

	private String levels;
	public DescribeAlarmEventListRequest() {
		super("Sas", "2018-12-03", "DescribeAlarmEventList", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
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

	public String getContainerFieldName() {
		return this.containerFieldName;
	}

	public void setContainerFieldName(String containerFieldName) {
		this.containerFieldName = containerFieldName;
		if(containerFieldName != null){
			putQueryParameter("ContainerFieldName", containerFieldName);
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

	public String getContainerFieldValue() {
		return this.containerFieldValue;
	}

	public void setContainerFieldValue(String containerFieldValue) {
		this.containerFieldValue = containerFieldValue;
		if(containerFieldValue != null){
			putQueryParameter("ContainerFieldValue", containerFieldValue);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
		if(levels != null){
			putQueryParameter("Levels", levels);
		}
	}

	@Override
	public Class<DescribeAlarmEventListResponse> getResponseClass() {
		return DescribeAlarmEventListResponse.class;
	}

}
