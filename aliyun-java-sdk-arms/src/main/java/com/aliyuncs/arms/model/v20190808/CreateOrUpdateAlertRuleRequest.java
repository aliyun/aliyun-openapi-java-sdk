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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateAlertRuleRequest extends RpcAcsRequest<CreateOrUpdateAlertRuleResponse> {
	   

	private Long alertGroup;

	private String alertName;

	private String alertStatus;

	private String annotations;

	private Long duration;

	private String metricsKey;

	private String alertRuleContent;

	private String promQL;

	private String level;

	private Boolean autoAddNewApplication;

	private String filters;

	private String clusterId;

	private String message;

	private String notifyStrategy;

	private String labels;

	private String alertType;

	private String alertCheckType;

	private String metricsType;

	private Long alertId;

	private String pids;
	public CreateOrUpdateAlertRuleRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateAlertRule", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(Long alertGroup) {
		this.alertGroup = alertGroup;
		if(alertGroup != null){
			putBodyParameter("AlertGroup", alertGroup.toString());
		}
	}

	public String getAlertName() {
		return this.alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
		if(alertName != null){
			putBodyParameter("AlertName", alertName);
		}
	}

	public String getAlertStatus() {
		return this.alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
		if(alertStatus != null){
			putBodyParameter("AlertStatus", alertStatus);
		}
	}

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
		if(annotations != null){
			putBodyParameter("Annotations", annotations);
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putBodyParameter("Duration", duration.toString());
		}
	}

	public String getMetricsKey() {
		return this.metricsKey;
	}

	public void setMetricsKey(String metricsKey) {
		this.metricsKey = metricsKey;
		if(metricsKey != null){
			putBodyParameter("MetricsKey", metricsKey);
		}
	}

	public String getAlertRuleContent() {
		return this.alertRuleContent;
	}

	public void setAlertRuleContent(String alertRuleContent) {
		this.alertRuleContent = alertRuleContent;
		if(alertRuleContent != null){
			putBodyParameter("AlertRuleContent", alertRuleContent);
		}
	}

	public String getPromQL() {
		return this.promQL;
	}

	public void setPromQL(String promQL) {
		this.promQL = promQL;
		if(promQL != null){
			putBodyParameter("PromQL", promQL);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level);
		}
	}

	public Boolean getAutoAddNewApplication() {
		return this.autoAddNewApplication;
	}

	public void setAutoAddNewApplication(Boolean autoAddNewApplication) {
		this.autoAddNewApplication = autoAddNewApplication;
		if(autoAddNewApplication != null){
			putBodyParameter("AutoAddNewApplication", autoAddNewApplication.toString());
		}
	}

	public String getFilters() {
		return this.filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
		if(filters != null){
			putBodyParameter("Filters", filters);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putBodyParameter("Message", message);
		}
	}

	public String getNotifyStrategy() {
		return this.notifyStrategy;
	}

	public void setNotifyStrategy(String notifyStrategy) {
		this.notifyStrategy = notifyStrategy;
		if(notifyStrategy != null){
			putBodyParameter("NotifyStrategy", notifyStrategy);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putBodyParameter("Labels", labels);
		}
	}

	public String getAlertType() {
		return this.alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
		if(alertType != null){
			putBodyParameter("AlertType", alertType);
		}
	}

	public String getAlertCheckType() {
		return this.alertCheckType;
	}

	public void setAlertCheckType(String alertCheckType) {
		this.alertCheckType = alertCheckType;
		if(alertCheckType != null){
			putBodyParameter("AlertCheckType", alertCheckType);
		}
	}

	public String getMetricsType() {
		return this.metricsType;
	}

	public void setMetricsType(String metricsType) {
		this.metricsType = metricsType;
		if(metricsType != null){
			putBodyParameter("MetricsType", metricsType);
		}
	}

	public Long getAlertId() {
		return this.alertId;
	}

	public void setAlertId(Long alertId) {
		this.alertId = alertId;
		if(alertId != null){
			putBodyParameter("AlertId", alertId.toString());
		}
	}

	public String getPids() {
		return this.pids;
	}

	public void setPids(String pids) {
		this.pids = pids;
		if(pids != null){
			putBodyParameter("Pids", pids);
		}
	}

	@Override
	public Class<CreateOrUpdateAlertRuleResponse> getResponseClass() {
		return CreateOrUpdateAlertRuleResponse.class;
	}

}
