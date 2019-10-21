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

package com.aliyuncs.iqa.model.v20190813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iqa.transform.v20190813.GetPredictResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPredictResultResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private String question;

	private Integer topK;

	private String traceTag;

	private Long costTime;

	private String trace;

	private List<PredictResult> predictResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getTopK() {
		return this.topK;
	}

	public void setTopK(Integer topK) {
		this.topK = topK;
	}

	public String getTraceTag() {
		return this.traceTag;
	}

	public void setTraceTag(String traceTag) {
		this.traceTag = traceTag;
	}

	public Long getCostTime() {
		return this.costTime;
	}

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}

	public String getTrace() {
		return this.trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public List<PredictResult> getPredictResults() {
		return this.predictResults;
	}

	public void setPredictResults(List<PredictResult> predictResults) {
		this.predictResults = predictResults;
	}

	public static class PredictResult {

		private Integer rank;

		private String questionId;

		private String question;

		private Float score;

		private String answer;

		public Integer getRank() {
			return this.rank;
		}

		public void setRank(Integer rank) {
			this.rank = rank;
		}

		public String getQuestionId() {
			return this.questionId;
		}

		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}

		public String getQuestion() {
			return this.question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public String getAnswer() {
			return this.answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}
	}

	@Override
	public GetPredictResultResponse getInstance(UnmarshallerContext context) {
		return	GetPredictResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
