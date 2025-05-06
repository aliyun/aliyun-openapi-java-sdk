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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetDatasetProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDatasetProxyResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String name;

		private String description;

		private String source;

		private String sourceBizId;

		private String proxyTarget;

		private Map<Object,Object> proxyConfigs;

		private Integer safetyLevel;

		private String sharedMode;

		private Long totalNum;

		private String tntInstId;

		private Integer status;

		private String runMsg;

		private String gmtCreate;

		private String gmtModified;

		private String sortKey;

		private List<String> fieldTypes;

		private Schema schema;

		private Creator creator;

		private Modifier modifier;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSourceBizId() {
			return this.sourceBizId;
		}

		public void setSourceBizId(String sourceBizId) {
			this.sourceBizId = sourceBizId;
		}

		public String getProxyTarget() {
			return this.proxyTarget;
		}

		public void setProxyTarget(String proxyTarget) {
			this.proxyTarget = proxyTarget;
		}

		public Map<Object,Object> getProxyConfigs() {
			return this.proxyConfigs;
		}

		public void setProxyConfigs(Map<Object,Object> proxyConfigs) {
			this.proxyConfigs = proxyConfigs;
		}

		public Integer getSafetyLevel() {
			return this.safetyLevel;
		}

		public void setSafetyLevel(Integer safetyLevel) {
			this.safetyLevel = safetyLevel;
		}

		public String getSharedMode() {
			return this.sharedMode;
		}

		public void setSharedMode(String sharedMode) {
			this.sharedMode = sharedMode;
		}

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public String getTntInstId() {
			return this.tntInstId;
		}

		public void setTntInstId(String tntInstId) {
			this.tntInstId = tntInstId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getRunMsg() {
			return this.runMsg;
		}

		public void setRunMsg(String runMsg) {
			this.runMsg = runMsg;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getSortKey() {
			return this.sortKey;
		}

		public void setSortKey(String sortKey) {
			this.sortKey = sortKey;
		}

		public List<String> getFieldTypes() {
			return this.fieldTypes;
		}

		public void setFieldTypes(List<String> fieldTypes) {
			this.fieldTypes = fieldTypes;
		}

		public Schema getSchema() {
			return this.schema;
		}

		public void setSchema(Schema schema) {
			this.schema = schema;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public static class Schema {

			private List<ITagDatasetField> fields;

			public List<ITagDatasetField> getFields() {
				return this.fields;
			}

			public void setFields(List<ITagDatasetField> fields) {
				this.fields = fields;
			}

			public static class ITagDatasetField {

				private String fieldName;

				private String type;

				private Boolean sensitive;

				private String classify;

				private Map<Object,Object> exif;

				private Boolean sortKey;

				private String fieldDesc;

				private String fieldClassify;

				private Map<Object,Object> alias;

				private String fieldType;

				public String getFieldName() {
					return this.fieldName;
				}

				public void setFieldName(String fieldName) {
					this.fieldName = fieldName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getSensitive() {
					return this.sensitive;
				}

				public void setSensitive(Boolean sensitive) {
					this.sensitive = sensitive;
				}

				public String getClassify() {
					return this.classify;
				}

				public void setClassify(String classify) {
					this.classify = classify;
				}

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
				}

				public Boolean getSortKey() {
					return this.sortKey;
				}

				public void setSortKey(Boolean sortKey) {
					this.sortKey = sortKey;
				}

				public String getFieldDesc() {
					return this.fieldDesc;
				}

				public void setFieldDesc(String fieldDesc) {
					this.fieldDesc = fieldDesc;
				}

				public String getFieldClassify() {
					return this.fieldClassify;
				}

				public void setFieldClassify(String fieldClassify) {
					this.fieldClassify = fieldClassify;
				}

				public Map<Object,Object> getAlias() {
					return this.alias;
				}

				public void setAlias(Map<Object,Object> alias) {
					this.alias = alias;
				}

				public String getFieldType() {
					return this.fieldType;
				}

				public void setFieldType(String fieldType) {
					this.fieldType = fieldType;
				}
			}
		}

		public static class Creator {

			private String userId;

			private String userName;

			private String accountType;

			private String accountNo;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}
		}

		public static class Modifier {

			private String userId;

			private String userName;

			private String accountType;

			private String accountNo;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}
		}
	}

	@Override
	public GetDatasetProxyResponse getInstance(UnmarshallerContext context) {
		return	GetDatasetProxyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
