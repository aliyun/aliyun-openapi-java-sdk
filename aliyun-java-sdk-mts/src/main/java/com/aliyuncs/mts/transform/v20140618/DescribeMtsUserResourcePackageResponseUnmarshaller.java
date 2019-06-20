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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.DescribeMtsUserResourcePackageResponse;
import com.aliyuncs.mts.model.v20140618.DescribeMtsUserResourcePackageResponse.ResourcePackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMtsUserResourcePackageResponseUnmarshaller {

	public static DescribeMtsUserResourcePackageResponse unmarshall(DescribeMtsUserResourcePackageResponse describeMtsUserResourcePackageResponse, UnmarshallerContext context) {
		
		describeMtsUserResourcePackageResponse.setRequestId(context.stringValue("DescribeMtsUserResourcePackageResponse.RequestId"));

		List<ResourcePackageInfo> resourcePackageInfos = new ArrayList<ResourcePackageInfo>();
		for (int i = 0; i < context.lengthValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos.Length"); i++) {
			ResourcePackageInfo resourcePackageInfo = new ResourcePackageInfo();
			resourcePackageInfo.setCurrCapacity(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CurrCapacity"));
			resourcePackageInfo.setInitCapacity(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InitCapacity"));
			resourcePackageInfo.setCommodityCode(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CommodityCode"));
			resourcePackageInfo.setDisplayName(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].DisplayName"));
			resourcePackageInfo.setInstanceId(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InstanceId"));
			resourcePackageInfo.setStatus(context.stringValue("DescribeMtsUserResourcePackageResponse.ResourcePackageInfos["+ i +"].Status"));

			resourcePackageInfos.add(resourcePackageInfo);
		}
		describeMtsUserResourcePackageResponse.setResourcePackageInfos(resourcePackageInfos);
	 
	 	return describeMtsUserResourcePackageResponse;
	}
}