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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleListRequest extends RpcAcsRequest<DescribeMetricRuleListResponse> {
	
	public DescribeMetricRuleListRequest() {
		super("Cms", "2019-01-01", "DescribeMetricRuleList", "cms");
	}

	private Boolean enableState;

	private String ruleIds;

	private String groupId;

	private String namespace;

	private String pageSize;

	private String alertState;

	private String ruleName;

	private String page;

	private String metricName;

	private String dimensions;

	public Boolean getEnableState() {
		return this.enableState;
	}

	public void setEnableState(Boolean enableState) {
		this.enableState = enableState;
		if(enableState != null){
			putQueryParameter("EnableState", enableState.toString());
		}
	}

	public String getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(String ruleIds) {
		this.ruleIds = ruleIds;
		if(ruleIds != null){
			putQueryParameter("RuleIds", ruleIds);
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

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
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

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		if(dimensions != null){
			putQueryParameter("Dimensions", dimensions);
		}
	}

	@Override
	public Class<DescribeMetricRuleListResponse> getResponseClass() {
		return DescribeMetricRuleListResponse.class;
	}

}
