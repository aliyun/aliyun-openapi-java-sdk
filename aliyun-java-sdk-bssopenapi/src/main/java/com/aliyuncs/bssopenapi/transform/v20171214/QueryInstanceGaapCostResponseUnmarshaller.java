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

import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceGaapCostResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceGaapCostResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceGaapCostResponse.Data.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceGaapCostResponseUnmarshaller {

	public static QueryInstanceGaapCostResponse unmarshall(QueryInstanceGaapCostResponse queryInstanceGaapCostResponse, UnmarshallerContext context) {
		
		queryInstanceGaapCostResponse.setRequestId(context.stringValue("QueryInstanceGaapCostResponse.RequestId"));
		queryInstanceGaapCostResponse.setSuccess(context.booleanValue("QueryInstanceGaapCostResponse.Success"));
		queryInstanceGaapCostResponse.setCode(context.stringValue("QueryInstanceGaapCostResponse.Code"));
		queryInstanceGaapCostResponse.setMessage(context.stringValue("QueryInstanceGaapCostResponse.Message"));

		Data data = new Data();
		data.setHostId(context.stringValue("QueryInstanceGaapCostResponse.Data.HostId"));
		data.setPageNum(context.integerValue("QueryInstanceGaapCostResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryInstanceGaapCostResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryInstanceGaapCostResponse.Data.TotalCount"));

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < context.lengthValue("QueryInstanceGaapCostResponse.Data.Modules.Length"); i++) {
			Module module = new Module();
			module.setBillingCycle(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillingCycle"));
			module.setInstanceID(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].InstanceID"));
			module.setProductCode(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductCode"));
			module.setProductType(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductType"));
			module.setSubscriptionType(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubscriptionType"));
			module.setTag(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Tag"));
			module.setResourceGroup(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ResourceGroup"));
			module.setAccountingUnit(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].AccountingUnit"));
			module.setPayerAccount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayerAccount"));
			module.setOwnerID(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OwnerID"));
			module.setRegion(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Region"));
			module.setCurrency(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Currency"));
			module.setPaymentCurrency(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentCurrency"));
			module.setOrderType(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderType"));
			module.setPayTime(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayTime"));
			module.setPretaxGrossAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxGrossAmount"));
			module.setPricingDiscount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PricingDiscount"));
			module.setDeductedByCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCoupons"));
			module.setPretaxAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmount"));
			module.setPretaxAmountLocal(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmountLocal"));
			module.setDeductedByCashCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCashCoupons"));
			module.setDeductedByPrepaidCard(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByPrepaidCard"));
			module.setPaymentAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentAmount"));
			module.setGaapPretaxGrossAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxGrossAmount"));
			module.setGaapPricingDiscount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPricingDiscount"));
			module.setGaapDeductedByCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCoupons"));
			module.setGaapPretaxAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmount"));
			module.setGaapPretaxAmountLocal(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmountLocal"));
			module.setGaapDeductedByCashCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCashCoupons"));
			module.setGaapDeductedByPrepaidCard(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByPrepaidCard"));
			module.setGaapPaymentAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPaymentAmount"));
			module.setMonthGaapPretaxGrossAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxGrossAmount"));
			module.setMonthGaapPricingDiscount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPricingDiscount"));
			module.setMonthGaapDeductedByCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCoupons"));
			module.setMonthGaapPretaxAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmount"));
			module.setMonthGaapPretaxAmountLocal(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmountLocal"));
			module.setMonthGaapDeductedByCashCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCashCoupons"));
			module.setMonthGaapDeductedByPrepaidCard(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByPrepaidCard"));
			module.setMonthGaapPaymentAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPaymentAmount"));
			module.setUnallocatedPaymentAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPaymentAmount"));
			module.setUsageStartDate(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageStartDate"));
			module.setUsageEndDate(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageEndDate"));
			module.setBillType(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillType"));
			module.setOrderId(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderId"));
			module.setSubOrderId(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubOrderId"));
			module.setUnallocatedPretaxGrossAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxGrossAmount"));
			module.setUnallocatedPricingDiscount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPricingDiscount"));
			module.setUnallocatedDeductedByCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCoupons"));
			module.setUnallocatedPretaxAmount(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmount"));
			module.setUnallocatedPretaxAmountLocal(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmountLocal"));
			module.setUnallocatedDeductedByCashCoupons(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCashCoupons"));
			module.setUnallocatedDeductedByPrepaidCard(context.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByPrepaidCard"));

			modules.add(module);
		}
		data.setModules(modules);
		queryInstanceGaapCostResponse.setData(data);
	 
	 	return queryInstanceGaapCostResponse;
	}
}