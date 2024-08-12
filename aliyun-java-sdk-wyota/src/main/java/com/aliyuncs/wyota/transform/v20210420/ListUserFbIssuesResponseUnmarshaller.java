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

import com.aliyuncs.wyota.model.v20210420.ListUserFbIssuesResponse;
import com.aliyuncs.wyota.model.v20210420.ListUserFbIssuesResponse.Data;
import com.aliyuncs.wyota.model.v20210420.ListUserFbIssuesResponse.Data.FeedbackIssueDataItem;
import com.aliyuncs.wyota.model.v20210420.ListUserFbIssuesResponse.Data.FeedbackIssueDataItem.FileListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserFbIssuesResponseUnmarshaller {

	public static ListUserFbIssuesResponse unmarshall(ListUserFbIssuesResponse listUserFbIssuesResponse, UnmarshallerContext _ctx) {
		
		listUserFbIssuesResponse.setRequestId(_ctx.stringValue("ListUserFbIssuesResponse.RequestId"));
		listUserFbIssuesResponse.setCode(_ctx.stringValue("ListUserFbIssuesResponse.Code"));
		listUserFbIssuesResponse.setMessage(_ctx.stringValue("ListUserFbIssuesResponse.Message"));
		listUserFbIssuesResponse.setTotalCount(_ctx.integerValue("ListUserFbIssuesResponse.TotalCount"));
		listUserFbIssuesResponse.setPageNumber(_ctx.integerValue("ListUserFbIssuesResponse.PageNumber"));
		listUserFbIssuesResponse.setPageSize(_ctx.integerValue("ListUserFbIssuesResponse.PageSize"));

		Data data = new Data();
		data.setCount(_ctx.stringValue("ListUserFbIssuesResponse.Data.Count"));

		List<FeedbackIssueDataItem> feedbackIssueData = new ArrayList<FeedbackIssueDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserFbIssuesResponse.Data.FeedbackIssueData.Length"); i++) {
			FeedbackIssueDataItem feedbackIssueDataItem = new FeedbackIssueDataItem();
			feedbackIssueDataItem.setIssueId(_ctx.integerValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].IssueId"));
			feedbackIssueDataItem.setFbType(_ctx.integerValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FbType"));
			feedbackIssueDataItem.setCustomerId(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].CustomerId"));
			feedbackIssueDataItem.setUserId(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].UserId"));
			feedbackIssueDataItem.setUserEmail(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].UserEmail"));
			feedbackIssueDataItem.setClientId(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].ClientId"));
			feedbackIssueDataItem.setClientSn(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].ClientSn"));
			feedbackIssueDataItem.setClientModel(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].ClientModel"));
			feedbackIssueDataItem.setIssueLabel(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].IssueLabel"));
			feedbackIssueDataItem.setDesktopId(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].DesktopId"));
			feedbackIssueDataItem.setAppId(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].AppId"));
			feedbackIssueDataItem.setTitle(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].Title"));
			feedbackIssueDataItem.setDescription(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].Description"));
			feedbackIssueDataItem.setErrorCode(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].ErrorCode"));
			feedbackIssueDataItem.setErrorMsg(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].ErrorMsg"));
			feedbackIssueDataItem.setStatus(_ctx.integerValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].Status"));
			feedbackIssueDataItem.setGmtCreated(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].GmtCreated"));

			List<FileListItem> fileList = new ArrayList<FileListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList.Length"); j++) {
				FileListItem fileListItem = new FileListItem();
				fileListItem.setFileName(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList["+ j +"].FileName"));
				fileListItem.setFileType(_ctx.integerValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList["+ j +"].FileType"));
				fileListItem.setFileSize(_ctx.integerValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList["+ j +"].FileSize"));
				fileListItem.setOssUrl(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList["+ j +"].OssUrl"));
				fileListItem.setFileMd5(_ctx.stringValue("ListUserFbIssuesResponse.Data.FeedbackIssueData["+ i +"].FileList["+ j +"].FileMd5"));

				fileList.add(fileListItem);
			}
			feedbackIssueDataItem.setFileList(fileList);

			feedbackIssueData.add(feedbackIssueDataItem);
		}
		data.setFeedbackIssueData(feedbackIssueData);
		listUserFbIssuesResponse.setData(data);
	 
	 	return listUserFbIssuesResponse;
	}
}