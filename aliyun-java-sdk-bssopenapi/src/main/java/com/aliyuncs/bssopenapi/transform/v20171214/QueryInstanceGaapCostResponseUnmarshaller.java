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
		queryInstanceGaapCostResponse.setSuccess(_ctx.booleanValue("QueryInstanceGaapCostResponse.Success"));
		queryInstanceGaapCostResponse.setCode(_ctx.stringValue("QueryInstanceGaapCostResponse.Code"));
		queryInstanceGaapCostResponse.setMessage(_ctx.stringValue("QueryInstanceGaapCostResponse.Message"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.HostId"));
		data.setPageNum(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryInstanceGaapCostResponse.Data.TotalCount"));

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceGaapCostResponse.Data.Modules.Length"); i++) {
			Module module = new Module();
			module.setBillingCycle(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillingCycle"));
			module.setInstanceID(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].InstanceID"));
			module.setProductCode(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductCode"));
			module.setProductType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ProductType"));
			module.setSubscriptionType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubscriptionType"));
			module.setTag(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Tag"));
			module.setResourceGroup(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].ResourceGroup"));
			module.setAccountingUnit(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].AccountingUnit"));
			module.setPayerAccount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayerAccount"));
			module.setOwnerID(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OwnerID"));
			module.setRegion(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Region"));
			module.setCurrency(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].Currency"));
			module.setPaymentCurrency(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentCurrency"));
			module.setOrderType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderType"));
			module.setPayTime(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PayTime"));
			module.setPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxGrossAmount"));
			module.setPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PricingDiscount"));
			module.setDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCoupons"));
			module.setPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmount"));
			module.setPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PretaxAmountLocal"));
			module.setDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByCashCoupons"));
			module.setDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].DeductedByPrepaidCard"));
			module.setPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].PaymentAmount"));
			module.setGaapPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxGrossAmount"));
			module.setGaapPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPricingDiscount"));
			module.setGaapDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCoupons"));
			module.setGaapPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmount"));
			module.setGaapPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPretaxAmountLocal"));
			module.setGaapDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByCashCoupons"));
			module.setGaapDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapDeductedByPrepaidCard"));
			module.setGaapPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].GaapPaymentAmount"));
			module.setMonthGaapPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxGrossAmount"));
			module.setMonthGaapPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPricingDiscount"));
			module.setMonthGaapDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCoupons"));
			module.setMonthGaapPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmount"));
			module.setMonthGaapPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPretaxAmountLocal"));
			module.setMonthGaapDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByCashCoupons"));
			module.setMonthGaapDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapDeductedByPrepaidCard"));
			module.setMonthGaapPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].MonthGaapPaymentAmount"));
			module.setUnallocatedPaymentAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPaymentAmount"));
			module.setUsageStartDate(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageStartDate"));
			module.setUsageEndDate(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UsageEndDate"));
			module.setBillType(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].BillType"));
			module.setOrderId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].OrderId"));
			module.setSubOrderId(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].SubOrderId"));
			module.setUnallocatedPretaxGrossAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxGrossAmount"));
			module.setUnallocatedPricingDiscount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPricingDiscount"));
			module.setUnallocatedDeductedByCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCoupons"));
			module.setUnallocatedPretaxAmount(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmount"));
			module.setUnallocatedPretaxAmountLocal(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedPretaxAmountLocal"));
			module.setUnallocatedDeductedByCashCoupons(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByCashCoupons"));
			module.setUnallocatedDeductedByPrepaidCard(_ctx.stringValue("QueryInstanceGaapCostResponse.Data.Modules["+ i +"].UnallocatedDeductedByPrepaidCard"));

			modules.add(module);
		}
		data.setModules(modules);
		queryInstanceGaapCostResponse.setData(data);
	 
	 	return queryInstanceGaapCostResponse;
	}
}