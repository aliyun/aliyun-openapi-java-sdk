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

import com.aliyuncs.nas.model.v20170626.ListDirectoriesAndFilesResponse;
import com.aliyuncs.nas.model.v20170626.ListDirectoriesAndFilesResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDirectoriesAndFilesResponseUnmarshaller {

	public static ListDirectoriesAndFilesResponse unmarshall(ListDirectoriesAndFilesResponse listDirectoriesAndFilesResponse, UnmarshallerContext _ctx) {
		
		listDirectoriesAndFilesResponse.setRequestId(_ctx.stringValue("ListDirectoriesAndFilesResponse.RequestId"));
		listDirectoriesAndFilesResponse.setNextToken(_ctx.stringValue("ListDirectoriesAndFilesResponse.NextToken"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("ListDirectoriesAndFilesResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setType(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Type"));
			entry.setHasInfrequentAccessFile(_ctx.booleanValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].HasInfrequentAccessFile"));
			entry.setCtime(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Ctime"));
			entry.setMtime(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Mtime"));
			entry.setSize(_ctx.longValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Size"));
			entry.setStorageType(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].StorageType"));
			entry.setAtime(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Atime"));
			entry.setName(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Name"));
			entry.setRetrieveTime(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].RetrieveTime"));
			entry.setInode(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].Inode"));
			entry.setFileId(_ctx.stringValue("ListDirectoriesAndFilesResponse.Entries["+ i +"].FileId"));

			entries.add(entry);
		}
		listDirectoriesAndFilesResponse.setEntries(entries);
	 
	 	return listDirectoriesAndFilesResponse;
	}
}