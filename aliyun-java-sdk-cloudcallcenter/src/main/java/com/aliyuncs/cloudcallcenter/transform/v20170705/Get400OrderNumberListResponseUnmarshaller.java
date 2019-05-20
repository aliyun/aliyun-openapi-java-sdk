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

import com.aliyuncs.cloudcallcenter.model.v20170705.Get400OrderNumberListResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Get400OrderNumberListResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.Get400OrderNumberListResponse.Data.GetOrderNumberOf400Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class Get400OrderNumberListResponseUnmarshaller {

	public static Get400OrderNumberListResponse unmarshall(Get400OrderNumberListResponse get400OrderNumberListResponse, UnmarshallerContext context) {
		
		get400OrderNumberListResponse.setRequestId(context.stringValue("Get400OrderNumberListResponse.RequestId"));
		get400OrderNumberListResponse.setSuccess(context.booleanValue("Get400OrderNumberListResponse.Success"));
		get400OrderNumberListResponse.setCode(context.stringValue("Get400OrderNumberListResponse.Code"));
		get400OrderNumberListResponse.setMessage(context.stringValue("Get400OrderNumberListResponse.Message"));
		get400OrderNumberListResponse.setHttpStatusCode(context.integerValue("Get400OrderNumberListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("Get400OrderNumberListResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("Get400OrderNumberListResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("Get400OrderNumberListResponse.Data.PageSize"));

		List<GetOrderNumberOf400Domain> orders = new ArrayList<GetOrderNumberOf400Domain>();
		for (int i = 0; i < context.lengthValue("Get400OrderNumberListResponse.Data.Orders.Length"); i++) {
			GetOrderNumberOf400Domain getOrderNumberOf400Domain = new GetOrderNumberOf400Domain();
			getOrderNumberOf400Domain.setOrderId(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].OrderId"));
			getOrderNumberOf400Domain.setManagerName(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].ManagerName"));
			getOrderNumberOf400Domain.setManagerMobilePhone(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].ManagerMobilePhone"));
			getOrderNumberOf400Domain.setNumber(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].Number"));
			getOrderNumberOf400Domain.setOrderTime(context.longValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].OrderTime"));
			getOrderNumberOf400Domain.setRegionNameProvince(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].RegionNameProvince"));
			getOrderNumberOf400Domain.setRegionNameCity(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].RegionNameCity"));
			getOrderNumberOf400Domain.setCorpName(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].CorpName"));
			getOrderNumberOf400Domain.setMonthlyPrice(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].MonthlyPrice"));
			getOrderNumberOf400Domain.setRealNameInsId(context.longValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].RealNameInsId"));
			getOrderNumberOf400Domain.setStatus(context.integerValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].Status"));
			getOrderNumberOf400Domain.setBillId(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].BillId"));
			getOrderNumberOf400Domain.setCanCancel(context.booleanValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].CanCancel"));
			getOrderNumberOf400Domain.setForbidCancelDesc(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].ForbidCancelDesc"));
			getOrderNumberOf400Domain.setSpecName(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].SpecName"));
			getOrderNumberOf400Domain.setDestroyTime(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].DestroyTime"));
			getOrderNumberOf400Domain.setWttorderId(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].WttorderId"));
			getOrderNumberOf400Domain.setCommodityInstanceId(context.stringValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].CommodityInstanceId"));
			getOrderNumberOf400Domain.setNumberCommodityStatus(context.longValue("Get400OrderNumberListResponse.Data.Orders["+ i +"].NumberCommodityStatus"));

			orders.add(getOrderNumberOf400Domain);
		}
		data.setOrders(orders);
		get400OrderNumberListResponse.setData(data);
	 
	 	return get400OrderNumberListResponse;
	}
}