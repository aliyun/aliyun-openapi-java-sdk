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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.PredictImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PredictImageResponse extends AcsResponse {

	private String requestId;

	private List<PredictData> predictDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PredictData> getPredictDatas() {
		return this.predictDatas;
	}

	public void setPredictDatas(List<PredictData> predictDatas) {
		this.predictDatas = predictDatas;
	}

	public static class PredictData {

		private String projectId;

		private String iterationId;

		private String dataId;

		private String dataName;

		private String dataUrl;

		private String creationTime;

		private String status;

		private String errorCode;

		private String errorMessage;

		private List<PredictionResult> predictionResults;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getIterationId() {
			return this.iterationId;
		}

		public void setIterationId(String iterationId) {
			this.iterationId = iterationId;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getDataName() {
			return this.dataName;
		}

		public void setDataName(String dataName) {
			this.dataName = dataName;
		}

		public String getDataUrl() {
			return this.dataUrl;
		}

		public void setDataUrl(String dataUrl) {
			this.dataUrl = dataUrl;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public List<PredictionResult> getPredictionResults() {
			return this.predictionResults;
		}

		public void setPredictionResults(List<PredictionResult> predictionResults) {
			this.predictionResults = predictionResults;
		}

		public static class PredictionResult {

			private String tagId;

			private String tagName;

			private String probability;

			private String overlap;

			private String regionType;

			private String properties;

			private Region region;

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public String getProbability() {
				return this.probability;
			}

			public void setProbability(String probability) {
				this.probability = probability;
			}

			public String getOverlap() {
				return this.overlap;
			}

			public void setOverlap(String overlap) {
				this.overlap = overlap;
			}

			public String getRegionType() {
				return this.regionType;
			}

			public void setRegionType(String regionType) {
				this.regionType = regionType;
			}

			public String getProperties() {
				return this.properties;
			}

			public void setProperties(String properties) {
				this.properties = properties;
			}

			public Region getRegion() {
				return this.region;
			}

			public void setRegion(Region region) {
				this.region = region;
			}

			public static class Region {

				private String left;

				private String top;

				private String width;

				private String height;

				public String getLeft() {
					return this.left;
				}

				public void setLeft(String left) {
					this.left = left;
				}

				public String getTop() {
					return this.top;
				}

				public void setTop(String top) {
					this.top = top;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}
			}
		}
	}

	@Override
	public PredictImageResponse getInstance(UnmarshallerContext context) {
		return	PredictImageResponseUnmarshaller.unmarshall(this, context);
	}
}
