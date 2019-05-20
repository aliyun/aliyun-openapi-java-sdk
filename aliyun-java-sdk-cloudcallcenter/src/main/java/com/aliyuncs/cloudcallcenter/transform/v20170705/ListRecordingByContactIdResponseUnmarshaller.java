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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingByContactIdResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRecordingByContactIdResponse.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecordingByContactIdResponseUnmarshaller {

	public static ListRecordingByContactIdResponse unmarshall(ListRecordingByContactIdResponse listRecordingByContactIdResponse, UnmarshallerContext context) {
		
		listRecordingByContactIdResponse.setRequestId(context.stringValue("ListRecordingByContactIdResponse.RequestId"));
		listRecordingByContactIdResponse.setSuccess(context.booleanValue("ListRecordingByContactIdResponse.Success"));
		listRecordingByContactIdResponse.setCode(context.stringValue("ListRecordingByContactIdResponse.Code"));
		listRecordingByContactIdResponse.setMessage(context.stringValue("ListRecordingByContactIdResponse.Message"));
		listRecordingByContactIdResponse.setHttpStatusCode(context.integerValue("ListRecordingByContactIdResponse.HttpStatusCode"));

		List<Recording> recordings = new ArrayList<Recording>();
		for (int i = 0; i < context.lengthValue("ListRecordingByContactIdResponse.Recordings.Length"); i++) {
			Recording recording = new Recording();
			recording.setContactId(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].ContactId"));
			recording.setContactType(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].ContactType"));
			recording.setAgentId(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].AgentId"));
			recording.setAgentName(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].AgentName"));
			recording.setCallingNumber(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].CallingNumber"));
			recording.setCalledNumber(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].CalledNumber"));
			recording.setStartTime(context.longValue("ListRecordingByContactIdResponse.Recordings["+ i +"].StartTime"));
			recording.setDuration(context.integerValue("ListRecordingByContactIdResponse.Recordings["+ i +"].Duration"));
			recording.setFileName(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].FileName"));
			recording.setFilePath(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].FilePath"));
			recording.setFileDescription(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].FileDescription"));
			recording.setChannel(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].Channel"));
			recording.setInstanceId(context.stringValue("ListRecordingByContactIdResponse.Recordings["+ i +"].InstanceId"));

			recordings.add(recording);
		}
		listRecordingByContactIdResponse.setRecordings(recordings);
	 
	 	return listRecordingByContactIdResponse;
	}
}