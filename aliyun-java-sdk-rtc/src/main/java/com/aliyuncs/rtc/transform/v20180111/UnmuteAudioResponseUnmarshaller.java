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

import com.aliyuncs.rtc.model.v20180111.UnmuteAudioResponse;
import com.aliyuncs.rtc.model.v20180111.UnmuteAudioResponse.Participant;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnmuteAudioResponseUnmarshaller {

	public static UnmuteAudioResponse unmarshall(UnmuteAudioResponse unmuteAudioResponse, UnmarshallerContext context) {
		
		unmuteAudioResponse.setRequestId(context.stringValue("UnmuteAudioResponse.RequestId"));
		unmuteAudioResponse.setConferenceId(context.stringValue("UnmuteAudioResponse.ConferenceId"));

		List<Participant> participants = new ArrayList<Participant>();
		for (int i = 0; i < context.lengthValue("UnmuteAudioResponse.Participants.Length"); i++) {
			Participant participant = new Participant();
			participant.setId(context.stringValue("UnmuteAudioResponse.Participants["+ i +"].Id"));
			participant.setCode(context.stringValue("UnmuteAudioResponse.Participants["+ i +"].Code"));
			participant.setMessage(context.stringValue("UnmuteAudioResponse.Participants["+ i +"].Message"));

			participants.add(participant);
		}
		unmuteAudioResponse.setParticipants(participants);
	 
	 	return unmuteAudioResponse;
	}
}