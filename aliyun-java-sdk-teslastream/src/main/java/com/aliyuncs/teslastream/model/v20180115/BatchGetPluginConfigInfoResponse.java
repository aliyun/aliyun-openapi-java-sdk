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

package com.aliyuncs.teslastream.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslastream.transform.v20180115.BatchGetPluginConfigInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetPluginConfigInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Plugin> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<Plugin> getData() {
		return this.data;
	}

	public void setData(List<Plugin> data) {
		this.data = data;
	}

	public static class Plugin {

		private String pluginProperties;

		private String pluginUniqKey;

		public String getPluginProperties() {
			return this.pluginProperties;
		}

		public void setPluginProperties(String pluginProperties) {
			this.pluginProperties = pluginProperties;
		}

		public String getPluginUniqKey() {
			return this.pluginUniqKey;
		}

		public void setPluginUniqKey(String pluginUniqKey) {
			this.pluginUniqKey = pluginUniqKey;
		}
	}

	@Override
	public BatchGetPluginConfigInfoResponse getInstance(UnmarshallerContext context) {
		return	BatchGetPluginConfigInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
