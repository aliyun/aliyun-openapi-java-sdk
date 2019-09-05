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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiIpControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiIpControlsResponse.ApiIpControlItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiIpControlsResponseUnmarshaller {

	public static DescribeApiIpControlsResponse unmarshall(DescribeApiIpControlsResponse describeApiIpControlsResponse, UnmarshallerContext _ctx) {
		
		describeApiIpControlsResponse.setRequestId(_ctx.stringValue("DescribeApiIpControlsResponse.RequestId"));
		describeApiIpControlsResponse.setTotalCount(_ctx.integerValue("DescribeApiIpControlsResponse.TotalCount"));
		describeApiIpControlsResponse.setPageSize(_ctx.integerValue("DescribeApiIpControlsResponse.PageSize"));
		describeApiIpControlsResponse.setPageNumber(_ctx.integerValue("DescribeApiIpControlsResponse.PageNumber"));

		List<ApiIpControlItem> apiIpControls = new ArrayList<ApiIpControlItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiIpControlsResponse.ApiIpControls.Length"); i++) {
			ApiIpControlItem apiIpControlItem = new ApiIpControlItem();
			apiIpControlItem.setApiId(_ctx.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].ApiId"));
			apiIpControlItem.setApiName(_ctx.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].ApiName"));
			apiIpControlItem.setIpControlId(_ctx.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].IpControlId"));
			apiIpControlItem.setIpControlName(_ctx.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].IpControlName"));
			apiIpControlItem.setBoundTime(_ctx.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].BoundTime"));

			apiIpControls.add(apiIpControlItem);
		}
		describeApiIpControlsResponse.setApiIpControls(apiIpControls);
	 
	 	return describeApiIpControlsResponse;
	}
}