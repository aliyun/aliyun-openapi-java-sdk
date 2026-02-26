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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.CreateProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private String title;

		private String type;

		private String status;

		private String method;

		private String createMode;

		private String intro;

		private String id;

		private String createTime;

		private String modifiedTime;

		private Source source;

		private Dataset dataset;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getCreateMode() {
			return this.createMode;
		}

		public void setCreateMode(String createMode) {
			this.createMode = createMode;
		}

		public String getIntro() {
			return this.intro;
		}

		public void setIntro(String intro) {
			this.intro = intro;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Dataset getDataset() {
			return this.dataset;
		}

		public void setDataset(Dataset dataset) {
			this.dataset = dataset;
		}

		public static class Source {

			private String ossKey;

			private Policy policy;

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}

			public Policy getPolicy() {
				return this.policy;
			}

			public void setPolicy(Policy policy) {
				this.policy = policy;
			}

			public static class Policy {

				private String accessId;

				private String policy;

				private String signature;

				private String dir;

				private String host;

				private String expire;

				public String getAccessId() {
					return this.accessId;
				}

				public void setAccessId(String accessId) {
					this.accessId = accessId;
				}

				public String getPolicy() {
					return this.policy;
				}

				public void setPolicy(String policy) {
					this.policy = policy;
				}

				public String getSignature() {
					return this.signature;
				}

				public void setSignature(String signature) {
					this.signature = signature;
				}

				public String getDir() {
					return this.dir;
				}

				public void setDir(String dir) {
					this.dir = dir;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getExpire() {
					return this.expire;
				}

				public void setExpire(String expire) {
					this.expire = expire;
				}
			}
		}

		public static class Dataset {

			private String ossKey;

			private String id;

			private String createTime;

			private String modifiedTime;

			private Policy1 policy1;

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Policy1 getPolicy1() {
				return this.policy1;
			}

			public void setPolicy1(Policy1 policy1) {
				this.policy1 = policy1;
			}

			public static class Policy1 {

				private String accessId;

				private String policy;

				private String signature;

				private String dir;

				private String host;

				private String expire;

				public String getAccessId() {
					return this.accessId;
				}

				public void setAccessId(String accessId) {
					this.accessId = accessId;
				}

				public String getPolicy() {
					return this.policy;
				}

				public void setPolicy(String policy) {
					this.policy = policy;
				}

				public String getSignature() {
					return this.signature;
				}

				public void setSignature(String signature) {
					this.signature = signature;
				}

				public String getDir() {
					return this.dir;
				}

				public void setDir(String dir) {
					this.dir = dir;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getExpire() {
					return this.expire;
				}

				public void setExpire(String expire) {
					this.expire = expire;
				}
			}
		}
	}

	@Override
	public CreateProjectResponse getInstance(UnmarshallerContext context) {
		return	CreateProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
