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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListRecordingsResponse;
import com.aliyuncs.ccc.model.v20170705.ListRecordingsResponse.Recordings;
import com.aliyuncs.ccc.model.v20170705.ListRecordingsResponse.Recordings.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingsResponseUnmarshaller {

	public static ListRecordingsResponse unmarshall(ListRecordingsResponse listRecordingsResponse, UnmarshallerContext _ctx) {
		
		listRecordingsResponse.setRequestId(_ctx.stringValue("ListRecordingsResponse.RequestId"));
		listRecordingsResponse.setSuccess(_ctx.booleanValue("ListRecordingsResponse.Success"));
		listRecordingsResponse.setCode(_ctx.stringValue("ListRecordingsResponse.Code"));
		listRecordingsResponse.setMessage(_ctx.stringValue("ListRecordingsResponse.Message"));
		listRecordingsResponse.setHttpStatusCode(_ctx.integerValue("ListRecordingsResponse.HttpStatusCode"));

		Recordings recordings = new Recordings();
		recordings.setTotalCount(_ctx.integerValue("ListRecordingsResponse.Recordings.TotalCount"));
		recordings.setPageNumber(_ctx.integerValue("ListRecordingsResponse.Recordings.PageNumber"));
		recordings.setPageSize(_ctx.integerValue("ListRecordingsResponse.Recordings.PageSize"));

		List<Recording> list = new ArrayList<Recording>();
		for (int i = 0; i < _ctx.lengthValue("ListRecordingsResponse.Recordings.List.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].ContactId"));
			recording.setContactType(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].ContactType"));
			recording.setAgentId(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].AgentId"));
			recording.setAgentName(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].AgentName"));
			recording.setCallingNumber(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].CallingNumber"));
			recording.setCalledNumber(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].CalledNumber"));
			recording.setStartTime(_ctx.longValue("ListRecordingsResponse.Recordings.List["+ i +"].StartTime"));
			recording.setDuration(_ctx.integerValue("ListRecordingsResponse.Recordings.List["+ i +"].Duration"));
			recording.setFileName(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FileName"));
			recording.setFilePath(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FilePath"));
			recording.setFileDescription(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FileDescription"));
			recording.setChannel(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].Channel"));
			recording.setInstanceId(_ctx.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].InstanceId"));

			list.add(recording);
		}
		recordings.setList(list);
		listRecordingsResponse.setRecordings(recordings);
	 
	 	return listRecordingsResponse;
	}
}