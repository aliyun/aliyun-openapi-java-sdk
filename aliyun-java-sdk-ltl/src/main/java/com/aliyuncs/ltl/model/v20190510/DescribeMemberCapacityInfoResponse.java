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

package com.aliyuncs.ltl.model.v20190510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ltl.transform.v20190510.DescribeMemberCapacityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMemberCapacityInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MemberCapacityInfo> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MemberCapacityInfo> getData() {
		return this.data;
	}

	public void setData(List<MemberCapacityInfo> data) {
		this.data = data;
	}

	public static class MemberCapacityInfo {

		private String usedCapacity;

		private String memberId;

		private String memberName;

		private String usedCount;

		private String memberUid;

		public String getUsedCapacity() {
			return this.usedCapacity;
		}

		public void setUsedCapacity(String usedCapacity) {
			this.usedCapacity = usedCapacity;
		}

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getUsedCount() {
			return this.usedCount;
		}

		public void setUsedCount(String usedCount) {
			this.usedCount = usedCount;
		}

		public String getMemberUid() {
			return this.memberUid;
		}

		public void setMemberUid(String memberUid) {
			this.memberUid = memberUid;
		}
	}

	@Override
	public DescribeMemberCapacityInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMemberCapacityInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
