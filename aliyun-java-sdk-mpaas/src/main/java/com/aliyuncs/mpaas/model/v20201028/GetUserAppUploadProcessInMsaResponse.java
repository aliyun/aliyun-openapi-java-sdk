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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.GetUserAppUploadProcessInMsaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserAppUploadProcessInMsaResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultContent resultContent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String code;

		private String message;

		private Boolean success;

		private Data data;

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

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private Long enhanceTaskId;

			private Long id;

			private Long progress;

			private Long status;

			private ApkInfo apkInfo;

			public Long getEnhanceTaskId() {
				return this.enhanceTaskId;
			}

			public void setEnhanceTaskId(Long enhanceTaskId) {
				this.enhanceTaskId = enhanceTaskId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getProgress() {
				return this.progress;
			}

			public void setProgress(Long progress) {
				this.progress = progress;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public ApkInfo getApkInfo() {
				return this.apkInfo;
			}

			public void setApkInfo(ApkInfo apkInfo) {
				this.apkInfo = apkInfo;
			}

			public static class ApkInfo {

				private String afterMd5;

				private Long afterSize;

				private String appCode;

				private String appPackage;

				private String beforeMd5;

				private Long beforeSize;

				private String classForest;

				private Long id;

				private String label;

				private Long progress;

				private Long status;

				private String taskType;

				private String versionCode;

				private String versionName;

				private List<EnhanceMappingItem> enhanceMapping;

				private List<String> enhancedClasses;

				private List<String> enhanceRules;

				public String getAfterMd5() {
					return this.afterMd5;
				}

				public void setAfterMd5(String afterMd5) {
					this.afterMd5 = afterMd5;
				}

				public Long getAfterSize() {
					return this.afterSize;
				}

				public void setAfterSize(Long afterSize) {
					this.afterSize = afterSize;
				}

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public String getAppPackage() {
					return this.appPackage;
				}

				public void setAppPackage(String appPackage) {
					this.appPackage = appPackage;
				}

				public String getBeforeMd5() {
					return this.beforeMd5;
				}

				public void setBeforeMd5(String beforeMd5) {
					this.beforeMd5 = beforeMd5;
				}

				public Long getBeforeSize() {
					return this.beforeSize;
				}

				public void setBeforeSize(Long beforeSize) {
					this.beforeSize = beforeSize;
				}

				public String getClassForest() {
					return this.classForest;
				}

				public void setClassForest(String classForest) {
					this.classForest = classForest;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Long getProgress() {
					return this.progress;
				}

				public void setProgress(Long progress) {
					this.progress = progress;
				}

				public Long getStatus() {
					return this.status;
				}

				public void setStatus(Long status) {
					this.status = status;
				}

				public String getTaskType() {
					return this.taskType;
				}

				public void setTaskType(String taskType) {
					this.taskType = taskType;
				}

				public String getVersionCode() {
					return this.versionCode;
				}

				public void setVersionCode(String versionCode) {
					this.versionCode = versionCode;
				}

				public String getVersionName() {
					return this.versionName;
				}

				public void setVersionName(String versionName) {
					this.versionName = versionName;
				}

				public List<EnhanceMappingItem> getEnhanceMapping() {
					return this.enhanceMapping;
				}

				public void setEnhanceMapping(List<EnhanceMappingItem> enhanceMapping) {
					this.enhanceMapping = enhanceMapping;
				}

				public List<String> getEnhancedClasses() {
					return this.enhancedClasses;
				}

				public void setEnhancedClasses(List<String> enhancedClasses) {
					this.enhancedClasses = enhancedClasses;
				}

				public List<String> getEnhanceRules() {
					return this.enhanceRules;
				}

				public void setEnhanceRules(List<String> enhanceRules) {
					this.enhanceRules = enhanceRules;
				}

				public static class EnhanceMappingItem {

					private String info;

					private String reason;

					private String type;

					public String getInfo() {
						return this.info;
					}

					public void setInfo(String info) {
						this.info = info;
					}

					public String getReason() {
						return this.reason;
					}

					public void setReason(String reason) {
						this.reason = reason;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}
				}
			}
		}
	}

	@Override
	public GetUserAppUploadProcessInMsaResponse getInstance(UnmarshallerContext context) {
		return	GetUserAppUploadProcessInMsaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
