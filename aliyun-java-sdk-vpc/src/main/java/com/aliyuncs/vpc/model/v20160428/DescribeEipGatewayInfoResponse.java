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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeEipGatewayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipGatewayInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<EipInfo> eipInfos;

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

	public List<EipInfo> getEipInfos() {
		return this.eipInfos;
	}

	public void setEipInfos(List<EipInfo> eipInfos) {
		this.eipInfos = eipInfos;
	}

	public static class EipInfo {

		private String ip;

		private String ipGw;

		private String ipMask;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getIpGw() {
			return this.ipGw;
		}

		public void setIpGw(String ipGw) {
			this.ipGw = ipGw;
		}

		public String getIpMask() {
			return this.ipMask;
		}

		public void setIpMask(String ipMask) {
			this.ipMask = ipMask;
		}
	}

	@Override
	public DescribeEipGatewayInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeEipGatewayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
