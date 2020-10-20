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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.ServiceConnAddr;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.ServiceConnAddr.ConnAddrInfo1;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.SlbConnAddr;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.SlbConnAddr.ConnAddrInfo;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.ThriftConn;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.UiProxyConnAddrInfo;
import com.aliyuncs.hbase.model.v20190101.DescribeClusterConnectionResponse.ZkConnAddr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterConnectionResponseUnmarshaller {

	public static DescribeClusterConnectionResponse unmarshall(DescribeClusterConnectionResponse describeClusterConnectionResponse, UnmarshallerContext _ctx) {
		
		describeClusterConnectionResponse.setRequestId(_ctx.stringValue("DescribeClusterConnectionResponse.RequestId"));
		describeClusterConnectionResponse.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.NetType"));
		describeClusterConnectionResponse.setVpcId(_ctx.stringValue("DescribeClusterConnectionResponse.VpcId"));
		describeClusterConnectionResponse.setVSwitchId(_ctx.stringValue("DescribeClusterConnectionResponse.VSwitchId"));
		describeClusterConnectionResponse.setDbType(_ctx.stringValue("DescribeClusterConnectionResponse.DbType"));
		describeClusterConnectionResponse.setIsMultimod(_ctx.stringValue("DescribeClusterConnectionResponse.IsMultimod"));

		UiProxyConnAddrInfo uiProxyConnAddrInfo = new UiProxyConnAddrInfo();
		uiProxyConnAddrInfo.setConnAddr(_ctx.stringValue("DescribeClusterConnectionResponse.UiProxyConnAddrInfo.ConnAddr"));
		uiProxyConnAddrInfo.setConnAddrPort(_ctx.stringValue("DescribeClusterConnectionResponse.UiProxyConnAddrInfo.ConnAddrPort"));
		uiProxyConnAddrInfo.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.UiProxyConnAddrInfo.NetType"));
		describeClusterConnectionResponse.setUiProxyConnAddrInfo(uiProxyConnAddrInfo);

		ThriftConn thriftConn = new ThriftConn();
		thriftConn.setConnAddr(_ctx.stringValue("DescribeClusterConnectionResponse.ThriftConn.ConnAddr"));
		thriftConn.setConnAddrPort(_ctx.stringValue("DescribeClusterConnectionResponse.ThriftConn.ConnAddrPort"));
		thriftConn.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.ThriftConn.NetType"));
		describeClusterConnectionResponse.setThriftConn(thriftConn);

		List<ZkConnAddr> zkConnAddrs = new ArrayList<ZkConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterConnectionResponse.ZkConnAddrs.Length"); i++) {
			ZkConnAddr zkConnAddr = new ZkConnAddr();
			zkConnAddr.setConnAddr(_ctx.stringValue("DescribeClusterConnectionResponse.ZkConnAddrs["+ i +"].ConnAddr"));
			zkConnAddr.setConnAddrPort(_ctx.stringValue("DescribeClusterConnectionResponse.ZkConnAddrs["+ i +"].ConnAddrPort"));
			zkConnAddr.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.ZkConnAddrs["+ i +"].NetType"));

			zkConnAddrs.add(zkConnAddr);
		}
		describeClusterConnectionResponse.setZkConnAddrs(zkConnAddrs);

		List<SlbConnAddr> slbConnAddrs = new ArrayList<SlbConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterConnectionResponse.SlbConnAddrs.Length"); i++) {
			SlbConnAddr slbConnAddr = new SlbConnAddr();
			slbConnAddr.setSlbType(_ctx.stringValue("DescribeClusterConnectionResponse.SlbConnAddrs["+ i +"].SlbType"));

			ConnAddrInfo connAddrInfo = new ConnAddrInfo();
			connAddrInfo.setConnAddr(_ctx.stringValue("DescribeClusterConnectionResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.ConnAddr"));
			connAddrInfo.setConnAddrPort(_ctx.stringValue("DescribeClusterConnectionResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.ConnAddrPort"));
			connAddrInfo.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.SlbConnAddrs["+ i +"].ConnAddrInfo.NetType"));
			slbConnAddr.setConnAddrInfo(connAddrInfo);

			slbConnAddrs.add(slbConnAddr);
		}
		describeClusterConnectionResponse.setSlbConnAddrs(slbConnAddrs);

		List<ServiceConnAddr> serviceConnAddrs = new ArrayList<ServiceConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterConnectionResponse.ServiceConnAddrs.Length"); i++) {
			ServiceConnAddr serviceConnAddr = new ServiceConnAddr();
			serviceConnAddr.setConnType(_ctx.stringValue("DescribeClusterConnectionResponse.ServiceConnAddrs["+ i +"].ConnType"));

			ConnAddrInfo1 connAddrInfo1 = new ConnAddrInfo1();
			connAddrInfo1.setConnAddr(_ctx.stringValue("DescribeClusterConnectionResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.ConnAddr"));
			connAddrInfo1.setConnAddrPort(_ctx.stringValue("DescribeClusterConnectionResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.ConnAddrPort"));
			connAddrInfo1.setNetType(_ctx.stringValue("DescribeClusterConnectionResponse.ServiceConnAddrs["+ i +"].ConnAddrInfo.NetType"));
			serviceConnAddr.setConnAddrInfo1(connAddrInfo1);

			serviceConnAddrs.add(serviceConnAddr);
		}
		describeClusterConnectionResponse.setServiceConnAddrs(serviceConnAddrs);
	 
	 	return describeClusterConnectionResponse;
	}
}