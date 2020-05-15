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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeContactPointsResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeContactPointsResponse.ContactPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactPointsResponseUnmarshaller {

	public static DescribeContactPointsResponse unmarshall(DescribeContactPointsResponse describeContactPointsResponse, UnmarshallerContext _ctx) {
		
		describeContactPointsResponse.setRequestId(_ctx.stringValue("DescribeContactPointsResponse.RequestId"));

		List<ContactPoint> contactPoints = new ArrayList<ContactPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactPointsResponse.ContactPoints.Length"); i++) {
			ContactPoint contactPoint = new ContactPoint();
			contactPoint.setDataCenterId(_ctx.stringValue("DescribeContactPointsResponse.ContactPoints["+ i +"].DataCenterId"));
			contactPoint.setPort(_ctx.integerValue("DescribeContactPointsResponse.ContactPoints["+ i +"].Port"));

			List<String> privateAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactPointsResponse.ContactPoints["+ i +"].PrivateAddresses.Length"); j++) {
				privateAddresses.add(_ctx.stringValue("DescribeContactPointsResponse.ContactPoints["+ i +"].PrivateAddresses["+ j +"]"));
			}
			contactPoint.setPrivateAddresses(privateAddresses);

			List<String> publicAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactPointsResponse.ContactPoints["+ i +"].PublicAddresses.Length"); j++) {
				publicAddresses.add(_ctx.stringValue("DescribeContactPointsResponse.ContactPoints["+ i +"].PublicAddresses["+ j +"]"));
			}
			contactPoint.setPublicAddresses(publicAddresses);

			contactPoints.add(contactPoint);
		}
		describeContactPointsResponse.setContactPoints(contactPoints);
	 
	 	return describeContactPointsResponse;
	}
}