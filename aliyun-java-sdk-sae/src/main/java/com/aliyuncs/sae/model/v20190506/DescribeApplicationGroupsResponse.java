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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationGroupsResponse extends AcsResponse {

	private String code;

	private String message;

	private String traceId;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private List<ApplicationGroup> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ApplicationGroup> getData() {
		return this.data;
	}

	public void setData(List<ApplicationGroup> data) {
		this.data = data;
	}

	public static class ApplicationGroup {

		private String groupId;

		private String groupName;

		private Integer groupType;

		private String packageType;

		private String packageVersion;

		private String imageUrl;

		private String packageUrl;

		private String jdk;

		private String webContainer;

		private String edasContainerVersion;

		private Integer replicas;

		private Integer runningInstances;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getGroupType() {
			return this.groupType;
		}

		public void setGroupType(Integer groupType) {
			this.groupType = groupType;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getPackageUrl() {
			return this.packageUrl;
		}

		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}

		public String getJdk() {
			return this.jdk;
		}

		public void setJdk(String jdk) {
			this.jdk = jdk;
		}

		public String getWebContainer() {
			return this.webContainer;
		}

		public void setWebContainer(String webContainer) {
			this.webContainer = webContainer;
		}

		public String getEdasContainerVersion() {
			return this.edasContainerVersion;
		}

		public void setEdasContainerVersion(String edasContainerVersion) {
			this.edasContainerVersion = edasContainerVersion;
		}

		public Integer getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Integer replicas) {
			this.replicas = replicas;
		}

		public Integer getRunningInstances() {
			return this.runningInstances;
		}

		public void setRunningInstances(Integer runningInstances) {
			this.runningInstances = runningInstances;
		}
	}

	@Override
	public DescribeApplicationGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
