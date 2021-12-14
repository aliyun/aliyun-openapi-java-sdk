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

import com.aliyuncs.vs.model.v20181212.DescribeVsDevicesDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDevicesDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDevicesDataResponseUnmarshaller {

	public static DescribeVsDevicesDataResponse unmarshall(DescribeVsDevicesDataResponse describeVsDevicesDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDevicesDataResponse.setRequestId(_ctx.stringValue("DescribeVsDevicesDataResponse.RequestId"));

		List<DataModule> devicesDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDevicesDataResponse.DevicesDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDevicesDataResponse.DevicesDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setDevicesDataValue(_ctx.stringValue("DescribeVsDevicesDataResponse.DevicesDataPerInterval["+ i +"].DevicesDataValue"));

			devicesDataPerInterval.add(dataModule);
		}
		describeVsDevicesDataResponse.setDevicesDataPerInterval(devicesDataPerInterval);
	 
	 	return describeVsDevicesDataResponse;
	}
}