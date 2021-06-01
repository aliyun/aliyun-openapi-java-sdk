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

	private Long totalNum;

	private Long pageSize;

	private String requestId;

	private Long currentPage;

	private String nextPageToken;

	private List<StreamPredictData> streamPredictDatas;

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
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

		private String status;

		private String predictResult;

		private String predictId;

		private String predictTime;

		private String dataUrl;

		private Long timestamp;

		private String modelId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPredictResult() {
			return this.predictResult;
		}

		public void setPredictResult(String predictResult) {
			this.predictResult = predictResult;
		}

		public String getPredictId() {
			return this.predictId;
		}

		public void setPredictId(String predictId) {
			this.predictId = predictId;
		}

		public String getPredictTime() {
			return this.predictTime;
		}

		public void setPredictTime(String predictTime) {
			this.predictTime = predictTime;
		}

		public String getDataUrl() {
			return this.dataUrl;
		}

		public void setDataUrl(String dataUrl) {
			this.dataUrl = dataUrl;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}
	}

	@Override
	public DescribeStreamPredictResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamPredictResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
