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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListAssetDirectoriesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetDirectoriesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetDirectoriesResponse.Data.Directory;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetDirectoriesResponse.Data.Directory.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssetDirectoriesResponseUnmarshaller {

	public static ListAssetDirectoriesResponse unmarshall(ListAssetDirectoriesResponse listAssetDirectoriesResponse, UnmarshallerContext _ctx) {
		
		listAssetDirectoriesResponse.setRequestId(_ctx.stringValue("ListAssetDirectoriesResponse.RequestId"));
		listAssetDirectoriesResponse.setMessage(_ctx.stringValue("ListAssetDirectoriesResponse.Message"));
		listAssetDirectoriesResponse.setHttpStatusCode(_ctx.integerValue("ListAssetDirectoriesResponse.HttpStatusCode"));
		listAssetDirectoriesResponse.setCode(_ctx.stringValue("ListAssetDirectoriesResponse.Code"));
		listAssetDirectoriesResponse.setSuccess(_ctx.booleanValue("ListAssetDirectoriesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListAssetDirectoriesResponse.Data.TotalCount"));
		data.setTopicId(_ctx.longValue("ListAssetDirectoriesResponse.Data.TopicId"));
		data.setTopicName(_ctx.stringValue("ListAssetDirectoriesResponse.Data.TopicName"));

		List<Directory> directoryList = new ArrayList<Directory>();
		for (int i = 0; i < _ctx.lengthValue("ListAssetDirectoriesResponse.Data.DirectoryList.Length"); i++) {
			Directory directory = new Directory();
			directory.setHasChildren(_ctx.booleanValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].HasChildren"));
			directory.setModifyTime(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].ModifyTime"));
			directory.setDirectoryId(_ctx.longValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].DirectoryId"));
			directory.setDirectoryDescription(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].DirectoryDescription"));
			directory.setParentDirectoryId(_ctx.longValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].ParentDirectoryId"));
			directory.setLevel(_ctx.integerValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].Level"));
			directory.setFullPath(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].FullPath"));
			directory.setDirectoryName(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].DirectoryName"));

			List<Long> fullPathIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].FullPathIds.Length"); j++) {
				fullPathIds.add(_ctx.longValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].FullPathIds["+ j +"]"));
			}
			directory.setFullPathIds(fullPathIds);

			List<String> fullPathNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].FullPathNames.Length"); j++) {
				fullPathNames.add(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].FullPathNames["+ j +"]"));
			}
			directory.setFullPathNames(fullPathNames);

			Modifier modifier = new Modifier();
			modifier.setUserName(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].Modifier.UserName"));
			modifier.setUserId(_ctx.stringValue("ListAssetDirectoriesResponse.Data.DirectoryList["+ i +"].Modifier.UserId"));
			directory.setModifier(modifier);

			directoryList.add(directory);
		}
		data.setDirectoryList(directoryList);
		listAssetDirectoriesResponse.setData(data);
	 
	 	return listAssetDirectoriesResponse;
	}
}