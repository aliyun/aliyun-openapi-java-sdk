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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeAccessibleRegionsResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeAccessibleRegionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessibleRegionsResponseUnmarshaller {

	public static DescribeAccessibleRegionsResponse unmarshall(DescribeAccessibleRegionsResponse describeAccessibleRegionsResponse, UnmarshallerContext _ctx) {
		
		describeAccessibleRegionsResponse.setRequestId(_ctx.stringValue("DescribeAccessibleRegionsResponse.RequestId"));
		describeAccessibleRegionsResponse.setErrorCode(_ctx.stringValue("DescribeAccessibleRegionsResponse.ErrorCode"));
		describeAccessibleRegionsResponse.setCode(_ctx.integerValue("DescribeAccessibleRegionsResponse.Code"));
		describeAccessibleRegionsResponse.setMsg(_ctx.stringValue("DescribeAccessibleRegionsResponse.Msg"));
		describeAccessibleRegionsResponse.setSuccess(_ctx.booleanValue("DescribeAccessibleRegionsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessibleRegionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionNo(_ctx.stringValue("DescribeAccessibleRegionsResponse.Data["+ i +"].RegionNo"));
			dataItem.setRegionName(_ctx.stringValue("DescribeAccessibleRegionsResponse.Data["+ i +"].RegionName"));
			dataItem.setTrackId(_ctx.stringValue("DescribeAccessibleRegionsResponse.Data["+ i +"].TrackId"));

			data.add(dataItem);
		}
		describeAccessibleRegionsResponse.setData(data);
	 
	 	return describeAccessibleRegionsResponse;
	}
}