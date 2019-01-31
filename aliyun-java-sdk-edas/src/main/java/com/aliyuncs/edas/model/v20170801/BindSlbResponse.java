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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.BindSlbResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindSlbResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String slbName;

		private String slbId;

		private String slbIp;

		private String extSlbName;

		private String extSlbId;

		private String extSlbIp;

		private Integer slbPort;

		private String vServerGroupId;

		private String extVServerGroupId;

		public String getSlbName() {
			return this.slbName;
		}

		public void setSlbName(String slbName) {
			this.slbName = slbName;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public String getExtSlbName() {
			return this.extSlbName;
		}

		public void setExtSlbName(String extSlbName) {
			this.extSlbName = extSlbName;
		}

		public String getExtSlbId() {
			return this.extSlbId;
		}

		public void setExtSlbId(String extSlbId) {
			this.extSlbId = extSlbId;
		}

		public String getExtSlbIp() {
			return this.extSlbIp;
		}

		public void setExtSlbIp(String extSlbIp) {
			this.extSlbIp = extSlbIp;
		}

		public Integer getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(Integer slbPort) {
			this.slbPort = slbPort;
		}

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getExtVServerGroupId() {
			return this.extVServerGroupId;
		}

		public void setExtVServerGroupId(String extVServerGroupId) {
			this.extVServerGroupId = extVServerGroupId;
		}
	}

	@Override
	public BindSlbResponse getInstance(UnmarshallerContext context) {
		return	BindSlbResponseUnmarshaller.unmarshall(this, context);
	}
}
