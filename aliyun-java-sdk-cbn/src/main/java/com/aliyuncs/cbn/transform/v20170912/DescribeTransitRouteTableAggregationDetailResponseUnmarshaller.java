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

import com.aliyuncs.cbn.model.v20170912.DescribeTransitRouteTableAggregationDetailResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeTransitRouteTableAggregationDetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransitRouteTableAggregationDetailResponseUnmarshaller {

	public static DescribeTransitRouteTableAggregationDetailResponse unmarshall(DescribeTransitRouteTableAggregationDetailResponse describeTransitRouteTableAggregationDetailResponse, UnmarshallerContext _ctx) {
		
		describeTransitRouteTableAggregationDetailResponse.setRequestId(_ctx.stringValue("DescribeTransitRouteTableAggregationDetailResponse.RequestId"));
		describeTransitRouteTableAggregationDetailResponse.setCount(_ctx.integerValue("DescribeTransitRouteTableAggregationDetailResponse.Count"));
		describeTransitRouteTableAggregationDetailResponse.setNextToken(_ctx.stringValue("DescribeTransitRouteTableAggregationDetailResponse.NextToken"));
		describeTransitRouteTableAggregationDetailResponse.setTotal(_ctx.integerValue("DescribeTransitRouteTableAggregationDetailResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransitRouteTableAggregationDetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("DescribeTransitRouteTableAggregationDetailResponse.Data["+ i +"].InstanceId"));
			dataItem.setDescription(_ctx.stringValue("DescribeTransitRouteTableAggregationDetailResponse.Data["+ i +"].Description"));
			dataItem.setStatus(_ctx.stringValue("DescribeTransitRouteTableAggregationDetailResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		describeTransitRouteTableAggregationDetailResponse.setData(data);
	 
	 	return describeTransitRouteTableAggregationDetailResponse;
	}
}