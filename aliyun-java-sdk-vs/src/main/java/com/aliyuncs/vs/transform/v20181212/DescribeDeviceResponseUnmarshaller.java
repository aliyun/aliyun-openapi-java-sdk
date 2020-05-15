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

import com.aliyuncs.vs.model.v20181212.DescribeDeviceResponse;
import com.aliyuncs.vs.model.v20181212.DescribeDeviceResponse.Directory;
import com.aliyuncs.vs.model.v20181212.DescribeDeviceResponse.Stats;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceResponseUnmarshaller {

	public static DescribeDeviceResponse unmarshall(DescribeDeviceResponse describeDeviceResponse, UnmarshallerContext _ctx) {
		
		describeDeviceResponse.setRequestId(_ctx.stringValue("DescribeDeviceResponse.RequestId"));
		describeDeviceResponse.setId(_ctx.stringValue("DescribeDeviceResponse.Id"));
		describeDeviceResponse.setName(_ctx.stringValue("DescribeDeviceResponse.Name"));
		describeDeviceResponse.setDescription(_ctx.stringValue("DescribeDeviceResponse.Description"));
		describeDeviceResponse.setGroupId(_ctx.stringValue("DescribeDeviceResponse.GroupId"));
		describeDeviceResponse.setParentId(_ctx.stringValue("DescribeDeviceResponse.ParentId"));
		describeDeviceResponse.setDirectoryId(_ctx.stringValue("DescribeDeviceResponse.DirectoryId"));
		describeDeviceResponse.setType(_ctx.stringValue("DescribeDeviceResponse.Type"));
		describeDeviceResponse.setAutoStart(_ctx.booleanValue("DescribeDeviceResponse.AutoStart"));
		describeDeviceResponse.setEnabled(_ctx.booleanValue("DescribeDeviceResponse.Enabled"));
		describeDeviceResponse.setBizProtocol(_ctx.stringValue("DescribeDeviceResponse.Protocol"));
		describeDeviceResponse.setStatus(_ctx.stringValue("DescribeDeviceResponse.Status"));
		describeDeviceResponse.setGbId(_ctx.stringValue("DescribeDeviceResponse.GbId"));
		describeDeviceResponse.setIp(_ctx.stringValue("DescribeDeviceResponse.Ip"));
		describeDeviceResponse.setPort(_ctx.longValue("DescribeDeviceResponse.Port"));
		describeDeviceResponse.setUrl(_ctx.stringValue("DescribeDeviceResponse.Url"));
		describeDeviceResponse.setUsername(_ctx.stringValue("DescribeDeviceResponse.Username"));
		describeDeviceResponse.setPassword(_ctx.stringValue("DescribeDeviceResponse.Password"));
		describeDeviceResponse.setVendor(_ctx.stringValue("DescribeDeviceResponse.Vendor"));
		describeDeviceResponse.setDsn(_ctx.stringValue("DescribeDeviceResponse.Dsn"));
		describeDeviceResponse.setLongitude(_ctx.stringValue("DescribeDeviceResponse.Longitude"));
		describeDeviceResponse.setLatitude(_ctx.stringValue("DescribeDeviceResponse.Latitude"));
		describeDeviceResponse.setAutoPos(_ctx.booleanValue("DescribeDeviceResponse.AutoPos"));
		describeDeviceResponse.setPosInterval(_ctx.longValue("DescribeDeviceResponse.PosInterval"));
		describeDeviceResponse.setCreatedTime(_ctx.stringValue("DescribeDeviceResponse.CreatedTime"));
		describeDeviceResponse.setRegisteredTime(_ctx.stringValue("DescribeDeviceResponse.RegisteredTime"));
		describeDeviceResponse.setChannelSyncTime(_ctx.stringValue("DescribeDeviceResponse.ChannelSyncTime"));
		describeDeviceResponse.setParams(_ctx.stringValue("DescribeDeviceResponse.Params"));

		Stats stats = new Stats();
		stats.setChannelNum(_ctx.longValue("DescribeDeviceResponse.Stats.ChannelNum"));
		stats.setStreamNum(_ctx.longValue("DescribeDeviceResponse.Stats.StreamNum"));
		stats.setOnlineNum(_ctx.longValue("DescribeDeviceResponse.Stats.OnlineNum"));
		stats.setOfflineNum(_ctx.longValue("DescribeDeviceResponse.Stats.OfflineNum"));
		stats.setFailedNum(_ctx.longValue("DescribeDeviceResponse.Stats.FailedNum"));
		describeDeviceResponse.setStats(stats);

		Directory directory = new Directory();
		directory.setId(_ctx.stringValue("DescribeDeviceResponse.Directory.Id"));
		directory.setName(_ctx.stringValue("DescribeDeviceResponse.Directory.Name"));
		directory.setDescription(_ctx.stringValue("DescribeDeviceResponse.Directory.Description"));
		directory.setGroupId(_ctx.stringValue("DescribeDeviceResponse.Directory.GroupId"));
		directory.setParentId(_ctx.stringValue("DescribeDeviceResponse.Directory.ParentId"));
		directory.setCreatedTime(_ctx.stringValue("DescribeDeviceResponse.Directory.CreatedTime"));
		describeDeviceResponse.setDirectory(directory);
	 
	 	return describeDeviceResponse;
	}
}