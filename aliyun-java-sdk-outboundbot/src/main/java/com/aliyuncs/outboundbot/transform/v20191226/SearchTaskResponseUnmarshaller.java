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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.SearchTaskResponse;
import com.aliyuncs.outboundbot.model.v20191226.SearchTaskResponse.SearchTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTaskResponseUnmarshaller {

	public static SearchTaskResponse unmarshall(SearchTaskResponse searchTaskResponse, UnmarshallerContext _ctx) {
		
		searchTaskResponse.setRequestId(_ctx.stringValue("SearchTaskResponse.RequestId"));
		searchTaskResponse.setHttpStatusCode(_ctx.integerValue("SearchTaskResponse.HttpStatusCode"));
		searchTaskResponse.setPageIndex(_ctx.integerValue("SearchTaskResponse.PageIndex"));
		searchTaskResponse.setSuccess(_ctx.booleanValue("SearchTaskResponse.Success"));
		searchTaskResponse.setCode(_ctx.stringValue("SearchTaskResponse.Code"));
		searchTaskResponse.setMessage(_ctx.stringValue("SearchTaskResponse.Message"));
		searchTaskResponse.setPageSize(_ctx.integerValue("SearchTaskResponse.PageSize"));
		searchTaskResponse.setTotal(_ctx.longValue("SearchTaskResponse.Total"));

		List<SearchTaskInfo> searchTaskInfoList = new ArrayList<SearchTaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchTaskResponse.SearchTaskInfoList.Length"); i++) {
			SearchTaskInfo searchTaskInfo = new SearchTaskInfo();
			searchTaskInfo.setJobGroupName(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobGroupName"));
			searchTaskInfo.setUserId(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].UserId"));
			searchTaskInfo.setActualTime(_ctx.longValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].ActualTime"));
			searchTaskInfo.setCalledNumber(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].CalledNumber"));
			searchTaskInfo.setTaskStatusString(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskStatusString"));
			searchTaskInfo.setTaskStatusName(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskStatusName"));
			searchTaskInfo.setJobStatus(_ctx.integerValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobStatus"));
			searchTaskInfo.setDialException(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].DialException"));
			searchTaskInfo.setUserName(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].UserName"));
			searchTaskInfo.setCallDurationDisplay(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].CallDurationDisplay"));
			searchTaskInfo.setHasAnswered(_ctx.booleanValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].HasAnswered"));
			searchTaskInfo.setJobStatusName(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobStatusName"));
			searchTaskInfo.setCallDuration(_ctx.integerValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].CallDuration"));
			searchTaskInfo.setTaskCreateTime(_ctx.longValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskCreateTime"));
			searchTaskInfo.setJobStatusString(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobStatusString"));
			searchTaskInfo.setHasReachedEndOfFlow(_ctx.booleanValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].HasReachedEndOfFlow"));
			searchTaskInfo.setInstanceId(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].InstanceId"));
			searchTaskInfo.setHasHangUpByRejection(_ctx.booleanValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].HasHangUpByRejection"));
			searchTaskInfo.setTaskEndReason(_ctx.integerValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskEndReason"));
			searchTaskInfo.setJobGroupId(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobGroupId"));
			searchTaskInfo.setTaskStatus(_ctx.integerValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskStatus"));
			searchTaskInfo.setJobId(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].JobId"));
			searchTaskInfo.setRecordingDuration(_ctx.integerValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].RecordingDuration"));
			searchTaskInfo.setTaskId(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].TaskId"));
			searchTaskInfo.setDialExceptionOld(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].DialExceptionOld"));
			searchTaskInfo.setHasLastPlaybackCompleted(_ctx.booleanValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].HasLastPlaybackCompleted"));
			searchTaskInfo.setScriptName(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].ScriptName"));

			List<String> dialExceptionCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].DialExceptionCodes.Length"); j++) {
				dialExceptionCodes.add(_ctx.stringValue("SearchTaskResponse.SearchTaskInfoList["+ i +"].DialExceptionCodes["+ j +"]"));
			}
			searchTaskInfo.setDialExceptionCodes(dialExceptionCodes);

			searchTaskInfoList.add(searchTaskInfo);
		}
		searchTaskResponse.setSearchTaskInfoList(searchTaskInfoList);
	 
	 	return searchTaskResponse;
	}
}