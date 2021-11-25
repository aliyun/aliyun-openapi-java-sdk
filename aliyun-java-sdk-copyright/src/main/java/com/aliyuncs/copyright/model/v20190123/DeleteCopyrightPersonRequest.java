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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCopyrightPersonRequest extends RpcAcsRequest<DeleteCopyrightPersonResponse> {
	   

	private Long personId;
	public DeleteCopyrightPersonRequest() {
		super("Copyright", "2019-01-23", "DeleteCopyrightPerson");
		setMethod(MethodType.POST);
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
		if(personId != null){
			putQueryParameter("PersonId", personId.toString());
		}
	}

	@Override
	public Class<DeleteCopyrightPersonResponse> getResponseClass() {
		return DeleteCopyrightPersonResponse.class;
	}

}
