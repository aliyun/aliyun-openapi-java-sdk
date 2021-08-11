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

import com.aliyuncs.nas.model.v20170626.ListRecycledDirectoriesAndFilesResponse;
import com.aliyuncs.nas.model.v20170626.ListRecycledDirectoriesAndFilesResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecycledDirectoriesAndFilesResponseUnmarshaller {

	public static ListRecycledDirectoriesAndFilesResponse unmarshall(ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFilesResponse, UnmarshallerContext _ctx) {
		
		listRecycledDirectoriesAndFilesResponse.setRequestId(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.RequestId"));
		listRecycledDirectoriesAndFilesResponse.setNextToken(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.NextToken"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("ListRecycledDirectoriesAndFilesResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setFileId(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].FileId"));
			entry.setType(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].Type"));
			entry.setName(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].Name"));
			entry.setDeleteTime(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].DeleteTime"));
			entry.setInode(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].Inode"));
			entry.setATime(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].ATime"));
			entry.setMTime(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].MTime"));
			entry.setCTime(_ctx.stringValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].CTime"));
			entry.setSize(_ctx.longValue("ListRecycledDirectoriesAndFilesResponse.Entries["+ i +"].Size"));

			entries.add(entry);
		}
		listRecycledDirectoriesAndFilesResponse.setEntries(entries);
	 
	 	return listRecycledDirectoriesAndFilesResponse;
	}
}