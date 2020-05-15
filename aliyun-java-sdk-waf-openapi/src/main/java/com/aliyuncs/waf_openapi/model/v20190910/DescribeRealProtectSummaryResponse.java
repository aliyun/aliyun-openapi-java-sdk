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

package com.aliyuncs.waf_openapi.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeRealProtectSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRealProtectSummaryResponse extends AcsResponse {

	private String requestId;

	private List<Item> realProtectSummarys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getRealProtectSummarys() {
		return this.realProtectSummarys;
	}

	public void setRealProtectSummarys(List<Item> realProtectSummarys) {
		this.realProtectSummarys = realProtectSummarys;
	}

	public static class Item {

		private Long algorithmPv;

		private Long jsinjectPv;

		private Long intelligencePv;

		private Long sdkPv;

		private Long index;

		private Long qps;

		public Long getAlgorithmPv() {
			return this.algorithmPv;
		}

		public void setAlgorithmPv(Long algorithmPv) {
			this.algorithmPv = algorithmPv;
		}

		public Long getJsinjectPv() {
			return this.jsinjectPv;
		}

		public void setJsinjectPv(Long jsinjectPv) {
			this.jsinjectPv = jsinjectPv;
		}

		public Long getIntelligencePv() {
			return this.intelligencePv;
		}

		public void setIntelligencePv(Long intelligencePv) {
			this.intelligencePv = intelligencePv;
		}

		public Long getSdkPv() {
			return this.sdkPv;
		}

		public void setSdkPv(Long sdkPv) {
			this.sdkPv = sdkPv;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public Long getQps() {
			return this.qps;
		}

		public void setQps(Long qps) {
			this.qps = qps;
		}
	}

	@Override
	public DescribeRealProtectSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeRealProtectSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
