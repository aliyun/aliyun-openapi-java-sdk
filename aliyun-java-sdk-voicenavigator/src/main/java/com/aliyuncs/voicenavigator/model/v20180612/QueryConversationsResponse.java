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
import com.aliyuncs.voicenavigator.transform.v20180612.QueryConversationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryConversationsResponse extends AcsResponse {

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

		private Integer effectiveAnswerCount;

		private Boolean transferredToAgent;

		private Long beginTime;

		private String skillGroupId;

		private String conversationId;

		private String callingNumber;

		private Integer userUtteranceCount;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getEffectiveAnswerCount() {
			return this.effectiveAnswerCount;
		}

		public void setEffectiveAnswerCount(Integer effectiveAnswerCount) {
			this.effectiveAnswerCount = effectiveAnswerCount;
		}

		public Boolean getTransferredToAgent() {
			return this.transferredToAgent;
		}

		public void setTransferredToAgent(Boolean transferredToAgent) {
			this.transferredToAgent = transferredToAgent;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
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

		public Integer getUserUtteranceCount() {
			return this.userUtteranceCount;
		}

		public void setUserUtteranceCount(Integer userUtteranceCount) {
			this.userUtteranceCount = userUtteranceCount;
		}
	}

	@Override
	public QueryConversationsResponse getInstance(UnmarshallerContext context) {
		return	QueryConversationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
