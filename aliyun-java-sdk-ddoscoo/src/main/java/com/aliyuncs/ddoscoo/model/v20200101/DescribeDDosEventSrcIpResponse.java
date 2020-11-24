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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosEventSrcIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosEventSrcIpResponse extends AcsResponse {

	private String requestId;

	private List<EventSrcIp> ips;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventSrcIp> getIps() {
		return this.ips;
	}

	public void setIps(List<EventSrcIp> ips) {
		this.ips = ips;
	}

	public static class EventSrcIp {

		private String srcIp;

		private String areaId;

		private String isp;

		public String getSrcIp() {
			return this.srcIp;
		}

		public void setSrcIp(String srcIp) {
			this.srcIp = srcIp;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}
	}

	@Override
	public DescribeDDosEventSrcIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosEventSrcIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
