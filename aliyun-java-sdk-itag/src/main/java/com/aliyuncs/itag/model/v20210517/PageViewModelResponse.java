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
import com.aliyuncs.itag.transform.v20210517.PageViewModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageViewModelResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private Long rt;

	private String host;

	private String errorCode;

	private Result result;

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

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public Long getRt() {
		return this.rt;
	}

	public void setRt(Long rt) {
		this.rt = rt;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
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

		private Integer pageNum;

		private Integer pageSize;

		private Long total;

		private Long totalPage;

		private List<ListItem> list;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String id;

			private String creatorId;

			private String creatorAccount;

			private String creatorName;

			private String tntInstId;

			private String name;

			private String type;

			private String source;

			private String remark;

			private Boolean async;

			private String gmtCreate;

			private String gmtModified;

			private String modelTag;

			private String udfType;

			private ModelConfig modelConfig;

			private ParamConfig paramConfig;

			private ModelExtendConfig modelExtendConfig;

			private Creator creator;

			private Modifier modifier;

			private DemoModelConfig demoModelConfig;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getCreatorAccount() {
				return this.creatorAccount;
			}

			public void setCreatorAccount(String creatorAccount) {
				this.creatorAccount = creatorAccount;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public String getTntInstId() {
				return this.tntInstId;
			}

			public void setTntInstId(String tntInstId) {
				this.tntInstId = tntInstId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public Boolean getAsync() {
				return this.async;
			}

			public void setAsync(Boolean async) {
				this.async = async;
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

			public String getModelTag() {
				return this.modelTag;
			}

			public void setModelTag(String modelTag) {
				this.modelTag = modelTag;
			}

			public String getUdfType() {
				return this.udfType;
			}

			public void setUdfType(String udfType) {
				this.udfType = udfType;
			}

			public ModelConfig getModelConfig() {
				return this.modelConfig;
			}

			public void setModelConfig(ModelConfig modelConfig) {
				this.modelConfig = modelConfig;
			}

			public ParamConfig getParamConfig() {
				return this.paramConfig;
			}

			public void setParamConfig(ParamConfig paramConfig) {
				this.paramConfig = paramConfig;
			}

			public ModelExtendConfig getModelExtendConfig() {
				return this.modelExtendConfig;
			}

			public void setModelExtendConfig(ModelExtendConfig modelExtendConfig) {
				this.modelExtendConfig = modelExtendConfig;
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

			public DemoModelConfig getDemoModelConfig() {
				return this.demoModelConfig;
			}

			public void setDemoModelConfig(DemoModelConfig demoModelConfig) {
				this.demoModelConfig = demoModelConfig;
			}

			public static class ModelConfig {

				private String host;

				private String requestType;

				private String contentType;

				private Long qpsLimit;

				private String serviceCode;

				private String appId;

				private String token;

				private String paiModelTarget;

				private String udfContent;

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getRequestType() {
					return this.requestType;
				}

				public void setRequestType(String requestType) {
					this.requestType = requestType;
				}

				public String getContentType() {
					return this.contentType;
				}

				public void setContentType(String contentType) {
					this.contentType = contentType;
				}

				public Long getQpsLimit() {
					return this.qpsLimit;
				}

				public void setQpsLimit(Long qpsLimit) {
					this.qpsLimit = qpsLimit;
				}

				public String getServiceCode() {
					return this.serviceCode;
				}

				public void setServiceCode(String serviceCode) {
					this.serviceCode = serviceCode;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getToken() {
					return this.token;
				}

				public void setToken(String token) {
					this.token = token;
				}

				public String getPaiModelTarget() {
					return this.paiModelTarget;
				}

				public void setPaiModelTarget(String paiModelTarget) {
					this.paiModelTarget = paiModelTarget;
				}

				public String getUdfContent() {
					return this.udfContent;
				}

				public void setUdfContent(String udfContent) {
					this.udfContent = udfContent;
				}
			}

			public static class ParamConfig {

				private List<PresetParamItem> presetParam;

				private List<PostParamItem> postParam;

				private List<ResponseParamItem> responseParam;

				public List<PresetParamItem> getPresetParam() {
					return this.presetParam;
				}

				public void setPresetParam(List<PresetParamItem> presetParam) {
					this.presetParam = presetParam;
				}

				public List<PostParamItem> getPostParam() {
					return this.postParam;
				}

				public void setPostParam(List<PostParamItem> postParam) {
					this.postParam = postParam;
				}

				public List<ResponseParamItem> getResponseParam() {
					return this.responseParam;
				}

				public void setResponseParam(List<ResponseParamItem> responseParam) {
					this.responseParam = responseParam;
				}

				public static class PresetParamItem {

					private String name;

					private String alias;

					private String type;

					private String codec;

					private String value;

					private String defaultValue;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getAlias() {
						return this.alias;
					}

					public void setAlias(String alias) {
						this.alias = alias;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getCodec() {
						return this.codec;
					}

					public void setCodec(String codec) {
						this.codec = codec;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}
				}

				public static class PostParamItem {

					private String name;

					private String alias;

					private String type;

					private String codec;

					private String value;

					private String defaultValue;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getAlias() {
						return this.alias;
					}

					public void setAlias(String alias) {
						this.alias = alias;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getCodec() {
						return this.codec;
					}

					public void setCodec(String codec) {
						this.codec = codec;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}
				}

				public static class ResponseParamItem {

					private String resultKey;

					private String resultPath;

					public String getResultKey() {
						return this.resultKey;
					}

					public void setResultKey(String resultKey) {
						this.resultKey = resultKey;
					}

					public String getResultPath() {
						return this.resultPath;
					}

					public void setResultPath(String resultPath) {
						this.resultPath = resultPath;
					}
				}
			}

			public static class ModelExtendConfig {

				private Long postUdfModelId;

				private Long preUdfModelId;

				private Map<Object,Object> extra;

				private List<Long> aggModelIds;

				private AsyncConfig asyncConfig;

				public Long getPostUdfModelId() {
					return this.postUdfModelId;
				}

				public void setPostUdfModelId(Long postUdfModelId) {
					this.postUdfModelId = postUdfModelId;
				}

				public Long getPreUdfModelId() {
					return this.preUdfModelId;
				}

				public void setPreUdfModelId(Long preUdfModelId) {
					this.preUdfModelId = preUdfModelId;
				}

				public Map<Object,Object> getExtra() {
					return this.extra;
				}

				public void setExtra(Map<Object,Object> extra) {
					this.extra = extra;
				}

				public List<Long> getAggModelIds() {
					return this.aggModelIds;
				}

				public void setAggModelIds(List<Long> aggModelIds) {
					this.aggModelIds = aggModelIds;
				}

				public AsyncConfig getAsyncConfig() {
					return this.asyncConfig;
				}

				public void setAsyncConfig(AsyncConfig asyncConfig) {
					this.asyncConfig = asyncConfig;
				}

				public static class AsyncConfig {

					private Long modelId;

					public Long getModelId() {
						return this.modelId;
					}

					public void setModelId(Long modelId) {
						this.modelId = modelId;
					}
				}
			}

			public static class Creator {

				private String userId;

				private String userName;

				private String accountType;

				private String accountNo;

				private String email;

				private String pamNo;

				private String supplierId;

				private String supplierName;

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

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPamNo() {
					return this.pamNo;
				}

				public void setPamNo(String pamNo) {
					this.pamNo = pamNo;
				}

				public String getSupplierId() {
					return this.supplierId;
				}

				public void setSupplierId(String supplierId) {
					this.supplierId = supplierId;
				}

				public String getSupplierName() {
					return this.supplierName;
				}

				public void setSupplierName(String supplierName) {
					this.supplierName = supplierName;
				}
			}

			public static class Modifier {

				private String userId;

				private String userName;

				private String accountType;

				private String accountNo;

				private String email;

				private String pamNo;

				private String supplierId;

				private String supplierName;

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

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPamNo() {
					return this.pamNo;
				}

				public void setPamNo(String pamNo) {
					this.pamNo = pamNo;
				}

				public String getSupplierId() {
					return this.supplierId;
				}

				public void setSupplierId(String supplierId) {
					this.supplierId = supplierId;
				}

				public String getSupplierName() {
					return this.supplierName;
				}

				public void setSupplierName(String supplierName) {
					this.supplierName = supplierName;
				}
			}

			public static class DemoModelConfig {

				private String host;

				private String requestType;

				private String contentType;

				private Long qpsLimit;

				private String serviceCode;

				private String appId;

				private String token;

				private String paiModelTarget;

				private String udfContent;

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getRequestType() {
					return this.requestType;
				}

				public void setRequestType(String requestType) {
					this.requestType = requestType;
				}

				public String getContentType() {
					return this.contentType;
				}

				public void setContentType(String contentType) {
					this.contentType = contentType;
				}

				public Long getQpsLimit() {
					return this.qpsLimit;
				}

				public void setQpsLimit(Long qpsLimit) {
					this.qpsLimit = qpsLimit;
				}

				public String getServiceCode() {
					return this.serviceCode;
				}

				public void setServiceCode(String serviceCode) {
					this.serviceCode = serviceCode;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getToken() {
					return this.token;
				}

				public void setToken(String token) {
					this.token = token;
				}

				public String getPaiModelTarget() {
					return this.paiModelTarget;
				}

				public void setPaiModelTarget(String paiModelTarget) {
					this.paiModelTarget = paiModelTarget;
				}

				public String getUdfContent() {
					return this.udfContent;
				}

				public void setUdfContent(String udfContent) {
					this.udfContent = udfContent;
				}
			}
		}
	}

	@Override
	public PageViewModelResponse getInstance(UnmarshallerContext context) {
		return	PageViewModelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
