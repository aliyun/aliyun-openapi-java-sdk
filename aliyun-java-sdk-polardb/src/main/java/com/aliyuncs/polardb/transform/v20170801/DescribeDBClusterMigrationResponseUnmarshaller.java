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
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.DstBidirectionalDtsJob;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.DstDtsJob;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.RdsEndpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.RdsEndpoint.Address2;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJob;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse.SrcDtsJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterMigrationResponseUnmarshaller {

	public static DescribeDBClusterMigrationResponse unmarshall(DescribeDBClusterMigrationResponse describeDBClusterMigrationResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterMigrationResponse.setRequestId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RequestId"));
		describeDBClusterMigrationResponse.setComment(_ctx.stringValue("DescribeDBClusterMigrationResponse.Comment"));
		describeDBClusterMigrationResponse.setExpiredTime(_ctx.stringValue("DescribeDBClusterMigrationResponse.ExpiredTime"));
		describeDBClusterMigrationResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterId"));
		describeDBClusterMigrationResponse.setTopologies(_ctx.stringValue("DescribeDBClusterMigrationResponse.Topologies"));
		describeDBClusterMigrationResponse.setRdsReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsReadWriteMode"));
		describeDBClusterMigrationResponse.setSourceRDSDBInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SourceRDSDBInstanceId"));
		describeDBClusterMigrationResponse.setDBClusterReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterReadWriteMode"));
		describeDBClusterMigrationResponse.setDelayedSeconds(_ctx.integerValue("DescribeDBClusterMigrationResponse.DelayedSeconds"));
		describeDBClusterMigrationResponse.setMigrationStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationStatus"));
		describeDBClusterMigrationResponse.setDtsInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DtsInstanceId"));
		describeDBClusterMigrationResponse.setSrcDbType(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDbType"));
		describeDBClusterMigrationResponse.setMigrationSwitch(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationSwitch"));
		describeDBClusterMigrationResponse.setMigrationDtsJobEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationDtsJobEndpoint"));
		describeDBClusterMigrationResponse.setDstBinlogPosition(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBinlogPosition"));
		describeDBClusterMigrationResponse.setSrcBinlogPosition(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBinlogPosition"));
		describeDBClusterMigrationResponse.setMigrationProgress(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationProgress"));

		List<DBClusterEndpoint> dBClusterEndpointList = new ArrayList<DBClusterEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList.Length"); i++) {
			DBClusterEndpoint dBClusterEndpoint = new DBClusterEndpoint();
			dBClusterEndpoint.setDBEndpointId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].DBEndpointId"));
			dBClusterEndpoint.setEndpointType(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].EndpointType"));
			dBClusterEndpoint.setReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].ReadWriteMode"));

			List<Address> addressItems = new ArrayList<Address>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems.Length"); j++) {
				Address address = new Address();
				address.setVSwitchId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].VSwitchId"));
				address.setConnectionString(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address.setNetType(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].NetType"));
				address.setPort(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].Port"));
				address.setVPCId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].VPCId"));
				address.setIPAddress(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].IPAddress"));
				address.setSSLEnabled(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterEndpointList["+ i +"].AddressItems["+ j +"].SSLEnabled"));

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
			rdsEndpoint.setCustinsType(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].CustinsType"));

			List<Address2> addressItems1 = new ArrayList<Address2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems.Length"); j++) {
				Address2 address2 = new Address2();
				address2.setVSwitchId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].VSwitchId"));
				address2.setConnectionString(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address2.setNetType(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].NetType"));
				address2.setPort(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].Port"));
				address2.setVPCId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].VPCId"));
				address2.setIPAddress(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].IPAddress"));
				address2.setSSLEnabled(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsEndpointList["+ i +"].AddressItems["+ j +"].SSLEnabled"));

				addressItems1.add(address2);
			}
			rdsEndpoint.setAddressItems1(addressItems1);

			rdsEndpointList.add(rdsEndpoint);
		}
		describeDBClusterMigrationResponse.setRdsEndpointList(rdsEndpointList);

		List<SrcDtsJob> srcDtsJobList = new ArrayList<SrcDtsJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.SrcDtsJobList.Length"); i++) {
			SrcDtsJob srcDtsJob = new SrcDtsJob();
			srcDtsJob.setDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].DtsJobId"));
			srcDtsJob.setDtsJobName(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].DtsJobName"));
			srcDtsJob.setDtsInstanceID(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].DtsInstanceID"));
			srcDtsJob.setDtsJobDirection(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].DtsJobDirection"));
			srcDtsJob.setStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].Status"));
			srcDtsJob.setSourceEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].SourceEndpoint"));
			srcDtsJob.setDestinationEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcDtsJobList["+ i +"].DestinationEndpoint"));

			srcDtsJobList.add(srcDtsJob);
		}
		describeDBClusterMigrationResponse.setSrcDtsJobList(srcDtsJobList);

		List<SrcBidirectionalDtsJob> srcBidirectionalDtsJobList = new ArrayList<SrcBidirectionalDtsJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList.Length"); i++) {
			SrcBidirectionalDtsJob srcBidirectionalDtsJob = new SrcBidirectionalDtsJob();
			srcBidirectionalDtsJob.setReverseDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].ReverseDtsJobId"));
			srcBidirectionalDtsJob.setDtsJobName(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].DtsJobName"));
			srcBidirectionalDtsJob.setDtsInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].DtsInstanceId"));
			srcBidirectionalDtsJob.setDtsJobDirection(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].DtsJobDirection"));
			srcBidirectionalDtsJob.setStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].Status"));
			srcBidirectionalDtsJob.setSourceEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].SourceEndpoint"));
			srcBidirectionalDtsJob.setDestinationEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].DestinationEndpoint"));
			srcBidirectionalDtsJob.setDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SrcBidirectionalDtsJobList["+ i +"].DtsJobId"));

			srcBidirectionalDtsJobList.add(srcBidirectionalDtsJob);
		}
		describeDBClusterMigrationResponse.setSrcBidirectionalDtsJobList(srcBidirectionalDtsJobList);

		List<DstDtsJob> dstDtsJobList = new ArrayList<DstDtsJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DstDtsJobList.Length"); i++) {
			DstDtsJob dstDtsJob = new DstDtsJob();
			dstDtsJob.setReverseDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].ReverseDtsJobId"));
			dstDtsJob.setDtsJobName(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].DtsJobName"));
			dstDtsJob.setDtsInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].DtsInstanceId"));
			dstDtsJob.setDtsJobDirection(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].DtsJobDirection"));
			dstDtsJob.setStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].Status"));
			dstDtsJob.setSourceEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].SourceEndpoint"));
			dstDtsJob.setDestinationEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].DestinationEndpoint"));
			dstDtsJob.setDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstDtsJobList["+ i +"].DtsJobId"));

			dstDtsJobList.add(dstDtsJob);
		}
		describeDBClusterMigrationResponse.setDstDtsJobList(dstDtsJobList);

		List<DstBidirectionalDtsJob> dstBidirectionalDtsJobList = new ArrayList<DstBidirectionalDtsJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList.Length"); i++) {
			DstBidirectionalDtsJob dstBidirectionalDtsJob = new DstBidirectionalDtsJob();
			dstBidirectionalDtsJob.setReverseDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].ReverseDtsJobId"));
			dstBidirectionalDtsJob.setDtsJobName(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].DtsJobName"));
			dstBidirectionalDtsJob.setDtsInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].DtsInstanceId"));
			dstBidirectionalDtsJob.setDtsJobDirection(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].DtsJobDirection"));
			dstBidirectionalDtsJob.setStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].Status"));
			dstBidirectionalDtsJob.setSourceEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].SourceEndpoint"));
			dstBidirectionalDtsJob.setDestinationEndpoint(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].DestinationEndpoint"));
			dstBidirectionalDtsJob.setDtsJobId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DstBidirectionalDtsJobList["+ i +"].DtsJobId"));

			dstBidirectionalDtsJobList.add(dstBidirectionalDtsJob);
		}
		describeDBClusterMigrationResponse.setDstBidirectionalDtsJobList(dstBidirectionalDtsJobList);
	 
	 	return describeDBClusterMigrationResponse;
	}
}