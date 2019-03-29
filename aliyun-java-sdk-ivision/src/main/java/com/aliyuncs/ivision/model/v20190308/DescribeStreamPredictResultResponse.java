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
import com.aliyuncs.ivision.transform.v20190308.DescribeStreamPredictResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamPredictResultResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long currentPage;

	private Long pageSize;

	private String nextPageToken;

	private List<StreamPredictData> streamPredictDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<StreamPredictData> getStreamPredictDatas() {
		return this.streamPredictDatas;
	}

	public void setStreamPredictDatas(List<StreamPredictData> streamPredictDatas) {
		this.streamPredictDatas = streamPredictDatas;
	}

	public static class StreamPredictData {

		private String predictId;

		private String modelId;

		private String dataUrl;

		private String streamTimestamp;

		private String predictTime;

		private String status;

		private List<ResultStatisticsItem> resultStatistics;

		private List<PredictionResult> predictionResults;

		public String getPredictId() {
			return this.predictId;
		}

		public void setPredictId(String predictId) {
			this.predictId = predictId;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getDataUrl() {
			return this.dataUrl;
		}

		public void setDataUrl(String dataUrl) {
			this.dataUrl = dataUrl;
		}

		public String getStreamTimestamp() {
			return this.streamTimestamp;
		}

		public void setStreamTimestamp(String streamTimestamp) {
			this.streamTimestamp = streamTimestamp;
		}

		public String getPredictTime() {
			return this.predictTime;
		}

		public void setPredictTime(String predictTime) {
			this.predictTime = predictTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<ResultStatisticsItem> getResultStatistics() {
			return this.resultStatistics;
		}

		public void setResultStatistics(List<ResultStatisticsItem> resultStatistics) {
			this.resultStatistics = resultStatistics;
		}

		public List<PredictionResult> getPredictionResults() {
			return this.predictionResults;
		}

		public void setPredictionResults(List<PredictionResult> predictionResults) {
			this.predictionResults = predictionResults;
		}

		public static class ResultStatisticsItem {

			private String tagId;

			private String tagName;

			private Long count;

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

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}

		public static class PredictionResult {

			private String tagId;

			private String tagName;

			private String probability;

			private String overlap;

			private String regionType;

			private Region region;

			private Properties properties;

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

			public Region getRegion() {
				return this.region;
			}

			public void setRegion(Region region) {
				this.region = region;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
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

			public static class Properties {

				private String withGloves;

				private String withGlovesProbability;

				public String getWithGloves() {
					return this.withGloves;
				}

				public void setWithGloves(String withGloves) {
					this.withGloves = withGloves;
				}

				public String getWithGlovesProbability() {
					return this.withGlovesProbability;
				}

				public void setWithGlovesProbability(String withGlovesProbability) {
					this.withGlovesProbability = withGlovesProbability;
				}
			}
		}
	}

	@Override
	public DescribeStreamPredictResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamPredictResultResponseUnmarshaller.unmarshall(this, context);
	}
}
