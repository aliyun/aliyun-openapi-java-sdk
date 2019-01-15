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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodUserResourcePackageResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodUserResourcePackageResponse.ResourcePackageInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserResourcePackageResponseUnmarshaller {

	public static DescribeVodUserResourcePackageResponse unmarshall(DescribeVodUserResourcePackageResponse describeVodUserResourcePackageResponse, UnmarshallerContext context) {
		
		describeVodUserResourcePackageResponse.setRequestId(context.stringValue("DescribeVodUserResourcePackageResponse.RequestId"));

		List<ResourcePackageInfo> resourcePackageInfos = new ArrayList<ResourcePackageInfo>();
		for (int i = 0; i < context.lengthValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos.Length"); i++) {
			ResourcePackageInfo resourcePackageInfo = new ResourcePackageInfo();
			resourcePackageInfo.setCurrCapacity(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CurrCapacity"));
			resourcePackageInfo.setInitCapacity(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InitCapacity"));
			resourcePackageInfo.setCommodityCode(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CommodityCode"));
			resourcePackageInfo.setDisplayName(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].DisplayName"));
			resourcePackageInfo.setInstanceId(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InstanceId"));
			resourcePackageInfo.setStatus(context.stringValue("DescribeVodUserResourcePackageResponse.ResourcePackageInfos["+ i +"].Status"));

			resourcePackageInfos.add(resourcePackageInfo);
		}
		describeVodUserResourcePackageResponse.setResourcePackageInfos(resourcePackageInfos);
	 
	 	return describeVodUserResourcePackageResponse;
	}
}