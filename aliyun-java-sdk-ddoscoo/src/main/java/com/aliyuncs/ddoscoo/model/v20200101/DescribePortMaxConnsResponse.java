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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortMaxConnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortMaxConnsResponse extends AcsResponse {

	private String requestId;

	private List<PortMaxConnsItem> portMaxConns;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PortMaxConnsItem> getPortMaxConns() {
		return this.portMaxConns;
	}

	public void setPortMaxConns(List<PortMaxConnsItem> portMaxConns) {
		this.portMaxConns = portMaxConns;
	}

	public static class PortMaxConnsItem {

		private String port;

		private String ip;

		private Long cps;

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getCps() {
			return this.cps;
		}

		public void setCps(Long cps) {
			this.cps = cps;
		}
	}

	@Override
	public DescribePortMaxConnsResponse getInstance(UnmarshallerContext context) {
		return	DescribePortMaxConnsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
