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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class LaunchShortMessageAppraiseRequest extends RpcAcsRequest<LaunchShortMessageAppraiseResponse> {
	
	public LaunchShortMessageAppraiseRequest() {
		super("CCC", "2017-07-05", "LaunchShortMessageAppraise", "ccc");
	}

	private String acid;

	private String instanceId;

	private Integer contactType;

	private String phoneNumbers;

	private String skillGroupId;

	public String getAcid() {
		return this.acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
		if(acid != null){
			putQueryParameter("Acid", acid);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getContactType() {
		return this.contactType;
	}

	public void setContactType(Integer contactType) {
		this.contactType = contactType;
		if(contactType != null){
			putQueryParameter("ContactType", contactType.toString());
		}
	}

	public String getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		if(phoneNumbers != null){
			putQueryParameter("PhoneNumbers", phoneNumbers);
		}
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	@Override
	public Class<LaunchShortMessageAppraiseResponse> getResponseClass() {
		return LaunchShortMessageAppraiseResponse.class;
	}

}
