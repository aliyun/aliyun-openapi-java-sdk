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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateChatDispatchRuleRequest extends RpcAcsRequest<UpdateChatDispatchRuleResponse> {
	   

	private String ruleName;

	private Integer timeout;

	private Integer heartTimeout;

	private String offlineNotice;

	private String noAgentNotice;

	private Integer level;

	private String skillGroupList;

	private String enableWorkTime;

	private String workTime;

	private String memberEnqueueNotice;

	private String memberDispatchNotice;

	private Boolean enableMemberDispatchNotice;

	private String memberSessionRemoveNotice;

	private String leaveNoticeMessage;

	private String memberLongSessionBeginTime;

	private Integer memberQueueHeartTimeout;

	private String agentCloseSessionNotice;

	private String memberCloseSessionNotice;

	private String agentSwitchQueueNotice;

	private String agentOfflineSwitchQueueNotice;

	private Long operatorId;
	public UpdateChatDispatchRuleRequest() {
		super("CCCXSpaceInner", "2019-12-27", "UpdateChatDispatchRule");
		setMethod(MethodType.POST);
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public Integer getHeartTimeout() {
		return this.heartTimeout;
	}

	public void setHeartTimeout(Integer heartTimeout) {
		this.heartTimeout = heartTimeout;
		if(heartTimeout != null){
			putBodyParameter("HeartTimeout", heartTimeout.toString());
		}
	}

	public String getOfflineNotice() {
		return this.offlineNotice;
	}

	public void setOfflineNotice(String offlineNotice) {
		this.offlineNotice = offlineNotice;
		if(offlineNotice != null){
			putBodyParameter("OfflineNotice", offlineNotice);
		}
	}

	public String getNoAgentNotice() {
		return this.noAgentNotice;
	}

	public void setNoAgentNotice(String noAgentNotice) {
		this.noAgentNotice = noAgentNotice;
		if(noAgentNotice != null){
			putBodyParameter("NoAgentNotice", noAgentNotice);
		}
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level.toString());
		}
	}

	public String getSkillGroupList() {
		return this.skillGroupList;
	}

	public void setSkillGroupList(String skillGroupList) {
		this.skillGroupList = skillGroupList;
		if(skillGroupList != null){
			putBodyParameter("SkillGroupList", skillGroupList);
		}
	}

	public String getEnableWorkTime() {
		return this.enableWorkTime;
	}

	public void setEnableWorkTime(String enableWorkTime) {
		this.enableWorkTime = enableWorkTime;
		if(enableWorkTime != null){
			putBodyParameter("EnableWorkTime", enableWorkTime);
		}
	}

	public String getWorkTime() {
		return this.workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
		if(workTime != null){
			putBodyParameter("WorkTime", workTime);
		}
	}

	public String getMemberEnqueueNotice() {
		return this.memberEnqueueNotice;
	}

	public void setMemberEnqueueNotice(String memberEnqueueNotice) {
		this.memberEnqueueNotice = memberEnqueueNotice;
		if(memberEnqueueNotice != null){
			putBodyParameter("MemberEnqueueNotice", memberEnqueueNotice);
		}
	}

	public String getMemberDispatchNotice() {
		return this.memberDispatchNotice;
	}

	public void setMemberDispatchNotice(String memberDispatchNotice) {
		this.memberDispatchNotice = memberDispatchNotice;
		if(memberDispatchNotice != null){
			putBodyParameter("MemberDispatchNotice", memberDispatchNotice);
		}
	}

	public Boolean getEnableMemberDispatchNotice() {
		return this.enableMemberDispatchNotice;
	}

	public void setEnableMemberDispatchNotice(Boolean enableMemberDispatchNotice) {
		this.enableMemberDispatchNotice = enableMemberDispatchNotice;
		if(enableMemberDispatchNotice != null){
			putBodyParameter("EnableMemberDispatchNotice", enableMemberDispatchNotice.toString());
		}
	}

	public String getMemberSessionRemoveNotice() {
		return this.memberSessionRemoveNotice;
	}

	public void setMemberSessionRemoveNotice(String memberSessionRemoveNotice) {
		this.memberSessionRemoveNotice = memberSessionRemoveNotice;
		if(memberSessionRemoveNotice != null){
			putBodyParameter("MemberSessionRemoveNotice", memberSessionRemoveNotice);
		}
	}

	public String getLeaveNoticeMessage() {
		return this.leaveNoticeMessage;
	}

	public void setLeaveNoticeMessage(String leaveNoticeMessage) {
		this.leaveNoticeMessage = leaveNoticeMessage;
		if(leaveNoticeMessage != null){
			putBodyParameter("LeaveNoticeMessage", leaveNoticeMessage);
		}
	}

	public String getMemberLongSessionBeginTime() {
		return this.memberLongSessionBeginTime;
	}

	public void setMemberLongSessionBeginTime(String memberLongSessionBeginTime) {
		this.memberLongSessionBeginTime = memberLongSessionBeginTime;
		if(memberLongSessionBeginTime != null){
			putBodyParameter("MemberLongSessionBeginTime", memberLongSessionBeginTime);
		}
	}

	public Integer getMemberQueueHeartTimeout() {
		return this.memberQueueHeartTimeout;
	}

	public void setMemberQueueHeartTimeout(Integer memberQueueHeartTimeout) {
		this.memberQueueHeartTimeout = memberQueueHeartTimeout;
		if(memberQueueHeartTimeout != null){
			putBodyParameter("MemberQueueHeartTimeout", memberQueueHeartTimeout.toString());
		}
	}

	public String getAgentCloseSessionNotice() {
		return this.agentCloseSessionNotice;
	}

	public void setAgentCloseSessionNotice(String agentCloseSessionNotice) {
		this.agentCloseSessionNotice = agentCloseSessionNotice;
		if(agentCloseSessionNotice != null){
			putBodyParameter("AgentCloseSessionNotice", agentCloseSessionNotice);
		}
	}

	public String getMemberCloseSessionNotice() {
		return this.memberCloseSessionNotice;
	}

	public void setMemberCloseSessionNotice(String memberCloseSessionNotice) {
		this.memberCloseSessionNotice = memberCloseSessionNotice;
		if(memberCloseSessionNotice != null){
			putBodyParameter("MemberCloseSessionNotice", memberCloseSessionNotice);
		}
	}

	public String getAgentSwitchQueueNotice() {
		return this.agentSwitchQueueNotice;
	}

	public void setAgentSwitchQueueNotice(String agentSwitchQueueNotice) {
		this.agentSwitchQueueNotice = agentSwitchQueueNotice;
		if(agentSwitchQueueNotice != null){
			putBodyParameter("AgentSwitchQueueNotice", agentSwitchQueueNotice);
		}
	}

	public String getAgentOfflineSwitchQueueNotice() {
		return this.agentOfflineSwitchQueueNotice;
	}

	public void setAgentOfflineSwitchQueueNotice(String agentOfflineSwitchQueueNotice) {
		this.agentOfflineSwitchQueueNotice = agentOfflineSwitchQueueNotice;
		if(agentOfflineSwitchQueueNotice != null){
			putBodyParameter("AgentOfflineSwitchQueueNotice", agentOfflineSwitchQueueNotice);
		}
	}

	public Long getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId.toString());
		}
	}

	@Override
	public Class<UpdateChatDispatchRuleResponse> getResponseClass() {
		return UpdateChatDispatchRuleResponse.class;
	}

}
