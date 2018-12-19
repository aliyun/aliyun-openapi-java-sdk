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

package com.aliyuncs.edas.model.v20170801;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.UpdateJvmConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateJvmConfigurationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private JvmConfiguration jvmConfiguration;

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

	public JvmConfiguration getJvmConfiguration() {
		return this.jvmConfiguration;
	}

	public void setJvmConfiguration(JvmConfiguration jvmConfiguration) {
		this.jvmConfiguration = jvmConfiguration;
	}

	public static class JvmConfiguration {

		private String options;

		private Integer minHeapSize;

		private Integer maxPermSize;

		private Integer maxHeapSize;

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public Integer getMinHeapSize() {
			return this.minHeapSize;
		}

		public void setMinHeapSize(Integer minHeapSize) {
			this.minHeapSize = minHeapSize;
		}

		public Integer getMaxPermSize() {
			return this.maxPermSize;
		}

		public void setMaxPermSize(Integer maxPermSize) {
			this.maxPermSize = maxPermSize;
		}

		public Integer getMaxHeapSize() {
			return this.maxHeapSize;
		}

		public void setMaxHeapSize(Integer maxHeapSize) {
			this.maxHeapSize = maxHeapSize;
		}
	}

	@Override
	public UpdateJvmConfigurationResponse getInstance(UnmarshallerContext context) {
		return	UpdateJvmConfigurationResponseUnmarshaller.unmarshall(this, context);
	}
}
