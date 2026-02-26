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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetInterceptionTargetDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInterceptionTargetDetailResponse extends AcsResponse {

	private String requestId;

	private RuleTarget ruleTarget;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RuleTarget getRuleTarget() {
		return this.ruleTarget;
	}

	public void setRuleTarget(RuleTarget ruleTarget) {
		this.ruleTarget = ruleTarget;
	}

	public static class RuleTarget {

		private String appName;

		private Long targetId;

		private String targetName;

		private String namespace;

		private String targetType;

		private String clusterName;

		private String clusterId;

		private List<String> imageList;

		private List<String> tagList;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getTargetId() {
			return this.targetId;
		}

		public void setTargetId(Long targetId) {
			this.targetId = targetId;
		}

		public String getTargetName() {
			return this.targetName;
		}

		public void setTargetName(String targetName) {
			this.targetName = targetName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<String> getImageList() {
			return this.imageList;
		}

		public void setImageList(List<String> imageList) {
			this.imageList = imageList;
		}

		public List<String> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<String> tagList) {
			this.tagList = tagList;
		}
	}

	@Override
	public GetInterceptionTargetDetailResponse getInstance(UnmarshallerContext context) {
		return	GetInterceptionTargetDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
