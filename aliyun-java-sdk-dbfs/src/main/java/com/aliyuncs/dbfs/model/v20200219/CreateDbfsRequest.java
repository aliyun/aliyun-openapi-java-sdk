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

package com.aliyuncs.dbfs.model.v20200219;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDbfsRequest extends RpcAcsRequest<CreateDbfsResponse> {
	   

	private Integer sizeG;

	private String clientToken;

	private String fsName;

	private String zoneId;

	private String category;
	public CreateDbfsRequest() {
		super("DBFS", "2020-02-19", "CreateDbfs");
		setMethod(MethodType.POST);
	}

	public Integer getSizeG() {
		return this.sizeG;
	}

	public void setSizeG(Integer sizeG) {
		this.sizeG = sizeG;
		if(sizeG != null){
			putQueryParameter("SizeG", sizeG.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getFsName() {
		return this.fsName;
	}

	public void setFsName(String fsName) {
		this.fsName = fsName;
		if(fsName != null){
			putQueryParameter("FsName", fsName);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<CreateDbfsResponse> getResponseClass() {
		return CreateDbfsResponse.class;
	}

}
