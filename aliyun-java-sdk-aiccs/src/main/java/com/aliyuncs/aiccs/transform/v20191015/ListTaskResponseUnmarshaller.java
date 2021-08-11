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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListTaskResponse;
import com.aliyuncs.aiccs.model.v20191015.ListTaskResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.ListTaskResponse.Data.RecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskResponseUnmarshaller {

	public static ListTaskResponse unmarshall(ListTaskResponse listTaskResponse, UnmarshallerContext _ctx) {
		
		listTaskResponse.setRequestId(_ctx.stringValue("ListTaskResponse.RequestId"));
		listTaskResponse.setCode(_ctx.stringValue("ListTaskResponse.Code"));
		listTaskResponse.setMessage(_ctx.stringValue("ListTaskResponse.Message"));
		listTaskResponse.setSuccess(_ctx.booleanValue("ListTaskResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("ListTaskResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("ListTaskResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListTaskResponse.Data.Total"));

		List<RecordItem> record = new ArrayList<RecordItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskResponse.Data.Record.Length"); i++) {
			RecordItem recordItem = new RecordItem();
			recordItem.setStatus(_ctx.stringValue("ListTaskResponse.Data.Record["+ i +"].Status"));
			recordItem.setGmtCreate(_ctx.stringValue("ListTaskResponse.Data.Record["+ i +"].GmtCreate"));
			recordItem.setTotalCount(_ctx.integerValue("ListTaskResponse.Data.Record["+ i +"].TotalCount"));
			recordItem.setFireTime(_ctx.stringValue("ListTaskResponse.Data.Record["+ i +"].FireTime"));
			recordItem.setTaskName(_ctx.stringValue("ListTaskResponse.Data.Record["+ i +"].TaskName"));
			recordItem.setRobotId(_ctx.longValue("ListTaskResponse.Data.Record["+ i +"].RobotId"));
			recordItem.setRobotName(_ctx.stringValue("ListTaskResponse.Data.Record["+ i +"].RobotName"));
			recordItem.setId(_ctx.longValue("ListTaskResponse.Data.Record["+ i +"].Id"));
			recordItem.setCompleteCount(_ctx.integerValue("ListTaskResponse.Data.Record["+ i +"].CompleteCount"));

			record.add(recordItem);
		}
		data.setRecord(record);
		listTaskResponse.setData(data);
	 
	 	return listTaskResponse;
	}
}