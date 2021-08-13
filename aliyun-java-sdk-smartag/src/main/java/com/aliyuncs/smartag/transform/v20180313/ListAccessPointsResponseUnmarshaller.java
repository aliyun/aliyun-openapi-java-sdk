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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListAccessPointsResponse;
import com.aliyuncs.smartag.model.v20180313.ListAccessPointsResponse.AccessPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessPointsResponseUnmarshaller {

	public static ListAccessPointsResponse unmarshall(ListAccessPointsResponse listAccessPointsResponse, UnmarshallerContext _ctx) {
		
		listAccessPointsResponse.setRequestId(_ctx.stringValue("ListAccessPointsResponse.RequestId"));
		listAccessPointsResponse.setTotalCount(_ctx.integerValue("ListAccessPointsResponse.TotalCount"));

		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessPointsResponse.AccessPoints.Length"); i++) {
			AccessPoint accessPoint = new AccessPoint();
			accessPoint.setLongitude(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].Longitude"));
			accessPoint.setActiveSmartAGCount(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].ActiveSmartAGCount"));
			accessPoint.setInactiveSmartAGCount(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].InactiveSmartAGCount"));
			accessPoint.setLatitude(_ctx.stringValue("ListAccessPointsResponse.AccessPoints["+ i +"].Latitude"));
			accessPoint.setAccessPointId(_ctx.integerValue("ListAccessPointsResponse.AccessPoints["+ i +"].AccessPointId"));

			accessPoints.add(accessPoint);
		}
		listAccessPointsResponse.setAccessPoints(accessPoints);
	 
	 	return listAccessPointsResponse;
	}
}