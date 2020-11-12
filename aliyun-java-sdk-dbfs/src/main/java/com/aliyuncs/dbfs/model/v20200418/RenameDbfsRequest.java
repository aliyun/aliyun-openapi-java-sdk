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
public class RenameDbfsRequest extends RpcAcsRequest<RenameDbfsResponse> {
	   

	private String fsName;

	private String fsId;
	public RenameDbfsRequest() {
		super("DBFS", "2020-04-18", "RenameDbfs");
		setMethod(MethodType.POST);
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
	public Class<RenameDbfsResponse> getResponseClass() {
		return RenameDbfsResponse.class;
	}

}
