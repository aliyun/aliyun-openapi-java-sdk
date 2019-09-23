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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeDBInstanceNetInfoResponse.InstanceNetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));

		List<InstanceNetInfo> netInfoItems = new ArrayList<InstanceNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.NetInfoItems.Length"); i++) {
			InstanceNetInfo instanceNetInfo = new InstanceNetInfo();
			instanceNetInfo.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].ConnectionString"));
			instanceNetInfo.setIPAddress(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].IPAddress"));
			instanceNetInfo.setPort(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].Port"));
			instanceNetInfo.setVPCId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].VPCId"));
			instanceNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].VSwitchId"));
			instanceNetInfo.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].DBInstanceNetType"));
			instanceNetInfo.setVPCInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].VPCInstanceId"));
			instanceNetInfo.setIPType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].IPType"));
			instanceNetInfo.setExpiredTime(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].ExpiredTime"));
			instanceNetInfo.setUpgradeable(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.NetInfoItems["+ i +"].Upgradeable"));

			netInfoItems.add(instanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setNetInfoItems(netInfoItems);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}