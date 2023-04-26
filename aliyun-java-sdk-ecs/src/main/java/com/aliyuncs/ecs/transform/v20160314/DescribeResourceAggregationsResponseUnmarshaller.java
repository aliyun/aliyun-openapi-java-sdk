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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourceAggregationsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceAggregationsResponse.Aggregation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceAggregationsResponseUnmarshaller {

	public static DescribeResourceAggregationsResponse unmarshall(DescribeResourceAggregationsResponse describeResourceAggregationsResponse, UnmarshallerContext _ctx) {
		
		describeResourceAggregationsResponse.setRequestId(_ctx.stringValue("DescribeResourceAggregationsResponse.RequestId"));

		List<Aggregation> aggregations = new ArrayList<Aggregation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceAggregationsResponse.Aggregations.Length"); i++) {
			Aggregation aggregation = new Aggregation();
			aggregation.setKeys(_ctx.stringValue("DescribeResourceAggregationsResponse.Aggregations["+ i +"].Keys"));
			aggregation.setCount(_ctx.stringValue("DescribeResourceAggregationsResponse.Aggregations["+ i +"].Count"));

			aggregations.add(aggregation);
		}
		describeResourceAggregationsResponse.setAggregations(aggregations);
	 
	 	return describeResourceAggregationsResponse;
	}
}