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
import com.aliyuncs.xingzhen.transform.v20191121.GetAppOrgItemByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppOrgItemByNameResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String requestId;

	private String message;

	private String _class;

	private Data data;

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

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String fullPath;

		private String modifiedTime;

		private String testOwner;

		private String description;

		private String technologyOwner;

		private String type;

		private String createTime;

		private Integer parentId;

		private String regionId;

		private Integer oneId;

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

		public String getTechnologyOwner() {
			return this.technologyOwner;
		}

		public void setTechnologyOwner(String technologyOwner) {
			this.technologyOwner = technologyOwner;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getOneId() {
			return this.oneId;
		}

		public void setOneId(Integer oneId) {
			this.oneId = oneId;
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

			private String modifiedTime;

			private Integer metaId;

			private String eagleEyeLogPaths;

			private String errorLogPaths;

			private String createTime;

			private String appLogPaths;

			private Boolean quanXiLogStatus;

			private String rLogPaths;

			private Integer id;

			private String _class;

			private List<AuthTesterListItem> authTesterList;

			private List<AuthPdListItem> authPdList;

			private List<AuthDevListItem> authDevList;

			private List<String> popeCodeList;

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Integer getMetaId() {
				return this.metaId;
			}

			public void setMetaId(Integer metaId) {
				this.metaId = metaId;
			}

			public String getEagleEyeLogPaths() {
				return this.eagleEyeLogPaths;
			}

			public void setEagleEyeLogPaths(String eagleEyeLogPaths) {
				this.eagleEyeLogPaths = eagleEyeLogPaths;
			}

			public String getErrorLogPaths() {
				return this.errorLogPaths;
			}

			public void setErrorLogPaths(String errorLogPaths) {
				this.errorLogPaths = errorLogPaths;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getAppLogPaths() {
				return this.appLogPaths;
			}

			public void setAppLogPaths(String appLogPaths) {
				this.appLogPaths = appLogPaths;
			}

			public Boolean getQuanXiLogStatus() {
				return this.quanXiLogStatus;
			}

			public void setQuanXiLogStatus(Boolean quanXiLogStatus) {
				this.quanXiLogStatus = quanXiLogStatus;
			}

			public String getRLogPaths() {
				return this.rLogPaths;
			}

			public void setRLogPaths(String rLogPaths) {
				this.rLogPaths = rLogPaths;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String get_Class() {
				return this._class;
			}

			public void set_Class(String _class) {
				this._class = _class;
			}

			public List<AuthTesterListItem> getAuthTesterList() {
				return this.authTesterList;
			}

			public void setAuthTesterList(List<AuthTesterListItem> authTesterList) {
				this.authTesterList = authTesterList;
			}

			public List<AuthPdListItem> getAuthPdList() {
				return this.authPdList;
			}

			public void setAuthPdList(List<AuthPdListItem> authPdList) {
				this.authPdList = authPdList;
			}

			public List<AuthDevListItem> getAuthDevList() {
				return this.authDevList;
			}

			public void setAuthDevList(List<AuthDevListItem> authDevList) {
				this.authDevList = authDevList;
			}

			public List<String> getPopeCodeList() {
				return this.popeCodeList;
			}

			public void setPopeCodeList(List<String> popeCodeList) {
				this.popeCodeList = popeCodeList;
			}

			public static class AuthTesterListItem {

				private String realName;

				private Integer deep;

				private String label;

				private String value;

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public Integer getDeep() {
					return this.deep;
				}

				public void setDeep(Integer deep) {
					this.deep = deep;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class AuthPdListItem {

				private String realName;

				private Integer deep;

				private String label;

				private String value;

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public Integer getDeep() {
					return this.deep;
				}

				public void setDeep(Integer deep) {
					this.deep = deep;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class AuthDevListItem {

				private String realName;

				private Integer deep;

				private String label;

				private String value;

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public Integer getDeep() {
					return this.deep;
				}

				public void setDeep(Integer deep) {
					this.deep = deep;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public GetAppOrgItemByNameResponse getInstance(UnmarshallerContext context) {
		return	GetAppOrgItemByNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
