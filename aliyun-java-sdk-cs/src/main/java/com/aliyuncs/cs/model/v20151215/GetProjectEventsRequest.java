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
package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProjectEventsRequest extends RoaAcsRequest<GetProjectEventsResponse> {
	
	public GetProjectEventsRequest() {
		super("CS", "2015-12-15", "GetProjectEvents");
		setUriPattern("/clusters/[ClusterId]/projects/[ProjectId]/events");
		setMethod(MethodType.GET);
	}

	private String clusterId;

	private String projectId;

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<GetProjectEventsResponse> getResponseClass() {
		return GetProjectEventsResponse.class;
	}

}
