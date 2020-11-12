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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResizeDbfsRequest extends RpcAcsRequest<ResizeDbfsResponse> {
	   

	private String clientToken;

	private Integer newSizeG;

	private String fsId;
	public ResizeDbfsRequest() {
		super("DBFS", "2020-04-18", "ResizeDbfs");
		setMethod(MethodType.POST);
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

	public Integer getNewSizeG() {
		return this.newSizeG;
	}

	public void setNewSizeG(Integer newSizeG) {
		this.newSizeG = newSizeG;
		if(newSizeG != null){
			putQueryParameter("NewSizeG", newSizeG.toString());
		}
	}

	public String getFsId() {
		return this.fsId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
		if(fsId != null){
			putQueryParameter("FsId", fsId);
		}
	}

	@Override
	public Class<ResizeDbfsResponse> getResponseClass() {
		return ResizeDbfsResponse.class;
	}

}
