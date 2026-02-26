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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ImportJobsRequest extends RpcAcsRequest<ImportJobsResponse> {
	   

	private String content;

	private Boolean overwrite;

	private String clusterId;

	private Boolean autoCreateApp;
	public ImportJobsRequest() {
		super("SchedulerX3", "2024-06-24", "ImportJobs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public Boolean getOverwrite() {
		return this.overwrite;
	}

	public void setOverwrite(Boolean overwrite) {
		this.overwrite = overwrite;
		if(overwrite != null){
			putBodyParameter("Overwrite", overwrite.toString());
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

	public Boolean getAutoCreateApp() {
		return this.autoCreateApp;
	}

	public void setAutoCreateApp(Boolean autoCreateApp) {
		this.autoCreateApp = autoCreateApp;
		if(autoCreateApp != null){
			putBodyParameter("AutoCreateApp", autoCreateApp.toString());
		}
	}

	@Override
	public Class<ImportJobsResponse> getResponseClass() {
		return ImportJobsResponse.class;
	}

}
