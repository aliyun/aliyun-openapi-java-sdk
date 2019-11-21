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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeRegionsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeRegionsResponse.RegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<RegionInfo> result = new ArrayList<RegionInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Result.Length"); i++) {
			RegionInfo regionInfo = new RegionInfo();
			regionInfo.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].regionId"));
			regionInfo.setRegionEndpoint(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].regionEndpoint"));
			regionInfo.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].localName"));
			regionInfo.setConsoleEndpoint(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].consoleEndpoint"));
			regionInfo.setStatus(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].status"));

			result.add(regionInfo);
		}
		describeRegionsResponse.setResult(result);
	 
	 	return describeRegionsResponse;
	}
}