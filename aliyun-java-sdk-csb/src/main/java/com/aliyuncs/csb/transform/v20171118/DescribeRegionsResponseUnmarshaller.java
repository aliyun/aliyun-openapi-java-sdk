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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.DescribeRegionsResponse;
import com.aliyuncs.csb.model.v20171118.DescribeRegionsResponse.Data;
import com.aliyuncs.csb.model.v20171118.DescribeRegionsResponse.Data.Region;
import com.aliyuncs.csb.model.v20171118.DescribeRegionsResponse.Data.Region.PhysicalLocation;
import com.aliyuncs.csb.model.v20171118.DescribeRegionsResponse.Data.Region.PhysicalLocation.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setCode(_ctx.integerValue("DescribeRegionsResponse.Code"));
		describeRegionsResponse.setMessage(_ctx.stringValue("DescribeRegionsResponse.Message"));

		Data data = new Data();

		List<Region> regionList = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Data.RegionList.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].RegionId"));
			region.setRegionName(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].RegionName"));
			region.setRegionUrl(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].RegionUrl"));
			region.setIsdefault(_ctx.booleanValue("DescribeRegionsResponse.Data.RegionList["+ i +"].Isdefault"));

			List<PhysicalLocation> physicalLocations = new ArrayList<PhysicalLocation>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations.Length"); j++) {
				PhysicalLocation physicalLocation = new PhysicalLocation();
				physicalLocation.setNo(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].No"));
				physicalLocation.setServiceCode(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].ServiceCode"));
				physicalLocation.setType(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Type"));
				physicalLocation.setName(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Name"));
				physicalLocation.setStatus(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Status"));

				List<Attribute> attributes = new ArrayList<Attribute>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Attributes.Length"); k++) {
					Attribute attribute = new Attribute();
					attribute.setName(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Attributes["+ k +"].Name"));
					attribute.setValue(_ctx.stringValue("DescribeRegionsResponse.Data.RegionList["+ i +"].PhysicalLocations["+ j +"].Attributes["+ k +"].Value"));

					attributes.add(attribute);
				}
				physicalLocation.setAttributes(attributes);

				physicalLocations.add(physicalLocation);
			}
			region.setPhysicalLocations(physicalLocations);

			regionList.add(region);
		}
		data.setRegionList(regionList);
		describeRegionsResponse.setData(data);
	 
	 	return describeRegionsResponse;
	}
}