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
import com.aliyuncs.cc5g.transform.v20220314.ListCardDayUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCardDayUsagesResponse extends AcsResponse {

	private String requestId;

	private List<Card> cards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Card> getCards() {
		return this.cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public static class Card {

		private String iccid;

		private List<UsageDataMonth> usageDataMonths;

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public List<UsageDataMonth> getUsageDataMonths() {
			return this.usageDataMonths;
		}

		public void setUsageDataMonths(List<UsageDataMonth> usageDataMonths) {
			this.usageDataMonths = usageDataMonths;
		}

		public static class UsageDataMonth {

			private String usageDataMonth;

			private String month;

			private List<CardDayUsage> cardDayUsages;

			public String getUsageDataMonth() {
				return this.usageDataMonth;
			}

			public void setUsageDataMonth(String usageDataMonth) {
				this.usageDataMonth = usageDataMonth;
			}

			public String getMonth() {
				return this.month;
			}

			public void setMonth(String month) {
				this.month = month;
			}

			public List<CardDayUsage> getCardDayUsages() {
				return this.cardDayUsages;
			}

			public void setCardDayUsages(List<CardDayUsage> cardDayUsages) {
				this.cardDayUsages = cardDayUsages;
			}

			public static class CardDayUsage {

				private String day;

				private String usageData;

				public String getDay() {
					return this.day;
				}

				public void setDay(String day) {
					this.day = day;
				}

				public String getUsageData() {
					return this.usageData;
				}

				public void setUsageData(String usageData) {
					this.usageData = usageData;
				}
			}
		}
	}

	@Override
	public ListCardDayUsagesResponse getInstance(UnmarshallerContext context) {
		return	ListCardDayUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
