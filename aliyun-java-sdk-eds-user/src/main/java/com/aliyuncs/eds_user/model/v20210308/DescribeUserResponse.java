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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserResponse extends AcsResponse {

	private String requestId;

	private User user;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class User {

		private String endUserId;

		private String email;

		private String phone;

		private String remark;

		private String wyId;

		private Integer status;

		private Map<Object,Object> extras;

		private Long gmtCreate;

		private String nickName;

		private List<Property> properties;

		private List<String> orgIds;

		private List<String> orgPaths;

		private ExternalInfo externalInfo;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getWyId() {
			return this.wyId;
		}

		public void setWyId(String wyId) {
			this.wyId = wyId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Map<Object,Object> getExtras() {
			return this.extras;
		}

		public void setExtras(Map<Object,Object> extras) {
			this.extras = extras;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public List<Property> getProperties() {
			return this.properties;
		}

		public void setProperties(List<Property> properties) {
			this.properties = properties;
		}

		public List<String> getOrgIds() {
			return this.orgIds;
		}

		public void setOrgIds(List<String> orgIds) {
			this.orgIds = orgIds;
		}

		public List<String> getOrgPaths() {
			return this.orgPaths;
		}

		public void setOrgPaths(List<String> orgPaths) {
			this.orgPaths = orgPaths;
		}

		public ExternalInfo getExternalInfo() {
			return this.externalInfo;
		}

		public void setExternalInfo(ExternalInfo externalInfo) {
			this.externalInfo = externalInfo;
		}

		public static class Property {

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

		public static class ExternalInfo {

			private String externalName;

			private String jobNumber;

			private String ssoType;

			private String externalId;

			public String getExternalName() {
				return this.externalName;
			}

			public void setExternalName(String externalName) {
				this.externalName = externalName;
			}

			public String getJobNumber() {
				return this.jobNumber;
			}

			public void setJobNumber(String jobNumber) {
				this.jobNumber = jobNumber;
			}

			public String getSsoType() {
				return this.ssoType;
			}

			public void setSsoType(String ssoType) {
				this.ssoType = ssoType;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}
		}
	}

	@Override
	public DescribeUserResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
