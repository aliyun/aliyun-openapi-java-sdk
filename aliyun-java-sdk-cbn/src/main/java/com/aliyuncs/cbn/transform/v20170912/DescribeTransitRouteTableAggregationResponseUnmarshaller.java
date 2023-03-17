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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeTransitRouteTableAggregationResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeTransitRouteTableAggregationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransitRouteTableAggregationResponseUnmarshaller {

	public static DescribeTransitRouteTableAggregationResponse unmarshall(DescribeTransitRouteTableAggregationResponse describeTransitRouteTableAggregationResponse, UnmarshallerContext _ctx) {
		
		describeTransitRouteTableAggregationResponse.setRequestId(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.RequestId"));
		describeTransitRouteTableAggregationResponse.setCount(_ctx.integerValue("DescribeTransitRouteTableAggregationResponse.Count"));
		describeTransitRouteTableAggregationResponse.setNextToken(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.NextToken"));
		describeTransitRouteTableAggregationResponse.setTotal(_ctx.integerValue("DescribeTransitRouteTableAggregationResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransitRouteTableAggregationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].Name"));
			dataItem.setTransitRouteTableAggregationCidr(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].TransitRouteTableAggregationCidr"));
			dataItem.setScope(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].Scope"));
			dataItem.setNexthop(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].Nexthop"));
			dataItem.setRouteType(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].RouteType"));
			dataItem.setDescription(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].Description"));
			dataItem.setTrRouteTableId(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].TrRouteTableId"));
			dataItem.setStatus(_ctx.stringValue("DescribeTransitRouteTableAggregationResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		describeTransitRouteTableAggregationResponse.setData(data);
	 
	 	return describeTransitRouteTableAggregationResponse;
	}
}