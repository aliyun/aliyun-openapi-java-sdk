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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingsResponse.Recordings;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingsResponse.Recordings.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingsResponseUnmarshaller {

	public static ListRecordingsResponse unmarshall(ListRecordingsResponse listRecordingsResponse, UnmarshallerContext context) {
		
		listRecordingsResponse.setRequestId(context.stringValue("ListRecordingsResponse.RequestId"));
		listRecordingsResponse.setSuccess(context.booleanValue("ListRecordingsResponse.Success"));
		listRecordingsResponse.setCode(context.stringValue("ListRecordingsResponse.Code"));
		listRecordingsResponse.setMessage(context.stringValue("ListRecordingsResponse.Message"));
		listRecordingsResponse.setHttpStatusCode(context.integerValue("ListRecordingsResponse.HttpStatusCode"));

		Recordings recordings = new Recordings();
		recordings.setTotalCount(context.integerValue("ListRecordingsResponse.Recordings.TotalCount"));
		recordings.setPageNumber(context.integerValue("ListRecordingsResponse.Recordings.PageNumber"));
		recordings.setPageSize(context.integerValue("ListRecordingsResponse.Recordings.PageSize"));

		List<Recording> list = new ArrayList<Recording>();
		for (int i = 0; i < context.lengthValue("ListRecordingsResponse.Recordings.List.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].ContactId"));
			recording.setContactType(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].ContactType"));
			recording.setAgentId(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].AgentId"));
			recording.setAgentName(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].AgentName"));
			recording.setCallingNumber(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].CallingNumber"));
			recording.setCalledNumber(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].CalledNumber"));
			recording.setStartTime(context.longValue("ListRecordingsResponse.Recordings.List["+ i +"].StartTime"));
			recording.setDuration(context.integerValue("ListRecordingsResponse.Recordings.List["+ i +"].Duration"));
			recording.setFileName(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FileName"));
			recording.setFilePath(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FilePath"));
			recording.setFileDescription(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].FileDescription"));
			recording.setChannel(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].Channel"));
			recording.setInstanceId(context.stringValue("ListRecordingsResponse.Recordings.List["+ i +"].InstanceId"));

			list.add(recording);
		}
		recordings.setList(list);
		listRecordingsResponse.setRecordings(recordings);
	 
	 	return listRecordingsResponse;
	}
}