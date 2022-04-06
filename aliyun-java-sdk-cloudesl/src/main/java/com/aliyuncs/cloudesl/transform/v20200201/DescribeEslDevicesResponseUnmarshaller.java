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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeEslDevicesResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeEslDevicesResponse.EslDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslDevicesResponseUnmarshaller {

	public static DescribeEslDevicesResponse unmarshall(DescribeEslDevicesResponse describeEslDevicesResponse, UnmarshallerContext _ctx) {
		
		describeEslDevicesResponse.setRequestId(_ctx.stringValue("DescribeEslDevicesResponse.RequestId"));
		describeEslDevicesResponse.setErrorMessage(_ctx.stringValue("DescribeEslDevicesResponse.ErrorMessage"));
		describeEslDevicesResponse.setSuccess(_ctx.booleanValue("DescribeEslDevicesResponse.Success"));
		describeEslDevicesResponse.setErrorCode(_ctx.stringValue("DescribeEslDevicesResponse.ErrorCode"));
		describeEslDevicesResponse.setCode(_ctx.stringValue("DescribeEslDevicesResponse.Code"));
		describeEslDevicesResponse.setMessage(_ctx.stringValue("DescribeEslDevicesResponse.Message"));
		describeEslDevicesResponse.setDynamicMessage(_ctx.stringValue("DescribeEslDevicesResponse.DynamicMessage"));
		describeEslDevicesResponse.setPageNumber(_ctx.integerValue("DescribeEslDevicesResponse.PageNumber"));
		describeEslDevicesResponse.setPageSize(_ctx.integerValue("DescribeEslDevicesResponse.PageSize"));
		describeEslDevicesResponse.setTotalCount(_ctx.integerValue("DescribeEslDevicesResponse.TotalCount"));
		describeEslDevicesResponse.setDynamicCode(_ctx.stringValue("DescribeEslDevicesResponse.DynamicCode"));

		List<EslDeviceInfo> eslDevices = new ArrayList<EslDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEslDevicesResponse.EslDevices.Length"); i++) {
			EslDeviceInfo eslDeviceInfo = new EslDeviceInfo();
			eslDeviceInfo.setType(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Type"));
			eslDeviceInfo.setStoreId(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].StoreId"));
			eslDeviceInfo.setEslBarCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslBarCode"));
			eslDeviceInfo.setModel(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Model"));
			eslDeviceInfo.setLastCommunicateTime(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].LastCommunicateTime"));
			eslDeviceInfo.setScreenHeight(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenHeight"));
			eslDeviceInfo.setScreenWidth(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenWidth"));
			eslDeviceInfo.setEslSignal(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslSignal"));
			eslDeviceInfo.setBatteryLevel(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BatteryLevel"));
			eslDeviceInfo.setEslStatus(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslStatus"));
			eslDeviceInfo.setMac(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Mac"));
			eslDeviceInfo.setTypeEncode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].TypeEncode"));

			eslDevices.add(eslDeviceInfo);
		}
		describeEslDevicesResponse.setEslDevices(eslDevices);
	 
	 	return describeEslDevicesResponse;
	}
}