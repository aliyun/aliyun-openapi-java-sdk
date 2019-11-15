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
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainTopClientIpVisitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainTopClientIpVisitResponse extends AcsResponse {

	private String requestId;

	private List<ClientIp> clientIpList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClientIp> getClientIpList() {
		return this.clientIpList;
	}

	public void setClientIpList(List<ClientIp> clientIpList) {
		this.clientIpList = clientIpList;
	}

	public static class ClientIp {

		private Integer rank;

		private String clientIp;

		private Long traffic;

		private Long acc;

		public Integer getRank() {
			return this.rank;
		}

		public void setRank(Integer rank) {
			this.rank = rank;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public Long getTraffic() {
			return this.traffic;
		}

		public void setTraffic(Long traffic) {
			this.traffic = traffic;
		}

		public Long getAcc() {
			return this.acc;
		}

		public void setAcc(Long acc) {
			this.acc = acc;
		}
	}

	@Override
	public DescribeDomainTopClientIpVisitResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainTopClientIpVisitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
