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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.TextEmbeddingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TextEmbeddingResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String status;

	private Integer textTokens;

	private List<ResultsItem> results;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTextTokens() {
		return this.textTokens;
	}

	public void setTextTokens(Integer textTokens) {
		this.textTokens = textTokens;
	}

	public List<ResultsItem> getResults() {
		return this.results;
	}

	public void setResults(List<ResultsItem> results) {
		this.results = results;
	}

	public static class ResultsItem {

		private Integer index;

		private List<Double> embedding;

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public List<Double> getEmbedding() {
			return this.embedding;
		}

		public void setEmbedding(List<Double> embedding) {
			this.embedding = embedding;
		}
	}

	@Override
	public TextEmbeddingResponse getInstance(UnmarshallerContext context) {
		return	TextEmbeddingResponseUnmarshaller.unmarshall(this, context);
	}
}
