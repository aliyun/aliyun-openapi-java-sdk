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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetFbOssConfigRequest extends RpcAcsRequest<GetFbOssConfigResponse> {
	   

	private Integer isDedicatedLine;

	private String region;

	private String dirPrefix;
	public GetFbOssConfigRequest() {
		super("wyota", "2021-04-20", "GetFbOssConfig");
		setMethod(MethodType.POST);
	}

	public Integer getIsDedicatedLine() {
		return this.isDedicatedLine;
	}

	public void setIsDedicatedLine(Integer isDedicatedLine) {
		this.isDedicatedLine = isDedicatedLine;
		if(isDedicatedLine != null){
			putBodyParameter("IsDedicatedLine", isDedicatedLine.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public String getDirPrefix() {
		return this.dirPrefix;
	}

	public void setDirPrefix(String dirPrefix) {
		this.dirPrefix = dirPrefix;
		if(dirPrefix != null){
			putBodyParameter("DirPrefix", dirPrefix);
		}
	}

	@Override
	public Class<GetFbOssConfigResponse> getResponseClass() {
		return GetFbOssConfigResponse.class;
	}

}
