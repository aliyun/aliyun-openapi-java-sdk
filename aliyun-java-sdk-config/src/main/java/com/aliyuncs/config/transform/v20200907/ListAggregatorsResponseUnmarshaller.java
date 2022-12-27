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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregatorsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregatorsResponse.AggregatorsResult;
import com.aliyuncs.config.model.v20200907.ListAggregatorsResponse.AggregatorsResult.AggregatorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregatorsResponseUnmarshaller {

	public static ListAggregatorsResponse unmarshall(ListAggregatorsResponse listAggregatorsResponse, UnmarshallerContext _ctx) {
		
		listAggregatorsResponse.setRequestId(_ctx.stringValue("ListAggregatorsResponse.RequestId"));

		AggregatorsResult aggregatorsResult = new AggregatorsResult();
		aggregatorsResult.setNextToken(_ctx.stringValue("ListAggregatorsResponse.AggregatorsResult.NextToken"));
		aggregatorsResult.setMaxResults(_ctx.integerValue("ListAggregatorsResponse.AggregatorsResult.MaxResults"));

		List<AggregatorsItem> aggregators = new ArrayList<AggregatorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregatorsResponse.AggregatorsResult.Aggregators.Length"); i++) {
			AggregatorsItem aggregatorsItem = new AggregatorsItem();
			aggregatorsItem.setAggregatorCreateTimestamp(_ctx.longValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorCreateTimestamp"));
			aggregatorsItem.setAggregatorAccountCount(_ctx.longValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorAccountCount"));
			aggregatorsItem.setDescription(_ctx.stringValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].Description"));
			aggregatorsItem.setAggregatorName(_ctx.stringValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorName"));
			aggregatorsItem.setAggregatorStatus(_ctx.integerValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorStatus"));
			aggregatorsItem.setAggregatorType(_ctx.stringValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorType"));
			aggregatorsItem.setAccountId(_ctx.longValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AccountId"));
			aggregatorsItem.setAggregatorId(_ctx.stringValue("ListAggregatorsResponse.AggregatorsResult.Aggregators["+ i +"].AggregatorId"));

			aggregators.add(aggregatorsItem);
		}
		aggregatorsResult.setAggregators(aggregators);
		listAggregatorsResponse.setAggregatorsResult(aggregatorsResult);
	 
	 	return listAggregatorsResponse;
	}
}