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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainDetailDataByLayerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainDetailDataByLayerResponse extends AcsResponse {

	private String requestId;

	private List<DataModule> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getData() {
		return this.data;
	}

	public void setData(List<DataModule> data) {
		this.data = data;
	}

	public static class DataModule {

		private String timeStamp;

		private String domainName;

		private Float bps;

		private Float qps;

		private Long traf;

		private Long acc;

		private Long ipv6Traf;

		private Float ipv6Bps;

		private Long ipv6Acc;

		private Float ipv6Qps;

		private String httpCode;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}

		public Float getQps() {
			return this.qps;
		}

		public void setQps(Float qps) {
			this.qps = qps;
		}

		public Long getTraf() {
			return this.traf;
		}

		public void setTraf(Long traf) {
			this.traf = traf;
		}

		public Long getAcc() {
			return this.acc;
		}

		public void setAcc(Long acc) {
			this.acc = acc;
		}

		public Long getIpv6Traf() {
			return this.ipv6Traf;
		}

		public void setIpv6Traf(Long ipv6Traf) {
			this.ipv6Traf = ipv6Traf;
		}

		public Float getIpv6Bps() {
			return this.ipv6Bps;
		}

		public void setIpv6Bps(Float ipv6Bps) {
			this.ipv6Bps = ipv6Bps;
		}

		public Long getIpv6Acc() {
			return this.ipv6Acc;
		}

		public void setIpv6Acc(Long ipv6Acc) {
			this.ipv6Acc = ipv6Acc;
		}

		public Float getIpv6Qps() {
			return this.ipv6Qps;
		}

		public void setIpv6Qps(Float ipv6Qps) {
			this.ipv6Qps = ipv6Qps;
		}

		public String getHttpCode() {
			return this.httpCode;
		}

		public void setHttpCode(String httpCode) {
			this.httpCode = httpCode;
		}
	}

	@Override
	public DescribeDomainDetailDataByLayerResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainDetailDataByLayerResponseUnmarshaller.unmarshall(this, context);
	}
}
