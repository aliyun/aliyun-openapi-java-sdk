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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.AddPrometheusGlobalViewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddPrometheusGlobalViewResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Boolean success;

		private String msg;

		private Info info;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Info getInfo() {
			return this.info;
		}

		public void setInfo(Info info) {
			this.info = info;
		}

		public static class Info {

			private String regionId;

			private String globalViewClusterId;

			private String failedInstances;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getGlobalViewClusterId() {
				return this.globalViewClusterId;
			}

			public void setGlobalViewClusterId(String globalViewClusterId) {
				this.globalViewClusterId = globalViewClusterId;
			}

			public String getFailedInstances() {
				return this.failedInstances;
			}

			public void setFailedInstances(String failedInstances) {
				this.failedInstances = failedInstances;
			}
		}
	}

	@Override
	public AddPrometheusGlobalViewResponse getInstance(UnmarshallerContext context) {
		return	AddPrometheusGlobalViewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
