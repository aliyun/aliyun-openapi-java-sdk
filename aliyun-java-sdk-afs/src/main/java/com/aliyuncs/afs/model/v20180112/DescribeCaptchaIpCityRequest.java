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

package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCaptchaIpCityRequest extends RpcAcsRequest<DescribeCaptchaIpCityResponse> {
	
	public DescribeCaptchaIpCityRequest() {
		super("afs", "2018-01-12", "DescribeCaptchaIpCity", "afs");
	}

	private String sourceIp;

	private String configName;

	private String refExtId;

	private String time;

	private String type;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getConfigName() {
		return this.configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
		if(configName != null){
			putQueryParameter("ConfigName", configName);
		}
	}

	public String getRefExtId() {
		return this.refExtId;
	}

	public void setRefExtId(String refExtId) {
		this.refExtId = refExtId;
		if(refExtId != null){
			putQueryParameter("RefExtId", refExtId);
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time);
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

	@Override
	public Class<DescribeCaptchaIpCityResponse> getResponseClass() {
		return DescribeCaptchaIpCityResponse.class;
	}

}
