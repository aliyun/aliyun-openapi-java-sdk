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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataSourceRequest extends RpcAcsRequest<UpdateDataSourceResponse> {
	   

	private String updateModel;
	public UpdateDataSourceRequest() {
		super("quickbi-public", "2022-01-01", "UpdateDataSource", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getUpdateModel() {
		return this.updateModel;
	}

	public void setUpdateModel(String updateModel) {
		this.updateModel = updateModel;
		if(updateModel != null){
			putQueryParameter("UpdateModel", updateModel);
		}
	}

	@Override
	public Class<UpdateDataSourceResponse> getResponseClass() {
		return UpdateDataSourceResponse.class;
	}

}
