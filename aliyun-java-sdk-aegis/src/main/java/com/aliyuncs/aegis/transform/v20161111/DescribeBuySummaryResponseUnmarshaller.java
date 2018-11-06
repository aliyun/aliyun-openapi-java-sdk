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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeBuySummaryResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeBuySummaryResponse.BuySummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuySummaryResponseUnmarshaller {

	public static DescribeBuySummaryResponse unmarshall(DescribeBuySummaryResponse describeBuySummaryResponse, UnmarshallerContext context) {
		
		describeBuySummaryResponse.setRequestId(context.stringValue("DescribeBuySummaryResponse.RequestId"));

		BuySummary buySummary = new BuySummary();
		buySummary.setExpireDateTimestamp(context.longValue("DescribeBuySummaryResponse.BuySummary.ExpireDateTimestamp"));
		buySummary.setPurchaseDate(context.longValue("DescribeBuySummaryResponse.BuySummary.PurchaseDate"));
		buySummary.setBuyVersion(context.stringValue("DescribeBuySummaryResponse.BuySummary.BuyVersion"));
		buySummary.setSafePointSurplusDays(context.integerValue("DescribeBuySummaryResponse.BuySummary.SafePointSurplusDays"));
		buySummary.setSafePointdailyCost(context.integerValue("DescribeBuySummaryResponse.BuySummary.SafePointdailyCost"));
		buySummary.setCapacity(context.integerValue("DescribeBuySummaryResponse.BuySummary.Capacity"));
		buySummary.setTotalMachineNum(context.integerValue("DescribeBuySummaryResponse.BuySummary.TotalMachineNum"));
		buySummary.setCanApplyTrial(context.booleanValue("DescribeBuySummaryResponse.BuySummary.CanApplyTrial"));
		buySummary.setInstanceId(context.stringValue("DescribeBuySummaryResponse.BuySummary.InstanceId"));
		buySummary.setUseCapacity(context.integerValue("DescribeBuySummaryResponse.BuySummary.UseCapacity"));
		buySummary.setCanAccessHidden(context.booleanValue("DescribeBuySummaryResponse.BuySummary.CanAccessHidden"));
		buySummary.setBuyStatus(context.booleanValue("DescribeBuySummaryResponse.BuySummary.BuyStatus"));
		buySummary.setBuyType(context.stringValue("DescribeBuySummaryResponse.BuySummary.BuyType"));
		buySummary.setExpireDate(context.longValue("DescribeBuySummaryResponse.BuySummary.ExpireDate"));
		buySummary.setSafePointCapacity(context.integerValue("DescribeBuySummaryResponse.BuySummary.SafePointCapacity"));
		buySummary.setNeedFeedBack(context.booleanValue("DescribeBuySummaryResponse.BuySummary.NeedFeedBack"));
		buySummary.setSafePointBuyVersion(context.stringValue("DescribeBuySummaryResponse.BuySummary.SafePointBuyVersion"));
		buySummary.setOriginalVersion(context.stringValue("DescribeBuySummaryResponse.BuySummary.OriginalVersion"));
		buySummary.setOriginalBuyType(context.stringValue("DescribeBuySummaryResponse.BuySummary.OriginalBuyType"));
		buySummary.setSafePointExpireDate(context.longValue("DescribeBuySummaryResponse.BuySummary.SafePointExpireDate"));
		buySummary.setSpecialCount(context.integerValue("DescribeBuySummaryResponse.BuySummary.SpecialCount"));
		describeBuySummaryResponse.setBuySummary(buySummary);
	 
	 	return describeBuySummaryResponse;
	}
}