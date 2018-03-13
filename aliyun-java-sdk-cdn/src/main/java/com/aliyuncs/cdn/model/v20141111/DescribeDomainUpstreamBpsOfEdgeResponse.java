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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainUpstreamBpsOfEdgeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainUpstreamBpsOfEdgeResponse extends AcsResponse {

	private String requestId;

	private List<DomainBpsModel> bpsDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainBpsModel> getBpsDatas() {
		return this.bpsDatas;
	}

	public void setBpsDatas(List<DomainBpsModel> bpsDatas) {
		this.bpsDatas = bpsDatas;
	}

	public static class DomainBpsModel {

		private String time;

		private Float bps;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}
	}

	@Override
	public DescribeDomainUpstreamBpsOfEdgeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainUpstreamBpsOfEdgeResponseUnmarshaller.unmarshall(this, context);
	}
}
