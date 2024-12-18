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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceNetInfoResponse.DBClustersNetInfosItem;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceNetInfoResponse.DBClustersNetInfosItem.PortListItem2;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfosItem;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfosItem.PortListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));

		List<DBInstanceNetInfosItem> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfosItem dBInstanceNetInfosItem = new DBInstanceNetInfosItem();
			dBInstanceNetInfosItem.setNetType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].NetType"));
			dBInstanceNetInfosItem.setVpcInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VpcInstanceId"));
			dBInstanceNetInfosItem.setVpcId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VpcId"));
			dBInstanceNetInfosItem.setVswitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VswitchId"));
			dBInstanceNetInfosItem.setUserVisible(_ctx.booleanValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].UserVisible"));
			dBInstanceNetInfosItem.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfosItem.setIp(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Ip"));
			dBInstanceNetInfosItem.setClusterId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ClusterId"));

			List<PortListItem> portList = new ArrayList<PortListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].PortList.Length"); j++) {
				PortListItem portListItem = new PortListItem();
				portListItem.setBizProtocol(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].PortList["+ j +"].Protocol"));
				portListItem.setPort(_ctx.integerValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].PortList["+ j +"].Port"));

				portList.add(portListItem);
			}
			dBInstanceNetInfosItem.setPortList(portList);

			dBInstanceNetInfos.add(dBInstanceNetInfosItem);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);

		List<DBClustersNetInfosItem> dBClustersNetInfos = new ArrayList<DBClustersNetInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos.Length"); i++) {
			DBClustersNetInfosItem dBClustersNetInfosItem = new DBClustersNetInfosItem();
			dBClustersNetInfosItem.setNetType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].NetType"));
			dBClustersNetInfosItem.setVpcInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].VpcInstanceId"));
			dBClustersNetInfosItem.setVpcId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].VpcId"));
			dBClustersNetInfosItem.setVswitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].VswitchId"));
			dBClustersNetInfosItem.setUserVisible(_ctx.booleanValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].UserVisible"));
			dBClustersNetInfosItem.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].ConnectionString"));
			dBClustersNetInfosItem.setIp(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].Ip"));
			dBClustersNetInfosItem.setClusterId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].ClusterId"));

			List<PortListItem2> portList1 = new ArrayList<PortListItem2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].PortList.Length"); j++) {
				PortListItem2 portListItem2 = new PortListItem2();
				portListItem2.setBizProtocol(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].PortList["+ j +"].Protocol"));
				portListItem2.setPort(_ctx.integerValue("DescribeDBInstanceNetInfoResponse.DBClustersNetInfos["+ i +"].PortList["+ j +"].Port"));

				portList1.add(portListItem2);
			}
			dBClustersNetInfosItem.setPortList1(portList1);

			dBClustersNetInfos.add(dBClustersNetInfosItem);
		}
		describeDBInstanceNetInfoResponse.setDBClustersNetInfos(dBClustersNetInfos);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}