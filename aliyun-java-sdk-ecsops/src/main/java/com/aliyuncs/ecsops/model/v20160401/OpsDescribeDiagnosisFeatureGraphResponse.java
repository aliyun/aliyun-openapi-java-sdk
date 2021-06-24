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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDiagnosisFeatureGraphResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiagnosisFeatureGraphResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNo;

	private List<FeatureVertex> featureVertexs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public List<FeatureVertex> getFeatureVertexs() {
		return this.featureVertexs;
	}

	public void setFeatureVertexs(List<FeatureVertex> featureVertexs) {
		this.featureVertexs = featureVertexs;
	}

	public static class FeatureVertex {

		private String severityLevel;

		private Long detailDocId;

		private String featureType;

		private String featureTargetType;

		private Boolean deleted;

		private String reason;

		private String id;

		private Boolean execRule;

		private String shortDesc;

		public String getSeverityLevel() {
			return this.severityLevel;
		}

		public void setSeverityLevel(String severityLevel) {
			this.severityLevel = severityLevel;
		}

		public Long getDetailDocId() {
			return this.detailDocId;
		}

		public void setDetailDocId(Long detailDocId) {
			this.detailDocId = detailDocId;
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

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getExecRule() {
			return this.execRule;
		}

		public void setExecRule(Boolean execRule) {
			this.execRule = execRule;
		}

		public String getShortDesc() {
			return this.shortDesc;
		}

		public void setShortDesc(String shortDesc) {
			this.shortDesc = shortDesc;
		}
	}

	@Override
	public OpsDescribeDiagnosisFeatureGraphResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDiagnosisFeatureGraphResponseUnmarshaller.unmarshall(this, context);
	}
}
