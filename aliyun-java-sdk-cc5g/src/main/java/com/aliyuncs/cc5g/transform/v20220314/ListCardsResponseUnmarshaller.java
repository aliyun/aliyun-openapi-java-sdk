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

import com.aliyuncs.cc5g.model.v20220314.ListCardsResponse;
import com.aliyuncs.cc5g.model.v20220314.ListCardsResponse.Card;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCardsResponseUnmarshaller {

	public static ListCardsResponse unmarshall(ListCardsResponse listCardsResponse, UnmarshallerContext _ctx) {
		
		listCardsResponse.setRequestId(_ctx.stringValue("ListCardsResponse.RequestId"));
		listCardsResponse.setNextToken(_ctx.stringValue("ListCardsResponse.NextToken"));
		listCardsResponse.setMaxResults(_ctx.stringValue("ListCardsResponse.MaxResults"));
		listCardsResponse.setTotalCount(_ctx.stringValue("ListCardsResponse.TotalCount"));

		List<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < _ctx.lengthValue("ListCardsResponse.Cards.Length"); i++) {
			Card card = new Card();
			card.setIccid(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Iccid"));
			card.setNetType(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].NetType"));
			card.setAPN(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].APN"));
			card.setISP(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].ISP"));
			card.setIpAddress(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].IpAddress"));
			card.setImsi(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Imsi"));
			card.setImei(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Imei"));
			card.setLock(_ctx.booleanValue("ListCardsResponse.Cards["+ i +"].Lock"));
			card.setSpec(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Spec"));
			card.setStatus(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Status"));
			card.setDescription(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Description"));
			card.setName(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].Name"));
			card.setUsageDataMonth(_ctx.longValue("ListCardsResponse.Cards["+ i +"].UsageDataMonth"));
			card.setOrderId(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].OrderId"));
			card.setActivatedTime(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].ActivatedTime"));
			card.setBusinessStatus(_ctx.stringValue("ListCardsResponse.Cards["+ i +"].BusinessStatus"));

			cards.add(card);
		}
		listCardsResponse.setCards(cards);
	 
	 	return listCardsResponse;
	}
}