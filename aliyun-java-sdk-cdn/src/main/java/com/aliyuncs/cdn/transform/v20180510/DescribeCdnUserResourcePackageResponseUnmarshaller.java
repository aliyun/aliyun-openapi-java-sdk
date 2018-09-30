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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserResourcePackageResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserResourcePackageResponse.ResourcePackageInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserResourcePackageResponseUnmarshaller {

	public static DescribeCdnUserResourcePackageResponse unmarshall(DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackageResponse, UnmarshallerContext context) {
		
		describeCdnUserResourcePackageResponse.setRequestId(context.stringValue("DescribeCdnUserResourcePackageResponse.RequestId"));

		List<ResourcePackageInfo> resourcePackageInfos = new ArrayList<ResourcePackageInfo>();
		for (int i = 0; i < context.lengthValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos.Length"); i++) {
			ResourcePackageInfo resourcePackageInfo = new ResourcePackageInfo();
			resourcePackageInfo.setCurrCapacity(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CurrCapacity"));
			resourcePackageInfo.setInitCapacity(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InitCapacity"));
			resourcePackageInfo.setCommodityCode(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CommodityCode"));
			resourcePackageInfo.setDisplayName(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].DisplayName"));
			resourcePackageInfo.setInstanceId(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InstanceId"));
			resourcePackageInfo.setStatus(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].Status"));
			resourcePackageInfo.setStartTime(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].StartTime"));
			resourcePackageInfo.setEndTime(context.stringValue("DescribeCdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].EndTime"));

			resourcePackageInfos.add(resourcePackageInfo);
		}
		describeCdnUserResourcePackageResponse.setResourcePackageInfos(resourcePackageInfos);
	 
	 	return describeCdnUserResourcePackageResponse;
	}
}