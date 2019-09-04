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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PubCreateDQCFollowerRequest extends RpcAcsRequest<PubCreateDQCFollowerResponse> {
	
	public PubCreateDQCFollowerRequest() {
		super("dataworks-enterprise-ultimate", "2019-04-24", "PubCreateDQCFollower");
		setMethod(MethodType.POST);
	}

	private Integer alarmMode;

	private String projectName;

	private String follower;

	private Long entityId;

	public Integer getAlarmMode() {
		return this.alarmMode;
	}

	public void setAlarmMode(Integer alarmMode) {
		this.alarmMode = alarmMode;
		if(alarmMode != null){
			putBodyParameter("AlarmMode", alarmMode.toString());
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getFollower() {
		return this.follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
		if(follower != null){
			putBodyParameter("Follower", follower);
		}
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	@Override
	public Class<PubCreateDQCFollowerResponse> getResponseClass() {
		return PubCreateDQCFollowerResponse.class;
	}

}
