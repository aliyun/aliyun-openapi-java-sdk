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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBrokerDemandResponseUnmarshaller {

	public static QueryBrokerDemandResponse unmarshall(QueryBrokerDemandResponse queryBrokerDemandResponse, UnmarshallerContext context) {
		
		queryBrokerDemandResponse.setRequestId(context.stringValue("QueryBrokerDemandResponse.RequestId"));
		queryBrokerDemandResponse.setTotalItemNum(context.integerValue("QueryBrokerDemandResponse.TotalItemNum"));
		queryBrokerDemandResponse.setCurrentPageNum(context.integerValue("QueryBrokerDemandResponse.CurrentPageNum"));
		queryBrokerDemandResponse.setPageSize(context.integerValue("QueryBrokerDemandResponse.PageSize"));
		queryBrokerDemandResponse.setTotalPageNum(context.integerValue("QueryBrokerDemandResponse.TotalPageNum"));

		List<Demand> data = new ArrayList<Demand>();
		for (int i = 0; i < context.lengthValue("QueryBrokerDemandResponse.Data.Length"); i++) {
			Demand demand = new Demand();
			demand.setBizId(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].BizId"));
			demand.setStatus(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Status"));
			demand.setDemandDomain(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].DemandDomain"));
			demand.setDemandPrice(context.floatValue("QueryBrokerDemandResponse.Data["+ i +"].DemandPrice"));
			demand.setMobile(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Mobile"));
			demand.setDescription(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].Description"));
			demand.setPublishTime(context.longValue("QueryBrokerDemandResponse.Data["+ i +"].PublishTime"));
			demand.setPayDomain(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].PayDomain"));
			demand.setPayPrice(context.floatValue("QueryBrokerDemandResponse.Data["+ i +"].PayPrice"));
			demand.setPayTime(context.longValue("QueryBrokerDemandResponse.Data["+ i +"].PayTime"));
			demand.setProduceType(context.integerValue("QueryBrokerDemandResponse.Data["+ i +"].ProduceType"));
			demand.setBargainSellerPrice(context.floatValue("QueryBrokerDemandResponse.Data["+ i +"].BargainSellerPrice"));
			demand.setBargainSellerMobile(context.stringValue("QueryBrokerDemandResponse.Data["+ i +"].BargainSellerMobile"));

			data.add(demand);
		}
		queryBrokerDemandResponse.setData(data);
	 
	 	return queryBrokerDemandResponse;
	}
}