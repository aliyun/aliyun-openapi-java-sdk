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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.RemoveParticipantsResponse;
import com.aliyuncs.rtc.model.v20180111.RemoveParticipantsResponse.Participant;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveParticipantsResponseUnmarshaller {

	public static RemoveParticipantsResponse unmarshall(RemoveParticipantsResponse removeParticipantsResponse, UnmarshallerContext context) {
		
		removeParticipantsResponse.setRequestId(context.stringValue("RemoveParticipantsResponse.RequestId"));
		removeParticipantsResponse.setConferenceId(context.stringValue("RemoveParticipantsResponse.ConferenceId"));

		List<Participant> participants = new ArrayList<Participant>();
		for (int i = 0; i < context.lengthValue("RemoveParticipantsResponse.Participants.Length"); i++) {
			Participant participant = new Participant();
			participant.setId(context.stringValue("RemoveParticipantsResponse.Participants["+ i +"].Id"));
			participant.setCode(context.stringValue("RemoveParticipantsResponse.Participants["+ i +"].Code"));
			participant.setMessage(context.stringValue("RemoveParticipantsResponse.Participants["+ i +"].Message"));

			participants.add(participant);
		}
		removeParticipantsResponse.setParticipants(participants);
	 
	 	return removeParticipantsResponse;
	}
}