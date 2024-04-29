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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateRetcodeAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRetcodeAppResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String data;

	private Boolean success;

	private String message;

	private RetcodeAppDataBean retcodeAppDataBean;

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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RetcodeAppDataBean getRetcodeAppDataBean() {
		return this.retcodeAppDataBean;
	}

	public void setRetcodeAppDataBean(RetcodeAppDataBean retcodeAppDataBean) {
		this.retcodeAppDataBean = retcodeAppDataBean;
	}

	public static class RetcodeAppDataBean {

		private String pid;

		private Long appId;

		private String resourceGroupId;

		private List<TagsItem> tags;

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

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
	}

	@Override
	public CreateRetcodeAppResponse getInstance(UnmarshallerContext context) {
		return	CreateRetcodeAppResponseUnmarshaller.unmarshall(this, context);
	}
}
