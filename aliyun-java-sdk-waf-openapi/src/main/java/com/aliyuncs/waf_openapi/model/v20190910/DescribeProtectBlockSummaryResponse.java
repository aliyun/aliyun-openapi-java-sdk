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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeProtectBlockSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProtectBlockSummaryResponse extends AcsResponse {

	private String requestId;

	private List<Item> protectBlockSummarys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getProtectBlockSummarys() {
		return this.protectBlockSummarys;
	}

	public void setProtectBlockSummarys(List<Item> protectBlockSummarys) {
		this.protectBlockSummarys = protectBlockSummarys;
	}

	public static class Item {

		private Long blockPv;

		private Long index;

		private Long allPv;

		public Long getBlockPv() {
			return this.blockPv;
		}

		public void setBlockPv(Long blockPv) {
			this.blockPv = blockPv;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public Long getAllPv() {
			return this.allPv;
		}

		public void setAllPv(Long allPv) {
			this.allPv = allPv;
		}
	}

	@Override
	public DescribeProtectBlockSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeProtectBlockSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
