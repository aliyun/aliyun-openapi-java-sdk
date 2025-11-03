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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeExecutePlaybooksRequest extends RpcAcsRequest<DescribeExecutePlaybooksResponse> {
	   

	private String playbookName;

	private String paramType;

	private String inputMode;

	private String uuid;

	private String lang;
	public DescribeExecutePlaybooksRequest() {
		super("sophonsoar", "2022-07-28", "DescribeExecutePlaybooks");
		setMethod(MethodType.GET);
	}

	public String getPlaybookName() {
		return this.playbookName;
	}

	public void setPlaybookName(String playbookName) {
		this.playbookName = playbookName;
		if(playbookName != null){
			putQueryParameter("PlaybookName", playbookName);
		}
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
		if(paramType != null){
			putQueryParameter("ParamType", paramType);
		}
	}

	public String getInputMode() {
		return this.inputMode;
	}

	public void setInputMode(String inputMode) {
		this.inputMode = inputMode;
		if(inputMode != null){
			putQueryParameter("InputMode", inputMode);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeExecutePlaybooksResponse> getResponseClass() {
		return DescribeExecutePlaybooksResponse.class;
	}

}
