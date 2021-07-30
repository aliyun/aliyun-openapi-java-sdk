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

package com.aliyuncs.xingzhen.model.v20191121;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xingzhen.transform.v20191121.GetAppOrgItemListByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppOrgItemListByIdResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String requestId;

	private String message;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String fullPath;

		private String modifiedTime;

		private String technologyOwner;

		private String testOwner;

		private String description;

		private String type;

		private String createTime;

		private Integer parentId;

		private Integer oneId;

		private String regionId;

		private String name;

		private Integer id;

		private String productOwner;

		private String _class;

		private Boolean keyApp;

		private ExtInfo extInfo;

		public String getFullPath() {
			return this.fullPath;
		}

		public void setFullPath(String fullPath) {
			this.fullPath = fullPath;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getTechnologyOwner() {
			return this.technologyOwner;
		}

		public void setTechnologyOwner(String technologyOwner) {
			this.technologyOwner = technologyOwner;
		}

		public String getTestOwner() {
			return this.testOwner;
		}

		public void setTestOwner(String testOwner) {
			this.testOwner = testOwner;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public Integer getOneId() {
			return this.oneId;
		}

		public void setOneId(Integer oneId) {
			this.oneId = oneId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getProductOwner() {
			return this.productOwner;
		}

		public void setProductOwner(String productOwner) {
			this.productOwner = productOwner;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public Boolean getKeyApp() {
			return this.keyApp;
		}

		public void setKeyApp(Boolean keyApp) {
			this.keyApp = keyApp;
		}

		public ExtInfo getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(ExtInfo extInfo) {
			this.extInfo = extInfo;
		}

		public static class ExtInfo {

			private Long metaId;

			private Long id;

			private List<String> popeCodeList;

			private AuthPdList authPdList;

			private AuthDevList authDevList;

			private AuthTesterList authTesterList;

			public Long getMetaId() {
				return this.metaId;
			}

			public void setMetaId(Long metaId) {
				this.metaId = metaId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<String> getPopeCodeList() {
				return this.popeCodeList;
			}

			public void setPopeCodeList(List<String> popeCodeList) {
				this.popeCodeList = popeCodeList;
			}

			public AuthPdList getAuthPdList() {
				return this.authPdList;
			}

			public void setAuthPdList(AuthPdList authPdList) {
				this.authPdList = authPdList;
			}

			public AuthDevList getAuthDevList() {
				return this.authDevList;
			}

			public void setAuthDevList(AuthDevList authDevList) {
				this.authDevList = authDevList;
			}

			public AuthTesterList getAuthTesterList() {
				return this.authTesterList;
			}

			public void setAuthTesterList(AuthTesterList authTesterList) {
				this.authTesterList = authTesterList;
			}

			public static class AuthPdList {

				private String id;

				private String name;

				private String nickName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}
			}

			public static class AuthDevList {

				private String id;

				private String name;

				private String nickName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}
			}

			public static class AuthTesterList {

				private String id;

				private String name;

				private String nickName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}
			}
		}
	}

	@Override
	public GetAppOrgItemListByIdResponse getInstance(UnmarshallerContext context) {
		return	GetAppOrgItemListByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
