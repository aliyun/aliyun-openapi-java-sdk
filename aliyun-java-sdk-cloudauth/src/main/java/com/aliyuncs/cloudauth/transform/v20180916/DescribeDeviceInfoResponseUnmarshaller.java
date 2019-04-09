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

package com.aliyuncs.cloudauth.transform.v20180916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20180916.DescribeDeviceInfoResponse;
import com.aliyuncs.cloudauth.model.v20180916.DescribeDeviceInfoResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceInfoResponseUnmarshaller {

	public static DescribeDeviceInfoResponse unmarshall(DescribeDeviceInfoResponse describeDeviceInfoResponse, UnmarshallerContext context) {
		
		describeDeviceInfoResponse.setRequestId(context.stringValue("DescribeDeviceInfoResponse.RequestId"));
		describeDeviceInfoResponse.setPageSize(context.integerValue("DescribeDeviceInfoResponse.PageSize"));
		describeDeviceInfoResponse.setCurrentPage(context.integerValue("DescribeDeviceInfoResponse.CurrentPage"));
		describeDeviceInfoResponse.setTotalCount(context.integerValue("DescribeDeviceInfoResponse.TotalCount"));

		List<DeviceInfo> deviceInfoList = new ArrayList<DeviceInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDeviceInfoResponse.DeviceInfoList.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceId(context.stringValue("DescribeDeviceInfoResponse.DeviceInfoList["+ i +"].DeviceId"));
			deviceInfo.setUserDeviceId(context.stringValue("DescribeDeviceInfoResponse.DeviceInfoList["+ i +"].UserDeviceId"));
			deviceInfo.setBizType(context.stringValue("DescribeDeviceInfoResponse.DeviceInfoList["+ i +"].BizType"));
			deviceInfo.setBeginDay(context.stringValue("DescribeDeviceInfoResponse.DeviceInfoList["+ i +"].BeginDay"));
			deviceInfo.setExpiredDay(context.stringValue("DescribeDeviceInfoResponse.DeviceInfoList["+ i +"].ExpiredDay"));

			deviceInfoList.add(deviceInfo);
		}
		describeDeviceInfoResponse.setDeviceInfoList(deviceInfoList);
	 
	 	return describeDeviceInfoResponse;
	}
}