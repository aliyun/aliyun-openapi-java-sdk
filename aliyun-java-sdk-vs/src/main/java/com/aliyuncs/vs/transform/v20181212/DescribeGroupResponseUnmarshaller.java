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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeGroupResponse;
import com.aliyuncs.vs.model.v20181212.DescribeGroupResponse.Stats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupResponseUnmarshaller {

	public static DescribeGroupResponse unmarshall(DescribeGroupResponse describeGroupResponse, UnmarshallerContext _ctx) {
		
		describeGroupResponse.setRequestId(_ctx.stringValue("DescribeGroupResponse.RequestId"));
		describeGroupResponse.setStatus(_ctx.stringValue("DescribeGroupResponse.Status"));
		describeGroupResponse.setLazyPull(_ctx.booleanValue("DescribeGroupResponse.LazyPull"));
		describeGroupResponse.setCallback(_ctx.stringValue("DescribeGroupResponse.Callback"));
		describeGroupResponse.setDescription(_ctx.stringValue("DescribeGroupResponse.Description"));
		describeGroupResponse.setApp(_ctx.stringValue("DescribeGroupResponse.App"));
		describeGroupResponse.setRegion(_ctx.stringValue("DescribeGroupResponse.Region"));
		describeGroupResponse.setEnabled(_ctx.booleanValue("DescribeGroupResponse.Enabled"));
		describeGroupResponse.setInProtocol(_ctx.stringValue("DescribeGroupResponse.InProtocol"));
		describeGroupResponse.setOutProtocol(_ctx.stringValue("DescribeGroupResponse.OutProtocol"));
		describeGroupResponse.setName(_ctx.stringValue("DescribeGroupResponse.Name"));
		describeGroupResponse.setPushDomain(_ctx.stringValue("DescribeGroupResponse.PushDomain"));
		describeGroupResponse.setCreatedTime(_ctx.stringValue("DescribeGroupResponse.CreatedTime"));
		describeGroupResponse.setCaptureVideo(_ctx.integerValue("DescribeGroupResponse.CaptureVideo"));
		describeGroupResponse.setPlayDomain(_ctx.stringValue("DescribeGroupResponse.PlayDomain"));
		describeGroupResponse.setCaptureInterval(_ctx.integerValue("DescribeGroupResponse.CaptureInterval"));
		describeGroupResponse.setGbPort(_ctx.longValue("DescribeGroupResponse.GbPort"));
		describeGroupResponse.setGbId(_ctx.stringValue("DescribeGroupResponse.GbId"));
		describeGroupResponse.setGbIp(_ctx.stringValue("DescribeGroupResponse.GbIp"));
		describeGroupResponse.setCaptureImage(_ctx.integerValue("DescribeGroupResponse.CaptureImage"));
		describeGroupResponse.setAliasId(_ctx.stringValue("DescribeGroupResponse.AliasId"));
		describeGroupResponse.setCaptureOssBucket(_ctx.stringValue("DescribeGroupResponse.CaptureOssBucket"));
		describeGroupResponse.setCaptureOssPath(_ctx.stringValue("DescribeGroupResponse.CaptureOssPath"));
		describeGroupResponse.setId(_ctx.stringValue("DescribeGroupResponse.Id"));

		List<String> gbTcpPorts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupResponse.GbTcpPorts.Length"); i++) {
			gbTcpPorts.add(_ctx.stringValue("DescribeGroupResponse.GbTcpPorts["+ i +"]"));
		}
		describeGroupResponse.setGbTcpPorts(gbTcpPorts);

		List<String> gbUdpPorts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupResponse.GbUdpPorts.Length"); i++) {
			gbUdpPorts.add(_ctx.stringValue("DescribeGroupResponse.GbUdpPorts["+ i +"]"));
		}
		describeGroupResponse.setGbUdpPorts(gbUdpPorts);

		Stats stats = new Stats();
		stats.setPlatformNum(_ctx.longValue("DescribeGroupResponse.Stats.PlatformNum"));
		stats.setDeviceNum(_ctx.longValue("DescribeGroupResponse.Stats.DeviceNum"));
		stats.setIpcNum(_ctx.longValue("DescribeGroupResponse.Stats.IpcNum"));
		stats.setIedNum(_ctx.longValue("DescribeGroupResponse.Stats.IedNum"));
		describeGroupResponse.setStats(stats);
	 
	 	return describeGroupResponse;
	}
}