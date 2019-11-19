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

package com.aliyuncs.hivisengine.model.v20190625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hivisengine.transform.v20190625.GetDiagnosisKneeResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiagnosisKneeResultResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String processStatus;

		private List<FuncResult> funcResults;

		public String getProcessStatus() {
			return this.processStatus;
		}

		public void setProcessStatus(String processStatus) {
			this.processStatus = processStatus;
		}

		public List<FuncResult> getFuncResults() {
			return this.funcResults;
		}

		public void setFuncResults(List<FuncResult> funcResults) {
			this.funcResults = funcResults;
		}

		public static class FuncResult {

			private String studyUid;

			private List<StudyResult> studyResults;

			public String getStudyUid() {
				return this.studyUid;
			}

			public void setStudyUid(String studyUid) {
				this.studyUid = studyUid;
			}

			public List<StudyResult> getStudyResults() {
				return this.studyResults;
			}

			public void setStudyResults(List<StudyResult> studyResults) {
				this.studyResults = studyResults;
			}

			public static class StudyResult {

				private String seriesUid;

				private List<SeriesResult> seriesResults;

				public String getSeriesUid() {
					return this.seriesUid;
				}

				public void setSeriesUid(String seriesUid) {
					this.seriesUid = seriesUid;
				}

				public List<SeriesResult> getSeriesResults() {
					return this.seriesResults;
				}

				public void setSeriesResults(List<SeriesResult> seriesResults) {
					this.seriesResults = seriesResults;
				}

				public static class SeriesResult {

					private String instanceUid;

					private List<InstanceResult> instanceResults;

					public String getInstanceUid() {
						return this.instanceUid;
					}

					public void setInstanceUid(String instanceUid) {
						this.instanceUid = instanceUid;
					}

					public List<InstanceResult> getInstanceResults() {
						return this.instanceResults;
					}

					public void setInstanceResults(List<InstanceResult> instanceResults) {
						this.instanceResults = instanceResults;
					}

					public static class InstanceResult {

						private Float classLabel;

						private Float confidence;

						private String side;

						private List<String> box;

						public Float getClassLabel() {
							return this.classLabel;
						}

						public void setClassLabel(Float classLabel) {
							this.classLabel = classLabel;
						}

						public Float getConfidence() {
							return this.confidence;
						}

						public void setConfidence(Float confidence) {
							this.confidence = confidence;
						}

						public String getSide() {
							return this.side;
						}

						public void setSide(String side) {
							this.side = side;
						}

						public List<String> getBox() {
							return this.box;
						}

						public void setBox(List<String> box) {
							this.box = box;
						}
					}
				}
			}
		}
	}

	@Override
	public GetDiagnosisKneeResultResponse getInstance(UnmarshallerContext context) {
		return	GetDiagnosisKneeResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
