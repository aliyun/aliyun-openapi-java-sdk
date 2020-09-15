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

package com.aliyuncs.cloudauth_console.model.v20190219;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth_console.transform.v20190219.DescribeUserInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserInfoListResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<UserInfo> userInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<UserInfo> getUserInfoList() {
		return this.userInfoList;
	}

	public void setUserInfoList(List<UserInfo> userInfoList) {
		this.userInfoList = userInfoList;
	}

	public static class UserInfo {

		private Long birthday;

		private Long userGroupId;

		private String groupName;

		private String identifyingImage;

		private Integer sex;

		private Long id;

		private String userName;

		private String certificateNo;

		private String phoneNo;

		private String certificateType;

		public Long getBirthday() {
			return this.birthday;
		}

		public void setBirthday(Long birthday) {
			this.birthday = birthday;
		}

		public Long getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(Long userGroupId) {
			this.userGroupId = userGroupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getIdentifyingImage() {
			return this.identifyingImage;
		}

		public void setIdentifyingImage(String identifyingImage) {
			this.identifyingImage = identifyingImage;
		}

		public Integer getSex() {
			return this.sex;
		}

		public void setSex(Integer sex) {
			this.sex = sex;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getCertificateNo() {
			return this.certificateNo;
		}

		public void setCertificateNo(String certificateNo) {
			this.certificateNo = certificateNo;
		}

		public String getPhoneNo() {
			return this.phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getCertificateType() {
			return this.certificateType;
		}

		public void setCertificateType(String certificateType) {
			this.certificateType = certificateType;
		}
	}

	@Override
	public DescribeUserInfoListResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
