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

import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyInstanceConsumptionResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyInstanceConsumptionResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryMonthlyInstanceConsumptionResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMonthlyInstanceConsumptionResponseUnmarshaller {

	public static QueryMonthlyInstanceConsumptionResponse unmarshall(QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionResponse, UnmarshallerContext context) {
		
		queryMonthlyInstanceConsumptionResponse.setRequestId(context.stringValue("QueryMonthlyInstanceConsumptionResponse.RequestId"));
		queryMonthlyInstanceConsumptionResponse.setSuccess(context.booleanValue("QueryMonthlyInstanceConsumptionResponse.Success"));
		queryMonthlyInstanceConsumptionResponse.setCode(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Code"));
		queryMonthlyInstanceConsumptionResponse.setMessage(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Message"));

		Data data = new Data();
		data.setPageNum(context.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.TotalCount"));
		data.setBillingCycle(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.BillingCycle"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryMonthlyInstanceConsumptionResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].InstanceID"));
			item.setProductCode(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setTag(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Tag"));
			item.setResourceGroup(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setPayerAccount(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PayerAccount"));
			item.setOwnerID(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].OwnerID"));
			item.setRegion(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Region"));
			item.setPretaxGrossAmount(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setDiscountAmount(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].DiscountAmount"));
			item.setPretaxAmount(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(context.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentCurrency(context.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PaymentCurrency"));

			items.add(item);
		}
		data.setItems(items);
		queryMonthlyInstanceConsumptionResponse.setData(data);
	 
	 	return queryMonthlyInstanceConsumptionResponse;
	}
}