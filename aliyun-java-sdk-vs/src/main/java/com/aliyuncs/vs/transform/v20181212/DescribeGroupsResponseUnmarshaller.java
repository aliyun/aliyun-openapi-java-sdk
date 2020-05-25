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

import com.aliyuncs.vs.model.v20181212.DescribeGroupsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeGroupsResponse.Group;
import com.aliyuncs.vs.model.v20181212.DescribeGroupsResponse.Group.Stats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupsResponseUnmarshaller {

	public static DescribeGroupsResponse unmarshall(DescribeGroupsResponse describeGroupsResponse, UnmarshallerContext _ctx) {
		
		describeGroupsResponse.setRequestId(_ctx.stringValue("DescribeGroupsResponse.RequestId"));
		describeGroupsResponse.setPageSize(_ctx.longValue("DescribeGroupsResponse.PageSize"));
		describeGroupsResponse.setPageNum(_ctx.longValue("DescribeGroupsResponse.PageNum"));
		describeGroupsResponse.setPageCount(_ctx.longValue("DescribeGroupsResponse.PageCount"));
		describeGroupsResponse.setTotalCount(_ctx.longValue("DescribeGroupsResponse.TotalCount"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setId(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Id"));
			group.setAliasId(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].AliasId"));
			group.setName(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Name"));
			group.setDescription(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Description"));
			group.setApp(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].App"));
			group.setRegion(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Region"));
			group.setInProtocol(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].InProtocol"));
			group.setOutProtocol(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].OutProtocol"));
			group.setEnabled(_ctx.booleanValue("DescribeGroupsResponse.Groups["+ i +"].Enabled"));
			group.setStatus(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Status"));
			group.setCreatedTime(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].CreatedTime"));
			group.setPushDomain(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].PushDomain"));
			group.setPlayDomain(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].PlayDomain"));
			group.setLazyPull(_ctx.booleanValue("DescribeGroupsResponse.Groups["+ i +"].LazyPull"));
			group.setCallback(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].Callback"));
			group.setCaptureInterval(_ctx.integerValue("DescribeGroupsResponse.Groups["+ i +"].CaptureInterval"));
			group.setCaptureImage(_ctx.integerValue("DescribeGroupsResponse.Groups["+ i +"].CaptureImage"));
			group.setCaptureVideo(_ctx.integerValue("DescribeGroupsResponse.Groups["+ i +"].CaptureVideo"));
			group.setCaptureOssBucket(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].CaptureOssBucket"));
			group.setCaptureOssPath(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].CaptureOssPath"));
			group.setGbId(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GbId"));
			group.setGbIp(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GbIp"));
			group.setGbPort(_ctx.longValue("DescribeGroupsResponse.Groups["+ i +"].GbPort"));

			List<String> gbUdpPorts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupsResponse.Groups["+ i +"].GbUdpPorts.Length"); j++) {
				gbUdpPorts.add(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GbUdpPorts["+ j +"]"));
			}
			group.setGbUdpPorts(gbUdpPorts);

			List<String> gbTcpPorts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupsResponse.Groups["+ i +"].GbTcpPorts.Length"); j++) {
				gbTcpPorts.add(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GbTcpPorts["+ j +"]"));
			}
			group.setGbTcpPorts(gbTcpPorts);

			Stats stats = new Stats();
			stats.setDeviceNum(_ctx.longValue("DescribeGroupsResponse.Groups["+ i +"].Stats.DeviceNum"));
			stats.setIedNum(_ctx.longValue("DescribeGroupsResponse.Groups["+ i +"].Stats.IedNum"));
			stats.setIpcNum(_ctx.longValue("DescribeGroupsResponse.Groups["+ i +"].Stats.IpcNum"));
			stats.setPlatformNum(_ctx.longValue("DescribeGroupsResponse.Groups["+ i +"].Stats.PlatformNum"));
			group.setStats(stats);

			groups.add(group);
		}
		describeGroupsResponse.setGroups(groups);
	 
	 	return describeGroupsResponse;
	}
}