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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceResponse;
import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceResponse.SecurityIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHiTSDBInstanceResponseUnmarshaller {

	public static DescribeHiTSDBInstanceResponse unmarshall(DescribeHiTSDBInstanceResponse describeHiTSDBInstanceResponse, UnmarshallerContext _ctx) {
		
		describeHiTSDBInstanceResponse.setRequestId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.RequestId"));
		describeHiTSDBInstanceResponse.setInstanceId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceId"));
		describeHiTSDBInstanceResponse.setInstanceAlias(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceAlias"));
		describeHiTSDBInstanceResponse.setInstanceDescription(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceDescription"));
		describeHiTSDBInstanceResponse.setRegionId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.RegionId"));
		describeHiTSDBInstanceResponse.setZoneId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.ZoneId"));
		describeHiTSDBInstanceResponse.setInstanceStatus(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceStatus"));
		describeHiTSDBInstanceResponse.setChargeType(_ctx.stringValue("DescribeHiTSDBInstanceResponse.ChargeType"));
		describeHiTSDBInstanceResponse.setNetworkType(_ctx.stringValue("DescribeHiTSDBInstanceResponse.NetworkType"));
		describeHiTSDBInstanceResponse.setGmtCreated(_ctx.stringValue("DescribeHiTSDBInstanceResponse.GmtCreated"));
		describeHiTSDBInstanceResponse.setGmtExpire(_ctx.stringValue("DescribeHiTSDBInstanceResponse.GmtExpire"));
		describeHiTSDBInstanceResponse.setInstanceClass(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceClass"));
		describeHiTSDBInstanceResponse.setMaxTimelineLimit(_ctx.stringValue("DescribeHiTSDBInstanceResponse.MaxTimelineLimit"));
		describeHiTSDBInstanceResponse.setInstanceStorage(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceStorage"));
		describeHiTSDBInstanceResponse.setInstanceTps(_ctx.stringValue("DescribeHiTSDBInstanceResponse.InstanceTps"));
		describeHiTSDBInstanceResponse.setReverseVpcIp(_ctx.stringValue("DescribeHiTSDBInstanceResponse.ReverseVpcIp"));
		describeHiTSDBInstanceResponse.setReverseVpcPort(_ctx.stringValue("DescribeHiTSDBInstanceResponse.ReverseVpcPort"));
		describeHiTSDBInstanceResponse.setVpcId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.VpcId"));
		describeHiTSDBInstanceResponse.setVswitchId(_ctx.stringValue("DescribeHiTSDBInstanceResponse.VswitchId"));
		describeHiTSDBInstanceResponse.setConnectionString(_ctx.stringValue("DescribeHiTSDBInstanceResponse.ConnectionString"));
		describeHiTSDBInstanceResponse.setPublicConnectionString(_ctx.stringValue("DescribeHiTSDBInstanceResponse.PublicConnectionString"));
		describeHiTSDBInstanceResponse.setAutoRenew(_ctx.stringValue("DescribeHiTSDBInstanceResponse.AutoRenew"));
		describeHiTSDBInstanceResponse.setEngineType(_ctx.stringValue("DescribeHiTSDBInstanceResponse.EngineType"));
		describeHiTSDBInstanceResponse.setCpuNumber(_ctx.stringValue("DescribeHiTSDBInstanceResponse.CpuNumber"));
		describeHiTSDBInstanceResponse.setMemSize(_ctx.stringValue("DescribeHiTSDBInstanceResponse.MemSize"));
		describeHiTSDBInstanceResponse.setSeries(_ctx.integerValue("DescribeHiTSDBInstanceResponse.Series"));
		describeHiTSDBInstanceResponse.setRDSStatus(_ctx.stringValue("DescribeHiTSDBInstanceResponse.RDSStatus"));
		describeHiTSDBInstanceResponse.setDiskCategory(_ctx.stringValue("DescribeHiTSDBInstanceResponse.DiskCategory"));
		describeHiTSDBInstanceResponse.setStatus(_ctx.stringValue("DescribeHiTSDBInstanceResponse.Status"));
		describeHiTSDBInstanceResponse.setPaymentType(_ctx.stringValue("DescribeHiTSDBInstanceResponse.PaymentType"));
		describeHiTSDBInstanceResponse.setCreateTime(_ctx.longValue("DescribeHiTSDBInstanceResponse.CreateTime"));
		describeHiTSDBInstanceResponse.setExpiredTime(_ctx.longValue("DescribeHiTSDBInstanceResponse.ExpiredTime"));

		List<SecurityIp> securityIpList = new ArrayList<SecurityIp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHiTSDBInstanceResponse.SecurityIpList.Length"); i++) {
			SecurityIp securityIp = new SecurityIp();
			securityIp.setIp(_ctx.stringValue("DescribeHiTSDBInstanceResponse.SecurityIpList["+ i +"].Ip"));

			securityIpList.add(securityIp);
		}
		describeHiTSDBInstanceResponse.setSecurityIpList(securityIpList);
	 
	 	return describeHiTSDBInstanceResponse;
	}
}