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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.ListRecentlyRecycledDirectoriesResponse;
import com.aliyuncs.nas.model.v20170626.ListRecentlyRecycledDirectoriesResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentlyRecycledDirectoriesResponseUnmarshaller {

	public static ListRecentlyRecycledDirectoriesResponse unmarshall(ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectoriesResponse, UnmarshallerContext _ctx) {
		
		listRecentlyRecycledDirectoriesResponse.setRequestId(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.RequestId"));
		listRecentlyRecycledDirectoriesResponse.setNextToken(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.NextToken"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("ListRecentlyRecycledDirectoriesResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setFileId(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.Entries["+ i +"].FileId"));
			entry.setPath(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.Entries["+ i +"].Path"));
			entry.setName(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.Entries["+ i +"].Name"));
			entry.setLastDeleteTime(_ctx.stringValue("ListRecentlyRecycledDirectoriesResponse.Entries["+ i +"].LastDeleteTime"));

			entries.add(entry);
		}
		listRecentlyRecycledDirectoriesResponse.setEntries(entries);
	 
	 	return listRecentlyRecycledDirectoriesResponse;
	}
}