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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeEcsPublicIpInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeEcsPublicIpInfoResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private EcsNatPublicIpModel ecsNatPublicIpModel;

	private VpcNatPublicIpModel vpcNatPublicIpModel;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public EcsNatPublicIpModel getEcsNatPublicIpModel() {
		return this.ecsNatPublicIpModel;
	}

	public void setEcsNatPublicIpModel(EcsNatPublicIpModel ecsNatPublicIpModel) {
		this.ecsNatPublicIpModel = ecsNatPublicIpModel;
	}

	public VpcNatPublicIpModel getVpcNatPublicIpModel() {
		return this.vpcNatPublicIpModel;
	}

	public void setVpcNatPublicIpModel(VpcNatPublicIpModel vpcNatPublicIpModel) {
		this.vpcNatPublicIpModel = vpcNatPublicIpModel;
	}

	public static class EcsNatPublicIpModel {

		private Integer ecsInstanceInternetRx;

		private String eniInstancePrimaryIp;

		private String ecsInstanceIpForms;

		private String ecsInstanceInternetIp;

		private String isp;

		private Integer ecsInstanceInternetTx;

		public Integer getEcsInstanceInternetRx() {
			return this.ecsInstanceInternetRx;
		}

		public void setEcsInstanceInternetRx(Integer ecsInstanceInternetRx) {
			this.ecsInstanceInternetRx = ecsInstanceInternetRx;
		}

		public String getEniInstancePrimaryIp() {
			return this.eniInstancePrimaryIp;
		}

		public void setEniInstancePrimaryIp(String eniInstancePrimaryIp) {
			this.eniInstancePrimaryIp = eniInstancePrimaryIp;
		}

		public String getEcsInstanceIpForms() {
			return this.ecsInstanceIpForms;
		}

		public void setEcsInstanceIpForms(String ecsInstanceIpForms) {
			this.ecsInstanceIpForms = ecsInstanceIpForms;
		}

		public String getEcsInstanceInternetIp() {
			return this.ecsInstanceInternetIp;
		}

		public void setEcsInstanceInternetIp(String ecsInstanceInternetIp) {
			this.ecsInstanceInternetIp = ecsInstanceInternetIp;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Integer getEcsInstanceInternetTx() {
			return this.ecsInstanceInternetTx;
		}

		public void setEcsInstanceInternetTx(Integer ecsInstanceInternetTx) {
			this.ecsInstanceInternetTx = ecsInstanceInternetTx;
		}
	}

	public static class VpcNatPublicIpModel {

		private String status;

		private Integer publicTxBps;

		private String ip;

		private Integer publicRxBps;

		private String ecsInstanceId;

		private String isp;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getPublicTxBps() {
			return this.publicTxBps;
		}

		public void setPublicTxBps(Integer publicTxBps) {
			this.publicTxBps = publicTxBps;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getPublicRxBps() {
			return this.publicRxBps;
		}

		public void setPublicRxBps(Integer publicRxBps) {
			this.publicRxBps = publicRxBps;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}
	}

	@Override
	public OpsDescribeEcsPublicIpInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeEcsPublicIpInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
