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

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeReleasableRegionListResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeReleasableRegionListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReleasableRegionListResponseUnmarshaller {

	public static DescribeReleasableRegionListResponse unmarshall(DescribeReleasableRegionListResponse describeReleasableRegionListResponse, UnmarshallerContext _ctx) {
		
		describeReleasableRegionListResponse.setRequestId(_ctx.stringValue("DescribeReleasableRegionListResponse.RequestId"));
		describeReleasableRegionListResponse.setErrorCode(_ctx.stringValue("DescribeReleasableRegionListResponse.ErrorCode"));
		describeReleasableRegionListResponse.setCode(_ctx.integerValue("DescribeReleasableRegionListResponse.Code"));
		describeReleasableRegionListResponse.setMsg(_ctx.stringValue("DescribeReleasableRegionListResponse.Msg"));
		describeReleasableRegionListResponse.setSuccess(_ctx.booleanValue("DescribeReleasableRegionListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReleasableRegionListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionNo(_ctx.stringValue("DescribeReleasableRegionListResponse.Data["+ i +"].RegionNo"));
			dataItem.setRegionName(_ctx.stringValue("DescribeReleasableRegionListResponse.Data["+ i +"].RegionName"));
			dataItem.setTrackId(_ctx.stringValue("DescribeReleasableRegionListResponse.Data["+ i +"].TrackId"));

			data.add(dataItem);
		}
		describeReleasableRegionListResponse.setData(data);
	 
	 	return describeReleasableRegionListResponse;
	}
}