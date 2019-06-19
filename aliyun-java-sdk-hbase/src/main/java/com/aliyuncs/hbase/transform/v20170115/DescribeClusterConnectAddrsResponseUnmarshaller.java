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

import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.ServiceConnAddr;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.ServiceConnAddr.ConnAddrInfo1;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.SlbConnAddr;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.SlbConnAddr.ConnAddrInfo;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.ThriftConn;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.UiProxyConnAddrInfo;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterConnectAddrsResponse.ZkConnAddr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterConnectAddrsResponseUnmarshaller {

	public static DescribeClusterConnectAddrsResponse unmarshall(DescribeClusterConnectAddrsResponse describeClusterConnectAddrsResponse, UnmarshallerContext context) {
		
		describeClusterConnectAddrsResponse.setRequestId(context.stringValue("DescribeClusterConnectAddrsResponse.RequestId"));
		describeClusterConnectAddrsResponse.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.NetType"));
		describeClusterConnectAddrsResponse.setVpcId(context.stringValue("DescribeClusterConnectAddrsResponse.VpcId"));
		describeClusterConnectAddrsResponse.setVSwitchId(context.stringValue("DescribeClusterConnectAddrsResponse.VSwitchId"));
		describeClusterConnectAddrsResponse.setDbType(context.stringValue("DescribeClusterConnectAddrsResponse.DbType"));
		describeClusterConnectAddrsResponse.setIsMultimod(context.stringValue("DescribeClusterConnectAddrsResponse.IsMultimod"));

		UiProxyConnAddrInfo uiProxyConnAddrInfo = new UiProxyConnAddrInfo();
		uiProxyConnAddrInfo.setConnAddr(context.stringValue("DescribeClusterConnectAddrsResponse.UiProxyConnAddrInfo.ConnAddr"));
		uiProxyConnAddrInfo.setConnAddrPort(context.stringValue("DescribeClusterConnectAddrsResponse.UiProxyConnAddrInfo.ConnAddrPort"));
		uiProxyConnAddrInfo.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.UiProxyConnAddrInfo.NetType"));
		describeClusterConnectAddrsResponse.setUiProxyConnAddrInfo(uiProxyConnAddrInfo);

		ThriftConn thriftConn = new ThriftConn();
		thriftConn.setConnAddr(context.stringValue("DescribeClusterConnectAddrsResponse.ThriftConn.ConnAddr"));
		thriftConn.setConnAddrPort(context.stringValue("DescribeClusterConnectAddrsResponse.ThriftConn.ConnAddrPort"));
		thriftConn.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.ThriftConn.NetType"));
		describeClusterConnectAddrsResponse.setThriftConn(thriftConn);

		List<ZkConnAddr> zkConnAddrs = new ArrayList<ZkConnAddr>();
		for (int i = 0; i < context.lengthValue("DescribeClusterConnectAddrsResponse.ZkConnAddrs.Length"); i++) {
			ZkConnAddr zkConnAddr = new ZkConnAddr();
			zkConnAddr.setConnAddr(context.stringValue("DescribeClusterConnectAddrsResponse.ZkConnAddrs["+ i +"].ConnAddr"));
			zkConnAddr.setConnAddrPort(context.stringValue("DescribeClusterConnectAddrsResponse.ZkConnAddrs["+ i +"].ConnAddrPort"));
			zkConnAddr.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.ZkConnAddrs["+ i +"].NetType"));

			zkConnAddrs.add(zkConnAddr);
		}
		describeClusterConnectAddrsResponse.setZkConnAddrs(zkConnAddrs);

		List<SlbConnAddr> slbConnAddrs = new ArrayList<SlbConnAddr>();
		for (int i = 0; i < context.lengthValue("DescribeClusterConnectAddrsResponse.SlbConnAddrs.Length"); i++) {
			SlbConnAddr slbConnAddr = new SlbConnAddr();
			slbConnAddr.setSlbType(context.stringValue("DescribeClusterConnectAddrsResponse.SlbConnAddrs["+ i +"].SlbType"));

			ConnAddrInfo connAddrInfo = new ConnAddrInfo();
			connAddrInfo.setConnAddr(context.stringValue("DescribeClusterConnectAddrsResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.ConnAddr"));
			connAddrInfo.setConnAddrPort(context.stringValue("DescribeClusterConnectAddrsResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.ConnAddrPort"));
			connAddrInfo.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.NetType"));
			slbConnAddr.setConnAddrInfo(connAddrInfo);

			slbConnAddrs.add(slbConnAddr);
		}
		describeClusterConnectAddrsResponse.setSlbConnAddrs(slbConnAddrs);

		List<ServiceConnAddr> serviceConnAddrs = new ArrayList<ServiceConnAddr>();
		for (int i = 0; i < context.lengthValue("DescribeClusterConnectAddrsResponse.ServiceConnAddrs.Length"); i++) {
			ServiceConnAddr serviceConnAddr = new ServiceConnAddr();
			serviceConnAddr.setConnType(context.stringValue("DescribeClusterConnectAddrsResponse.ServiceConnAddrs["+ i +"].ConnType"));

			ConnAddrInfo1 connAddrInfo1 = new ConnAddrInfo1();
			connAddrInfo1.setConnAddr(context.stringValue("DescribeClusterConnectAddrsResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.ConnAddr"));
			connAddrInfo1.setConnAddrPort(context.stringValue("DescribeClusterConnectAddrsResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.ConnAddrPort"));
			connAddrInfo1.setNetType(context.stringValue("DescribeClusterConnectAddrsResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.NetType"));
			serviceConnAddr.setConnAddrInfo1(connAddrInfo1);

			serviceConnAddrs.add(serviceConnAddr);
		}
		describeClusterConnectAddrsResponse.setServiceConnAddrs(serviceConnAddrs);
	 
	 	return describeClusterConnectAddrsResponse;
	}
}