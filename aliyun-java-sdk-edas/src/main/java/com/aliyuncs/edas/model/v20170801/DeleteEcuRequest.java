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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteEcuRequest extends RoaAcsRequest<DeleteEcuResponse> {
	
	public DeleteEcuRequest() {
		super("Edas", "2017-08-01", "DeleteEcu");
		setUriPattern("/pop/v5/resource/delete_ecu");
		setMethod(MethodType.POST);
	}

	private String ecuId;

	public String getEcuId() {
		return this.ecuId;
	}

	public void setEcuId(String ecuId) {
		this.ecuId = ecuId;
		if(ecuId != null){
			putQueryParameter("EcuId", ecuId);
		}
	}

	@Override
	public Class<DeleteEcuResponse> getResponseClass() {
		return DeleteEcuResponse.class;
	}

}
