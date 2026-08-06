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

import com.aliyuncs.nas.model.v20170626.ListDataInsightDirectoriesResponse;
import com.aliyuncs.nas.model.v20170626.ListDataInsightDirectoriesResponse.Directory;
import com.aliyuncs.nas.model.v20170626.ListDataInsightDirectoriesResponse.Directory.SubDirectoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataInsightDirectoriesResponseUnmarshaller {

	public static ListDataInsightDirectoriesResponse unmarshall(ListDataInsightDirectoriesResponse listDataInsightDirectoriesResponse, UnmarshallerContext _ctx) {
		
		listDataInsightDirectoriesResponse.setRequestId(_ctx.stringValue("ListDataInsightDirectoriesResponse.RequestId"));
		listDataInsightDirectoriesResponse.setNextToken(_ctx.stringValue("ListDataInsightDirectoriesResponse.NextToken"));
		listDataInsightDirectoriesResponse.setMaxResults(_ctx.integerValue("ListDataInsightDirectoriesResponse.MaxResults"));
		listDataInsightDirectoriesResponse.setFileSystemId(_ctx.stringValue("ListDataInsightDirectoriesResponse.FileSystemId"));
		listDataInsightDirectoriesResponse.setParentDir(_ctx.stringValue("ListDataInsightDirectoriesResponse.ParentDir"));

		Directory directory = new Directory();
		directory.setDirCapacity(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.DirCapacity"));
		directory.setDirCapacityOnline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.DirCapacityOnline"));
		directory.setFileCount(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.FileCount"));
		directory.setFileCountOnline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.FileCountOnline"));
		directory.setFileCountOffline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.FileCountOffline"));
		directory.setDirCapacityOffline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.DirCapacityOffline"));

		List<SubDirectoriesItem> subDirectories = new ArrayList<SubDirectoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories.Length"); i++) {
			SubDirectoriesItem subDirectoriesItem = new SubDirectoriesItem();
			subDirectoriesItem.setDirCapacity(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].DirCapacity"));
			subDirectoriesItem.setDirCapacityOnline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].DirCapacityOnline"));
			subDirectoriesItem.setDirLevel(_ctx.integerValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].DirLevel"));
			subDirectoriesItem.setFileCount(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].FileCount"));
			subDirectoriesItem.setDirName(_ctx.stringValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].DirName"));
			subDirectoriesItem.setFileCountOnline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].FileCountOnline"));
			subDirectoriesItem.setFileCountOffline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].FileCountOffline"));
			subDirectoriesItem.setCreatedAt(_ctx.stringValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].CreatedAt"));
			subDirectoriesItem.setDirCapacityOffline(_ctx.longValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].DirCapacityOffline"));
			subDirectoriesItem.setFileSystemId(_ctx.stringValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].FileSystemId"));
			subDirectoriesItem.setLastAccessTime(_ctx.stringValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].LastAccessTime"));
			subDirectoriesItem.setUpdatedAt(_ctx.stringValue("ListDataInsightDirectoriesResponse.Directory.SubDirectories["+ i +"].UpdatedAt"));

			subDirectories.add(subDirectoriesItem);
		}
		directory.setSubDirectories(subDirectories);
		listDataInsightDirectoriesResponse.setDirectory(directory);
	 
	 	return listDataInsightDirectoriesResponse;
	}
}