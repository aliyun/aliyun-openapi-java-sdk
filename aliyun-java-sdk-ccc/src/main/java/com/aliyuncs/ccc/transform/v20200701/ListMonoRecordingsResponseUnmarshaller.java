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

import com.aliyuncs.ccc.model.v20200701.ListMonoRecordingsResponse;
import com.aliyuncs.ccc.model.v20200701.ListMonoRecordingsResponse.RecordingDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMonoRecordingsResponseUnmarshaller {

	public static ListMonoRecordingsResponse unmarshall(ListMonoRecordingsResponse listMonoRecordingsResponse, UnmarshallerContext _ctx) {
		
		listMonoRecordingsResponse.setRequestId(_ctx.stringValue("ListMonoRecordingsResponse.RequestId"));
		listMonoRecordingsResponse.setCode(_ctx.stringValue("ListMonoRecordingsResponse.Code"));
		listMonoRecordingsResponse.setHttpStatusCode(_ctx.integerValue("ListMonoRecordingsResponse.HttpStatusCode"));
		listMonoRecordingsResponse.setMessage(_ctx.stringValue("ListMonoRecordingsResponse.Message"));

		List<RecordingDTO> data = new ArrayList<RecordingDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListMonoRecordingsResponse.Data.Length"); i++) {
			RecordingDTO recordingDTO = new RecordingDTO();
			recordingDTO.setFileName(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].FileName"));
			recordingDTO.setFileUrl(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].FileUrl"));
			recordingDTO.setAgentId(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].AgentId"));
			recordingDTO.setAgentName(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].AgentName"));
			recordingDTO.setStartTime(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].StartTime"));
			recordingDTO.setContactId(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].ContactId"));
			recordingDTO.setDuration(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].Duration"));
			recordingDTO.setSkillGroupId(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].SkillGroupId"));
			recordingDTO.setRamId(_ctx.stringValue("ListMonoRecordingsResponse.Data["+ i +"].RamId"));

			data.add(recordingDTO);
		}
		listMonoRecordingsResponse.setData(data);
	 
	 	return listMonoRecordingsResponse;
	}
}