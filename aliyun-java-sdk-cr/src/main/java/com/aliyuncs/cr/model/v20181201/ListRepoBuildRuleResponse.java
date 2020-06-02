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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoBuildRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoBuildRuleResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private String totalCount;

	private List<BuildRulesItem> buildRules;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<BuildRulesItem> getBuildRules() {
		return this.buildRules;
	}

	public void setBuildRules(List<BuildRulesItem> buildRules) {
		this.buildRules = buildRules;
	}

	public static class BuildRulesItem {

		private String buildRuleId;

		private String dockerfileLocation;

		private String dockerfileName;

		private String pushType;

		private String pushName;

		private String imageTag;

		public String getBuildRuleId() {
			return this.buildRuleId;
		}

		public void setBuildRuleId(String buildRuleId) {
			this.buildRuleId = buildRuleId;
		}

		public String getDockerfileLocation() {
			return this.dockerfileLocation;
		}

		public void setDockerfileLocation(String dockerfileLocation) {
			this.dockerfileLocation = dockerfileLocation;
		}

		public String getDockerfileName() {
			return this.dockerfileName;
		}

		public void setDockerfileName(String dockerfileName) {
			this.dockerfileName = dockerfileName;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
		}

		public String getPushName() {
			return this.pushName;
		}

		public void setPushName(String pushName) {
			this.pushName = pushName;
		}

		public String getImageTag() {
			return this.imageTag;
		}

		public void setImageTag(String imageTag) {
			this.imageTag = imageTag;
		}
	}

	@Override
	public ListRepoBuildRuleResponse getInstance(UnmarshallerContext context) {
		return	ListRepoBuildRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
