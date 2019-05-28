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

import com.aliyuncs.ccc.model.v20170705.ListRecordingOfDualTrackResponse;
import com.aliyuncs.ccc.model.v20170705.ListRecordingOfDualTrackResponse.Recordings;
import com.aliyuncs.ccc.model.v20170705.ListRecordingOfDualTrackResponse.Recordings.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingOfDualTrackResponseUnmarshaller {

	public static ListRecordingOfDualTrackResponse unmarshall(ListRecordingOfDualTrackResponse listRecordingOfDualTrackResponse, UnmarshallerContext context) {
		
		listRecordingOfDualTrackResponse.setRequestId(context.stringValue("ListRecordingOfDualTrackResponse.RequestId"));
		listRecordingOfDualTrackResponse.setSuccess(context.booleanValue("ListRecordingOfDualTrackResponse.Success"));
		listRecordingOfDualTrackResponse.setCode(context.stringValue("ListRecordingOfDualTrackResponse.Code"));
		listRecordingOfDualTrackResponse.setMessage(context.stringValue("ListRecordingOfDualTrackResponse.Message"));
		listRecordingOfDualTrackResponse.setHttpStatusCode(context.integerValue("ListRecordingOfDualTrackResponse.HttpStatusCode"));

		Recordings recordings = new Recordings();
		recordings.setTotalCount(context.integerValue("ListRecordingOfDualTrackResponse.Recordings.TotalCount"));
		recordings.setPageNumber(context.integerValue("ListRecordingOfDualTrackResponse.Recordings.PageNumber"));
		recordings.setPageSize(context.integerValue("ListRecordingOfDualTrackResponse.Recordings.PageSize"));

		List<Recording> list = new ArrayList<Recording>();
		for (int i = 0; i < context.lengthValue("ListRecordingOfDualTrackResponse.Recordings.List.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].ContactId"));
			recording.setContactType(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].ContactType"));
			recording.setAgentId(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].AgentId"));
			recording.setAgentName(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].AgentName"));
			recording.setCallingNumber(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].CallingNumber"));
			recording.setCalledNumber(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].CalledNumber"));
			recording.setStartTime(context.longValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].StartTime"));
			recording.setDuration(context.integerValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].Duration"));
			recording.setFileName(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FileName"));
			recording.setFilePath(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FilePath"));
			recording.setFileDescription(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FileDescription"));
			recording.setChannel(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].Channel"));
			recording.setInstanceId(context.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].InstanceId"));

			list.add(recording);
		}
		recordings.setList(list);
		listRecordingOfDualTrackResponse.setRecordings(recordings);
	 
	 	return listRecordingOfDualTrackResponse;
	}
}