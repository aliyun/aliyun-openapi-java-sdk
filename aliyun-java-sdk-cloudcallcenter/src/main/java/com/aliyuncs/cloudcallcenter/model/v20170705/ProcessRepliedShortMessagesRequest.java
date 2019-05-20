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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ProcessRepliedShortMessagesRequest extends RpcAcsRequest<ProcessRepliedShortMessagesResponse> {
	
	public ProcessRepliedShortMessagesRequest() {
		super("CloudCallCenter", "2017-07-05", "ProcessRepliedShortMessages", "CloudCallCenter", "innerAPI");
	}

	private List<SmsUpMessage> smsUpMessages;

	public List<SmsUpMessage> getSmsUpMessages() {
		return this.smsUpMessages;
	}

	public void setSmsUpMessages(List<SmsUpMessage> smsUpMessages) {
		this.smsUpMessages = smsUpMessages;	
		if (smsUpMessages != null) {
			for (int depth1 = 0; depth1 < smsUpMessages.size(); depth1++) {
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".signName" , smsUpMessages.get(depth1).getSignName());
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".DestCode" , smsUpMessages.get(depth1).getDestCode());
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".phoneNumber" , smsUpMessages.get(depth1).getPhoneNumber());
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".SendTime" , smsUpMessages.get(depth1).getSendTime());
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".SequenceId" , smsUpMessages.get(depth1).getSequenceId());
				putQueryParameter("SmsUpMessage." + (depth1 + 1) + ".Content" , smsUpMessages.get(depth1).getContent());
			}
		}	
	}

	public static class SmsUpMessage {

		private String signName;

		private String destCode;

		private String phoneNumber;

		private String sendTime;

		private String sequenceId;

		private String content;

		public String getSignName() {
			return this.signName;
		}

		public void setSignName(String signName) {
			this.signName = signName;
		}

		public String getDestCode() {
			return this.destCode;
		}

		public void setDestCode(String destCode) {
			this.destCode = destCode;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}

		public String getSequenceId() {
			return this.sequenceId;
		}

		public void setSequenceId(String sequenceId) {
			this.sequenceId = sequenceId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<ProcessRepliedShortMessagesResponse> getResponseClass() {
		return ProcessRepliedShortMessagesResponse.class;
	}

}
