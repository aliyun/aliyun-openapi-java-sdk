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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeUnderlayEniResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeUnderlayEniResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String instanceId;

		private String underlayEniId;

		private String ip;

		private String vlan;

		private String mask;

		private String gateway;

		private String mac;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUnderlayEniId() {
			return this.underlayEniId;
		}

		public void setUnderlayEniId(String underlayEniId) {
			this.underlayEniId = underlayEniId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getVlan() {
			return this.vlan;
		}

		public void setVlan(String vlan) {
			this.vlan = vlan;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public String getGateway() {
			return this.gateway;
		}

		public void setGateway(String gateway) {
			this.gateway = gateway;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}
	}

	@Override
	public OpsDescribeUnderlayEniResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeUnderlayEniResponseUnmarshaller.unmarshall(this, context);
	}
}
