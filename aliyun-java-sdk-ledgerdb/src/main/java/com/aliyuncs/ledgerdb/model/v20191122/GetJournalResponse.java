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
import com.aliyuncs.ledgerdb.transform.v20191122.GetJournalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJournalResponse extends AcsResponse {

	private String requestId;

	private Journal journal;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Journal getJournal() {
		return this.journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	public static class Journal {

		private String journalId;

		private String ledgerId;

		private String payloadType;

		private String payloadJsonString;

		private String memberId;

		private String clientId;

		private String journalHash;

		private Long timestamp;

		private List<String> clues;

		public String getJournalId() {
			return this.journalId;
		}

		public void setJournalId(String journalId) {
			this.journalId = journalId;
		}

		public String getLedgerId() {
			return this.ledgerId;
		}

		public void setLedgerId(String ledgerId) {
			this.ledgerId = ledgerId;
		}

		public String getPayloadType() {
			return this.payloadType;
		}

		public void setPayloadType(String payloadType) {
			this.payloadType = payloadType;
		}

		public String getPayloadJsonString() {
			return this.payloadJsonString;
		}

		public void setPayloadJsonString(String payloadJsonString) {
			this.payloadJsonString = payloadJsonString;
		}

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getJournalHash() {
			return this.journalHash;
		}

		public void setJournalHash(String journalHash) {
			this.journalHash = journalHash;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public List<String> getClues() {
			return this.clues;
		}

		public void setClues(List<String> clues) {
			this.clues = clues;
		}
	}

	@Override
	public GetJournalResponse getInstance(UnmarshallerContext context) {
		return	GetJournalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
