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
import com.aliyuncs.ltl.transform.v20190510.DescribeMPCoSResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMPCoSResourceInfoResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long memberQuota;

		private Long usedMember;

		private Long phaseGroupQuota;

		private Long usedPhaseGroup;

		private List<PhaseQuotaInfo> phaseQuotaInfoList;

		public Long getMemberQuota() {
			return this.memberQuota;
		}

		public void setMemberQuota(Long memberQuota) {
			this.memberQuota = memberQuota;
		}

		public Long getUsedMember() {
			return this.usedMember;
		}

		public void setUsedMember(Long usedMember) {
			this.usedMember = usedMember;
		}

		public Long getPhaseGroupQuota() {
			return this.phaseGroupQuota;
		}

		public void setPhaseGroupQuota(Long phaseGroupQuota) {
			this.phaseGroupQuota = phaseGroupQuota;
		}

		public Long getUsedPhaseGroup() {
			return this.usedPhaseGroup;
		}

		public void setUsedPhaseGroup(Long usedPhaseGroup) {
			this.usedPhaseGroup = usedPhaseGroup;
		}

		public List<PhaseQuotaInfo> getPhaseQuotaInfoList() {
			return this.phaseQuotaInfoList;
		}

		public void setPhaseQuotaInfoList(List<PhaseQuotaInfo> phaseQuotaInfoList) {
			this.phaseQuotaInfoList = phaseQuotaInfoList;
		}

		public static class PhaseQuotaInfo {

			private String phaseGroupId;

			private String phaseGroupName;

			private Long phaseQuota;

			private Long usedPhase;

			public String getPhaseGroupId() {
				return this.phaseGroupId;
			}

			public void setPhaseGroupId(String phaseGroupId) {
				this.phaseGroupId = phaseGroupId;
			}

			public String getPhaseGroupName() {
				return this.phaseGroupName;
			}

			public void setPhaseGroupName(String phaseGroupName) {
				this.phaseGroupName = phaseGroupName;
			}

			public Long getPhaseQuota() {
				return this.phaseQuota;
			}

			public void setPhaseQuota(Long phaseQuota) {
				this.phaseQuota = phaseQuota;
			}

			public Long getUsedPhase() {
				return this.usedPhase;
			}

			public void setUsedPhase(Long usedPhase) {
				this.usedPhase = usedPhase;
			}
		}
	}

	@Override
	public DescribeMPCoSResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMPCoSResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
