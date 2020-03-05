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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeRouteServicesInCenResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeRouteServicesInCenResponse.RouteServiceEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteServicesInCenResponseUnmarshaller {

	public static DescribeRouteServicesInCenResponse unmarshall(DescribeRouteServicesInCenResponse describeRouteServicesInCenResponse, UnmarshallerContext _ctx) {
		
		describeRouteServicesInCenResponse.setRequestId(_ctx.stringValue("DescribeRouteServicesInCenResponse.RequestId"));
		describeRouteServicesInCenResponse.setTotalCount(_ctx.integerValue("DescribeRouteServicesInCenResponse.TotalCount"));
		describeRouteServicesInCenResponse.setPageNumber(_ctx.integerValue("DescribeRouteServicesInCenResponse.PageNumber"));
		describeRouteServicesInCenResponse.setPageSize(_ctx.integerValue("DescribeRouteServicesInCenResponse.PageSize"));

		List<RouteServiceEntry> routeServiceEntries = new ArrayList<RouteServiceEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteServicesInCenResponse.RouteServiceEntries.Length"); i++) {
			RouteServiceEntry routeServiceEntry = new RouteServiceEntry();
			routeServiceEntry.setCenId(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].CenId"));
			routeServiceEntry.setHost(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].Host"));
			routeServiceEntry.setHostRegionId(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].HostRegionId"));
			routeServiceEntry.setAccessRegionId(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].AccessRegionId"));
			routeServiceEntry.setUpdateInterval(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].UpdateInterval"));
			routeServiceEntry.setStatus(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].Status"));
			routeServiceEntry.setHostVpcId(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].HostVpcId"));
			routeServiceEntry.setDescription(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].Description"));

			List<String> cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].Cidrs.Length"); j++) {
				cidrs.add(_ctx.stringValue("DescribeRouteServicesInCenResponse.RouteServiceEntries["+ i +"].Cidrs["+ j +"]"));
			}
			routeServiceEntry.setCidrs(cidrs);

			routeServiceEntries.add(routeServiceEntry);
		}
		describeRouteServicesInCenResponse.setRouteServiceEntries(routeServiceEntries);
	 
	 	return describeRouteServicesInCenResponse;
	}
}