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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetBodyPersonRequest extends RpcAcsRequest<GetBodyPersonResponse> {
	   

	private Long personId;

	private Long dbId;
	public GetBodyPersonRequest() {
		super("facebody", "2019-12-30", "GetBodyPerson", "facebody");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getDbId() {
		return this.dbId;
	}

	public void setDbId(Long dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId.toString());
		}
	}

	@Override
	public Class<GetBodyPersonResponse> getResponseClass() {
		return GetBodyPersonResponse.class;
	}

}
