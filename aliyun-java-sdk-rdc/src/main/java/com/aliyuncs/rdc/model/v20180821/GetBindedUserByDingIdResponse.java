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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rdc.transform.v20180821.GetBindedUserByDingIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBindedUserByDingIdResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nickName;

		private Boolean isValid;

		private String uuid;

		private String guid;

		private Integer id;

		private String mainAccountType;

		private AliyunUser aliyunUser;

		private DingtalkUser dingtalkUser;

		private UserProfileDTO userProfileDTO;

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public Boolean getIsValid() {
			return this.isValid;
		}

		public void setIsValid(Boolean isValid) {
			this.isValid = isValid;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getMainAccountType() {
			return this.mainAccountType;
		}

		public void setMainAccountType(String mainAccountType) {
			this.mainAccountType = mainAccountType;
		}

		public AliyunUser getAliyunUser() {
			return this.aliyunUser;
		}

		public void setAliyunUser(AliyunUser aliyunUser) {
			this.aliyunUser = aliyunUser;
		}

		public DingtalkUser getDingtalkUser() {
			return this.dingtalkUser;
		}

		public void setDingtalkUser(DingtalkUser dingtalkUser) {
			this.dingtalkUser = dingtalkUser;
		}

		public UserProfileDTO getUserProfileDTO() {
			return this.userProfileDTO;
		}

		public void setUserProfileDTO(UserProfileDTO userProfileDTO) {
			this.userProfileDTO = userProfileDTO;
		}

		public static class AliyunUser {

			private String kp;

			private String nickName;

			private String havanaId;

			private String realname;

			private String taobaoNick;

			private String aliyunId;

			private Integer accountStructure;

			private Integer id;

			private String email;

			public String getKp() {
				return this.kp;
			}

			public void setKp(String kp) {
				this.kp = kp;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getHavanaId() {
				return this.havanaId;
			}

			public void setHavanaId(String havanaId) {
				this.havanaId = havanaId;
			}

			public String getRealname() {
				return this.realname;
			}

			public void setRealname(String realname) {
				this.realname = realname;
			}

			public String getTaobaoNick() {
				return this.taobaoNick;
			}

			public void setTaobaoNick(String taobaoNick) {
				this.taobaoNick = taobaoNick;
			}

			public String getAliyunId() {
				return this.aliyunId;
			}

			public void setAliyunId(String aliyunId) {
				this.aliyunId = aliyunId;
			}

			public Integer getAccountStructure() {
				return this.accountStructure;
			}

			public void setAccountStructure(Integer accountStructure) {
				this.accountStructure = accountStructure;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		}

		public static class DingtalkUser {

			private String nick;

			private String codeUserName;

			private String unionId;

			private String dingId;

			private Integer dingtalkUserId;

			private Integer id;

			public String getNick() {
				return this.nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
			}

			public String getCodeUserName() {
				return this.codeUserName;
			}

			public void setCodeUserName(String codeUserName) {
				this.codeUserName = codeUserName;
			}

			public String getUnionId() {
				return this.unionId;
			}

			public void setUnionId(String unionId) {
				this.unionId = unionId;
			}

			public String getDingId() {
				return this.dingId;
			}

			public void setDingId(String dingId) {
				this.dingId = dingId;
			}

			public Integer getDingtalkUserId() {
				return this.dingtalkUserId;
			}

			public void setDingtalkUserId(Integer dingtalkUserId) {
				this.dingtalkUserId = dingtalkUserId;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
		}

		public static class UserProfileDTO {

			private String englishName;

			private String nickName;

			private String mobile;

			private String avatar;

			private Integer userId;

			private Long createdAt;

			private String name;

			private String dataSource;

			private String email;

			public String getEnglishName() {
				return this.englishName;
			}

			public void setEnglishName(String englishName) {
				this.englishName = englishName;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}

			public Integer getUserId() {
				return this.userId;
			}

			public void setUserId(Integer userId) {
				this.userId = userId;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDataSource() {
				return this.dataSource;
			}

			public void setDataSource(String dataSource) {
				this.dataSource = dataSource;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		}
	}

	@Override
	public GetBindedUserByDingIdResponse getInstance(UnmarshallerContext context) {
		return	GetBindedUserByDingIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
