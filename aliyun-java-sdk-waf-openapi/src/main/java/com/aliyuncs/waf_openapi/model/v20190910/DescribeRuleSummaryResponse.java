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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeRuleSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleSummaryResponse extends AcsResponse {

	private String requestId;

	private List<Item> ruleSummarys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getRuleSummarys() {
		return this.ruleSummarys;
	}

	public void setRuleSummarys(List<Item> ruleSummarys) {
		this.ruleSummarys = ruleSummarys;
	}

	public static class Item {

		private Long timeStamp;

		private Long pv;

		public Long getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(Long timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getPv() {
			return this.pv;
		}

		public void setPv(Long pv) {
			this.pv = pv;
		}
	}

	@Override
	public DescribeRuleSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeRuleSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
