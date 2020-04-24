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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgersResponse;
import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgersResponse.Ledger;
import com.aliyuncs.ledgerdb.model.v20191122.DescribeLedgersResponse.Ledger.LastTimeAnchor;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLedgersResponseUnmarshaller {

	public static DescribeLedgersResponse unmarshall(DescribeLedgersResponse describeLedgersResponse, UnmarshallerContext _ctx) {
		
		describeLedgersResponse.setRequestId(_ctx.stringValue("DescribeLedgersResponse.RequestId"));
		describeLedgersResponse.setNextToken(_ctx.stringValue("DescribeLedgersResponse.NextToken"));
		describeLedgersResponse.setMaxResults(_ctx.integerValue("DescribeLedgersResponse.MaxResults"));

		List<Ledger> ledgers = new ArrayList<Ledger>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLedgersResponse.Ledgers.Length"); i++) {
			Ledger ledger = new Ledger();
			ledger.setLedgerId(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LedgerId"));
			ledger.setLedgerName(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LedgerName"));
			ledger.setLedgerDescription(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LedgerDescription"));
			ledger.setLedgerType(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LedgerType"));
			ledger.setOwnerAliUid(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].OwnerAliUid"));
			ledger.setRegionId(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].RegionId"));
			ledger.setZoneId(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].ZoneId"));
			ledger.setCreateTime(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].CreateTime"));
			ledger.setUpdateTime(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].UpdateTime"));
			ledger.setLedgerStatus(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LedgerStatus"));
			ledger.setJournalCount(_ctx.longValue("DescribeLedgersResponse.Ledgers["+ i +"].JournalCount"));
			ledger.setMemberCount(_ctx.longValue("DescribeLedgersResponse.Ledgers["+ i +"].MemberCount"));
			ledger.setTimeAnchorCount(_ctx.longValue("DescribeLedgersResponse.Ledgers["+ i +"].TimeAnchorCount"));

			LastTimeAnchor lastTimeAnchor = new LastTimeAnchor();
			lastTimeAnchor.setJournalId(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.JournalId"));
			lastTimeAnchor.setLedgerDigest(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.LedgerDigest"));
			lastTimeAnchor.setLedgerDigestType(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.LedgerDigestType"));
			lastTimeAnchor.setLedgerVersion(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.LedgerVersion"));
			lastTimeAnchor.setProof(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.Proof"));
			lastTimeAnchor.setTimeStamp(_ctx.stringValue("DescribeLedgersResponse.Ledgers["+ i +"].LastTimeAnchor.TimeStamp"));
			ledger.setLastTimeAnchor(lastTimeAnchor);

			ledgers.add(ledger);
		}
		describeLedgersResponse.setLedgers(ledgers);
	 
	 	return describeLedgersResponse;
	}
}