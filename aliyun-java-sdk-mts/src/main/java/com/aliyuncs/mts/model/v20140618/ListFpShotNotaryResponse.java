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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListFpShotNotaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFpShotNotaryResponse extends AcsResponse {

	private String requestId;

	private String nextPageToken;

	private List<FpShotNotary> fpShotNotaryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<FpShotNotary> getFpShotNotaryList() {
		return this.fpShotNotaryList;
	}

	public void setFpShotNotaryList(List<FpShotNotary> fpShotNotaryList) {
		this.fpShotNotaryList = fpShotNotaryList;
	}

	public static class FpShotNotary {

		private String creationTime;

		private String finishTime;

		private String jobId;

		private String txHash;

		private String transactionId;

		private String fpDBId;

		private String detail;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getTxHash() {
			return this.txHash;
		}

		public void setTxHash(String txHash) {
			this.txHash = txHash;
		}

		public String getTransactionId() {
			return this.transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getFpDBId() {
			return this.fpDBId;
		}

		public void setFpDBId(String fpDBId) {
			this.fpDBId = fpDBId;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public ListFpShotNotaryResponse getInstance(UnmarshallerContext context) {
		return	ListFpShotNotaryResponseUnmarshaller.unmarshall(this, context);
	}
}
