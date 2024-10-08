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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListScriptRecordingRequest extends RpcAcsRequest<ListScriptRecordingResponse> {
	   

	private String refIdsJson;

	private String uuidsJson;

	private String statesJson;

	private Integer pageNumber;

	private String scriptId;

	private String search;

	private String instanceId;

	private Integer pageSize;
	public ListScriptRecordingRequest() {
		super("OutboundBot", "2019-12-26", "ListScriptRecording", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRefIdsJson() {
		return this.refIdsJson;
	}

	public void setRefIdsJson(String refIdsJson) {
		this.refIdsJson = refIdsJson;
		if(refIdsJson != null){
			putQueryParameter("RefIdsJson", refIdsJson);
		}
	}

	public String getUuidsJson() {
		return this.uuidsJson;
	}

	public void setUuidsJson(String uuidsJson) {
		this.uuidsJson = uuidsJson;
		if(uuidsJson != null){
			putQueryParameter("UuidsJson", uuidsJson);
		}
	}

	public String getStatesJson() {
		return this.statesJson;
	}

	public void setStatesJson(String statesJson) {
		this.statesJson = statesJson;
		if(statesJson != null){
			putQueryParameter("StatesJson", statesJson);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("Search", search);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListScriptRecordingResponse> getResponseClass() {
		return ListScriptRecordingResponse.class;
	}

}
