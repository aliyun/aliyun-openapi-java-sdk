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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingsByContactIdResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingsByContactIdResponse.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingsByContactIdResponseUnmarshaller {

	public static ListRecordingsByContactIdResponse unmarshall(ListRecordingsByContactIdResponse listRecordingsByContactIdResponse, UnmarshallerContext context) {
		
		listRecordingsByContactIdResponse.setRequestId(context.stringValue("ListRecordingsByContactIdResponse.RequestId"));
		listRecordingsByContactIdResponse.setSuccess(context.booleanValue("ListRecordingsByContactIdResponse.Success"));
		listRecordingsByContactIdResponse.setCode(context.stringValue("ListRecordingsByContactIdResponse.Code"));
		listRecordingsByContactIdResponse.setMessage(context.stringValue("ListRecordingsByContactIdResponse.Message"));
		listRecordingsByContactIdResponse.setHttpStatusCode(context.integerValue("ListRecordingsByContactIdResponse.HttpStatusCode"));

		List<Recording> recordings = new ArrayList<Recording>();
		for (int i = 0; i < context.lengthValue("ListRecordingsByContactIdResponse.Recordings.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].ContactId"));
			recording.setContactType(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].ContactType"));
			recording.setAgentId(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].AgentId"));
			recording.setAgentName(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].AgentName"));
			recording.setCallingNumber(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].CallingNumber"));
			recording.setCalledNumber(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].CalledNumber"));
			recording.setStartTime(context.longValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].StartTime"));
			recording.setDuration(context.integerValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].Duration"));
			recording.setFileName(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FileName"));
			recording.setFilePath(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FilePath"));
			recording.setFileDescription(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].FileDescription"));
			recording.setChannel(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].Channel"));
			recording.setInstanceId(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].InstanceId"));
			recording.setQualityCheckTid(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].QualityCheckTid"));
			recording.setQualityCheckTaskId(context.stringValue("ListRecordingsByContactIdResponse.Recordings["+ i +"].QualityCheckTaskId"));

			recordings.add(recording);
		}
		listRecordingsByContactIdResponse.setRecordings(recordings);
	 
	 	return listRecordingsByContactIdResponse;
	}
}