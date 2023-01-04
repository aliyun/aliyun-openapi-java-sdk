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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.UpdateArtifactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateArtifactResponse extends AcsResponse {

	private String requestId;

	private String artifactId;

	private String artifactType;

	private String versionName;

	private String artifactVersion;

	private String description;

	private String gmtModified;

	private String status;

	private String artifactProperty;

	private String supportRegionIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getArtifactType() {
		return this.artifactType;
	}

	public void setArtifactType(String artifactType) {
		this.artifactType = artifactType;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getArtifactVersion() {
		return this.artifactVersion;
	}

	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getArtifactProperty() {
		return this.artifactProperty;
	}

	public void setArtifactProperty(String artifactProperty) {
		this.artifactProperty = artifactProperty;
	}

	public String getSupportRegionIds() {
		return this.supportRegionIds;
	}

	public void setSupportRegionIds(String supportRegionIds) {
		this.supportRegionIds = supportRegionIds;
	}

	@Override
	public UpdateArtifactResponse getInstance(UnmarshallerContext context) {
		return	UpdateArtifactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
