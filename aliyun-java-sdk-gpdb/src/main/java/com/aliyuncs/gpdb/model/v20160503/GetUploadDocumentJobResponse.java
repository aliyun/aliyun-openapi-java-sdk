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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.GetUploadDocumentJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUploadDocumentJobResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String status;

	private Job job;

	private ChunkResult chunkResult;

	private Usage usage;

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

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public ChunkResult getChunkResult() {
		return this.chunkResult;
	}

	public void setChunkResult(ChunkResult chunkResult) {
		this.chunkResult = chunkResult;
	}

	public Usage getUsage() {
		return this.usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	public static class Job {

		private String id;

		private Boolean completed;

		private String createTime;

		private String updateTime;

		private String status;

		private String error;

		private Integer progress;

		private String errorCode;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getCompleted() {
			return this.completed;
		}

		public void setCompleted(Boolean completed) {
			this.completed = completed;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	public static class ChunkResult {

		private String chunkFileUrl;

		private String plainChunkFileUrl;

		public String getChunkFileUrl() {
			return this.chunkFileUrl;
		}

		public void setChunkFileUrl(String chunkFileUrl) {
			this.chunkFileUrl = chunkFileUrl;
		}

		public String getPlainChunkFileUrl() {
			return this.plainChunkFileUrl;
		}

		public void setPlainChunkFileUrl(String plainChunkFileUrl) {
			this.plainChunkFileUrl = plainChunkFileUrl;
		}
	}

	public static class Usage {

		private Integer embeddingTokens;

		private Integer embeddingEntries;

		public Integer getEmbeddingTokens() {
			return this.embeddingTokens;
		}

		public void setEmbeddingTokens(Integer embeddingTokens) {
			this.embeddingTokens = embeddingTokens;
		}

		public Integer getEmbeddingEntries() {
			return this.embeddingEntries;
		}

		public void setEmbeddingEntries(Integer embeddingEntries) {
			this.embeddingEntries = embeddingEntries;
		}
	}

	@Override
	public GetUploadDocumentJobResponse getInstance(UnmarshallerContext context) {
		return	GetUploadDocumentJobResponseUnmarshaller.unmarshall(this, context);
	}
}
