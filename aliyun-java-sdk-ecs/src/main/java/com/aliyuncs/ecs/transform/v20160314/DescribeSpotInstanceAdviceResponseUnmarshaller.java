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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeSpotInstanceAdviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpotInstanceAdviceResponseUnmarshaller {

	public static DescribeSpotInstanceAdviceResponse unmarshall(DescribeSpotInstanceAdviceResponse describeSpotInstanceAdviceResponse, UnmarshallerContext _ctx) {
		
		describeSpotInstanceAdviceResponse.setRequestId(_ctx.stringValue("DescribeSpotInstanceAdviceResponse.RequestId"));
		describeSpotInstanceAdviceResponse.setRegionId(_ctx.stringValue("DescribeSpotInstanceAdviceResponse.RegionId"));

		List<String> availableSpotZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSpotInstanceAdviceResponse.AvailableSpotZones.Length"); i++) {
			availableSpotZones.add(_ctx.stringValue("DescribeSpotInstanceAdviceResponse.AvailableSpotZones["+ i +"]"));
		}
		describeSpotInstanceAdviceResponse.setAvailableSpotZones(availableSpotZones);
	 
	 	return describeSpotInstanceAdviceResponse;
	}
}