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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAreaBlockConfigsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAreaBlockConfigsResponse.AreaBlockConfig;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAreaBlockConfigsResponse.AreaBlockConfig.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebAreaBlockConfigsResponseUnmarshaller {

	public static DescribeWebAreaBlockConfigsResponse unmarshall(DescribeWebAreaBlockConfigsResponse describeWebAreaBlockConfigsResponse, UnmarshallerContext _ctx) {
		
		describeWebAreaBlockConfigsResponse.setRequestId(_ctx.stringValue("DescribeWebAreaBlockConfigsResponse.RequestId"));

		List<AreaBlockConfig> areaBlockConfigs = new ArrayList<AreaBlockConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebAreaBlockConfigsResponse.AreaBlockConfigs.Length"); i++) {
			AreaBlockConfig areaBlockConfig = new AreaBlockConfig();
			areaBlockConfig.setDomain(_ctx.stringValue("DescribeWebAreaBlockConfigsResponse.AreaBlockConfigs["+ i +"].Domain"));

			List<Region> regionList = new ArrayList<Region>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebAreaBlockConfigsResponse.AreaBlockConfigs["+ i +"].RegionList.Length"); j++) {
				Region region = new Region();
				region.setBlock(_ctx.integerValue("DescribeWebAreaBlockConfigsResponse.AreaBlockConfigs["+ i +"].RegionList["+ j +"].Block"));
				region.setRegion(_ctx.stringValue("DescribeWebAreaBlockConfigsResponse.AreaBlockConfigs["+ i +"].RegionList["+ j +"].Region"));

				regionList.add(region);
			}
			areaBlockConfig.setRegionList(regionList);

			areaBlockConfigs.add(areaBlockConfig);
		}
		describeWebAreaBlockConfigsResponse.setAreaBlockConfigs(areaBlockConfigs);
	 
	 	return describeWebAreaBlockConfigsResponse;
	}
}