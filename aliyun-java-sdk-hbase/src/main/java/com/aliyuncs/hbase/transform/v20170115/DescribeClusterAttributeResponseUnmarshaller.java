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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.DescribeClusterAttributeResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterAttributeResponse.ConnectionInfo;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterAttributeResponse.NetInfo;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterAttributeResponse.Node;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterAttributeResponse.Node.Daemon;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterAttributeResponseUnmarshaller {

	public static DescribeClusterAttributeResponse unmarshall(DescribeClusterAttributeResponse describeClusterAttributeResponse, UnmarshallerContext context) {
		
		describeClusterAttributeResponse.setRequestId(context.stringValue("DescribeClusterAttributeResponse.RequestId"));
		describeClusterAttributeResponse.setCoreDiskType(context.stringValue("DescribeClusterAttributeResponse.CoreDiskType"));
		describeClusterAttributeResponse.setCoreDiskSize(context.stringValue("DescribeClusterAttributeResponse.CoreDiskSize"));
		describeClusterAttributeResponse.setClusterId(context.stringValue("DescribeClusterAttributeResponse.ClusterId"));
		describeClusterAttributeResponse.setClusterName(context.stringValue("DescribeClusterAttributeResponse.ClusterName"));
		describeClusterAttributeResponse.setMainVersion(context.stringValue("DescribeClusterAttributeResponse.MainVersion"));
		describeClusterAttributeResponse.setStatus(context.stringValue("DescribeClusterAttributeResponse.Status"));
		describeClusterAttributeResponse.setClusterType(context.stringValue("DescribeClusterAttributeResponse.ClusterType"));
		describeClusterAttributeResponse.setHasUser(context.stringValue("DescribeClusterAttributeResponse.HasUser"));
		describeClusterAttributeResponse.setLockMode(context.stringValue("DescribeClusterAttributeResponse.LockMode"));
		describeClusterAttributeResponse.setHaType(context.stringValue("DescribeClusterAttributeResponse.HaType"));
		describeClusterAttributeResponse.setMasterInstanceType(context.stringValue("DescribeClusterAttributeResponse.MasterInstanceType"));
		describeClusterAttributeResponse.setMasterDiskType(context.stringValue("DescribeClusterAttributeResponse.MasterDiskType"));
		describeClusterAttributeResponse.setMasterDiskSize(context.integerValue("DescribeClusterAttributeResponse.MasterDiskSize"));
		describeClusterAttributeResponse.setCoreInstanceType(context.stringValue("DescribeClusterAttributeResponse.CoreInstanceType"));
		describeClusterAttributeResponse.setCoreInstanceQuantity(context.integerValue("DescribeClusterAttributeResponse.CoreInstanceQuantity"));
		describeClusterAttributeResponse.setCoreDiskQuantity(context.integerValue("DescribeClusterAttributeResponse.CoreDiskQuantity"));
		describeClusterAttributeResponse.setPayType(context.stringValue("DescribeClusterAttributeResponse.PayType"));
		describeClusterAttributeResponse.setAutoRenew(context.stringValue("DescribeClusterAttributeResponse.AutoRenew"));
		describeClusterAttributeResponse.setCreateTime(context.stringValue("DescribeClusterAttributeResponse.CreateTime"));
		describeClusterAttributeResponse.setExpireTime(context.stringValue("DescribeClusterAttributeResponse.ExpireTime"));
		describeClusterAttributeResponse.setRegionId(context.stringValue("DescribeClusterAttributeResponse.RegionId"));
		describeClusterAttributeResponse.setZoneId(context.stringValue("DescribeClusterAttributeResponse.ZoneId"));
		describeClusterAttributeResponse.setUpdateStatus(context.stringValue("DescribeClusterAttributeResponse.UpdateStatus"));
		describeClusterAttributeResponse.setColdStorageStatus(context.stringValue("DescribeClusterAttributeResponse.ColdStorageStatus"));
		describeClusterAttributeResponse.setMinorVersion(context.stringValue("DescribeClusterAttributeResponse.MinorVersion"));

		ConnectionInfo connectionInfo = new ConnectionInfo();
		connectionInfo.setUIProxyConnectionString(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.UIProxyConnectionString"));
		connectionInfo.setZKPort(context.integerValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKPort"));
		connectionInfo.setThriftConnectionString(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ThriftConnectionString"));
		connectionInfo.setThriftPort(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ThriftPort"));
		connectionInfo.setHaThriftConnectionString(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.HaThriftConnectionString"));
		connectionInfo.setHaThriftPort(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.HaThriftPort"));
		connectionInfo.setHaRestConnectionString(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.HaRestConnectionString"));
		connectionInfo.setHaRestPort(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.HaRestPort"));

		List<String> zKConnectionStringList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKConnectionStringList.Length"); i++) {
			zKConnectionStringList.add(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKConnectionStringList["+ i +"]"));
		}
		connectionInfo.setZKConnectionStringList(zKConnectionStringList);

		List<String> zKPublicConnectionStringList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKPublicConnectionStringList.Length"); i++) {
			zKPublicConnectionStringList.add(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKPublicConnectionStringList["+ i +"]"));
		}
		connectionInfo.setZKPublicConnectionStringList(zKPublicConnectionStringList);

		List<String> zKInnerConnectionStringList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKInnerConnectionStringList.Length"); i++) {
			zKInnerConnectionStringList.add(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKInnerConnectionStringList["+ i +"]"));
		}
		connectionInfo.setZKInnerConnectionStringList(zKInnerConnectionStringList);

		List<String> zKClassicConnectionStringList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKClassicConnectionStringList.Length"); i++) {
			zKClassicConnectionStringList.add(context.stringValue("DescribeClusterAttributeResponse.ConnectionInfo.ZKClassicConnectionStringList["+ i +"]"));
		}
		connectionInfo.setZKClassicConnectionStringList(zKClassicConnectionStringList);
		describeClusterAttributeResponse.setConnectionInfo(connectionInfo);

		NetInfo netInfo = new NetInfo();
		netInfo.setNetType(context.stringValue("DescribeClusterAttributeResponse.NetInfo.NetType"));
		netInfo.setInnerIpAddress(context.stringValue("DescribeClusterAttributeResponse.NetInfo.InnerIpAddress"));
		netInfo.setPublicIpAddress(context.stringValue("DescribeClusterAttributeResponse.NetInfo.PublicIpAddress"));
		netInfo.setVpcId(context.stringValue("DescribeClusterAttributeResponse.NetInfo.VpcId"));
		netInfo.setVSwitchId(context.stringValue("DescribeClusterAttributeResponse.NetInfo.VSwitchId"));
		netInfo.setSecurityIpList(context.stringValue("DescribeClusterAttributeResponse.NetInfo.SecurityIpList"));
		describeClusterAttributeResponse.setNetInfo(netInfo);

		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < context.lengthValue("DescribeClusterAttributeResponse.NodeList.Length"); i++) {
			Node node = new Node();
			node.setNodeId(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeId"));
			node.setNodeType(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeType"));
			node.setServiceType(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].ServiceType"));
			node.setNodeStatus(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeStatus"));
			node.setRegionQuantity(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].RegionQuantity"));
			node.setMemStore(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].MemStore"));
			node.setStoreFile(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].StoreFile"));
			node.setNodeInstanceType(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeInstanceType"));
			node.setNodeDiskType(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeDiskType"));
			node.setNodeDiskSize(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeDiskSize"));
			node.setNodeDiskQuantity(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].NodeDiskQuantity"));

			List<Daemon> daemonList = new ArrayList<Daemon>();
			for (int j = 0; j < context.lengthValue("DescribeClusterAttributeResponse.NodeList["+ i +"].DaemonList.Length"); j++) {
				Daemon daemon = new Daemon();
				daemon.setDaemonName(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].DaemonList["+ j +"].DaemonName"));
				daemon.setDaemonStatus(context.stringValue("DescribeClusterAttributeResponse.NodeList["+ i +"].DaemonList["+ j +"].DaemonStatus"));

				daemonList.add(daemon);
			}
			node.setDaemonList(daemonList);

			nodeList.add(node);
		}
		describeClusterAttributeResponse.setNodeList(nodeList);
	 
	 	return describeClusterAttributeResponse;
	}
}