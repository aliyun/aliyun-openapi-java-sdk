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

import com.aliyuncs.ccc.model.v20170705.ListRecordingsByContactIdResponse;
import com.aliyuncs.ccc.model.v20170705.ListRecordingsByContactIdResponse.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingsByContactIdResponseUnmarshaller {

	public static ListRecordingsByContactIdResponse unmarshall(ListRecordingsByContactIdResponse listRecordingsByContactIdResponse, UnmarshallerContext _ctx) {
		
		listRecordingsByContactIdResponse.setRequestId(_ctx.stringValue("ListRecordingsByContactIdResponse.RequestId"));
		listRecordingsByContactIdResponse.setSuccess(_ctx.booleanValue("ListRecordingsByContactIdResponse.Success"));
		listRecordingsByContactIdResponse.setCode(_ctx.stringValue("ListRecordingsByContactIdResponse.Code"));
		listRecordingsByContactIdResponse.setMessage(_ctx.stringValue("ListRecordingsByContactIdResponse.Message"));
		listRecordingsByContactIdResponse.setHttpStatusCode(_ctx.integerValue("ListRecordingsByContactIdResponse.HttpStatusCode"));

		List<Recording> recordings = new ArrayList<Recording>();
		for (int i = 0; i < _ctx.lengthValue("ListRecordingsByContactIdResponse.Recordings.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].ContactId"));
			recording.setContactType(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].ContactType"));
			recording.setAgentId(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].AgentId"));
			recording.setAgentName(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].AgentName"));
			recording.setCallingNumber(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].CallingNumber"));
			recording.setCalledNumber(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].CalledNumber"));
			recording.setStartTime(_ctx.longValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].StartTime"));
			recording.setDuration(_ctx.integerValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].Duration"));
			recording.setFileName(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FileName"));
			recording.setFilePath(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FilePath"));
			recording.setFileDescription(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FileDescription"));
			recording.setChannel(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].Channel"));
			recording.setInstanceId(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].InstanceId"));
			recording.setQualityCheckTid(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].QualityCheckTid"));
			recording.setQualityCheckTaskId(_ctx.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].QualityCheckTaskId"));

			recordings.add(recording);
		}
		listRecordingsByContactIdResponse.setRecordings(recordings);
	 
	 	return listRecordingsByContactIdResponse;
	}
}