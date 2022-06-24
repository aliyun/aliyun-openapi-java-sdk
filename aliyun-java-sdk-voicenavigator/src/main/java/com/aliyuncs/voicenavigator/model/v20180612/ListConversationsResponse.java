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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.ListConversationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConversationsResponse extends AcsResponse {

	private Long totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Conversation> conversations;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Conversation> getConversations() {
		return this.conversations;
	}

	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}

	public static class Conversation {

		private Long endTime;

		private Boolean hasToAgent;

		private Long startTime;

		private String skillGroup;

		private String conversationId;

		private String callingNumber;

		private Integer endReason;

		private Integer rounds;

		private Boolean hasLastPlaybackCompleted;

		private Boolean sandBox;

		private String calledNumber;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Boolean getHasToAgent() {
			return this.hasToAgent;
		}

		public void setHasToAgent(Boolean hasToAgent) {
			this.hasToAgent = hasToAgent;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getSkillGroup() {
			return this.skillGroup;
		}

		public void setSkillGroup(String skillGroup) {
			this.skillGroup = skillGroup;
		}

		public String getConversationId() {
			return this.conversationId;
		}

		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}

		public String getCallingNumber() {
			return this.callingNumber;
		}

		public void setCallingNumber(String callingNumber) {
			this.callingNumber = callingNumber;
		}

		public Integer getEndReason() {
			return this.endReason;
		}

		public void setEndReason(Integer endReason) {
			this.endReason = endReason;
		}

		public Integer getRounds() {
			return this.rounds;
		}

		public void setRounds(Integer rounds) {
			this.rounds = rounds;
		}

		public Boolean getHasLastPlaybackCompleted() {
			return this.hasLastPlaybackCompleted;
		}

		public void setHasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
			this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
		}

		public Boolean getSandBox() {
			return this.sandBox;
		}

		public void setSandBox(Boolean sandBox) {
			this.sandBox = sandBox;
		}

		public String getCalledNumber() {
			return this.calledNumber;
		}

		public void setCalledNumber(String calledNumber) {
			this.calledNumber = calledNumber;
		}
	}

	@Override
	public ListConversationsResponse getInstance(UnmarshallerContext context) {
		return	ListConversationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
