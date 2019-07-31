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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRedeemResponseUnmarshaller {

	public static QueryRedeemResponse unmarshall(QueryRedeemResponse queryRedeemResponse, UnmarshallerContext _ctx) {
		
		queryRedeemResponse.setRequestId(_ctx.stringValue("QueryRedeemResponse.RequestId"));
		queryRedeemResponse.setSuccess(_ctx.booleanValue("QueryRedeemResponse.Success"));
		queryRedeemResponse.setCode(_ctx.stringValue("QueryRedeemResponse.Code"));
		queryRedeemResponse.setMessage(_ctx.stringValue("QueryRedeemResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryRedeemResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryRedeemResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("QueryRedeemResponse.Data.TotalCount"));

		List<RedeemItem> redeem = new ArrayList<RedeemItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRedeemResponse.Data.Redeem.Length"); i++) {
			RedeemItem redeemItem = new RedeemItem();
			redeemItem.setRedeemId(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].RedeemId"));
			redeemItem.setRedeemNo(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].RedeemNo"));
			redeemItem.setStatus(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Status"));
			redeemItem.setGrantedTime(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].GrantedTime"));
			redeemItem.setEffectiveTime(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].EffectiveTime"));
			redeemItem.setExpiryTime(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].ExpiryTime"));
			redeemItem.setNominalValue(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].NominalValue"));
			redeemItem.setBalance(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Balance"));
			redeemItem.setApplicableProducts(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].ApplicableProducts"));
			redeemItem.setSpecification(_ctx.stringValue("QueryRedeemResponse.Data.Redeem["+ i +"].Specification"));

			redeem.add(redeemItem);
		}
		data.setRedeem(redeem);
		queryRedeemResponse.setData(data);
	 
	 	return queryRedeemResponse;
	}
}