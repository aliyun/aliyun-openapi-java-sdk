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

import com.aliyuncs.ledgerdb.model.v20191122.ListTimeAnchorsResponse;
import com.aliyuncs.ledgerdb.model.v20191122.ListTimeAnchorsResponse.TimeAnchor;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTimeAnchorsResponseUnmarshaller {

	public static ListTimeAnchorsResponse unmarshall(ListTimeAnchorsResponse listTimeAnchorsResponse, UnmarshallerContext _ctx) {
		
		listTimeAnchorsResponse.setRequestId(_ctx.stringValue("ListTimeAnchorsResponse.RequestId"));
		listTimeAnchorsResponse.setNextToken(_ctx.stringValue("ListTimeAnchorsResponse.NextToken"));
		listTimeAnchorsResponse.setMaxResults(_ctx.integerValue("ListTimeAnchorsResponse.MaxResults"));

		List<TimeAnchor> timeAnchors = new ArrayList<TimeAnchor>();
		for (int i = 0; i < _ctx.lengthValue("ListTimeAnchorsResponse.TimeAnchors.Length"); i++) {
			TimeAnchor timeAnchor = new TimeAnchor();
			timeAnchor.setJournalId(_ctx.longValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].JournalId"));
			timeAnchor.setLedgerVersion(_ctx.longValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].LedgerVersion"));
			timeAnchor.setLedgerDigest(_ctx.stringValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].LedgerDigest"));
			timeAnchor.setLedgerDigestType(_ctx.stringValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].LedgerDigestType"));
			timeAnchor.setTimeStamp(_ctx.longValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].TimeStamp"));
			timeAnchor.setProof(_ctx.stringValue("ListTimeAnchorsResponse.TimeAnchors["+ i +"].Proof"));

			timeAnchors.add(timeAnchor);
		}
		listTimeAnchorsResponse.setTimeAnchors(timeAnchors);
	 
	 	return listTimeAnchorsResponse;
	}
}