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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSoftFileRequest extends RpcAcsRequest<GetSoftFileResponse> {
	   

	private String code;

	private String softwareVersion;

	private String type;

	private String softwareName;
	public GetSoftFileRequest() {
		super("Copyright", "2019-01-23", "GetSoftFile", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public String getSoftwareVersion() {
		return this.softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
		if(softwareVersion != null){
			putQueryParameter("SoftwareVersion", softwareVersion);
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

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
		if(softwareName != null){
			putQueryParameter("SoftwareName", softwareName);
		}
	}

	@Override
	public Class<GetSoftFileResponse> getResponseClass() {
		return GetSoftFileResponse.class;
	}

}
