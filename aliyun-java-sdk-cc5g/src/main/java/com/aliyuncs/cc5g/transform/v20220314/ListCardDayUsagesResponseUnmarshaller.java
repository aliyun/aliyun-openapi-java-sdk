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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListCardDayUsagesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListCardDayUsagesResponse.Card;
import com.aliyuncs.cc5g.model.v20220314.ListCardDayUsagesResponse.Card.UsageDataMonth;
import com.aliyuncs.cc5g.model.v20220314.ListCardDayUsagesResponse.Card.UsageDataMonth.CardDayUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCardDayUsagesResponseUnmarshaller {

	public static ListCardDayUsagesResponse unmarshall(ListCardDayUsagesResponse listCardDayUsagesResponse, UnmarshallerContext _ctx) {
		
		listCardDayUsagesResponse.setRequestId(_ctx.stringValue("ListCardDayUsagesResponse.RequestId"));

		List<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < _ctx.lengthValue("ListCardDayUsagesResponse.Cards.Length"); i++) {
			Card card = new Card();
			card.setIccid(_ctx.stringValue("ListCardDayUsagesResponse.Cards["+ i +"].Iccid"));

			List<UsageDataMonth> usageDataMonths = new ArrayList<UsageDataMonth>();
			for (int j = 0; j < _ctx.lengthValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths.Length"); j++) {
				UsageDataMonth usageDataMonth = new UsageDataMonth();
				usageDataMonth.setUsageDataMonth(_ctx.stringValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths["+ j +"].UsageDataMonth"));
				usageDataMonth.setMonth(_ctx.stringValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths["+ j +"].Month"));

				List<CardDayUsage> cardDayUsages = new ArrayList<CardDayUsage>();
				for (int k = 0; k < _ctx.lengthValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths["+ j +"].CardDayUsages.Length"); k++) {
					CardDayUsage cardDayUsage = new CardDayUsage();
					cardDayUsage.setDay(_ctx.stringValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths["+ j +"].CardDayUsages["+ k +"].Day"));
					cardDayUsage.setUsageData(_ctx.stringValue("ListCardDayUsagesResponse.Cards["+ i +"].UsageDataMonths["+ j +"].CardDayUsages["+ k +"].UsageData"));

					cardDayUsages.add(cardDayUsage);
				}
				usageDataMonth.setCardDayUsages(cardDayUsages);

				usageDataMonths.add(usageDataMonth);
			}
			card.setUsageDataMonths(usageDataMonths);

			cards.add(card);
		}
		listCardDayUsagesResponse.setCards(cards);
	 
	 	return listCardDayUsagesResponse;
	}
}