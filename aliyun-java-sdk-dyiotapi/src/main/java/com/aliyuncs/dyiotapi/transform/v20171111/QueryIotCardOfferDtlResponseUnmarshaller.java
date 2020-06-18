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

import com.aliyuncs.dyiotapi.model.v20171111.QueryIotCardOfferDtlResponse;
import com.aliyuncs.dyiotapi.model.v20171111.QueryIotCardOfferDtlResponse.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIotCardOfferDtlResponseUnmarshaller {

	public static QueryIotCardOfferDtlResponse unmarshall(QueryIotCardOfferDtlResponse queryIotCardOfferDtlResponse, UnmarshallerContext _ctx) {
		
		queryIotCardOfferDtlResponse.setRequestId(_ctx.stringValue("QueryIotCardOfferDtlResponse.RequestId"));
		queryIotCardOfferDtlResponse.setCode(_ctx.stringValue("QueryIotCardOfferDtlResponse.Code"));
		queryIotCardOfferDtlResponse.setMessage(_ctx.stringValue("QueryIotCardOfferDtlResponse.Message"));

		List<Detail> cardOfferDetail = new ArrayList<Detail>();
		for (int i = 0; i < _ctx.lengthValue("QueryIotCardOfferDtlResponse.CardOfferDetail.Length"); i++) {
			Detail detail = new Detail();
			detail.setExpireTime(_ctx.stringValue("QueryIotCardOfferDtlResponse.CardOfferDetail["+ i +"].ExpireTime"));
			detail.setEffectiveTime(_ctx.stringValue("QueryIotCardOfferDtlResponse.CardOfferDetail["+ i +"].EffectiveTime"));
			detail.setOrderTime(_ctx.stringValue("QueryIotCardOfferDtlResponse.CardOfferDetail["+ i +"].OrderTime"));
			detail.setOfferName(_ctx.stringValue("QueryIotCardOfferDtlResponse.CardOfferDetail["+ i +"].OfferName"));
			detail.setOfferId(_ctx.stringValue("QueryIotCardOfferDtlResponse.CardOfferDetail["+ i +"].OfferId"));

			cardOfferDetail.add(detail);
		}
		queryIotCardOfferDtlResponse.setCardOfferDetail(cardOfferDetail);
	 
	 	return queryIotCardOfferDtlResponse;
	}
}