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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.RemoveParticipantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveParticipantsResponse extends AcsResponse {

	private String requestId;

	private String conferenceId;

	private List<Participant> participants;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getConferenceId() {
		return this.conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public List<Participant> getParticipants() {
		return this.participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public static class Participant {

		private String id;

		private String code;

		private String message;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public RemoveParticipantsResponse getInstance(UnmarshallerContext context) {
		return	RemoveParticipantsResponseUnmarshaller.unmarshall(this, context);
	}
}
