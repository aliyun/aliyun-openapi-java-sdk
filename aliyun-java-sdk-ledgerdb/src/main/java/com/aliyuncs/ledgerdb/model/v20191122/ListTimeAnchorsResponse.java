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

package com.aliyuncs.ledgerdb.model.v20191122;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ledgerdb.transform.v20191122.ListTimeAnchorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTimeAnchorsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<TimeAnchor> timeAnchors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TimeAnchor> getTimeAnchors() {
		return this.timeAnchors;
	}

	public void setTimeAnchors(List<TimeAnchor> timeAnchors) {
		this.timeAnchors = timeAnchors;
	}

	public static class TimeAnchor {

		private Long journalId;

		private Long ledgerVersion;

		private String ledgerDigest;

		private String ledgerDigestType;

		private Long timeStamp;

		private String proof;

		public Long getJournalId() {
			return this.journalId;
		}

		public void setJournalId(Long journalId) {
			this.journalId = journalId;
		}

		public Long getLedgerVersion() {
			return this.ledgerVersion;
		}

		public void setLedgerVersion(Long ledgerVersion) {
			this.ledgerVersion = ledgerVersion;
		}

		public String getLedgerDigest() {
			return this.ledgerDigest;
		}

		public void setLedgerDigest(String ledgerDigest) {
			this.ledgerDigest = ledgerDigest;
		}

		public String getLedgerDigestType() {
			return this.ledgerDigestType;
		}

		public void setLedgerDigestType(String ledgerDigestType) {
			this.ledgerDigestType = ledgerDigestType;
		}

		public Long getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(Long timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getProof() {
			return this.proof;
		}

		public void setProof(String proof) {
			this.proof = proof;
		}
	}

	@Override
	public ListTimeAnchorsResponse getInstance(UnmarshallerContext context) {
		return	ListTimeAnchorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
