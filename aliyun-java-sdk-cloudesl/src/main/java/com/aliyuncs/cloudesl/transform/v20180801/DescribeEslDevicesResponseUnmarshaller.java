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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslDevicesResponseUnmarshaller {

	public static DescribeEslDevicesResponse unmarshall(DescribeEslDevicesResponse describeEslDevicesResponse, UnmarshallerContext _ctx) {
		
		describeEslDevicesResponse.setRequestId(_ctx.stringValue("DescribeEslDevicesResponse.RequestId"));
		describeEslDevicesResponse.setSuccess(_ctx.booleanValue("DescribeEslDevicesResponse.Success"));
		describeEslDevicesResponse.setMessage(_ctx.stringValue("DescribeEslDevicesResponse.Message"));
		describeEslDevicesResponse.setErrorCode(_ctx.stringValue("DescribeEslDevicesResponse.ErrorCode"));
		describeEslDevicesResponse.setTotalCount(_ctx.integerValue("DescribeEslDevicesResponse.TotalCount"));
		describeEslDevicesResponse.setPageNumber(_ctx.integerValue("DescribeEslDevicesResponse.PageNumber"));
		describeEslDevicesResponse.setPageSize(_ctx.integerValue("DescribeEslDevicesResponse.PageSize"));

		List<EslDeviceInfo> eslDevices = new ArrayList<EslDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEslDevicesResponse.EslDevices.Length"); i++) {
			EslDeviceInfo eslDeviceInfo = new EslDeviceInfo();
			eslDeviceInfo.setCompanyId(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].CompanyId"));
			eslDeviceInfo.setStoreId(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].StoreId"));
			eslDeviceInfo.setMac(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Mac"));
			eslDeviceInfo.setEslBarCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslBarCode"));
			eslDeviceInfo.setItemBarCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemBarCode"));
			eslDeviceInfo.setVendor(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Vendor"));
			eslDeviceInfo.setConnectAp(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ConnectAp"));
			eslDeviceInfo.setType(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Type"));
			eslDeviceInfo.setModel(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Model"));
			eslDeviceInfo.setBeBind(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BeBind"));
			eslDeviceInfo.setScreenWidth(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenWidth"));
			eslDeviceInfo.setScreenHeight(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenHeight"));
			eslDeviceInfo.setLastCommunicateTime(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].LastCommunicateTime"));
			eslDeviceInfo.setBatteryLevel(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BatteryLevel"));
			eslDeviceInfo.setEslStatus(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslStatus"));
			eslDeviceInfo.setShelfCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ShelfCode"));
			eslDeviceInfo.setPositionCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].PositionCode"));
			eslDeviceInfo.setItemId(_ctx.longValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemId"));
			eslDeviceInfo.setItemTitle(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemTitle"));
			eslDeviceInfo.setItemActionPrice(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemActionPrice"));
			eslDeviceInfo.setItemPriceUnit(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemPriceUnit"));

			eslDevices.add(eslDeviceInfo);
		}
		describeEslDevicesResponse.setEslDevices(eslDevices);
	 
	 	return describeEslDevicesResponse;
	}
}