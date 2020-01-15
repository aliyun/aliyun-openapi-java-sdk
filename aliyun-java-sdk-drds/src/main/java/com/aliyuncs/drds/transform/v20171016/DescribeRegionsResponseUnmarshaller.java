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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeRegionsResponse;
import com.aliyuncs.drds.model.v20171016.DescribeRegionsResponse.DrdsRegion;
import com.aliyuncs.drds.model.v20171016.DescribeRegionsResponse.DrdsRegion.InstanceSeries;
import com.aliyuncs.drds.model.v20171016.DescribeRegionsResponse.DrdsRegion.InstanceSeries.Spec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));

		List<DrdsRegion> drdsRegions = new ArrayList<DrdsRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.DrdsRegions.Length"); i++) {
			DrdsRegion drdsRegion = new DrdsRegion();
			drdsRegion.setRegionId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionId"));
			drdsRegion.setRegionName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionName"));
			drdsRegion.setZoneId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneId"));
			drdsRegion.setZoneName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneName"));

			List<InstanceSeries> instanceSeriesList = new ArrayList<InstanceSeries>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList.Length"); j++) {
				InstanceSeries instanceSeries = new InstanceSeries();
				instanceSeries.setSeriesId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList["+ j +"].SeriesId"));
				instanceSeries.setSeriesName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList["+ j +"].SeriesName"));

				List<Spec> specList = new ArrayList<Spec>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList["+ j +"].SpecList.Length"); k++) {
					Spec spec = new Spec();
					spec.setSpecId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList["+ j +"].SpecList["+ k +"].SpecId"));
					spec.setSpecName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].InstanceSeriesList["+ j +"].SpecList["+ k +"].SpecName"));

					specList.add(spec);
				}
				instanceSeries.setSpecList(specList);

				instanceSeriesList.add(instanceSeries);
			}
			drdsRegion.setInstanceSeriesList(instanceSeriesList);

			drdsRegions.add(drdsRegion);
		}
		describeRegionsResponse.setDrdsRegions(drdsRegions);
	 
	 	return describeRegionsResponse;
	}
}