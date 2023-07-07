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

package com.aliyuncs.domain.transform.v20180208;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.QueryBrokerDemandResponse;
import com.aliyuncs.domain.model.v20180208.QueryBrokerDemandResponse.Demand;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBrokerDemandResponseUnmarshaller {

	public static QueryBrokerDemandResponse unmarshall(QueryBrokerDemandResponse queryBrokerDemandResponse, UnmarshallerContext _ctx) {
		
		queryBrokerDemandResponse.setRequestId(_ctx.stringValue("QueryBrokerDemandResponse.RequestId"));
		queryBrokerDemandResponse.setCurrentPageNum(_ctx.integerValue("QueryBrokerDemandResponse.CurrentPageNum"));
		queryBrokerDemandResponse.setTotalPageNum(_ctx.integerValue("QueryBrokerDemandResponse.TotalPageNum"));
		queryBrokerDemandResponse.setPageSize(_ctx.integerValue("QueryBrokerDemandResponse.PageSize"));
		queryBrokerDemandResponse.setTotalItemNum(_ctx.integerValue("QueryBrokerDemandResponse.TotalItemNum"));

		List<Demand> data = new ArrayList<Demand>();
		for (int i = 0; i < _ctx.lengthValue("QueryBrokerDemandResponse.Data.Length"); i++) {
			Demand demand = new Demand();
			demand.setStatus(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Status"));
			demand.setDemandPrice(_ctx.floatValue("QueryBrokerDemandResponse.Data["+ i +"].DemandPrice"));
			demand.setBizId(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].BizId"));
			demand.setBargainSellerMobile(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].BargainSellerMobile"));
			demand.setPublishTime(_ctx.longValue("QueryBrokerDemandResponse.Data["+ i +"].PublishTime"));
			demand.setProduceType(_ctx.integerValue("QueryBrokerDemandResponse.Data["+ i +"].ProduceType"));
			demand.setDemandDomain(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].DemandDomain"));
			demand.setDescription(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Description"));
			demand.setMobile(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Mobile"));
			demand.setServicePayPrice(_ctx.floatValue("QueryBrokerDemandResponse.Data["+ i +"].ServicePayPrice"));
			demand.setPayPrice(_ctx.floatValue("QueryBrokerDemandResponse.Data["+ i +"].PayPrice"));
			demand.setPayTime(_ctx.longValue("QueryBrokerDemandResponse.Data["+ i +"].PayTime"));
			demand.setBargainSellerPrice(_ctx.floatValue("QueryBrokerDemandResponse.Data["+ i +"].BargainSellerPrice"));
			demand.setOrderType(_ctx.integerValue("QueryBrokerDemandResponse.Data["+ i +"].OrderType"));
			demand.setPayDomain(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].PayDomain"));
			demand.setAuditStatus(_ctx.integerValue("QueryBrokerDemandResponse.Data["+ i +"].AuditStatus"));
			demand.setPartnerDomain(_ctx.stringValue("QueryBrokerDemandResponse.Data["+ i +"].PartnerDomain"));
			demand.setPurchaseStatus(_ctx.integerValue("QueryBrokerDemandResponse.Data["+ i +"].PurchaseStatus"));

			data.add(demand);
		}
		queryBrokerDemandResponse.setData(data);
	 
	 	return queryBrokerDemandResponse;
	}
}