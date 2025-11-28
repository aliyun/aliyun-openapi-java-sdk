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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeApplicationsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationsResponse.Applications;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationsResponse.Applications.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationsResponseUnmarshaller {

	public static DescribeApplicationsResponse unmarshall(DescribeApplicationsResponse describeApplicationsResponse, UnmarshallerContext _ctx) {
		
		describeApplicationsResponse.setRequestId(_ctx.stringValue("DescribeApplicationsResponse.RequestId"));
		describeApplicationsResponse.setTotalRecordCount(_ctx.integerValue("DescribeApplicationsResponse.TotalRecordCount"));
		describeApplicationsResponse.setPageRecordCount(_ctx.integerValue("DescribeApplicationsResponse.PageRecordCount"));
		describeApplicationsResponse.setPageNumber(_ctx.integerValue("DescribeApplicationsResponse.PageNumber"));

		List<Applications> items = new ArrayList<Applications>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationsResponse.Items.Length"); i++) {
			Applications applications = new Applications();
			applications.setStatus(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Status"));
			applications.setDescription(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Description"));
			applications.setEngineVersion(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].EngineVersion"));
			applications.setZoneId(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].ZoneId"));
			applications.setExpired(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Expired"));
			applications.setPayType(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].PayType"));
			applications.setPolarFSInstanceId(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].PolarFSInstanceId"));
			applications.setApplicationType(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].ApplicationType"));
			applications.setCreationTime(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].CreationTime"));
			applications.setRegionId(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].RegionId"));
			applications.setApplicationId(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].ApplicationId"));
			applications.setExpireTime(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].ExpireTime"));
			applications.setDBClusterId(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].DBClusterId"));
			applications.setCategory(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Category"));

			List<Endpoint> endpoints = new ArrayList<Endpoint>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationsResponse.Items["+ i +"].Endpoints.Length"); j++) {
				Endpoint endpoint = new Endpoint();
				endpoint.setIP(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Endpoints["+ j +"].IP"));
				endpoint.setPort(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Endpoints["+ j +"].Port"));
				endpoint.setNetType(_ctx.stringValue("DescribeApplicationsResponse.Items["+ i +"].Endpoints["+ j +"].NetType"));

				endpoints.add(endpoint);
			}
			applications.setEndpoints(endpoints);

			items.add(applications);
		}
		describeApplicationsResponse.setItems(items);
	 
	 	return describeApplicationsResponse;
	}
}