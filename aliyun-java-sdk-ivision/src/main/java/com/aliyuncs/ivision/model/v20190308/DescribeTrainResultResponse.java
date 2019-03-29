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
import com.aliyuncs.ivision.transform.v20190308.DescribeTrainResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrainResultResponse extends AcsResponse {

	private String requestId;

	private TrainResult trainResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TrainResult getTrainResult() {
		return this.trainResult;
	}

	public void setTrainResult(TrainResult trainResult) {
		this.trainResult = trainResult;
	}

	public static class TrainResult {

		private String projectId;

		private String iterationId;

		private String iterationName;

		private String precision;

		private String recall;

		private String mAP;

		private String threshold;

		private String status;

		private String startTime;

		private String endTime;

		private String errorCode;

		private String errorMessage;

		private List<TagResult> tagResults;

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

		public String getIterationName() {
			return this.iterationName;
		}

		public void setIterationName(String iterationName) {
			this.iterationName = iterationName;
		}

		public String getPrecision() {
			return this.precision;
		}

		public void setPrecision(String precision) {
			this.precision = precision;
		}

		public String getRecall() {
			return this.recall;
		}

		public void setRecall(String recall) {
			this.recall = recall;
		}

		public String getMAP() {
			return this.mAP;
		}

		public void setMAP(String mAP) {
			this.mAP = mAP;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
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

		public List<TagResult> getTagResults() {
			return this.tagResults;
		}

		public void setTagResults(List<TagResult> tagResults) {
			this.tagResults = tagResults;
		}

		public static class TagResult {

			private String tagId;

			private String tagName;

			private String precision;

			private String recall;

			private String aP;

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

			public String getPrecision() {
				return this.precision;
			}

			public void setPrecision(String precision) {
				this.precision = precision;
			}

			public String getRecall() {
				return this.recall;
			}

			public void setRecall(String recall) {
				this.recall = recall;
			}

			public String getAP() {
				return this.aP;
			}

			public void setAP(String aP) {
				this.aP = aP;
			}
		}
	}

	@Override
	public DescribeTrainResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrainResultResponseUnmarshaller.unmarshall(this, context);
	}
}
