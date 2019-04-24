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

package com.aliyuncs.xspace.model.v20170720;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xspace.transform.v20170720.QueryCustomerByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerByIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String nick;

		private String realName;

		private String email;

		private String phone;

		private String gender;

		private String photo;

		private String detail;

		private List<String> tags;

		private CustomizeFields customizeFields;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getRealName() {
			return this.realName;
		}

		public void setRealName(String realName) {
			this.realName = realName;
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

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhoto() {
			return this.photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public CustomizeFields getCustomizeFields() {
			return this.customizeFields;
		}

		public void setCustomizeFields(CustomizeFields customizeFields) {
			this.customizeFields = customizeFields;
		}

		public static class CustomizeFields {

			private String cid;

			private String abcUrl;

			private String distributionLevel;

			private String mainAccountUid;

			private String associatePerson;

			private String tag;

			private List<String> associatePersonList;

			public String getCid() {
				return this.cid;
			}

			public void setCid(String cid) {
				this.cid = cid;
			}

			public String getAbcUrl() {
				return this.abcUrl;
			}

			public void setAbcUrl(String abcUrl) {
				this.abcUrl = abcUrl;
			}

			public String getDistributionLevel() {
				return this.distributionLevel;
			}

			public void setDistributionLevel(String distributionLevel) {
				this.distributionLevel = distributionLevel;
			}

			public String getMainAccountUid() {
				return this.mainAccountUid;
			}

			public void setMainAccountUid(String mainAccountUid) {
				this.mainAccountUid = mainAccountUid;
			}

			public String getAssociatePerson() {
				return this.associatePerson;
			}

			public void setAssociatePerson(String associatePerson) {
				this.associatePerson = associatePerson;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<String> getAssociatePersonList() {
				return this.associatePersonList;
			}

			public void setAssociatePersonList(List<String> associatePersonList) {
				this.associatePersonList = associatePersonList;
			}
		}
	}

	@Override
	public QueryCustomerByIdResponse getInstance(UnmarshallerContext context) {
		return	QueryCustomerByIdResponseUnmarshaller.unmarshall(this, context);
	}
}
