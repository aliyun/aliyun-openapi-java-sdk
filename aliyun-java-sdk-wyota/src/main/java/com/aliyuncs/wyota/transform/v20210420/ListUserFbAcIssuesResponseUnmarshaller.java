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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListUserFbAcIssuesResponse;
import com.aliyuncs.wyota.model.v20210420.ListUserFbAcIssuesResponse.Data;
import com.aliyuncs.wyota.model.v20210420.ListUserFbAcIssuesResponse.Data.IssueDataListItem;
import com.aliyuncs.wyota.model.v20210420.ListUserFbAcIssuesResponse.Data.IssueDataListItem.FileListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserFbAcIssuesResponseUnmarshaller {

	public static ListUserFbAcIssuesResponse unmarshall(ListUserFbAcIssuesResponse listUserFbAcIssuesResponse, UnmarshallerContext _ctx) {
		
		listUserFbAcIssuesResponse.setRequestId(_ctx.stringValue("ListUserFbAcIssuesResponse.RequestId"));
		listUserFbAcIssuesResponse.setCode(_ctx.stringValue("ListUserFbAcIssuesResponse.Code"));
		listUserFbAcIssuesResponse.setMessage(_ctx.stringValue("ListUserFbAcIssuesResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListUserFbAcIssuesResponse.Data.TotalCount"));

		List<IssueDataListItem> issueDataList = new ArrayList<IssueDataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserFbAcIssuesResponse.Data.IssueDataList.Length"); i++) {
			IssueDataListItem issueDataListItem = new IssueDataListItem();
			issueDataListItem.setIssueId(_ctx.longValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].IssueId"));
			issueDataListItem.setInstanceId(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].InstanceId"));
			issueDataListItem.setAccount(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].Account"));
			issueDataListItem.setUserEmail(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].UserEmail"));
			issueDataListItem.setClientVersion(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].ClientVersion"));
			issueDataListItem.setLabel(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].Label"));
			issueDataListItem.setErrorMessage(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].ErrorMessage"));
			issueDataListItem.setReservedA(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].ReservedA"));
			issueDataListItem.setReservedB(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].ReservedB"));
			issueDataListItem.setGmtCreated(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].GmtCreated"));
			issueDataListItem.setGmtModified(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].GmtModified"));

			List<FileListItem> fileList = new ArrayList<FileListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].FileList.Length"); j++) {
				FileListItem fileListItem = new FileListItem();
				fileListItem.setSessionId(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].FileList["+ j +"].SessionId"));
				fileListItem.setFileName(_ctx.stringValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].FileList["+ j +"].FileName"));
				fileListItem.setFileType(_ctx.integerValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].FileList["+ j +"].FileType"));
				fileListItem.setFileSize(_ctx.integerValue("ListUserFbAcIssuesResponse.Data.IssueDataList["+ i +"].FileList["+ j +"].FileSize"));

				fileList.add(fileListItem);
			}
			issueDataListItem.setFileList(fileList);

			issueDataList.add(issueDataListItem);
		}
		data.setIssueDataList(issueDataList);
		listUserFbAcIssuesResponse.setData(data);
	 
	 	return listUserFbAcIssuesResponse;
	}
}