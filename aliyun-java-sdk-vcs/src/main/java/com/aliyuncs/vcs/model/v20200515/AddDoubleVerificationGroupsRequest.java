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
public class AddDoubleVerificationGroupsRequest extends RpcAcsRequest<AddDoubleVerificationGroupsResponse> {
	   

	private List<DoubleVerificationGroupList> doubleVerificationGroupList;

	private String id;
	public AddDoubleVerificationGroupsRequest() {
		super("Vcs", "2020-05-15", "AddDoubleVerificationGroups");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DoubleVerificationGroupList> getDoubleVerificationGroupList() {
		return this.doubleVerificationGroupList;
	}

	public void setDoubleVerificationGroupList(List<DoubleVerificationGroupList> doubleVerificationGroupList) {
		this.doubleVerificationGroupList = doubleVerificationGroupList;	
		if (doubleVerificationGroupList != null) {
			for (int depth1 = 0; depth1 < doubleVerificationGroupList.size(); depth1++) {
				if (doubleVerificationGroupList.get(depth1) != null) {
					
						putBodyParameter("DoubleVerificationGroupList." + (depth1 + 1) + ".GroupId" , doubleVerificationGroupList.get(depth1).getGroupId());
						putBodyParameter("DoubleVerificationGroupList." + (depth1 + 1) + ".MemberNumber" , doubleVerificationGroupList.get(depth1).getMemberNumber());
						putBodyParameter("DoubleVerificationGroupList." + (depth1 + 1) + ".Interval" , doubleVerificationGroupList.get(depth1).getInterval());
						if (doubleVerificationGroupList.get(depth1).getPersonIdList() != null) {
							for (int depth2 = 0; depth2 < doubleVerificationGroupList.get(depth1).getPersonIdList().size(); depth2++) {
								if (doubleVerificationGroupList.get(depth1).getPersonIdList().get(depth2) != null) {
									
										putBodyParameter("DoubleVerificationGroupList." + (depth1 + 1) + ".PersonIdList." + (depth2 + 1) + ".PersonTableId" , doubleVerificationGroupList.get(depth1).getPersonIdList().get(depth2).getPersonTableId());
										putBodyParameter("DoubleVerificationGroupList." + (depth1 + 1) + ".PersonIdList." + (depth2 + 1) + ".PersonId" , doubleVerificationGroupList.get(depth1).getPersonIdList().get(depth2).getPersonId());
								}
							}
						}
				}
			}
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

	public static class DoubleVerificationGroupList {

		private String groupId;

		private Long memberNumber;

		private Long interval;

		private List<PersonIdListItem> personIdList;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getMemberNumber() {
			return this.memberNumber;
		}

		public void setMemberNumber(Long memberNumber) {
			this.memberNumber = memberNumber;
		}

		public Long getInterval() {
			return this.interval;
		}

		public void setInterval(Long interval) {
			this.interval = interval;
		}

		public List<PersonIdListItem> getPersonIdList() {
			return this.personIdList;
		}

		public void setPersonIdList(List<PersonIdListItem> personIdList) {
			this.personIdList = personIdList;
		}

		public static class PersonIdListItem {

			private String personTableId;

			private String personId;

			public String getPersonTableId() {
				return this.personTableId;
			}

			public void setPersonTableId(String personTableId) {
				this.personTableId = personTableId;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}
		}
	}

	@Override
	public Class<AddDoubleVerificationGroupsResponse> getResponseClass() {
		return AddDoubleVerificationGroupsResponse.class;
	}

}
