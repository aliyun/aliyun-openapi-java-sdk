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

package com.aliyuncs.dyiotapi.transform.v20171111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyiotapi.model.v20171111.QueryCardsInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCardsInfoResponseUnmarshaller {

	public static QueryCardsInfoResponse unmarshall(QueryCardsInfoResponse queryCardsInfoResponse, UnmarshallerContext _ctx) {
		
		queryCardsInfoResponse.setRequestId(_ctx.stringValue("QueryCardsInfoResponse.RequestId"));
		queryCardsInfoResponse.setCode(_ctx.stringValue("QueryCardsInfoResponse.Code"));
		queryCardsInfoResponse.setMessage(_ctx.stringValue("QueryCardsInfoResponse.Message"));

		List<String> cardsInfo = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCardsInfoResponse.CardsInfo.Length"); i++) {
			cardsInfo.add(_ctx.stringValue("QueryCardsInfoResponse.CardsInfo["+ i +"]"));
		}
		queryCardsInfoResponse.setCardsInfo(cardsInfo);
	 
	 	return queryCardsInfoResponse;
	}
}