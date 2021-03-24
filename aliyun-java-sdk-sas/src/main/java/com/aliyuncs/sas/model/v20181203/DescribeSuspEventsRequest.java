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

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsRequest extends RpcAcsRequest<DescribeSuspEventsResponse> {
	   

	private String targetType;

	private String remark;

	private String source;

	private String containerFieldName;

	private String sourceIp;

	private String containerFieldValue;

	private String pageSize;

	private String from;

	private String lang;

	private String alarmUniqueInfo;

	private String uniqueInfo;

	private Long groupId;

	private String dealed;

	private String currentPage;

	private String clusterId;

	private List<String> operateErrorCodeLists;

	private String name;

	private String levels;

	private String parentEventTypes;

	private String status;

	private String uuids;
	public DescribeSuspEventsRequest() {
		super("Sas", "2018-12-03", "DescribeSuspEvents", "sas");
		setMethod(MethodType.POST);
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
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

	public String getAlarmUniqueInfo() {
		return this.alarmUniqueInfo;
	}

	public void setAlarmUniqueInfo(String alarmUniqueInfo) {
		this.alarmUniqueInfo = alarmUniqueInfo;
		if(alarmUniqueInfo != null){
			putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
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

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
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

	public String getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getParentEventTypes() {
		return this.parentEventTypes;
	}

	public void setParentEventTypes(String parentEventTypes) {
		this.parentEventTypes = parentEventTypes;
		if(parentEventTypes != null){
			putQueryParameter("ParentEventTypes", parentEventTypes);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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
	public Class<DescribeSuspEventsResponse> getResponseClass() {
		return DescribeSuspEventsResponse.class;
	}

}
