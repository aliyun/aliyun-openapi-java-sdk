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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DebugPlaybookRequest extends RpcAcsRequest<DebugPlaybookResponse> {
	   

	private String taskflow;

	private String playbookUuid;

	private String record;

	private String lang;
	public DebugPlaybookRequest() {
		super("sophonsoar", "2022-07-28", "DebugPlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTaskflow() {
		return this.taskflow;
	}

	public void setTaskflow(String taskflow) {
		this.taskflow = taskflow;
		if(taskflow != null){
			putBodyParameter("Taskflow", taskflow);
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putBodyParameter("PlaybookUuid", playbookUuid);
		}
	}

	public String getRecord() {
		return this.record;
	}

	public void setRecord(String record) {
		this.record = record;
		if(record != null){
			putBodyParameter("Record", record);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putBodyParameter("Lang", lang);
		}
	}

	@Override
	public Class<DebugPlaybookResponse> getResponseClass() {
		return DebugPlaybookResponse.class;
	}

}
