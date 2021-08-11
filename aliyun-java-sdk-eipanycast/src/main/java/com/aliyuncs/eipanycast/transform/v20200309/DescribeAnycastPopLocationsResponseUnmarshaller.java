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

import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastPopLocationsResponse;
import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastPopLocationsResponse.AnycastPopLocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnycastPopLocationsResponseUnmarshaller {

	public static DescribeAnycastPopLocationsResponse unmarshall(DescribeAnycastPopLocationsResponse describeAnycastPopLocationsResponse, UnmarshallerContext _ctx) {
		
		describeAnycastPopLocationsResponse.setRequestId(_ctx.stringValue("DescribeAnycastPopLocationsResponse.RequestId"));
		describeAnycastPopLocationsResponse.setCount(_ctx.stringValue("DescribeAnycastPopLocationsResponse.Count"));

		List<AnycastPopLocation> anycastPopLocationList = new ArrayList<AnycastPopLocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAnycastPopLocationsResponse.AnycastPopLocationList.Length"); i++) {
			AnycastPopLocation anycastPopLocation = new AnycastPopLocation();
			anycastPopLocation.setRegionId(_ctx.stringValue("DescribeAnycastPopLocationsResponse.AnycastPopLocationList["+ i +"].RegionId"));
			anycastPopLocation.setRegionName(_ctx.stringValue("DescribeAnycastPopLocationsResponse.AnycastPopLocationList["+ i +"].RegionName"));

			anycastPopLocationList.add(anycastPopLocation);
		}
		describeAnycastPopLocationsResponse.setAnycastPopLocationList(anycastPopLocationList);
	 
	 	return describeAnycastPopLocationsResponse;
	}
}