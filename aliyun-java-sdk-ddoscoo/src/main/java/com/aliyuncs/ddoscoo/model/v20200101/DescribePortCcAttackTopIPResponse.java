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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortCcAttackTopIPResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortCcAttackTopIPResponse extends AcsResponse {

	private String requestId;

	private List<TopIpItem> topIp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TopIpItem> getTopIp() {
		return this.topIp;
	}

	public void setTopIp(List<TopIpItem> topIp) {
		this.topIp = topIp;
	}

	public static class TopIpItem {

		private String srcIp;

		private Long pv;

		private String areaId;

		public String getSrcIp() {
			return this.srcIp;
		}

		public void setSrcIp(String srcIp) {
			this.srcIp = srcIp;
		}

		public Long getPv() {
			return this.pv;
		}

		public void setPv(Long pv) {
			this.pv = pv;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}
	}

	@Override
	public DescribePortCcAttackTopIPResponse getInstance(UnmarshallerContext context) {
		return	DescribePortCcAttackTopIPResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
