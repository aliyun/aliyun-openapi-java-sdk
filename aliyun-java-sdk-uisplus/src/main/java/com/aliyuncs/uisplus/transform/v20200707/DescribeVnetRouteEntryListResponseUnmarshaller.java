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

package com.aliyuncs.uisplus.transform.v20200707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uisplus.model.v20200707.DescribeVnetRouteEntryListResponse;
import com.aliyuncs.uisplus.model.v20200707.DescribeVnetRouteEntryListResponse.VnetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnetRouteEntryListResponseUnmarshaller {

	public static DescribeVnetRouteEntryListResponse unmarshall(DescribeVnetRouteEntryListResponse describeVnetRouteEntryListResponse, UnmarshallerContext _ctx) {
		
		describeVnetRouteEntryListResponse.setRequestId(_ctx.stringValue("DescribeVnetRouteEntryListResponse.RequestId"));
		describeVnetRouteEntryListResponse.setPageSize(_ctx.integerValue("DescribeVnetRouteEntryListResponse.PageSize"));
		describeVnetRouteEntryListResponse.setPageNumber(_ctx.integerValue("DescribeVnetRouteEntryListResponse.PageNumber"));
		describeVnetRouteEntryListResponse.setTotalCount(_ctx.integerValue("DescribeVnetRouteEntryListResponse.TotalCount"));

		List<VnetsItem> vnets = new ArrayList<VnetsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVnetRouteEntryListResponse.Vnets.Length"); i++) {
			VnetsItem vnetsItem = new VnetsItem();
			vnetsItem.setUisId(_ctx.stringValue("DescribeVnetRouteEntryListResponse.Vnets["+ i +"].UisId"));
			vnetsItem.setNexthop(_ctx.stringValue("DescribeVnetRouteEntryListResponse.Vnets["+ i +"].Nexthop"));
			vnetsItem.setVnetId(_ctx.stringValue("DescribeVnetRouteEntryListResponse.Vnets["+ i +"].VnetId"));
			vnetsItem.setDestination(_ctx.stringValue("DescribeVnetRouteEntryListResponse.Vnets["+ i +"].Destination"));
			vnetsItem.setNexthopType(_ctx.stringValue("DescribeVnetRouteEntryListResponse.Vnets["+ i +"].NexthopType"));

			vnets.add(vnetsItem);
		}
		describeVnetRouteEntryListResponse.setVnets(vnets);
	 
	 	return describeVnetRouteEntryListResponse;
	}
}