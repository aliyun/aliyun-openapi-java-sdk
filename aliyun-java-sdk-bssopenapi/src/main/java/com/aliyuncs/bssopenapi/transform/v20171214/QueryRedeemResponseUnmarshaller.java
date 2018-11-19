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

import com.aliyuncs.bssopenapi.model.v20171214.QueryRedeemResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRedeemResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRedeemResponse.Data.RedeemItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRedeemResponseUnmarshaller {

	public static QueryRedeemResponse unmarshall(QueryRedeemResponse queryRedeemResponse, UnmarshallerContext context) {
		
		queryRedeemResponse.setRequestId(context.stringValue("QueryRedeemResponse.RequestId"));
		queryRedeemResponse.setSuccess(context.booleanValue("QueryRedeemResponse.Success"));
		queryRedeemResponse.setCode(context.stringValue("QueryRedeemResponse.Code"));
		queryRedeemResponse.setMessage(context.stringValue("QueryRedeemResponse.Message"));

		Data data = new Data();
		data.setPageNum(context.longValue("QueryRedeemResponse.Data.PageNum"));
		data.setPageSize(context.longValue("QueryRedeemResponse.Data.PageSize"));
		data.setTotalCount(context.longValue("QueryRedeemResponse.Data.TotalCount"));

		List<RedeemItem> redeem = new ArrayList<RedeemItem>();
		for (int i = 0; i < context.lengthValue("QueryRedeemResponse.Data.Redeem.Length"); i++) {
			RedeemItem redeemItem = new RedeemItem();
			redeemItem.setRedeemId(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].RedeemId"));
			redeemItem.setRedeemNo(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].RedeemNo"));
			redeemItem.setStatus(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Status"));
			redeemItem.setGrantedTime(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].GrantedTime"));
			redeemItem.setEffectiveTime(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].EffectiveTime"));
			redeemItem.setExpiryTime(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].ExpiryTime"));
			redeemItem.setNominalValue(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].NominalValue"));
			redeemItem.setBalance(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Balance"));
			redeemItem.setApplicableProducts(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].ApplicableProducts"));
			redeemItem.setSpecification(context.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Specification"));

			redeem.add(redeemItem);
		}
		data.setRedeem(redeem);
		queryRedeemResponse.setData(data);
	 
	 	return queryRedeemResponse;
	}
}