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

package com.aliyuncs.workbench_ide.model.v20200814;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadProduceRequest extends RpcAcsRequest<UploadProduceResponse> {
	   

	private String callFromWhere;

	private Long size;

	private String appId;

	private String name;
	public UploadProduceRequest() {
		super("Workbench-ide", "2020-08-14", "UploadProduce");
		setMethod(MethodType.POST);
	}

	public String getCallFromWhere() {
		return this.callFromWhere;
	}

	public void setCallFromWhere(String callFromWhere) {
		this.callFromWhere = callFromWhere;
		if(callFromWhere != null){
			putQueryParameter("CallFromWhere", callFromWhere);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UploadProduceResponse> getResponseClass() {
		return UploadProduceResponse.class;
	}

}
