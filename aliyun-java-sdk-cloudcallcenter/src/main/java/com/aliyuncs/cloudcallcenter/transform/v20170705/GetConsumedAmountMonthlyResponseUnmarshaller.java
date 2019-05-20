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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetConsumedAmountMonthlyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetConsumedAmountMonthlyResponse.Consumptions;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetConsumedAmountMonthlyResponse.Consumptions.Consumption;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumedAmountMonthlyResponseUnmarshaller {

	public static GetConsumedAmountMonthlyResponse unmarshall(GetConsumedAmountMonthlyResponse getConsumedAmountMonthlyResponse, UnmarshallerContext context) {
		
		getConsumedAmountMonthlyResponse.setRequestId(context.stringValue("GetConsumedAmountMonthlyResponse.RequestId"));
		getConsumedAmountMonthlyResponse.setSuccess(context.booleanValue("GetConsumedAmountMonthlyResponse.Success"));
		getConsumedAmountMonthlyResponse.setCode(context.stringValue("GetConsumedAmountMonthlyResponse.Code"));
		getConsumedAmountMonthlyResponse.setMessage(context.stringValue("GetConsumedAmountMonthlyResponse.Message"));
		getConsumedAmountMonthlyResponse.setHttpStatusCode(context.integerValue("GetConsumedAmountMonthlyResponse.HttpStatusCode"));

		Consumptions consumptions = new Consumptions();
		consumptions.setTotalCount(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.TotalCount"));
		consumptions.setPageNumber(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.PageNumber"));
		consumptions.setPageSize(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.PageSize"));

		List<Consumption> list = new ArrayList<Consumption>();
		for (int i = 0; i < context.lengthValue("GetConsumedAmountMonthlyResponse.Consumptions.List.Length"); i++) {
			Consumption consumption = new Consumption();
			consumption.setIncomingAmount(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].IncomingAmount"));
			consumption.setIncomingCount(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].IncomingCount"));
			consumption.setOutcomingAmount(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].OutcomingAmount"));
			consumption.setOutcomingCount(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].OutcomingCount"));
			consumption.setYear(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].Year"));
			consumption.setMonth(context.integerValue("GetConsumedAmountMonthlyResponse.Consumptions.List["+ i +"].Month"));

			list.add(consumption);
		}
		consumptions.setList(list);
		getConsumedAmountMonthlyResponse.setConsumptions(consumptions);
	 
	 	return getConsumedAmountMonthlyResponse;
	}
}