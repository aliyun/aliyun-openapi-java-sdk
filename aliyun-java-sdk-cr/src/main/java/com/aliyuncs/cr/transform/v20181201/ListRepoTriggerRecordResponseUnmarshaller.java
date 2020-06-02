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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoTriggerRecordResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoTriggerRecordResponse.RepoTriggerRecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoTriggerRecordResponseUnmarshaller {

	public static ListRepoTriggerRecordResponse unmarshall(ListRepoTriggerRecordResponse listRepoTriggerRecordResponse, UnmarshallerContext _ctx) {
		
		listRepoTriggerRecordResponse.setRequestId(_ctx.stringValue("ListRepoTriggerRecordResponse.RequestId"));
		listRepoTriggerRecordResponse.setIsSuccess(_ctx.booleanValue("ListRepoTriggerRecordResponse.IsSuccess"));
		listRepoTriggerRecordResponse.setCode(_ctx.stringValue("ListRepoTriggerRecordResponse.Code"));

		List<RepoTriggerRecordsItem> repoTriggerRecords = new ArrayList<RepoTriggerRecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoTriggerRecordResponse.RepoTriggerRecords.Length"); i++) {
			RepoTriggerRecordsItem repoTriggerRecordsItem = new RepoTriggerRecordsItem();
			repoTriggerRecordsItem.setTriggerId(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerId"));
			repoTriggerRecordsItem.setTriggerName(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerName"));
			repoTriggerRecordsItem.setTriggerUrl(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerUrl"));
			repoTriggerRecordsItem.setRepoEvent(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].RepoEvent"));
			repoTriggerRecordsItem.setTriggerType(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerType"));
			repoTriggerRecordsItem.setTriggerTag(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerTag"));
			repoTriggerRecordsItem.setTriggerLogId(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].TriggerLogId"));
			repoTriggerRecordsItem.setStatusCode(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].StatusCode"));
			repoTriggerRecordsItem.setRequestTime(_ctx.longValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].RequestTime"));
			repoTriggerRecordsItem.setRequestHeaders(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].RequestHeaders"));
			repoTriggerRecordsItem.setRequestBody(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].RequestBody"));
			repoTriggerRecordsItem.setResponseHeaders(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].ResponseHeaders"));
			repoTriggerRecordsItem.setResponseBody(_ctx.stringValue("ListRepoTriggerRecordResponse.RepoTriggerRecords["+ i +"].ResponseBody"));

			repoTriggerRecords.add(repoTriggerRecordsItem);
		}
		listRepoTriggerRecordResponse.setRepoTriggerRecords(repoTriggerRecords);
	 
	 	return listRepoTriggerRecordResponse;
	}
}