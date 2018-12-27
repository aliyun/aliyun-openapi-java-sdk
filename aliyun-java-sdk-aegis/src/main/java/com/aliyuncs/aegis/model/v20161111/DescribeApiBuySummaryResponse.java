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

package com.aliyuncs.aegis.model.v20161111;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeApiBuySummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiBuySummaryResponse extends AcsResponse {

	private String requestId;

	private BuySummary buySummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BuySummary getBuySummary() {
		return this.buySummary;
	}

	public void setBuySummary(BuySummary buySummary) {
		this.buySummary = buySummary;
	}

	public static class BuySummary {

		private Long status;

		private Boolean buyThreatBook;

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Boolean getBuyThreatBook() {
			return this.buyThreatBook;
		}

		public void setBuyThreatBook(Boolean buyThreatBook) {
			this.buyThreatBook = buyThreatBook;
		}
	}

	@Override
	public DescribeApiBuySummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiBuySummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
