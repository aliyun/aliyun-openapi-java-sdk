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

import com.aliyuncs.rtc.model.v20180111.MuteAudioResponse;
import com.aliyuncs.rtc.model.v20180111.MuteAudioResponse.Participant;
import com.aliyuncs.transform.UnmarshallerContext;


public class MuteAudioResponseUnmarshaller {

	public static MuteAudioResponse unmarshall(MuteAudioResponse muteAudioResponse, UnmarshallerContext _ctx) {
		
		muteAudioResponse.setRequestId(_ctx.stringValue("MuteAudioResponse.RequestId"));
		muteAudioResponse.setConferenceId(_ctx.stringValue("MuteAudioResponse.ConferenceId"));

		List<Participant> participants = new ArrayList<Participant>();
		for (int i = 0; i < _ctx.lengthValue("MuteAudioResponse.Participants.Length"); i++) {
			Participant participant = new Participant();
			participant.setId(_ctx.stringValue("MuteAudioResponse.Participants["+ i +"].Id"));
			participant.setCode(_ctx.stringValue("MuteAudioResponse.Participants["+ i +"].Code"));
			participant.setMessage(_ctx.stringValue("MuteAudioResponse.Participants["+ i +"].Message"));

			participants.add(participant);
		}
		muteAudioResponse.setParticipants(participants);
	 
	 	return muteAudioResponse;
	}
}