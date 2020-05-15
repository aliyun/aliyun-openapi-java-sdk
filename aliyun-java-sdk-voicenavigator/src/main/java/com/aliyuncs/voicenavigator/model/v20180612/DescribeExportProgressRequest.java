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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeExportProgressRequest extends RpcAcsRequest<DescribeExportProgressResponse> {
	   

	private String instanceId;

	private String exportTaskId;
	public DescribeExportProgressRequest() {
		super("VoiceNavigator", "2018-06-12", "DescribeExportProgress", "voicebot");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getExportTaskId() {
		return this.exportTaskId;
	}

	public void setExportTaskId(String exportTaskId) {
		this.exportTaskId = exportTaskId;
		if(exportTaskId != null){
			putQueryParameter("ExportTaskId", exportTaskId);
		}
	}

	@Override
	public Class<DescribeExportProgressResponse> getResponseClass() {
		return DescribeExportProgressResponse.class;
	}

}
