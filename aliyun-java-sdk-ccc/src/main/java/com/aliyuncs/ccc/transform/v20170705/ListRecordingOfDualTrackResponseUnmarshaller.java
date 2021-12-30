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

	public static ListRecordingOfDualTrackResponse unmarshall(ListRecordingOfDualTrackResponse listRecordingOfDualTrackResponse, UnmarshallerContext _ctx) {
		
		listRecordingOfDualTrackResponse.setRequestId(_ctx.stringValue("ListRecordingOfDualTrackResponse.RequestId"));
		listRecordingOfDualTrackResponse.setSuccess(_ctx.booleanValue("ListRecordingOfDualTrackResponse.Success"));
		listRecordingOfDualTrackResponse.setCode(_ctx.stringValue("ListRecordingOfDualTrackResponse.Code"));
		listRecordingOfDualTrackResponse.setMessage(_ctx.stringValue("ListRecordingOfDualTrackResponse.Message"));
		listRecordingOfDualTrackResponse.setHttpStatusCode(_ctx.integerValue("ListRecordingOfDualTrackResponse.HttpStatusCode"));

		Recordings recordings = new Recordings();
		recordings.setTotalCount(_ctx.integerValue("ListRecordingOfDualTrackResponse.Recordings.TotalCount"));
		recordings.setPageNumber(_ctx.integerValue("ListRecordingOfDualTrackResponse.Recordings.PageNumber"));
		recordings.setPageSize(_ctx.integerValue("ListRecordingOfDualTrackResponse.Recordings.PageSize"));

		List<Recording> list = new ArrayList<Recording>();
		for (int i = 0; i < _ctx.lengthValue("ListRecordingOfDualTrackResponse.Recordings.List.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].ContactId"));
			recording.setContactType(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].ContactType"));
			recording.setAgentId(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].AgentId"));
			recording.setAgentName(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].AgentName"));
			recording.setCallingNumber(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].CallingNumber"));
			recording.setCalledNumber(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].CalledNumber"));
			recording.setStartTime(_ctx.longValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].StartTime"));
			recording.setDuration(_ctx.integerValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].Duration"));
			recording.setFileName(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FileName"));
			recording.setFilePath(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FilePath"));
			recording.setFileDescription(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].FileDescription"));
			recording.setChannel(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].Channel"));
			recording.setInstanceId(_ctx.stringValue("ListRecordingOfDualTrackResponse.Recordings.List["+ i +"].InstanceId"));

			list.add(recording);
		}
		recordings.setList(list);
		listRecordingOfDualTrackResponse.setRecordings(recordings);
	 
	 	return listRecordingOfDualTrackResponse;
	}
}