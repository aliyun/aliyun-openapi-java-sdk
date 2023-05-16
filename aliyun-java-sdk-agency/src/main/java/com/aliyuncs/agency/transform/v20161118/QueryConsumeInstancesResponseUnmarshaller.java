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

package com.aliyuncs.agency.transform.v20161118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20161118.QueryConsumeInstancesResponse;
import com.aliyuncs.agency.model.v20161118.QueryConsumeInstancesResponse.ConsumeInstanceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConsumeInstancesResponseUnmarshaller {

	public static QueryConsumeInstancesResponse unmarshall(QueryConsumeInstancesResponse queryConsumeInstancesResponse, UnmarshallerContext _ctx) {
		
		queryConsumeInstancesResponse.setCurrentPage(_ctx.integerValue("QueryConsumeInstancesResponse.CurrentPage"));
		queryConsumeInstancesResponse.setSuccess(_ctx.booleanValue("QueryConsumeInstancesResponse.Success"));
		queryConsumeInstancesResponse.setNextPageMinId(_ctx.longValue("QueryConsumeInstancesResponse.NextPageMinId"));
		queryConsumeInstancesResponse.setCode(_ctx.stringValue("QueryConsumeInstancesResponse.Code"));
		queryConsumeInstancesResponse.setMessage(_ctx.stringValue("QueryConsumeInstancesResponse.Message"));
		queryConsumeInstancesResponse.setPageSize(_ctx.integerValue("QueryConsumeInstancesResponse.PageSize"));
		queryConsumeInstancesResponse.setTotalCount(_ctx.integerValue("QueryConsumeInstancesResponse.TotalCount"));

		List<ConsumeInstanceModel> data = new ArrayList<ConsumeInstanceModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryConsumeInstancesResponse.Data.Length"); i++) {
			ConsumeInstanceModel consumeInstanceModel = new ConsumeInstanceModel();
			consumeInstanceModel.setConsumePeriod(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ConsumePeriod"));
			consumeInstanceModel.setInternetIp(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].InternetIp"));
			consumeInstanceModel.setFreeAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].FreeAmount"));
			consumeInstanceModel.setTag(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].Tag"));
			consumeInstanceModel.setServiceStartTime(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ServiceStartTime"));
			consumeInstanceModel.setOwnerId(_ctx.longValue("QueryConsumeInstancesResponse.Data["+ i +"].OwnerId"));
			consumeInstanceModel.setConsumeAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ConsumeAmount"));
			consumeInstanceModel.setServiceDuration(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ServiceDuration"));
			consumeInstanceModel.setRegion(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].Region"));
			consumeInstanceModel.setConsumeCategory(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ConsumeCategory"));
			consumeInstanceModel.setBizId(_ctx.longValue("QueryConsumeInstancesResponse.Data["+ i +"].bizId"));
			consumeInstanceModel.setCommodityCode(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].CommodityCode"));
			consumeInstanceModel.setServiceEndTime(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ServiceEndTime"));
			consumeInstanceModel.setInstanceId(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].InstanceId"));
			consumeInstanceModel.setUnclearAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].UnclearAmount"));
			consumeInstanceModel.setRequireAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].RequireAmount"));
			consumeInstanceModel.setBuyerId(_ctx.longValue("QueryConsumeInstancesResponse.Data["+ i +"].BuyerId"));
			consumeInstanceModel.setIntranetIp(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].IntranetIp"));
			consumeInstanceModel.setInstanceNick(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].InstanceNick"));
			consumeInstanceModel.setConsumeDetailMap(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ConsumeDetailMap"));
			consumeInstanceModel.setPayStatus(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].PayStatus"));
			consumeInstanceModel.setConsumeTime(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].ConsumeTime"));
			consumeInstanceModel.setCashPayAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].CashPayAmount"));
			consumeInstanceModel.setCouponPayAmount(_ctx.stringValue("QueryConsumeInstancesResponse.Data["+ i +"].CouponPayAmount"));

			data.add(consumeInstanceModel);
		}
		queryConsumeInstancesResponse.setData(data);
	 
	 	return queryConsumeInstancesResponse;
	}
}