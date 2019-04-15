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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerGroupDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerGroupDetailResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private Integer ecsCount;

		private String vpcInstanceId;

		private String groupDesc;

		private String regionNo;

		private String groupName;

		private String gmtCreated;

		private String groupNo;

		private String gmtModified;

		private List<Permission> permissions;

		private List<Tag> tags;

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getGroupDesc() {
			return this.groupDesc;
		}

		public void setGroupDesc(String groupDesc) {
			this.groupDesc = groupDesc;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGroupNo() {
			return this.groupNo;
		}

		public void setGroupNo(String groupNo) {
			this.groupNo = groupNo;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<Permission> getPermissions() {
			return this.permissions;
		}

		public void setPermissions(List<Permission> permissions) {
			this.permissions = permissions;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Permission {

			private String portRange;

			private String destCidrIp;

			private String direction;

			private String nic;

			private String sourceGroupOwnerUserAccount;

			private String policy;

			private String ipProtocal;

			private String destGroupNo;

			private String destGroupOwnerUserAccount;

			private String sourceGroupNo;

			private Integer level;

			private String sourceCidrIp;

			public String getPortRange() {
				return this.portRange;
			}

			public void setPortRange(String portRange) {
				this.portRange = portRange;
			}

			public String getDestCidrIp() {
				return this.destCidrIp;
			}

			public void setDestCidrIp(String destCidrIp) {
				this.destCidrIp = destCidrIp;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public String getNic() {
				return this.nic;
			}

			public void setNic(String nic) {
				this.nic = nic;
			}

			public String getSourceGroupOwnerUserAccount() {
				return this.sourceGroupOwnerUserAccount;
			}

			public void setSourceGroupOwnerUserAccount(String sourceGroupOwnerUserAccount) {
				this.sourceGroupOwnerUserAccount = sourceGroupOwnerUserAccount;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}

			public String getIpProtocal() {
				return this.ipProtocal;
			}

			public void setIpProtocal(String ipProtocal) {
				this.ipProtocal = ipProtocal;
			}

			public String getDestGroupNo() {
				return this.destGroupNo;
			}

			public void setDestGroupNo(String destGroupNo) {
				this.destGroupNo = destGroupNo;
			}

			public String getDestGroupOwnerUserAccount() {
				return this.destGroupOwnerUserAccount;
			}

			public void setDestGroupOwnerUserAccount(String destGroupOwnerUserAccount) {
				this.destGroupOwnerUserAccount = destGroupOwnerUserAccount;
			}

			public String getSourceGroupNo() {
				return this.sourceGroupNo;
			}

			public void setSourceGroupNo(String sourceGroupNo) {
				this.sourceGroupNo = sourceGroupNo;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public String getSourceCidrIp() {
				return this.sourceCidrIp;
			}

			public void setSourceCidrIp(String sourceCidrIp) {
				this.sourceCidrIp = sourceCidrIp;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public InnerGroupDetailResponse getInstance(UnmarshallerContext context) {
		return	InnerGroupDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
