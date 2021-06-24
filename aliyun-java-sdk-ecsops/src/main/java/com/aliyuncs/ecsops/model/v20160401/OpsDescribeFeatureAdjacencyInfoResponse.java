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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFeatureAdjacencyInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFeatureAdjacencyInfoResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNo;

	private Integer count;

	private List<FeatureEdge> featureEdges;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<FeatureEdge> getFeatureEdges() {
		return this.featureEdges;
	}

	public void setFeatureEdges(List<FeatureEdge> featureEdges) {
		this.featureEdges = featureEdges;
	}

	public static class FeatureEdge {

		private Float logicalCorrelation;

		private Float correlationByHuman;

		private String id;

		private String problemClassification;

		private VertexFrom vertexFrom;

		private VertexTo vertexTo;

		public Float getLogicalCorrelation() {
			return this.logicalCorrelation;
		}

		public void setLogicalCorrelation(Float logicalCorrelation) {
			this.logicalCorrelation = logicalCorrelation;
		}

		public Float getCorrelationByHuman() {
			return this.correlationByHuman;
		}

		public void setCorrelationByHuman(Float correlationByHuman) {
			this.correlationByHuman = correlationByHuman;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProblemClassification() {
			return this.problemClassification;
		}

		public void setProblemClassification(String problemClassification) {
			this.problemClassification = problemClassification;
		}

		public VertexFrom getVertexFrom() {
			return this.vertexFrom;
		}

		public void setVertexFrom(VertexFrom vertexFrom) {
			this.vertexFrom = vertexFrom;
		}

		public VertexTo getVertexTo() {
			return this.vertexTo;
		}

		public void setVertexTo(VertexTo vertexTo) {
			this.vertexTo = vertexTo;
		}

		public static class VertexFrom {

			private String severityLevel;

			private Long detailDocId;

			private String featureType;

			private String featureTargetType;

			private String deleted;

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

			public String getDeleted() {
				return this.deleted;
			}

			public void setDeleted(String deleted) {
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

		public static class VertexTo {

			private String severityLevel;

			private String detailDocId;

			private String featureType;

			private String featureTargetType;

			private String deleted;

			private String reason;

			private String id;

			private String execRule;

			private String shortDesc;

			public String getSeverityLevel() {
				return this.severityLevel;
			}

			public void setSeverityLevel(String severityLevel) {
				this.severityLevel = severityLevel;
			}

			public String getDetailDocId() {
				return this.detailDocId;
			}

			public void setDetailDocId(String detailDocId) {
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

			public String getDeleted() {
				return this.deleted;
			}

			public void setDeleted(String deleted) {
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

			public String getExecRule() {
				return this.execRule;
			}

			public void setExecRule(String execRule) {
				this.execRule = execRule;
			}

			public String getShortDesc() {
				return this.shortDesc;
			}

			public void setShortDesc(String shortDesc) {
				this.shortDesc = shortDesc;
			}
		}
	}

	@Override
	public OpsDescribeFeatureAdjacencyInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFeatureAdjacencyInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
