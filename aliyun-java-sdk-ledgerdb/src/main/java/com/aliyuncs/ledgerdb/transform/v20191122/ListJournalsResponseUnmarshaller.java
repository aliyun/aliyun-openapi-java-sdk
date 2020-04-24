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

import com.aliyuncs.ledgerdb.model.v20191122.ListJournalsResponse;
import com.aliyuncs.ledgerdb.model.v20191122.ListJournalsResponse.Journal;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJournalsResponseUnmarshaller {

	public static ListJournalsResponse unmarshall(ListJournalsResponse listJournalsResponse, UnmarshallerContext _ctx) {
		
		listJournalsResponse.setRequestId(_ctx.stringValue("ListJournalsResponse.RequestId"));
		listJournalsResponse.setNextToken(_ctx.stringValue("ListJournalsResponse.NextToken"));
		listJournalsResponse.setMaxResults(_ctx.integerValue("ListJournalsResponse.MaxResults"));

		List<Journal> journals = new ArrayList<Journal>();
		for (int i = 0; i < _ctx.lengthValue("ListJournalsResponse.Journals.Length"); i++) {
			Journal journal = new Journal();
			journal.setJournalId(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].JournalId"));
			journal.setLedgerId(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].LedgerId"));
			journal.setPayloadType(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].PayloadType"));
			journal.setPayloadJsonString(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].PayloadJsonString"));
			journal.setMemberId(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].MemberId"));
			journal.setClientId(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].ClientId"));
			journal.setJournalHash(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].JournalHash"));
			journal.setTimestamp(_ctx.longValue("ListJournalsResponse.Journals["+ i +"].Timestamp"));

			List<String> clues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJournalsResponse.Journals["+ i +"].Clues.Length"); j++) {
				clues.add(_ctx.stringValue("ListJournalsResponse.Journals["+ i +"].Clues["+ j +"]"));
			}
			journal.setClues(clues);

			journals.add(journal);
		}
		listJournalsResponse.setJournals(journals);
	 
	 	return listJournalsResponse;
	}
}