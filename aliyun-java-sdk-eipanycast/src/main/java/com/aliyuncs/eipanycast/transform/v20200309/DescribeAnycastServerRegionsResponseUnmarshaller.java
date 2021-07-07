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

package com.aliyuncs.eipanycast.transform.v20200309;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastServerRegionsResponse;
import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastServerRegionsResponse.AnycastServerRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnycastServerRegionsResponseUnmarshaller {

	public static DescribeAnycastServerRegionsResponse unmarshall(DescribeAnycastServerRegionsResponse describeAnycastServerRegionsResponse, UnmarshallerContext _ctx) {
		
		describeAnycastServerRegionsResponse.setRequestId(_ctx.stringValue("DescribeAnycastServerRegionsResponse.RequestId"));
		describeAnycastServerRegionsResponse.setCount(_ctx.stringValue("DescribeAnycastServerRegionsResponse.Count"));

		List<AnycastServerRegion> anycastServerRegionList = new ArrayList<AnycastServerRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAnycastServerRegionsResponse.AnycastServerRegionList.Length"); i++) {
			AnycastServerRegion anycastServerRegion = new AnycastServerRegion();
			anycastServerRegion.setRegionId(_ctx.stringValue("DescribeAnycastServerRegionsResponse.AnycastServerRegionList["+ i +"].RegionId"));
			anycastServerRegion.setRegionName(_ctx.stringValue("DescribeAnycastServerRegionsResponse.AnycastServerRegionList["+ i +"].RegionName"));

			anycastServerRegionList.add(anycastServerRegion);
		}
		describeAnycastServerRegionsResponse.setAnycastServerRegionList(anycastServerRegionList);
	 
	 	return describeAnycastServerRegionsResponse;
	}
}