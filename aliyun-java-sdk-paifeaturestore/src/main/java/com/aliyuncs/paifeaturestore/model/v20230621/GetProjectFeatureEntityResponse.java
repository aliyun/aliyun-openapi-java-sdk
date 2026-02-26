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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetProjectFeatureEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectFeatureEntityResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String featureEntityId;

	private String projectName;

	private String workspaceId;

	private String joinId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeatureEntityId() {
		return this.featureEntityId;
	}

	public void setFeatureEntityId(String featureEntityId) {
		this.featureEntityId = featureEntityId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getJoinId() {
		return this.joinId;
	}

	public void setJoinId(String joinId) {
		this.joinId = joinId;
	}

	@Override
	public GetProjectFeatureEntityResponse getInstance(UnmarshallerContext context) {
		return	GetProjectFeatureEntityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
