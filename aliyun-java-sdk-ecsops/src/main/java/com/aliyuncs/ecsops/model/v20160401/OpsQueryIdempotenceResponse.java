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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryIdempotenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryIdempotenceResponse extends AcsResponse {

	private String requestId;

	private List<IdempotenceModel> idempotenceModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IdempotenceModel> getIdempotenceModels() {
		return this.idempotenceModels;
	}

	public void setIdempotenceModels(List<IdempotenceModel> idempotenceModels) {
		this.idempotenceModels = idempotenceModels;
	}

	public static class IdempotenceModel {

		private String gmtCreated;

		private String status;

		private Boolean continueAfterProcessingTimeout;

		private String processingExpireDate;

		private String token;

		private Integer version;

		private String expireDate;

		private Boolean deleted;

		private String gmtModified;

		private String lastResult;

		private Long id;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getContinueAfterProcessingTimeout() {
			return this.continueAfterProcessingTimeout;
		}

		public void setContinueAfterProcessingTimeout(Boolean continueAfterProcessingTimeout) {
			this.continueAfterProcessingTimeout = continueAfterProcessingTimeout;
		}

		public String getProcessingExpireDate() {
			return this.processingExpireDate;
		}

		public void setProcessingExpireDate(String processingExpireDate) {
			this.processingExpireDate = processingExpireDate;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getLastResult() {
			return this.lastResult;
		}

		public void setLastResult(String lastResult) {
			this.lastResult = lastResult;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsQueryIdempotenceResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryIdempotenceResponseUnmarshaller.unmarshall(this, context);
	}
}
