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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ledgerdb.transform.v20191122.DescribeLedgerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLedgerResponse extends AcsResponse {

	private String requestId;

	private Ledger ledger;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Ledger getLedger() {
		return this.ledger;
	}

	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}

	public static class Ledger {

		private String ledgerId;

		private String ledgerName;

		private String ledgerDescription;

		private String ledgerType;

		private String ownerAliUid;

		private String regionId;

		private String zoneId;

		private String createTime;

		private String updateTime;

		private String ledgerStatus;

		private Long journalCount;

		private Long memberCount;

		private Long timeAnchorCount;

		private LastTimeAnchor lastTimeAnchor;

		public String getLedgerId() {
			return this.ledgerId;
		}

		public void setLedgerId(String ledgerId) {
			this.ledgerId = ledgerId;
		}

		public String getLedgerName() {
			return this.ledgerName;
		}

		public void setLedgerName(String ledgerName) {
			this.ledgerName = ledgerName;
		}

		public String getLedgerDescription() {
			return this.ledgerDescription;
		}

		public void setLedgerDescription(String ledgerDescription) {
			this.ledgerDescription = ledgerDescription;
		}

		public String getLedgerType() {
			return this.ledgerType;
		}

		public void setLedgerType(String ledgerType) {
			this.ledgerType = ledgerType;
		}

		public String getOwnerAliUid() {
			return this.ownerAliUid;
		}

		public void setOwnerAliUid(String ownerAliUid) {
			this.ownerAliUid = ownerAliUid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
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

		public String getLedgerStatus() {
			return this.ledgerStatus;
		}

		public void setLedgerStatus(String ledgerStatus) {
			this.ledgerStatus = ledgerStatus;
		}

		public Long getJournalCount() {
			return this.journalCount;
		}

		public void setJournalCount(Long journalCount) {
			this.journalCount = journalCount;
		}

		public Long getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}

		public Long getTimeAnchorCount() {
			return this.timeAnchorCount;
		}

		public void setTimeAnchorCount(Long timeAnchorCount) {
			this.timeAnchorCount = timeAnchorCount;
		}

		public LastTimeAnchor getLastTimeAnchor() {
			return this.lastTimeAnchor;
		}

		public void setLastTimeAnchor(LastTimeAnchor lastTimeAnchor) {
			this.lastTimeAnchor = lastTimeAnchor;
		}

		public static class LastTimeAnchor {

			private String journalId;

			private String ledgerDigest;

			private String ledgerDigestType;

			private String ledgerVersion;

			private String proof;

			private String timeStamp;

			public String getJournalId() {
				return this.journalId;
			}

			public void setJournalId(String journalId) {
				this.journalId = journalId;
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

			public String getLedgerVersion() {
				return this.ledgerVersion;
			}

			public void setLedgerVersion(String ledgerVersion) {
				this.ledgerVersion = ledgerVersion;
			}

			public String getProof() {
				return this.proof;
			}

			public void setProof(String proof) {
				this.proof = proof;
			}

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}
		}
	}

	@Override
	public DescribeLedgerResponse getInstance(UnmarshallerContext context) {
		return	DescribeLedgerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
