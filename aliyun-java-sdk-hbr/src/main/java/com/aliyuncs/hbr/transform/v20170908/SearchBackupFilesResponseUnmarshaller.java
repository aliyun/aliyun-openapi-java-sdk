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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.SearchBackupFilesResponse;
import com.aliyuncs.hbr.model.v20170908.SearchBackupFilesResponse.SearchResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchBackupFilesResponseUnmarshaller {

	public static SearchBackupFilesResponse unmarshall(SearchBackupFilesResponse searchBackupFilesResponse, UnmarshallerContext _ctx) {
		
		searchBackupFilesResponse.setRequestId(_ctx.stringValue("SearchBackupFilesResponse.RequestId"));
		searchBackupFilesResponse.setSuccess(_ctx.booleanValue("SearchBackupFilesResponse.Success"));
		searchBackupFilesResponse.setCode(_ctx.stringValue("SearchBackupFilesResponse.Code"));
		searchBackupFilesResponse.setMessage(_ctx.stringValue("SearchBackupFilesResponse.Message"));
		searchBackupFilesResponse.setMaxResults(_ctx.longValue("SearchBackupFilesResponse.MaxResults"));
		searchBackupFilesResponse.setLimit(_ctx.integerValue("SearchBackupFilesResponse.Limit"));
		searchBackupFilesResponse.setNextToken(_ctx.stringValue("SearchBackupFilesResponse.NextToken"));

		List<SearchResult> searchResults = new ArrayList<SearchResult>();
		for (int i = 0; i < _ctx.lengthValue("SearchBackupFilesResponse.SearchResults.Length"); i++) {
			SearchResult searchResult = new SearchResult();
			searchResult.setAccountId(_ctx.longValue("SearchBackupFilesResponse.SearchResults["+ i +"].AccountId"));
			searchResult.setVaultId(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].VaultId"));
			searchResult.setSnapshotId(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].SnapshotId"));
			searchResult.setPath(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].Path"));
			searchResult.setClientId(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].ClientId"));
			searchResult.setSnapshotHash(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].SnapshotHash"));
			searchResult.setNodeId(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].NodeId"));
			searchResult.setBackupTime(_ctx.longValue("SearchBackupFilesResponse.SearchResults["+ i +"].BackupTime"));
			searchResult.setExpireTime(_ctx.longValue("SearchBackupFilesResponse.SearchResults["+ i +"].ExpireTime"));
			searchResult.setName(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].Name"));
			searchResult.setType(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].Type"));
			searchResult.setModTime(_ctx.longValue("SearchBackupFilesResponse.SearchResults["+ i +"].ModTime"));
			searchResult.setUser(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].User"));
			searchResult.setGroup(_ctx.stringValue("SearchBackupFilesResponse.SearchResults["+ i +"].Group"));
			searchResult.setSize(_ctx.longValue("SearchBackupFilesResponse.SearchResults["+ i +"].Size"));

			searchResults.add(searchResult);
		}
		searchBackupFilesResponse.setSearchResults(searchResults);
	 
	 	return searchBackupFilesResponse;
	}
}