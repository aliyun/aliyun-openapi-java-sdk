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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.DBClusterEndpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.DBClusterEndpoint.Address;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.RdsEndpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.RdsEndpoint.Address2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterMigrationResponseUnmarshaller {

	public static DescribeDBClusterMigrationResponse unmarshall(DescribeDBClusterMigrationResponse describeDBClusterMigrationResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterMigrationResponse.setRequestId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RequestId"));
		describeDBClusterMigrationResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterId"));
		describeDBClusterMigrationResponse.setSourceRDSDBInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SourceRDSDBInstanceId"));
		describeDBClusterMigrationResponse.setMigrationStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationStatus"));
		describeDBClusterMigrationResponse.setTopologies(_ctx.stringValue("DescribeDBClusterMigrationResponse.Topologies"));
		describeDBClusterMigrationResponse.setDelayedSeconds(_ctx.integerValue("DescribeDBClusterMigrationResponse.DelayedSeconds"));
		describeDBClusterMigrationResponse.setExpiredTime(_ctx.stringValue("DescribeDBClusterMigrationResponse.ExpiredTime"));
		describeDBClusterMigrationResponse.setRdsReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsReadWriteMode"));
		describeDBClusterMigrationResponse.setDBClusterReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterReadWriteMode"));
		describeDBClusterMigrationResponse.setComment(_ctx.stringValue("DescribeDBClusterMigrationResponse.Comment"));

		List<DBClusterEndpoint> dBClusterEndpointList = new ArrayList<DBClusterEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList.Length"); i++) {
			DBClusterEndpoint dBClusterEndpoint = new DBClusterEndpoint();
			dBClusterEndpoint.setDBEndpointId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].DBEndpointId"));
			dBClusterEndpoint.setEndpointType(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].EndpointType"));

			List<Address> addressItems = new ArrayList<Address>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems.Length"); j++) {
				Address address = new Address();
				address.setConnectionString(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address.setIPAddress(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].IPAddress"));
				address.setNetType(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].NetType"));
				address.setPort(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].Port"));
				address.setVPCId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].VPCId"));
				address.setVSwitchId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].VSwitchId"));

				addressItems.add(address);
			}
			dBClusterEndpoint.setAddressItems(addressItems);

			dBClusterEndpointList.add(dBClusterEndpoint);
		}
		describeDBClusterMigrationResponse.setDBClusterEndpointList(dBClusterEndpointList);

		List<RdsEndpoint> rdsEndpointList = new ArrayList<RdsEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.RdsEndpointList.Length"); i++) {
			RdsEndpoint rdsEndpoint = new RdsEndpoint();
			rdsEndpoint.setDBEndpointId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].DBEndpointId"));
			rdsEndpoint.setEndpointType(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].EndpointType"));

			List<Address2> addressItems1 = new ArrayList<Address2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems.Length"); j++) {
				Address2 address2 = new Address2();
				address2.setConnectionString(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address2.setIPAddress(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].IPAddress"));
				address2.setNetType(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].NetType"));
				address2.setPort(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].Port"));
				address2.setVPCId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].VPCId"));
				address2.setVSwitchId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].VSwitchId"));

				addressItems1.add(address2);
			}
			rdsEndpoint.setAddressItems1(addressItems1);

			rdsEndpointList.add(rdsEndpoint);
		}
		describeDBClusterMigrationResponse.setRdsEndpointList(rdsEndpointList);
	 
	 	return describeDBClusterMigrationResponse;
	}
}