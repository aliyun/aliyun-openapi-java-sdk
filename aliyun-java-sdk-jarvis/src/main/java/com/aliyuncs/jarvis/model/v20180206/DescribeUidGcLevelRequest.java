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

package com.aliyuncs.jarvis.model.v20180206;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeUidGcLevelRequest extends RpcAcsRequest<DescribeUidGcLevelResponse> {
	
	public DescribeUidGcLevelRequest() {
		super("jarvis", "2018-02-06", "DescribeUidGcLevel");
	}

	private String sourceIp;

	private String lang;

	private String sourceCode;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
		if(sourceCode != null){
			putQueryParameter("SourceCode", sourceCode);
		}
	}

	@Override
	public Class<DescribeUidGcLevelResponse> getResponseClass() {
		return DescribeUidGcLevelResponse.class;
	}

}
