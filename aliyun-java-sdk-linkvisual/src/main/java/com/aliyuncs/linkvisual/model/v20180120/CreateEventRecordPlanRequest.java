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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateEventRecordPlanRequest extends RpcAcsRequest<CreateEventRecordPlanResponse> {
	   

	private String name;

	private String eventTypes;

	private Integer preRecordDuration;

	private Integer recordDuration;

	private String templateId;
	public CreateEventRecordPlanRequest() {
		super("Linkvisual", "2018-01-20", "CreateEventRecordPlan", "linkvisual");
		setMethod(MethodType.POST);
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

	public String getEventTypes() {
		return this.eventTypes;
	}

	public void setEventTypes(String eventTypes) {
		this.eventTypes = eventTypes;
		if(eventTypes != null){
			putQueryParameter("EventTypes", eventTypes);
		}
	}

	public Integer getPreRecordDuration() {
		return this.preRecordDuration;
	}

	public void setPreRecordDuration(Integer preRecordDuration) {
		this.preRecordDuration = preRecordDuration;
		if(preRecordDuration != null){
			putQueryParameter("PreRecordDuration", preRecordDuration.toString());
		}
	}

	public Integer getRecordDuration() {
		return this.recordDuration;
	}

	public void setRecordDuration(Integer recordDuration) {
		this.recordDuration = recordDuration;
		if(recordDuration != null){
			putQueryParameter("RecordDuration", recordDuration.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<CreateEventRecordPlanResponse> getResponseClass() {
		return CreateEventRecordPlanResponse.class;
	}

}
