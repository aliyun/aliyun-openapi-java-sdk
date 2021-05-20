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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.DescribeAppInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppInstanceListResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<Instance> instanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Instance> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}

	public static class Instance {

		private String appId;

		private String groupId;

		private String podRaw;

		private String groupName;

		private Boolean canary;

		private String version;

		private String nodeName;

		private String nodeLabels;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getPodRaw() {
			return this.podRaw;
		}

		public void setPodRaw(String podRaw) {
			this.podRaw = podRaw;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Boolean getCanary() {
			return this.canary;
		}

		public void setCanary(Boolean canary) {
			this.canary = canary;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodeLabels() {
			return this.nodeLabels;
		}

		public void setNodeLabels(String nodeLabels) {
			this.nodeLabels = nodeLabels;
		}
	}

	@Override
	public DescribeAppInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
