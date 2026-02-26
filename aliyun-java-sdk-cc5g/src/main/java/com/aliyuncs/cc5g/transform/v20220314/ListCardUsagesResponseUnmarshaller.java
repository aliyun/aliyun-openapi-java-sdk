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

import com.aliyuncs.cc5g.model.v20220314.ListCardUsagesResponse;
import com.aliyuncs.cc5g.model.v20220314.ListCardUsagesResponse.Card;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCardUsagesResponseUnmarshaller {

	public static ListCardUsagesResponse unmarshall(ListCardUsagesResponse listCardUsagesResponse, UnmarshallerContext _ctx) {
		
		listCardUsagesResponse.setRequestId(_ctx.stringValue("ListCardUsagesResponse.RequestId"));
		listCardUsagesResponse.setTotalCount(_ctx.stringValue("ListCardUsagesResponse.TotalCount"));

		List<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < _ctx.lengthValue("ListCardUsagesResponse.Cards.Length"); i++) {
			Card card = new Card();
			card.setIccid(_ctx.stringValue("ListCardUsagesResponse.Cards["+ i +"].Iccid"));
			card.setUsageDataMonth(_ctx.longValue("ListCardUsagesResponse.Cards["+ i +"].UsageDataMonth"));

			cards.add(card);
		}
		listCardUsagesResponse.setCards(cards);
	 
	 	return listCardUsagesResponse;
	}
}