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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeResolverAvailableZonesResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverAvailableZonesResponse.AvailableZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResolverAvailableZonesResponseUnmarshaller {

	public static DescribeResolverAvailableZonesResponse unmarshall(DescribeResolverAvailableZonesResponse describeResolverAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		describeResolverAvailableZonesResponse.setRequestId(_ctx.stringValue("DescribeResolverAvailableZonesResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverAvailableZonesResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setStatus(_ctx.stringValue("DescribeResolverAvailableZonesResponse.AvailableZones["+ i +"].Status"));
			availableZone.setAzId(_ctx.stringValue("DescribeResolverAvailableZonesResponse.AvailableZones["+ i +"].AzId"));

			availableZones.add(availableZone);
		}
		describeResolverAvailableZonesResponse.setAvailableZones(availableZones);
	 
	 	return describeResolverAvailableZonesResponse;
	}
}