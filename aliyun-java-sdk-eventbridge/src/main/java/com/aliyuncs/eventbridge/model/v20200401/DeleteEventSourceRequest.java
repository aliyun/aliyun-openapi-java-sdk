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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteEventSourceRequest extends RpcAcsRequest<DeleteEventSourceResponse> {
	   

	private String eventBusName;

	private String eventSourceName;
	public DeleteEventSourceRequest() {
		super("eventbridge", "2020-04-01", "DeleteEventSource");
		setMethod(MethodType.POST);
	}

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putBodyParameter("EventBusName", eventBusName);
		}
	}

	public String getEventSourceName() {
		return this.eventSourceName;
	}

	public void setEventSourceName(String eventSourceName) {
		this.eventSourceName = eventSourceName;
		if(eventSourceName != null){
			putBodyParameter("EventSourceName", eventSourceName);
		}
	}

	@Override
	public Class<DeleteEventSourceResponse> getResponseClass() {
		return DeleteEventSourceResponse.class;
	}

}
