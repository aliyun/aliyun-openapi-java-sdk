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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLakeHouseSpaceRequest extends RpcAcsRequest<CreateLakeHouseSpaceResponse> {
	   

	private String spaceName;

	private String description;

	private Long tid;

	private String mode;

	private String dwDbType;

	private String prodDbId;

	private String devDbId;

	private String spaceConfig;
	public CreateLakeHouseSpaceRequest() {
		super("dms-enterprise", "2018-11-01", "CreateLakeHouseSpace", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpaceName() {
		return this.spaceName;
	}

	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
		if(spaceName != null){
			putQueryParameter("SpaceName", spaceName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getDwDbType() {
		return this.dwDbType;
	}

	public void setDwDbType(String dwDbType) {
		this.dwDbType = dwDbType;
		if(dwDbType != null){
			putQueryParameter("DwDbType", dwDbType);
		}
	}

	public String getProdDbId() {
		return this.prodDbId;
	}

	public void setProdDbId(String prodDbId) {
		this.prodDbId = prodDbId;
		if(prodDbId != null){
			putQueryParameter("ProdDbId", prodDbId);
		}
	}

	public String getDevDbId() {
		return this.devDbId;
	}

	public void setDevDbId(String devDbId) {
		this.devDbId = devDbId;
		if(devDbId != null){
			putQueryParameter("DevDbId", devDbId);
		}
	}

	public String getSpaceConfig() {
		return this.spaceConfig;
	}

	public void setSpaceConfig(String spaceConfig) {
		this.spaceConfig = spaceConfig;
		if(spaceConfig != null){
			putQueryParameter("SpaceConfig", spaceConfig);
		}
	}

	@Override
	public Class<CreateLakeHouseSpaceResponse> getResponseClass() {
		return CreateLakeHouseSpaceResponse.class;
	}

}
