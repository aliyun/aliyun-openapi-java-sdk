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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListCardUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCardUsagesResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<Card> cards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Card> getCards() {
		return this.cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public static class Card {

		private String iccid;

		private Long usageDataMonth;

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public Long getUsageDataMonth() {
			return this.usageDataMonth;
		}

		public void setUsageDataMonth(Long usageDataMonth) {
			this.usageDataMonth = usageDataMonth;
		}
	}

	@Override
	public ListCardUsagesResponse getInstance(UnmarshallerContext context) {
		return	ListCardUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
