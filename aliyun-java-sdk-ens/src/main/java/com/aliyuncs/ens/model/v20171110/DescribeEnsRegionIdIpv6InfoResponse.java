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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsRegionIdIpv6InfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsRegionIdIpv6InfoResponse extends AcsResponse {

	private String requestId;

	private SupportIpv6Info supportIpv6Info;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SupportIpv6Info getSupportIpv6Info() {
		return this.supportIpv6Info;
	}

	public void setSupportIpv6Info(SupportIpv6Info supportIpv6Info) {
		this.supportIpv6Info = supportIpv6Info;
	}

	public static class SupportIpv6Info {

		private Boolean supportIpv6;

		private String ensRegionId;

		public Boolean getSupportIpv6() {
			return this.supportIpv6;
		}

		public void setSupportIpv6(Boolean supportIpv6) {
			this.supportIpv6 = supportIpv6;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	@Override
	public DescribeEnsRegionIdIpv6InfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsRegionIdIpv6InfoResponseUnmarshaller.unmarshall(this, context);
	}
}
