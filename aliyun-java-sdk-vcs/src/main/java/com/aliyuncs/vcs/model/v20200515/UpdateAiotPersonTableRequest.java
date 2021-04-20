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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAiotPersonTableRequest extends RpcAcsRequest<UpdateAiotPersonTableResponse> {
	   

	private PersonTable personTable;

	private String id;
	public UpdateAiotPersonTableRequest() {
		super("Vcs", "2020-05-15", "UpdateAiotPersonTable");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public PersonTable getPersonTable() {
		return this.personTable;
	}

	public void setPersonTable(PersonTable personTable) {
		this.personTable = personTable;	
		if (personTable != null) {
			
				if (personTable.getVerificationModelList() != null) {
					for (int depth1 = 0; depth1 < personTable.getVerificationModelList().size(); depth1++) {
						putBodyParameter("PersonTable.VerificationModelList." + (depth1 + 1) , personTable.getVerificationModelList().get(depth1));
					}
				}
				putBodyParameter("PersonTable.PersonTableId" , personTable.getPersonTableId());
				putBodyParameter("PersonTable.Name" , personTable.getName());
				putBodyParameter("PersonTable.Type" , personTable.getType());
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public static class PersonTable {

		private List<Long> verificationModelList;

		private String personTableId;

		private String name;

		private Long type;

		public List<Long> getVerificationModelList() {
			return this.verificationModelList;
		}

		public void setVerificationModelList(List<Long> verificationModelList) {
			this.verificationModelList = verificationModelList;
		}

		public String getPersonTableId() {
			return this.personTableId;
		}

		public void setPersonTableId(String personTableId) {
			this.personTableId = personTableId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}
	}

	@Override
	public Class<UpdateAiotPersonTableResponse> getResponseClass() {
		return UpdateAiotPersonTableResponse.class;
	}

}
