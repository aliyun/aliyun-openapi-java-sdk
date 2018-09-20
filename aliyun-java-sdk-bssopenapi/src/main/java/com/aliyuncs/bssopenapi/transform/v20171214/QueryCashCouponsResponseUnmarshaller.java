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

import com.aliyuncs.bssopenapi.model.v20171214.QueryCashCouponsResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCashCouponsResponse.CashCoupon;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCashCouponsResponseUnmarshaller {

	public static QueryCashCouponsResponse unmarshall(QueryCashCouponsResponse queryCashCouponsResponse, UnmarshallerContext context) {
		
		queryCashCouponsResponse.setRequestId(context.stringValue("QueryCashCouponsResponse.RequestId"));
		queryCashCouponsResponse.setSuccess(context.booleanValue("QueryCashCouponsResponse.Success"));
		queryCashCouponsResponse.setCode(context.stringValue("QueryCashCouponsResponse.Code"));
		queryCashCouponsResponse.setMessage(context.stringValue("QueryCashCouponsResponse.Message"));

		List<CashCoupon> data = new ArrayList<CashCoupon>();
		for (int i = 0; i < context.lengthValue("QueryCashCouponsResponse.Data.Length"); i++) {
			CashCoupon cashCoupon = new CashCoupon();
			cashCoupon.setCashCouponId(context.longValue("QueryCashCouponsResponse.Data["+ i +"].CashCouponId"));
			cashCoupon.setCashCouponNo(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].CashCouponNo"));
			cashCoupon.setGrantedTime(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].GrantedTime"));
			cashCoupon.setEffectiveTime(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].EffectiveTime"));
			cashCoupon.setExpiryTime(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].ExpiryTime"));
			cashCoupon.setApplicableProducts(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].ApplicableProducts"));
			cashCoupon.setApplicableScenarios(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].ApplicableScenarios"));
			cashCoupon.setNominalValue(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].NominalValue"));
			cashCoupon.setBalance(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].Balance"));
			cashCoupon.setStatus(context.stringValue("QueryCashCouponsResponse.Data["+ i +"].Status"));

			data.add(cashCoupon);
		}
		queryCashCouponsResponse.setData(data);
	 
	 	return queryCashCouponsResponse;
	}
}