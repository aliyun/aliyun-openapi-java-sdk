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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsUserResourcePackageResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsUserResourcePackageResponse.ResourcePackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsUserResourcePackageResponseUnmarshaller {

	public static DescribeVsUserResourcePackageResponse unmarshall(DescribeVsUserResourcePackageResponse describeVsUserResourcePackageResponse, UnmarshallerContext _ctx) {
		
		describeVsUserResourcePackageResponse.setRequestId(_ctx.stringValue("DescribeVsUserResourcePackageResponse.RequestId"));

		List<ResourcePackageInfo> resourcePackageInfos = new ArrayList<ResourcePackageInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos.Length"); i++) {
			ResourcePackageInfo resourcePackageInfo = new ResourcePackageInfo();
			resourcePackageInfo.setCurrCapacity(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CurrCapacity"));
			resourcePackageInfo.setInitCapacity(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InitCapacity"));
			resourcePackageInfo.setCommodityCode(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CommodityCode"));
			resourcePackageInfo.setDisplayName(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].DisplayName"));
			resourcePackageInfo.setInstanceId(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InstanceId"));
			resourcePackageInfo.setStatus(_ctx.stringValue("DescribeVsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].Status"));

			resourcePackageInfos.add(resourcePackageInfo);
		}
		describeVsUserResourcePackageResponse.setResourcePackageInfos(resourcePackageInfos);
	 
	 	return describeVsUserResourcePackageResponse;
	}
}