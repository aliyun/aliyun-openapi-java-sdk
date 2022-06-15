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

import com.aliyuncs.ccc.model.v20200701.ListMultiChannelRecordingsResponse;
import com.aliyuncs.ccc.model.v20200701.ListMultiChannelRecordingsResponse.RecordingDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiChannelRecordingsResponseUnmarshaller {

	public static ListMultiChannelRecordingsResponse unmarshall(ListMultiChannelRecordingsResponse listMultiChannelRecordingsResponse, UnmarshallerContext _ctx) {
		
		listMultiChannelRecordingsResponse.setRequestId(_ctx.stringValue("ListMultiChannelRecordingsResponse.RequestId"));
		listMultiChannelRecordingsResponse.setCode(_ctx.stringValue("ListMultiChannelRecordingsResponse.Code"));
		listMultiChannelRecordingsResponse.setHttpStatusCode(_ctx.integerValue("ListMultiChannelRecordingsResponse.HttpStatusCode"));
		listMultiChannelRecordingsResponse.setMessage(_ctx.stringValue("ListMultiChannelRecordingsResponse.Message"));

		List<RecordingDTO> data = new ArrayList<RecordingDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiChannelRecordingsResponse.Data.Length"); i++) {
			RecordingDTO recordingDTO = new RecordingDTO();
			recordingDTO.setFileName(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].FileName"));
			recordingDTO.setFileUrl(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].FileUrl"));
			recordingDTO.setAgentId(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].AgentId"));
			recordingDTO.setAgentName(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].AgentName"));
			recordingDTO.setStartTime(_ctx.longValue("ListMultiChannelRecordingsResponse.Data["+ i +"].StartTime"));
			recordingDTO.setContactId(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].ContactId"));
			recordingDTO.setDuration(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].Duration"));
			recordingDTO.setSkillGroupId(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].SkillGroupId"));
			recordingDTO.setRamId(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].RamId"));
			recordingDTO.setAgentChannelId(_ctx.stringValue("ListMultiChannelRecordingsResponse.Data["+ i +"].AgentChannelId"));

			data.add(recordingDTO);
		}
		listMultiChannelRecordingsResponse.setData(data);
	 
	 	return listMultiChannelRecordingsResponse;
	}
}