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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeProduceResultsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeProduceResultsResponse.ProduceResultSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeProduceResultsResponseUnmarshaller {

	public static OpsDescribeProduceResultsResponse unmarshall(OpsDescribeProduceResultsResponse opsDescribeProduceResultsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeProduceResultsResponse.setRequestId(_ctx.stringValue("OpsDescribeProduceResultsResponse.RequestId"));

		List<ProduceResultSet> produceResultSets = new ArrayList<ProduceResultSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeProduceResultsResponse.ProduceResultSets.Length"); i++) {
			ProduceResultSet produceResultSet = new ProduceResultSet();
			produceResultSet.setId(_ctx.longValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].Id"));
			produceResultSet.setOrderId(_ctx.longValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].OrderId"));
			produceResultSet.setInstanceId(_ctx.stringValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].InstanceId"));
			produceResultSet.setStatus(_ctx.integerValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].Status"));
			produceResultSet.setResourceType(_ctx.stringValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].ResourceType"));
			produceResultSet.setChargeType(_ctx.integerValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].ChargeType"));
			produceResultSet.setActionType(_ctx.integerValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].ActionType"));
			produceResultSet.setCommodityCode(_ctx.stringValue("OpsDescribeProduceResultsResponse.ProduceResultSets["+ i +"].commodityCode"));

			produceResultSets.add(produceResultSet);
		}
		opsDescribeProduceResultsResponse.setProduceResultSets(produceResultSets);
	 
	 	return opsDescribeProduceResultsResponse;
	}
}