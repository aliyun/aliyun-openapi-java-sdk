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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmsRequest extends RpcAcsRequest<DescribeAlarmsResponse> {
	
	public DescribeAlarmsRequest() {
		super("Cms", "2018-03-08", "DescribeAlarms", "cms");
	}

	private Boolean enableState;

	private String names;

	private String displayName;

	private String groupId;

	private String namespace;

	private String pageSize;

	private String alertState;

	private String nameKeyword;

	private String groupBy;

	private String page;

	private String metricName;

	public Boolean getEnableState() {
		return this.enableState;
	}

	public void setEnableState(Boolean enableState) {
		this.enableState = enableState;
		if(enableState != null){
			putQueryParameter("EnableState", enableState.toString());
		}
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
		if(names != null){
			putQueryParameter("Names", names);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public String getAlertState() {
		return this.alertState;
	}

	public void setAlertState(String alertState) {
		this.alertState = alertState;
		if(alertState != null){
			putQueryParameter("AlertState", alertState);
		}
	}

	public String getNameKeyword() {
		return this.nameKeyword;
	}

	public void setNameKeyword(String nameKeyword) {
		this.nameKeyword = nameKeyword;
		if(nameKeyword != null){
			putQueryParameter("NameKeyword", nameKeyword);
		}
	}

	public String getGroupBy() {
		return this.groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		if(groupBy != null){
			putQueryParameter("GroupBy", groupBy);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	@Override
	public Class<DescribeAlarmsResponse> getResponseClass() {
		return DescribeAlarmsResponse.class;
	}

}
