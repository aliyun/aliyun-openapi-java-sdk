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

import com.aliyuncs.vs.model.v20181212.DescribeUserDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeUserDevicesResponse.UserDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserDevicesResponseUnmarshaller {

	public static DescribeUserDevicesResponse unmarshall(DescribeUserDevicesResponse describeUserDevicesResponse, UnmarshallerContext _ctx) {
		
		describeUserDevicesResponse.setRequestId(_ctx.stringValue("DescribeUserDevicesResponse.RequestId"));

		List<UserDevice> list = new ArrayList<UserDevice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserDevicesResponse.List.Length"); i++) {
			UserDevice userDevice = new UserDevice();
			userDevice.setStatus(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].Status"));
			userDevice.setSpecification(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].Specification"));
			userDevice.setMacAddress(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].MacAddress"));
			userDevice.setMatrixId(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].MatrixId"));
			userDevice.setAliUid(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].AliUid"));
			userDevice.setEdgeNodeName(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].EdgeNodeName"));
			userDevice.setServer(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].Server"));
			userDevice.setInstanceId(_ctx.stringValue("DescribeUserDevicesResponse.List["+ i +"].InstanceId"));

			list.add(userDevice);
		}
		describeUserDevicesResponse.setList(list);
	 
	 	return describeUserDevicesResponse;
	}
}