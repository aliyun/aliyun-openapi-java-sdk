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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnExportProgressRequest extends RpcAcsRequest<DescribeVnExportProgressResponse> {
	
	public DescribeVnExportProgressRequest() {
		super("CloudCallCenter", "2017-07-05", "DescribeVnExportProgress", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String exportTaskId;

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
	public Class<DescribeVnExportProgressResponse> getResponseClass() {
		return DescribeVnExportProgressResponse.class;
	}

}
