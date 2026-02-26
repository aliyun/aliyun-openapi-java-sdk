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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.AnalyzeSQLLineageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AnalyzeSQLLineageResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private LineageResult lineageResult;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public LineageResult getLineageResult() {
		return this.lineageResult;
	}

	public void setLineageResult(LineageResult lineageResult) {
		this.lineageResult = lineageResult;
	}

	public static class LineageResult {

		private List<LineageItem> lineages;

		private List<ObjectMetadataItem> objectMetadata;

		public List<LineageItem> getLineages() {
			return this.lineages;
		}

		public void setLineages(List<LineageItem> lineages) {
			this.lineages = lineages;
		}

		public List<ObjectMetadataItem> getObjectMetadata() {
			return this.objectMetadata;
		}

		public void setObjectMetadata(List<ObjectMetadataItem> objectMetadata) {
			this.objectMetadata = objectMetadata;
		}

		public static class LineageItem {

			private String lineageType;

			private String src;

			private String dst;

			private String operType;

			private ProcessDetail processDetail;

			public String getLineageType() {
				return this.lineageType;
			}

			public void setLineageType(String lineageType) {
				this.lineageType = lineageType;
			}

			public String getSrc() {
				return this.src;
			}

			public void setSrc(String src) {
				this.src = src;
			}

			public String getDst() {
				return this.dst;
			}

			public void setDst(String dst) {
				this.dst = dst;
			}

			public String getOperType() {
				return this.operType;
			}

			public void setOperType(String operType) {
				this.operType = operType;
			}

			public ProcessDetail getProcessDetail() {
				return this.processDetail;
			}

			public void setProcessDetail(ProcessDetail processDetail) {
				this.processDetail = processDetail;
			}

			public static class ProcessDetail {

				private String code;

				private String calWay;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getCalWay() {
					return this.calWay;
				}

				public void setCalWay(String calWay) {
					this.calWay = calWay;
				}
			}
		}

		public static class ObjectMetadataItem {

			private String name;

			private String type;

			private String source;

			private List<Field> fields;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public List<Field> getFields() {
				return this.fields;
			}

			public void setFields(List<Field> fields) {
				this.fields = fields;
			}

			public static class Field {

				private String name;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public AnalyzeSQLLineageResponse getInstance(UnmarshallerContext context) {
		return	AnalyzeSQLLineageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
