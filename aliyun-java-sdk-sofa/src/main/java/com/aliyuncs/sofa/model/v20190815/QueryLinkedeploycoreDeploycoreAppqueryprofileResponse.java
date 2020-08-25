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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkedeploycoreDeploycoreAppqueryprofileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkedeploycoreDeploycoreAppqueryprofileResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appName;

		private String defaultBuildPackVersion;

		private String envName;

		private Boolean frontApp;

		private String imageId;

		private String name;

		private String stationName;

		private String techStack;

		private Long tenantId;

		private String tenantName;

		private List<String> buildPackVersions;

		private List<String> customized;

		private List<String> iteration;

		private List<String> latestTag;

		private List<String> sidecars;

		private List<String> trunk;

		private List<String> zoneList;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDefaultBuildPackVersion() {
			return this.defaultBuildPackVersion;
		}

		public void setDefaultBuildPackVersion(String defaultBuildPackVersion) {
			this.defaultBuildPackVersion = defaultBuildPackVersion;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public Boolean getFrontApp() {
			return this.frontApp;
		}

		public void setFrontApp(Boolean frontApp) {
			this.frontApp = frontApp;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStationName() {
			return this.stationName;
		}

		public void setStationName(String stationName) {
			this.stationName = stationName;
		}

		public String getTechStack() {
			return this.techStack;
		}

		public void setTechStack(String techStack) {
			this.techStack = techStack;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public List<String> getBuildPackVersions() {
			return this.buildPackVersions;
		}

		public void setBuildPackVersions(List<String> buildPackVersions) {
			this.buildPackVersions = buildPackVersions;
		}

		public List<String> getCustomized() {
			return this.customized;
		}

		public void setCustomized(List<String> customized) {
			this.customized = customized;
		}

		public List<String> getIteration() {
			return this.iteration;
		}

		public void setIteration(List<String> iteration) {
			this.iteration = iteration;
		}

		public List<String> getLatestTag() {
			return this.latestTag;
		}

		public void setLatestTag(List<String> latestTag) {
			this.latestTag = latestTag;
		}

		public List<String> getSidecars() {
			return this.sidecars;
		}

		public void setSidecars(List<String> sidecars) {
			this.sidecars = sidecars;
		}

		public List<String> getTrunk() {
			return this.trunk;
		}

		public void setTrunk(List<String> trunk) {
			this.trunk = trunk;
		}

		public List<String> getZoneList() {
			return this.zoneList;
		}

		public void setZoneList(List<String> zoneList) {
			this.zoneList = zoneList;
		}
	}

	@Override
	public QueryLinkedeploycoreDeploycoreAppqueryprofileResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkedeploycoreDeploycoreAppqueryprofileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
