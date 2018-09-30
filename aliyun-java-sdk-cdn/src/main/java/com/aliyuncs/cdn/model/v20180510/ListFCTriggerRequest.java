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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListFCTriggerRequest extends RpcAcsRequest<ListFCTriggerResponse> {
	
	public ListFCTriggerRequest() {
		super("Cdn", "2018-05-10", "ListFCTrigger");
	}

	private String eventMetaVersion;

	private Long ownerId;

	private String eventMetaName;

	public String getEventMetaVersion() {
		return this.eventMetaVersion;
	}

	public void setEventMetaVersion(String eventMetaVersion) {
		this.eventMetaVersion = eventMetaVersion;
		if(eventMetaVersion != null){
			putQueryParameter("EventMetaVersion", eventMetaVersion);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getEventMetaName() {
		return this.eventMetaName;
	}

	public void setEventMetaName(String eventMetaName) {
		this.eventMetaName = eventMetaName;
		if(eventMetaName != null){
			putQueryParameter("EventMetaName", eventMetaName);
		}
	}

	@Override
	public Class<ListFCTriggerResponse> getResponseClass() {
		return ListFCTriggerResponse.class;
	}

}
