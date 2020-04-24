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

package com.aliyuncs.ledgerdb.transform.v20191122;

import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgerResponse;
import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgerResponse.Ledger;
import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgerResponse.Ledger.LastTimeAnchor;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLedgerResponseUnmarshaller {

	public static DescribeLedgerResponse unmarshall(DescribeLedgerResponse describeLedgerResponse, UnmarshallerContext _ctx) {
		
		describeLedgerResponse.setRequestId(_ctx.stringValue("DescribeLedgerResponse.RequestId"));

		Ledger ledger = new Ledger();
		ledger.setLedgerId(_ctx.stringValue("DescribeLedgerResponse.Ledger.LedgerId"));
		ledger.setLedgerName(_ctx.stringValue("DescribeLedgerResponse.Ledger.LedgerName"));
		ledger.setLedgerDescription(_ctx.stringValue("DescribeLedgerResponse.Ledger.LedgerDescription"));
		ledger.setLedgerType(_ctx.stringValue("DescribeLedgerResponse.Ledger.LedgerType"));
		ledger.setOwnerAliUid(_ctx.stringValue("DescribeLedgerResponse.Ledger.OwnerAliUid"));
		ledger.setRegionId(_ctx.stringValue("DescribeLedgerResponse.Ledger.RegionId"));
		ledger.setZoneId(_ctx.stringValue("DescribeLedgerResponse.Ledger.ZoneId"));
		ledger.setCreateTime(_ctx.stringValue("DescribeLedgerResponse.Ledger.CreateTime"));
		ledger.setUpdateTime(_ctx.stringValue("DescribeLedgerResponse.Ledger.UpdateTime"));
		ledger.setLedgerStatus(_ctx.stringValue("DescribeLedgerResponse.Ledger.LedgerStatus"));
		ledger.setJournalCount(_ctx.longValue("DescribeLedgerResponse.Ledger.JournalCount"));
		ledger.setMemberCount(_ctx.longValue("DescribeLedgerResponse.Ledger.MemberCount"));
		ledger.setTimeAnchorCount(_ctx.longValue("DescribeLedgerResponse.Ledger.TimeAnchorCount"));

		LastTimeAnchor lastTimeAnchor = new LastTimeAnchor();
		lastTimeAnchor.setJournalId(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.JournalId"));
		lastTimeAnchor.setLedgerDigest(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.LedgerDigest"));
		lastTimeAnchor.setLedgerDigestType(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.LedgerDigestType"));
		lastTimeAnchor.setLedgerVersion(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.LedgerVersion"));
		lastTimeAnchor.setProof(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.Proof"));
		lastTimeAnchor.setTimeStamp(_ctx.stringValue("DescribeLedgerResponse.Ledger.LastTimeAnchor.TimeStamp"));
		ledger.setLastTimeAnchor(lastTimeAnchor);
		describeLedgerResponse.setLedger(ledger);
	 
	 	return describeLedgerResponse;
	}
}