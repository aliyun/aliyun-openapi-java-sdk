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

	public static QueryMonthlyInstanceConsumptionResponse unmarshall(QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionResponse, UnmarshallerContext _ctx) {
		
		queryMonthlyInstanceConsumptionResponse.setRequestId(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.RequestId"));
		queryMonthlyInstanceConsumptionResponse.setSuccess(_ctx.booleanValue("QueryMonthlyInstanceConsumptionResponse.Success"));
		queryMonthlyInstanceConsumptionResponse.setCode(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Code"));
		queryMonthlyInstanceConsumptionResponse.setMessage(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryMonthlyInstanceConsumptionResponse.Data.TotalCount"));
		data.setBillingCycle(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.BillingCycle"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryMonthlyInstanceConsumptionResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setInstanceID(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].InstanceID"));
			item.setProductCode(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductType(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ProductType"));
			item.setSubscriptionType(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].SubscriptionType"));
			item.setTag(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Tag"));
			item.setResourceGroup(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].ResourceGroup"));
			item.setPayerAccount(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PayerAccount"));
			item.setOwnerID(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].OwnerID"));
			item.setRegion(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Region"));
			item.setPretaxGrossAmount(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxGrossAmount"));
			item.setDiscountAmount(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].DiscountAmount"));
			item.setPretaxAmount(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxAmount"));
			item.setCurrency(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Currency"));
			item.setPretaxAmountLocal(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PretaxAmountLocal"));
			item.setTax(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].Tax"));
			item.setAfterTaxAmount(_ctx.floatValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].AfterTaxAmount"));
			item.setPaymentCurrency(_ctx.stringValue("QueryMonthlyInstanceConsumptionResponse.Data.Items["+ i +"].PaymentCurrency"));

			items.add(item);
		}
		data.setItems(items);
		queryMonthlyInstanceConsumptionResponse.setData(data);
	 
	 	return queryMonthlyInstanceConsumptionResponse;
	}
}