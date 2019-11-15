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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserResourcePackageResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserResourcePackageResponse.ResourcePackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserResourcePackageResponseUnmarshaller {

	public static DescribeDcdnUserResourcePackageResponse unmarshall(DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackageResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserResourcePackageResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.RequestId"));

		List<ResourcePackageInfo> resourcePackageInfos = new ArrayList<ResourcePackageInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos.Length"); i++) {
			ResourcePackageInfo resourcePackageInfo = new ResourcePackageInfo();
			resourcePackageInfo.setCurrCapacity(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CurrCapacity"));
			resourcePackageInfo.setInitCapacity(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InitCapacity"));
			resourcePackageInfo.setCommodityCode(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].CommodityCode"));
			resourcePackageInfo.setDisplayName(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].DisplayName"));
			resourcePackageInfo.setTemplateName(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].TemplateName"));
			resourcePackageInfo.setInstanceId(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].InstanceId"));
			resourcePackageInfo.setStatus(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].Status"));
			resourcePackageInfo.setStartTime(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].StartTime"));
			resourcePackageInfo.setEndTime(_ctx.stringValue("DescribeDcdnUserResourcePackageResponse.ResourcePackageInfos["+ i +"].EndTime"));

			resourcePackageInfos.add(resourcePackageInfo);
		}
		describeDcdnUserResourcePackageResponse.setResourcePackageInfos(resourcePackageInfos);
	 
	 	return describeDcdnUserResourcePackageResponse;
	}
}