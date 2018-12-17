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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.DescribeEslDevicesResponse;
import com.aliyuncs.cloudesl.model.v20180801.DescribeEslDevicesResponse.EslDeviceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslDevicesResponseUnmarshaller {

	public static DescribeEslDevicesResponse unmarshall(DescribeEslDevicesResponse describeEslDevicesResponse, UnmarshallerContext context) {
		
		describeEslDevicesResponse.setRequestId(context.stringValue("DescribeEslDevicesResponse.RequestId"));
		describeEslDevicesResponse.setSuccess(context.booleanValue("DescribeEslDevicesResponse.Success"));
		describeEslDevicesResponse.setMessage(context.stringValue("DescribeEslDevicesResponse.Message"));
		describeEslDevicesResponse.setErrorCode(context.stringValue("DescribeEslDevicesResponse.ErrorCode"));
		describeEslDevicesResponse.setTotalCount(context.integerValue("DescribeEslDevicesResponse.TotalCount"));
		describeEslDevicesResponse.setPageNumber(context.integerValue("DescribeEslDevicesResponse.PageNumber"));
		describeEslDevicesResponse.setPageSize(context.integerValue("DescribeEslDevicesResponse.PageSize"));

		List<EslDeviceInfo> eslDevices = new ArrayList<EslDeviceInfo>();
		for (int i = 0; i < context.lengthValue("DescribeEslDevicesResponse.EslDevices.Length"); i++) {
			EslDeviceInfo eslDeviceInfo = new EslDeviceInfo();
			eslDeviceInfo.setCompanyId(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].CompanyId"));
			eslDeviceInfo.setStoreId(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].StoreId"));
			eslDeviceInfo.setMac(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Mac"));
			eslDeviceInfo.setEslBarCode(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslBarCode"));
			eslDeviceInfo.setItemBarCode(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemBarCode"));
			eslDeviceInfo.setVendor(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Vendor"));
			eslDeviceInfo.setConnectAp(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ConnectAp"));
			eslDeviceInfo.setType(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Type"));
			eslDeviceInfo.setModel(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Model"));
			eslDeviceInfo.setBeBind(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BeBind"));
			eslDeviceInfo.setScreenWidth(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenWidth"));
			eslDeviceInfo.setScreenHeight(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenHeight"));
			eslDeviceInfo.setLastCommunicateTime(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].LastCommunicateTime"));
			eslDeviceInfo.setBatteryLevel(context.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BatteryLevel"));
			eslDeviceInfo.setEslStatus(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslStatus"));
			eslDeviceInfo.setShelfCode(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ShelfCode"));
			eslDeviceInfo.setPositionCode(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].PositionCode"));
			eslDeviceInfo.setItemId(context.longValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemId"));
			eslDeviceInfo.setItemTitle(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemTitle"));
			eslDeviceInfo.setItemActionPrice(context.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemActionPrice"));
			eslDeviceInfo.setItemPriceUnit(context.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemPriceUnit"));

			eslDevices.add(eslDeviceInfo);
		}
		describeEslDevicesResponse.setEslDevices(eslDevices);
	 
	 	return describeEslDevicesResponse;
	}
}