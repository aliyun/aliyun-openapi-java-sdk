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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficControlsResponse.ApiTrafficControlItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiTrafficControlsResponseUnmarshaller {

	public static DescribeApiTrafficControlsResponse unmarshall(DescribeApiTrafficControlsResponse describeApiTrafficControlsResponse, UnmarshallerContext _ctx) {
		
		describeApiTrafficControlsResponse.setRequestId(_ctx.stringValue("DescribeApiTrafficControlsResponse.RequestId"));
		describeApiTrafficControlsResponse.setPageNumber(_ctx.integerValue("DescribeApiTrafficControlsResponse.PageNumber"));
		describeApiTrafficControlsResponse.setPageSize(_ctx.integerValue("DescribeApiTrafficControlsResponse.PageSize"));
		describeApiTrafficControlsResponse.setTotalCount(_ctx.integerValue("DescribeApiTrafficControlsResponse.TotalCount"));

		List<ApiTrafficControlItem> apiTrafficControls = new ArrayList<ApiTrafficControlItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiTrafficControlsResponse.ApiTrafficControls.Length"); i++) {
			ApiTrafficControlItem apiTrafficControlItem = new ApiTrafficControlItem();
			apiTrafficControlItem.setBoundTime(_ctx.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].BoundTime"));
			apiTrafficControlItem.setApiId(_ctx.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].ApiId"));
			apiTrafficControlItem.setTrafficControlId(_ctx.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].TrafficControlId"));
			apiTrafficControlItem.setTrafficControlName(_ctx.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].TrafficControlName"));
			apiTrafficControlItem.setApiName(_ctx.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].ApiName"));

			apiTrafficControls.add(apiTrafficControlItem);
		}
		describeApiTrafficControlsResponse.setApiTrafficControls(apiTrafficControls);
	 
	 	return describeApiTrafficControlsResponse;
	}
}