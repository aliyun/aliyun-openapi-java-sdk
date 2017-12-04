/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateAlarmRequest extends RpcAcsRequest<CreateAlarmResponse> {
	
	public CreateAlarmRequest() {
		super("Cms", "2017-03-01", "CreateAlarm", "cms");
	}

	private String callby_cms_owner;

	private Integer period;

	private String webhook;

	private String contactGroups;

	private Integer endTime;

	private String threshold;

	private Integer startTime;

	private String name;

	private String namespace;

	private Integer evaluationCount;

	private Integer silenceTime;

	private String metricName;

	private Integer notifyType;

	private String comparisonOperator;

	private String dimensions;

	private String statistics;

	public String getCallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setCallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		if(callby_cms_owner != null){
			putQueryParameter("callby_cms_owner", callby_cms_owner);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getWebhook() {
		return this.webhook;
	}

	public void setWebhook(String webhook) {
		this.webhook = webhook;
		if(webhook != null){
			putQueryParameter("Webhook", webhook);
		}
	}

	public String getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(String contactGroups) {
		this.contactGroups = contactGroups;
		if(contactGroups != null){
			putQueryParameter("ContactGroups", contactGroups);
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold);
		}
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public Integer getEvaluationCount() {
		return this.evaluationCount;
	}

	public void setEvaluationCount(Integer evaluationCount) {
		this.evaluationCount = evaluationCount;
		if(evaluationCount != null){
			putQueryParameter("EvaluationCount", evaluationCount.toString());
		}
	}

	public Integer getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Integer silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
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

	public Integer getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(Integer notifyType) {
		this.notifyType = notifyType;
		if(notifyType != null){
			putQueryParameter("NotifyType", notifyType.toString());
		}
	}

	public String getComparisonOperator() {
		return this.comparisonOperator;
	}

	public void setComparisonOperator(String comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
		if(comparisonOperator != null){
			putQueryParameter("ComparisonOperator", comparisonOperator);
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

	public String getStatistics() {
		return this.statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
		if(statistics != null){
			putQueryParameter("Statistics", statistics);
		}
	}

	@Override
	public Class<CreateAlarmResponse> getResponseClass() {
		return CreateAlarmResponse.class;
	}

}
