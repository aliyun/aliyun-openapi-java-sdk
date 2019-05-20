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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListVnConversationDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVnConversationDetailsResponse extends AcsResponse {

	private String requestId;

	private List<ConversationDetail> conversationDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConversationDetail> getConversationDetails() {
		return this.conversationDetails;
	}

	public void setConversationDetails(List<ConversationDetail> conversationDetails) {
		this.conversationDetails = conversationDetails;
	}

	public static class ConversationDetail {

		private String conversationId;

		private String speaker;

		private String utterance;

		private String action;

		private String actionParams;

		private Long createTime;

		private String sequenceId;

		public String getConversationId() {
			return this.conversationId;
		}

		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}

		public String getSpeaker() {
			return this.speaker;
		}

		public void setSpeaker(String speaker) {
			this.speaker = speaker;
		}

		public String getUtterance() {
			return this.utterance;
		}

		public void setUtterance(String utterance) {
			this.utterance = utterance;
		}

		public String getBizAction() {
			return this.action;
		}

		public void setBizAction(String action) {
			this.action = action;
		}

		/**
		 * @deprecated use getBizAction instead of this.
		 */
		@Deprecated
		public String getAction() {
			return this.action;
		}

		/**
		 * @deprecated use setBizAction instead of this.
		 */
		@Deprecated
		public void setAction(String action) {
			this.action = action;
		}

		public String getActionParams() {
			return this.actionParams;
		}

		public void setActionParams(String actionParams) {
			this.actionParams = actionParams;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSequenceId() {
			return this.sequenceId;
		}

		public void setSequenceId(String sequenceId) {
			this.sequenceId = sequenceId;
		}
	}

	@Override
	public ListVnConversationDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListVnConversationDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
