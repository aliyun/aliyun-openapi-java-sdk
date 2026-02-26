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

package com.aliyuncs.ecs_workbench.transform.v20220220;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs_workbench.model.v20220220.ListInstanceRecordsResponse;
import com.aliyuncs.ecs_workbench.model.v20220220.ListInstanceRecordsResponse.Root;
import com.aliyuncs.ecs_workbench.model.v20220220.ListInstanceRecordsResponse.Root.RecordListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceRecordsResponseUnmarshaller {

	public static ListInstanceRecordsResponse unmarshall(ListInstanceRecordsResponse listInstanceRecordsResponse, UnmarshallerContext _ctx) {
		
		listInstanceRecordsResponse.setRequestId(_ctx.stringValue("ListInstanceRecordsResponse.RequestId"));
		listInstanceRecordsResponse.setSuccess(_ctx.booleanValue("ListInstanceRecordsResponse.Success"));
		listInstanceRecordsResponse.setCode(_ctx.stringValue("ListInstanceRecordsResponse.Code"));
		listInstanceRecordsResponse.setMessage(_ctx.stringValue("ListInstanceRecordsResponse.Message"));

		Root root = new Root();
		root.setTotalCount(_ctx.integerValue("ListInstanceRecordsResponse.Root.TotalCount"));

		List<RecordListItem> recordList = new ArrayList<RecordListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceRecordsResponse.Root.RecordList.Length"); i++) {
			RecordListItem recordListItem = new RecordListItem();
			recordListItem.setGmtCreate(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].GmtCreate"));
			recordListItem.setAccountId(_ctx.longValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].AccountId"));
			recordListItem.setInstanceId(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].InstanceId"));
			recordListItem.setTerminalSessionToken(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].TerminalSessionToken"));
			recordListItem.setRecordDurationMillis(_ctx.longValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].RecordDurationMillis"));
			recordListItem.setStatus(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].Status"));
			recordListItem.setExpireTime(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].ExpireTime"));
			recordListItem.setInstanceRecordUrl(_ctx.stringValue("ListInstanceRecordsResponse.Root.RecordList["+ i +"].InstanceRecordUrl"));

			recordList.add(recordListItem);
		}
		root.setRecordList(recordList);
		listInstanceRecordsResponse.setRoot(root);
	 
	 	return listInstanceRecordsResponse;
	}
}