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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryPrepaidCardsResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPrepaidCardsResponse.PrepaidCard;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPrepaidCardsResponseUnmarshaller {

	public static QueryPrepaidCardsResponse unmarshall(QueryPrepaidCardsResponse queryPrepaidCardsResponse, UnmarshallerContext _ctx) {
		
		queryPrepaidCardsResponse.setRequestId(_ctx.stringValue("QueryPrepaidCardsResponse.RequestId"));
		queryPrepaidCardsResponse.setCode(_ctx.stringValue("QueryPrepaidCardsResponse.Code"));
		queryPrepaidCardsResponse.setMessage(_ctx.stringValue("QueryPrepaidCardsResponse.Message"));
		queryPrepaidCardsResponse.setSuccess(_ctx.booleanValue("QueryPrepaidCardsResponse.Success"));

		List<PrepaidCard> data = new ArrayList<PrepaidCard>();
		for (int i = 0; i < _ctx.lengthValue("QueryPrepaidCardsResponse.Data.Length"); i++) {
			PrepaidCard prepaidCard = new PrepaidCard();
			prepaidCard.setStatus(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].Status"));
			prepaidCard.setExpiryTime(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ExpiryTime"));
			prepaidCard.setGrantedTime(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].GrantedTime"));
			prepaidCard.setNominalValue(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].NominalValue"));
			prepaidCard.setEffectiveTime(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].EffectiveTime"));
			prepaidCard.setPrepaidCardNo(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].PrepaidCardNo"));
			prepaidCard.setApplicableScenarios(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ApplicableScenarios"));
			prepaidCard.setPrepaidCardId(_ctx.longValue("QueryPrepaidCardsResponse.Data["+ i +"].PrepaidCardId"));
			prepaidCard.setApplicableProducts(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ApplicableProducts"));
			prepaidCard.setBalance(_ctx.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].Balance"));

			data.add(prepaidCard);
		}
		queryPrepaidCardsResponse.setData(data);
	 
	 	return queryPrepaidCardsResponse;
	}
}