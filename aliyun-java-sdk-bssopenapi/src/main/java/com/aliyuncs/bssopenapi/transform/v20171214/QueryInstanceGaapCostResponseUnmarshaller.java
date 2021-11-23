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

	public static QueryInstanceGaapCostResponse unmarshall(QueryInstanceGaapCostResponse queryInstanceGaapCostResponse, UnmarshallerContext _ctx) {
		
		queryInstanceGaapCostResponse.setRequestId(_ctx.stringValue("QueryInstanceGaapCostResponse.RequestId"));
		queryInstanceGaapCostResponse.setCode(_ctx.stringValue("QueryInstanceGaapCostResponse.Code"));
		queryInstanceGaapCostResponse.setMessage(_ctx.stringValue("QueryInstanceGaapCostResponse.Message"));
		queryInstanceGaapCostResponse.setSuccess(_ctx.booleanValue("QueryInstanceGaapCostResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.TotalCount"));
		data.setHostId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.HostId"));

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceGaapCostResponse.Data.Modules.Length"); i++) {
			Module module = new Module();
			module.setGaapDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCashCoupons"));
			module.setSubscriptionType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubscriptionType"));
			module.setMonthGaapPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmount"));
			module.setDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCoupons"));
			module.setSubOrderId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubOrderId"));
			module.setRegion(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Region"));
			module.setOrderType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderType"));
			module.setMonthGaapDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByPrepaidCard"));
			module.setUnallocatedDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCashCoupons"));
			module.setPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmountLocal"));
			module.setBillingCycle(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillingCycle"));
			module.setPayerAccount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayerAccount"));
			module.setMonthGaapPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmountLocal"));
			module.setAccountingUnit(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].AccountingUnit"));
			module.setGaapPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmountLocal"));
			module.setUnallocatedDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByPrepaidCard"));
			module.setProductType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductType"));
			module.setPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentAmount"));
			module.setMonthGaapPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxGrossAmount"));
			module.setBillType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillType"));
			module.setPayTime(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayTime"));
			module.setPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxGrossAmount"));
			module.setOrderId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderId"));
			module.setUnallocatedPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPricingDiscount"));
			module.setMonthGaapDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCashCoupons"));
			module.setUnallocatedPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxGrossAmount"));
			module.setInstanceID(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].InstanceID"));
			module.setTag(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Tag"));
			module.setCurrency(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Currency"));
			module.setGaapDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCoupons"));
			module.setDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCashCoupons"));
			module.setGaapDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByPrepaidCard"));
			module.setGaapPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPaymentAmount"));
			module.setUnallocatedPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmountLocal"));
			module.setMonthGaapPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPricingDiscount"));
			module.setPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PricingDiscount"));
			module.setGaapPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPricingDiscount"));
			module.setResourceGroup(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ResourceGroup"));
			module.setUnallocatedDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCoupons"));
			module.setPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmount"));
			module.setUnallocatedPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmount"));
			module.setGaapPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxGrossAmount"));
			module.setUnallocatedPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPaymentAmount"));
			module.setPaymentCurrency(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentCurrency"));
			module.setOwnerID(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OwnerID"));
			module.setDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByPrepaidCard"));
			module.setGaapPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmount"));
			module.setMonthGaapDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCoupons"));
			module.setMonthGaapPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPaymentAmount"));
			module.setUsageEndDate(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageEndDate"));
			module.setUsageStartDate(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageStartDate"));
			module.setProductCode(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductCode"));

			modules.add(module);
		}
		data.setModules(modules);
		queryInstanceGaapCostResponse.setData(data);
	 
	 	return queryInstanceGaapCostResponse;
	}
}