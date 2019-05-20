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

/**
 * @author auto create
 * @version 
 */
public class AppraiseRequest extends RpcAcsRequest<AppraiseResponse> {
	
	public AppraiseRequest() {
		super("CloudCallCenter", "2017-07-05", "Appraise", "CloudCallCenter", "innerAPI");
	}

	private String acid;

	private String pressKey;

	private String instanceId;

	private String skillGroupId;

	private String pressKeyMapping;

	private String source;

	private String type;

	private String ramId;

	public String getAcid() {
		return this.acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
		if(acid != null){
			putQueryParameter("Acid", acid);
		}
	}

	public String getPressKey() {
		return this.pressKey;
	}

	public void setPressKey(String pressKey) {
		this.pressKey = pressKey;
		if(pressKey != null){
			putQueryParameter("PressKey", pressKey);
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

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	public String getPressKeyMapping() {
		return this.pressKeyMapping;
	}

	public void setPressKeyMapping(String pressKeyMapping) {
		this.pressKeyMapping = pressKeyMapping;
		if(pressKeyMapping != null){
			putQueryParameter("PressKeyMapping", pressKeyMapping);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getRamId() {
		return this.ramId;
	}

	public void setRamId(String ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("RamId", ramId);
		}
	}

	@Override
	public Class<AppraiseResponse> getResponseClass() {
		return AppraiseResponse.class;
	}

}
