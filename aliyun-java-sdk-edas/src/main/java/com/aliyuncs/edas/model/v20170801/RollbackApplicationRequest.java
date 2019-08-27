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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RollbackApplicationRequest extends RoaAcsRequest<RollbackApplicationResponse> {
	
	public RollbackApplicationRequest() {
		super("Edas", "2017-08-01", "RollbackApplication", "edas");
		setUriPattern("/pop/v5/changeorder/co_rollback");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String appId;

	private String groupId;

	private Integer batchWaitTime;

	private Integer batch;

	private String historyVersion;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public Integer getBatch() {
		return this.batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
		if(batch != null){
			putQueryParameter("Batch", batch.toString());
		}
	}

	public String getHistoryVersion() {
		return this.historyVersion;
	}

	public void setHistoryVersion(String historyVersion) {
		this.historyVersion = historyVersion;
		if(historyVersion != null){
			putQueryParameter("HistoryVersion", historyVersion);
		}
	}

	@Override
	public Class<RollbackApplicationResponse> getResponseClass() {
		return RollbackApplicationResponse.class;
	}

}
