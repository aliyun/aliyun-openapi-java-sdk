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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListApplicationAccessPointsResponse;
import com.aliyuncs.kms.model.v20160120.ListApplicationAccessPointsResponse.ApplicationAccessPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationAccessPointsResponseUnmarshaller {

	public static ListApplicationAccessPointsResponse unmarshall(ListApplicationAccessPointsResponse listApplicationAccessPointsResponse, UnmarshallerContext _ctx) {
		
		listApplicationAccessPointsResponse.setRequestId(_ctx.stringValue("ListApplicationAccessPointsResponse.RequestId"));
		listApplicationAccessPointsResponse.setPageNumber(_ctx.integerValue("ListApplicationAccessPointsResponse.PageNumber"));
		listApplicationAccessPointsResponse.setPageSize(_ctx.integerValue("ListApplicationAccessPointsResponse.PageSize"));
		listApplicationAccessPointsResponse.setTotalCount(_ctx.integerValue("ListApplicationAccessPointsResponse.TotalCount"));

		List<ApplicationAccessPoint> applicationAccessPoints = new ArrayList<ApplicationAccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationAccessPointsResponse.ApplicationAccessPoints.Length"); i++) {
			ApplicationAccessPoint applicationAccessPoint = new ApplicationAccessPoint();
			applicationAccessPoint.setName(_ctx.stringValue("ListApplicationAccessPointsResponse.ApplicationAccessPoints["+ i +"].Name"));
			applicationAccessPoint.setAuthenticationMethod(_ctx.stringValue("ListApplicationAccessPointsResponse.ApplicationAccessPoints["+ i +"].AuthenticationMethod"));

			applicationAccessPoints.add(applicationAccessPoint);
		}
		listApplicationAccessPointsResponse.setApplicationAccessPoints(applicationAccessPoints);
	 
	 	return listApplicationAccessPointsResponse;
	}
}