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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListRecentCallDetailRecordsResponse;
import com.aliyuncs.ccc.model.v20200701.ListRecentCallDetailRecordsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListRecentCallDetailRecordsResponse.Data.CallDetailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentCallDetailRecordsResponseUnmarshaller {

	public static ListRecentCallDetailRecordsResponse unmarshall(ListRecentCallDetailRecordsResponse listRecentCallDetailRecordsResponse, UnmarshallerContext _ctx) {
		
		listRecentCallDetailRecordsResponse.setRequestId(_ctx.stringValue("ListRecentCallDetailRecordsResponse.RequestId"));
		listRecentCallDetailRecordsResponse.setCode(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Code"));
		listRecentCallDetailRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListRecentCallDetailRecordsResponse.HttpStatusCode"));
		listRecentCallDetailRecordsResponse.setMessage(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListRecentCallDetailRecordsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListRecentCallDetailRecordsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListRecentCallDetailRecordsResponse.Data.TotalCount"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListRecentCallDetailRecordsResponse.Data.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setAgentIds(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].AgentIds"));
			callDetailRecord.setCallDuration(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].CallDuration"));
			callDetailRecord.setCalledNumber(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].CalledNumber"));
			callDetailRecord.setCallingNumber(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].CallingNumber"));
			callDetailRecord.setContactDisposition(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].ContactDisposition"));
			callDetailRecord.setContactId(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].ContactId"));
			callDetailRecord.setContactType(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].ContactType"));
			callDetailRecord.setDuration(_ctx.longValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].Duration"));
			callDetailRecord.setInstanceId(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].InstanceId"));
			callDetailRecord.setSkillGroupIds(_ctx.stringValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].SkillGroupIds"));
			callDetailRecord.setStartTime(_ctx.longValue("ListRecentCallDetailRecordsResponse.Data.List["+ i +"].StartTime"));

			list.add(callDetailRecord);
		}
		data.setList(list);
		listRecentCallDetailRecordsResponse.setData(data);
	 
	 	return listRecentCallDetailRecordsResponse;
	}
}