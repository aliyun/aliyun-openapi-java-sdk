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

package com.aliyuncs.grace.model.v20220606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.grace.transform.v20220606.GetFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileResponse extends AcsResponse {

	private String type;

	private Long size;

	private Long creationTime;

	private String displayName;

	private String labels;

	private Boolean shared;

	private String transferState;

	private String name;

	private String requestId;

	private AnalyzeProgress analyzeProgress;

	private TransferProgress transferProgress;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public Boolean getShared() {
		return this.shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public String getTransferState() {
		return this.transferState;
	}

	public void setTransferState(String transferState) {
		this.transferState = transferState;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AnalyzeProgress getAnalyzeProgress() {
		return this.analyzeProgress;
	}

	public void setAnalyzeProgress(AnalyzeProgress analyzeProgress) {
		this.analyzeProgress = analyzeProgress;
	}

	public TransferProgress getTransferProgress() {
		return this.transferProgress;
	}

	public void setTransferProgress(TransferProgress transferProgress) {
		this.transferProgress = transferProgress;
	}

	public static class AnalyzeProgress {

		private String message;

		private Double percent;

		private String state;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Double getPercent() {
			return this.percent;
		}

		public void setPercent(Double percent) {
			this.percent = percent;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	public static class TransferProgress {

		private Long totalSize;

		private Long transferredSize;

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Long getTransferredSize() {
			return this.transferredSize;
		}

		public void setTransferredSize(Long transferredSize) {
			this.transferredSize = transferredSize;
		}
	}

	@Override
	public GetFileResponse getInstance(UnmarshallerContext context) {
		return	GetFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
