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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteLabReservedRequest extends RpcAcsRequest<DeleteLabReservedResponse> {
	   

	private String reservedId;
	public DeleteLabReservedRequest() {
		super("EduCloud", "2022-02-02", "DeleteLabReserved");
		setMethod(MethodType.POST);
	}

	public String getReservedId() {
		return this.reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
		if(reservedId != null){
			putBodyParameter("ReservedId", reservedId);
		}
	}

	@Override
	public Class<DeleteLabReservedResponse> getResponseClass() {
		return DeleteLabReservedResponse.class;
	}

}
