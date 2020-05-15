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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeConversationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConversationResponse extends AcsResponse {

	private String requestId;

	private String callingNumber;

	private Long beginTime;

	private Long endTime;

	private Boolean transferredToAgent;

	private String skillGroupId;

	private Integer userUtteranceCount;

	private Integer effectiveAnswerCount;

	private String conversationId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Boolean getTransferredToAgent() {
		return this.transferredToAgent;
	}

	public void setTransferredToAgent(Boolean transferredToAgent) {
		this.transferredToAgent = transferredToAgent;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public Integer getUserUtteranceCount() {
		return this.userUtteranceCount;
	}

	public void setUserUtteranceCount(Integer userUtteranceCount) {
		this.userUtteranceCount = userUtteranceCount;
	}

	public Integer getEffectiveAnswerCount() {
		return this.effectiveAnswerCount;
	}

	public void setEffectiveAnswerCount(Integer effectiveAnswerCount) {
		this.effectiveAnswerCount = effectiveAnswerCount;
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	@Override
	public DescribeConversationResponse getInstance(UnmarshallerContext context) {
		return	DescribeConversationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
