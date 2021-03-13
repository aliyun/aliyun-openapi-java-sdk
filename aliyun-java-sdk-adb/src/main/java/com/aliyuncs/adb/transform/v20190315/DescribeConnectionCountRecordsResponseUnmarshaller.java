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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeConnectionCountRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeConnectionCountRecordsResponse.AccessIps;
import com.aliyuncs.adb.model.v20190315.DescribeConnectionCountRecordsResponse.Users;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConnectionCountRecordsResponseUnmarshaller {

	public static DescribeConnectionCountRecordsResponse unmarshall(DescribeConnectionCountRecordsResponse describeConnectionCountRecordsResponse, UnmarshallerContext _ctx) {
		
		describeConnectionCountRecordsResponse.setRequestId(_ctx.stringValue("DescribeConnectionCountRecordsResponse.RequestId"));
		describeConnectionCountRecordsResponse.setTotalCount(_ctx.stringValue("DescribeConnectionCountRecordsResponse.TotalCount"));
		describeConnectionCountRecordsResponse.setDBClusterId(_ctx.stringValue("DescribeConnectionCountRecordsResponse.DBClusterId"));

		List<Users> userRecords = new ArrayList<Users>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConnectionCountRecordsResponse.UserRecords.Length"); i++) {
			Users users = new Users();
			users.setUser(_ctx.stringValue("DescribeConnectionCountRecordsResponse.UserRecords["+ i +"].User"));
			users.setCount(_ctx.longValue("DescribeConnectionCountRecordsResponse.UserRecords["+ i +"].Count"));

			userRecords.add(users);
		}
		describeConnectionCountRecordsResponse.setUserRecords(userRecords);

		List<AccessIps> accessIpRecords = new ArrayList<AccessIps>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConnectionCountRecordsResponse.AccessIpRecords.Length"); i++) {
			AccessIps accessIps = new AccessIps();
			accessIps.setAccessIp(_ctx.stringValue("DescribeConnectionCountRecordsResponse.AccessIpRecords["+ i +"].AccessIp"));
			accessIps.setCount(_ctx.longValue("DescribeConnectionCountRecordsResponse.AccessIpRecords["+ i +"].Count"));

			accessIpRecords.add(accessIps);
		}
		describeConnectionCountRecordsResponse.setAccessIpRecords(accessIpRecords);
	 
	 	return describeConnectionCountRecordsResponse;
	}
}