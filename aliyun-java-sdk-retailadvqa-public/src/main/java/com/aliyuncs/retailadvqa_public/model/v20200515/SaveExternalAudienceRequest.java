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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveExternalAudienceRequest extends RpcAcsRequest<SaveExternalAudienceResponse> {
	   

	private String accessId;

	private String audienceName;

	private String mappingType;

	private String dataSourceId;

	private String audienceId;
	public SaveExternalAudienceRequest() {
		super("retailadvqa-public", "2020-05-15", "SaveExternalAudience");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getAudienceName() {
		return this.audienceName;
	}

	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
		if(audienceName != null){
			putQueryParameter("AudienceName", audienceName);
		}
	}

	public String getMappingType() {
		return this.mappingType;
	}

	public void setMappingType(String mappingType) {
		this.mappingType = mappingType;
		if(mappingType != null){
			putQueryParameter("MappingType", mappingType);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
		}
	}

	public String getAudienceId() {
		return this.audienceId;
	}

	public void setAudienceId(String audienceId) {
		this.audienceId = audienceId;
		if(audienceId != null){
			putQueryParameter("AudienceId", audienceId);
		}
	}

	@Override
	public Class<SaveExternalAudienceResponse> getResponseClass() {
		return SaveExternalAudienceResponse.class;
	}

}
