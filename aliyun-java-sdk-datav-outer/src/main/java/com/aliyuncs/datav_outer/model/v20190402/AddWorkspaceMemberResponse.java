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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.AddWorkspaceMemberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddWorkspaceMemberResponse extends AcsResponse {

	private String requestId;

	private Member member;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public static class Member {

		private String type;

		private Long workspaceId;

		private String memberUid;

		private String expiredAt;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(Long workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getMemberUid() {
			return this.memberUid;
		}

		public void setMemberUid(String memberUid) {
			this.memberUid = memberUid;
		}

		public String getExpiredAt() {
			return this.expiredAt;
		}

		public void setExpiredAt(String expiredAt) {
			this.expiredAt = expiredAt;
		}
	}

	@Override
	public AddWorkspaceMemberResponse getInstance(UnmarshallerContext context) {
		return	AddWorkspaceMemberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
