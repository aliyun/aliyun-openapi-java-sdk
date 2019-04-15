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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyWebLockOperateEventsRequest extends RpcAcsRequest<ModifyWebLockOperateEventsResponse> {
	
	public ModifyWebLockOperateEventsRequest() {
		super("aegis", "2016-11-11", "ModifyWebLockOperateEvents", "vipaegis");
	}

	private String operation;

	private String eventIds;

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	public String getEventIds() {
		return this.eventIds;
	}

	public void setEventIds(String eventIds) {
		this.eventIds = eventIds;
		if(eventIds != null){
			putQueryParameter("EventIds", eventIds);
		}
	}

	@Override
	public Class<ModifyWebLockOperateEventsResponse> getResponseClass() {
		return ModifyWebLockOperateEventsResponse.class;
	}

}
