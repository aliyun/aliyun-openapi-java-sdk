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

import com.aliyuncs.rtc.model.v20180111.UnmuteAudioAllResponse;
import com.aliyuncs.rtc.model.v20180111.UnmuteAudioAllResponse.Participant;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnmuteAudioAllResponseUnmarshaller {

	public static UnmuteAudioAllResponse unmarshall(UnmuteAudioAllResponse unmuteAudioAllResponse, UnmarshallerContext _ctx) {
		
		unmuteAudioAllResponse.setRequestId(_ctx.stringValue("UnmuteAudioAllResponse.RequestId"));
		unmuteAudioAllResponse.setConferenceId(_ctx.stringValue("UnmuteAudioAllResponse.ConferenceId"));

		List<Participant> participants = new ArrayList<Participant>();
		for (int i = 0; i < _ctx.lengthValue("UnmuteAudioAllResponse.Participants.Length"); i++) {
			Participant participant = new Participant();
			participant.setId(_ctx.stringValue("UnmuteAudioAllResponse.Participants["+ i +"].Id"));
			participant.setCode(_ctx.stringValue("UnmuteAudioAllResponse.Participants["+ i +"].Code"));
			participant.setMessage(_ctx.stringValue("UnmuteAudioAllResponse.Participants["+ i +"].Message"));

			participants.add(participant);
		}
		unmuteAudioAllResponse.setParticipants(participants);
	 
	 	return unmuteAudioAllResponse;
	}
}