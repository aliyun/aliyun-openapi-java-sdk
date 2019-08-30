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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeHotDbListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHotDbListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String msg;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String randomCode;

		private List<InstanceDb> list;

		public String getRandomCode() {
			return this.randomCode;
		}

		public void setRandomCode(String randomCode) {
			this.randomCode = randomCode;
		}

		public List<InstanceDb> getList() {
			return this.list;
		}

		public void setList(List<InstanceDb> list) {
			this.list = list;
		}

		public static class InstanceDb {

			private String instanceName;

			private List<String> hotDbList;

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public List<String> getHotDbList() {
				return this.hotDbList;
			}

			public void setHotDbList(List<String> hotDbList) {
				this.hotDbList = hotDbList;
			}
		}
	}

	@Override
	public DescribeHotDbListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHotDbListResponseUnmarshaller.unmarshall(this, context);
	}
}
