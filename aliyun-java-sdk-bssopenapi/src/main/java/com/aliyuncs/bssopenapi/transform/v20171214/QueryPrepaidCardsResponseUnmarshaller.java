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

	public static QueryPrepaidCardsResponse unmarshall(QueryPrepaidCardsResponse queryPrepaidCardsResponse, UnmarshallerContext context) {
		
		queryPrepaidCardsResponse.setRequestId(context.stringValue("QueryPrepaidCardsResponse.RequestId"));
		queryPrepaidCardsResponse.setSuccess(context.booleanValue("QueryPrepaidCardsResponse.Success"));
		queryPrepaidCardsResponse.setCode(context.stringValue("QueryPrepaidCardsResponse.Code"));
		queryPrepaidCardsResponse.setMessage(context.stringValue("QueryPrepaidCardsResponse.Message"));

		List<PrepaidCard> data = new ArrayList<PrepaidCard>();
		for (int i = 0; i < context.lengthValue("QueryPrepaidCardsResponse.Data.Length"); i++) {
			PrepaidCard prepaidCard = new PrepaidCard();
			prepaidCard.setPrepaidCardId(context.longValue("QueryPrepaidCardsResponse.Data["+ i +"].PrepaidCardId"));
			prepaidCard.setPrepaidCardNo(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].PrepaidCardNo"));
			prepaidCard.setGrantedTime(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].GrantedTime"));
			prepaidCard.setEffectiveTime(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].EffectiveTime"));
			prepaidCard.setExpiryTime(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ExpiryTime"));
			prepaidCard.setApplicableProducts(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ApplicableProducts"));
			prepaidCard.setApplicableScenarios(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].ApplicableScenarios"));
			prepaidCard.setNominalValue(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].NominalValue"));
			prepaidCard.setBalance(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].Balance"));
			prepaidCard.setStatus(context.stringValue("QueryPrepaidCardsResponse.Data["+ i +"].Status"));

			data.add(prepaidCard);
		}
		queryPrepaidCardsResponse.setData(data);
	 
	 	return queryPrepaidCardsResponse;
	}
}