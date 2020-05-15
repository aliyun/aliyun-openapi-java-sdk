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

import com.aliyuncs.ledgerdb.model.v20191122.GetJournalResponse;
import com.aliyuncs.ledgerdb.model.v20191122.GetJournalResponse.Journal;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJournalResponseUnmarshaller {

	public static GetJournalResponse unmarshall(GetJournalResponse getJournalResponse, UnmarshallerContext _ctx) {
		
		getJournalResponse.setRequestId(_ctx.stringValue("GetJournalResponse.RequestId"));

		Journal journal = new Journal();
		journal.setJournalId(_ctx.stringValue("GetJournalResponse.Journal.JournalId"));
		journal.setLedgerId(_ctx.stringValue("GetJournalResponse.Journal.LedgerId"));
		journal.setPayloadType(_ctx.stringValue("GetJournalResponse.Journal.PayloadType"));
		journal.setPayloadJsonString(_ctx.stringValue("GetJournalResponse.Journal.PayloadJsonString"));
		journal.setMemberId(_ctx.stringValue("GetJournalResponse.Journal.MemberId"));
		journal.setClientId(_ctx.stringValue("GetJournalResponse.Journal.ClientId"));
		journal.setJournalHash(_ctx.stringValue("GetJournalResponse.Journal.JournalHash"));
		journal.setTimestamp(_ctx.longValue("GetJournalResponse.Journal.Timestamp"));

		List<String> clues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJournalResponse.Journal.Clues.Length"); i++) {
			clues.add(_ctx.stringValue("GetJournalResponse.Journal.Clues["+ i +"]"));
		}
		journal.setClues(clues);
		getJournalResponse.setJournal(journal);
	 
	 	return getJournalResponse;
	}
}