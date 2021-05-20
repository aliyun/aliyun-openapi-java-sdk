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
public class UpdateDoubleVerificationGroupRequest extends RpcAcsRequest<UpdateDoubleVerificationGroupResponse> {
	   

	private DoubleVerificationGroup doubleVerificationGroup;

	private String id;
	public UpdateDoubleVerificationGroupRequest() {
		super("Vcs", "2020-05-15", "UpdateDoubleVerificationGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public DoubleVerificationGroup getDoubleVerificationGroup() {
		return this.doubleVerificationGroup;
	}

	public void setDoubleVerificationGroup(DoubleVerificationGroup doubleVerificationGroup) {
		this.doubleVerificationGroup = doubleVerificationGroup;	
		if (doubleVerificationGroup != null) {
			
				putBodyParameter("DoubleVerificationGroup.GroupId" , doubleVerificationGroup.getGroupId());
				putBodyParameter("DoubleVerificationGroup.MemberNumber" , doubleVerificationGroup.getMemberNumber());
				putBodyParameter("DoubleVerificationGroup.Interval" , doubleVerificationGroup.getInterval());
				if (doubleVerificationGroup.getPersonIdList() != null) {
					for (int depth1 = 0; depth1 < doubleVerificationGroup.getPersonIdList().size(); depth1++) {
						if (doubleVerificationGroup.getPersonIdList().get(depth1) != null) {
							
								putBodyParameter("DoubleVerificationGroup.PersonIdList." + (depth1 + 1) + ".PersonTableId" , doubleVerificationGroup.getPersonIdList().get(depth1).getPersonTableId());
								putBodyParameter("DoubleVerificationGroup.PersonIdList." + (depth1 + 1) + ".PersonId" , doubleVerificationGroup.getPersonIdList().get(depth1).getPersonId());
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

	public static class DoubleVerificationGroup {

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
	public Class<UpdateDoubleVerificationGroupResponse> getResponseClass() {
		return UpdateDoubleVerificationGroupResponse.class;
	}

}
