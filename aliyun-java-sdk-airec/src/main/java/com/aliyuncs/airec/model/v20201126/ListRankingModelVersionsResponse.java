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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListRankingModelVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRankingModelVersionsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String status;

		private String runTime;

		private String runLog;

		private String templateName;

		private String name;

		private String templateId;

		private RunResult runResult;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRunTime() {
			return this.runTime;
		}

		public void setRunTime(String runTime) {
			this.runTime = runTime;
		}

		public String getRunLog() {
			return this.runLog;
		}

		public void setRunLog(String runLog) {
			this.runLog = runLog;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public RunResult getRunResult() {
			return this.runResult;
		}

		public void setRunResult(RunResult runResult) {
			this.runResult = runResult;
		}

		public static class RunResult {

			private String assessAuc;

			private String assessGauc;

			private String assessLoss;

			private String trainAuc;

			private String trainGauc;

			private String trainLoss;

			public String getAssessAuc() {
				return this.assessAuc;
			}

			public void setAssessAuc(String assessAuc) {
				this.assessAuc = assessAuc;
			}

			public String getAssessGauc() {
				return this.assessGauc;
			}

			public void setAssessGauc(String assessGauc) {
				this.assessGauc = assessGauc;
			}

			public String getAssessLoss() {
				return this.assessLoss;
			}

			public void setAssessLoss(String assessLoss) {
				this.assessLoss = assessLoss;
			}

			public String getTrainAuc() {
				return this.trainAuc;
			}

			public void setTrainAuc(String trainAuc) {
				this.trainAuc = trainAuc;
			}

			public String getTrainGauc() {
				return this.trainGauc;
			}

			public void setTrainGauc(String trainGauc) {
				this.trainGauc = trainGauc;
			}

			public String getTrainLoss() {
				return this.trainLoss;
			}

			public void setTrainLoss(String trainLoss) {
				this.trainLoss = trainLoss;
			}
		}
	}

	@Override
	public ListRankingModelVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListRankingModelVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
