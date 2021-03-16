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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFeatureDefinitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFeatureDefinitionResponse extends AcsResponse {

	private String requestId;

	private Integer page;

	private Integer pageSize;

	private Integer totalCount;

	private Integer count;

	private List<FeatureDefinition> featureDefinitions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<FeatureDefinition> getFeatureDefinitions() {
		return this.featureDefinitions;
	}

	public void setFeatureDefinitions(List<FeatureDefinition> featureDefinitions) {
		this.featureDefinitions = featureDefinitions;
	}

	public static class FeatureDefinition {

		private String gmtCreate;

		private String gmtModified;

		private Boolean deleted;

		private Long detailDocId;

		private String featureName;

		private String featureType;

		private String featureTargetType;

		private String shortDesc;

		private Long validTimeRange;

		private Boolean execRule;

		private String reason;

		private String severityLevel;

		private String supportTeams;

		private Long extractionId;

		private String createUserName;

		private String lastModifiedUserName;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Long getDetailDocId() {
			return this.detailDocId;
		}

		public void setDetailDocId(Long detailDocId) {
			this.detailDocId = detailDocId;
		}

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getFeatureType() {
			return this.featureType;
		}

		public void setFeatureType(String featureType) {
			this.featureType = featureType;
		}

		public String getFeatureTargetType() {
			return this.featureTargetType;
		}

		public void setFeatureTargetType(String featureTargetType) {
			this.featureTargetType = featureTargetType;
		}

		public String getShortDesc() {
			return this.shortDesc;
		}

		public void setShortDesc(String shortDesc) {
			this.shortDesc = shortDesc;
		}

		public Long getValidTimeRange() {
			return this.validTimeRange;
		}

		public void setValidTimeRange(Long validTimeRange) {
			this.validTimeRange = validTimeRange;
		}

		public Boolean getExecRule() {
			return this.execRule;
		}

		public void setExecRule(Boolean execRule) {
			this.execRule = execRule;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getSeverityLevel() {
			return this.severityLevel;
		}

		public void setSeverityLevel(String severityLevel) {
			this.severityLevel = severityLevel;
		}

		public String getSupportTeams() {
			return this.supportTeams;
		}

		public void setSupportTeams(String supportTeams) {
			this.supportTeams = supportTeams;
		}

		public Long getExtractionId() {
			return this.extractionId;
		}

		public void setExtractionId(Long extractionId) {
			this.extractionId = extractionId;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getLastModifiedUserName() {
			return this.lastModifiedUserName;
		}

		public void setLastModifiedUserName(String lastModifiedUserName) {
			this.lastModifiedUserName = lastModifiedUserName;
		}
	}

	@Override
	public OpsDescribeFeatureDefinitionResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFeatureDefinitionResponseUnmarshaller.unmarshall(this, context);
	}
}
