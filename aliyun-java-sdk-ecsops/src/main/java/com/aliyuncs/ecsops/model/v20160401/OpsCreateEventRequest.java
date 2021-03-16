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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateEventRequest extends RpcAcsRequest<OpsCreateEventResponse> {
	   

	private String data;

	private String eventTime;

	private String eventTypeVersion;

	private String source;

	private String operator;

	private String schemaURL;

	private String contentType;

	private String extensions;

	private String workOrderId;

	private String cloudEventsVersion;

	private String eventType;

	private String auditParamStr;
	public OpsCreateEventRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateEvent", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
		if(eventTime != null){
			putQueryParameter("EventTime", eventTime);
		}
	}

	public String getEventTypeVersion() {
		return this.eventTypeVersion;
	}

	public void setEventTypeVersion(String eventTypeVersion) {
		this.eventTypeVersion = eventTypeVersion;
		if(eventTypeVersion != null){
			putQueryParameter("EventTypeVersion", eventTypeVersion);
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getSchemaURL() {
		return this.schemaURL;
	}

	public void setSchemaURL(String schemaURL) {
		this.schemaURL = schemaURL;
		if(schemaURL != null){
			putQueryParameter("SchemaURL", schemaURL);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putQueryParameter("ContentType", contentType);
		}
	}

	public String getExtensions() {
		return this.extensions;
	}

	public void setExtensions(String extensions) {
		this.extensions = extensions;
		if(extensions != null){
			putQueryParameter("Extensions", extensions);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getCloudEventsVersion() {
		return this.cloudEventsVersion;
	}

	public void setCloudEventsVersion(String cloudEventsVersion) {
		this.cloudEventsVersion = cloudEventsVersion;
		if(cloudEventsVersion != null){
			putQueryParameter("CloudEventsVersion", cloudEventsVersion);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateEventResponse> getResponseClass() {
		return OpsCreateEventResponse.class;
	}

}
