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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribeEslDevicesResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribeEslDevicesResponse.EslDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslDevicesResponseUnmarshaller {

	public static DescribeEslDevicesResponse unmarshall(DescribeEslDevicesResponse describeEslDevicesResponse, UnmarshallerContext _ctx) {
		
		describeEslDevicesResponse.setRequestId(_ctx.stringValue("DescribeEslDevicesResponse.RequestId"));
		describeEslDevicesResponse.setErrorMessage(_ctx.stringValue("DescribeEslDevicesResponse.ErrorMessage"));
		describeEslDevicesResponse.setErrorCode(_ctx.stringValue("DescribeEslDevicesResponse.ErrorCode"));
		describeEslDevicesResponse.setPageSize(_ctx.integerValue("DescribeEslDevicesResponse.PageSize"));
		describeEslDevicesResponse.setMessage(_ctx.stringValue("DescribeEslDevicesResponse.Message"));
		describeEslDevicesResponse.setTotalCount(_ctx.integerValue("DescribeEslDevicesResponse.TotalCount"));
		describeEslDevicesResponse.setDynamicCode(_ctx.stringValue("DescribeEslDevicesResponse.DynamicCode"));
		describeEslDevicesResponse.setCode(_ctx.stringValue("DescribeEslDevicesResponse.Code"));
		describeEslDevicesResponse.setPageNumber(_ctx.integerValue("DescribeEslDevicesResponse.PageNumber"));
		describeEslDevicesResponse.setDynamicMessage(_ctx.stringValue("DescribeEslDevicesResponse.DynamicMessage"));
		describeEslDevicesResponse.setSuccess(_ctx.booleanValue("DescribeEslDevicesResponse.Success"));

		List<EslDeviceInfo> eslDevices = new ArrayList<EslDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEslDevicesResponse.EslDevices.Length"); i++) {
			EslDeviceInfo eslDeviceInfo = new EslDeviceInfo();
			eslDeviceInfo.setBeBind(_ctx.booleanValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BeBind"));
			eslDeviceInfo.setPositionCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].PositionCode"));
			eslDeviceInfo.setEslStatus(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslStatus"));
			eslDeviceInfo.setStoreId(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].StoreId"));
			eslDeviceInfo.setType(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Type"));
			eslDeviceInfo.setMac(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Mac"));
			eslDeviceInfo.setItemActionPrice(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemActionPrice"));
			eslDeviceInfo.setConnectAp(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ConnectAp"));
			eslDeviceInfo.setItemPriceUnit(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemPriceUnit"));
			eslDeviceInfo.setShelfCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ShelfCode"));
			eslDeviceInfo.setScreenWidth(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenWidth"));
			eslDeviceInfo.setItemTitle(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemTitle"));
			eslDeviceInfo.setScreenHeight(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ScreenHeight"));
			eslDeviceInfo.setLastCommunicateTime(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].LastCommunicateTime"));
			eslDeviceInfo.setModel(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Model"));
			eslDeviceInfo.setEslBarCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].EslBarCode"));
			eslDeviceInfo.setBatteryLevel(_ctx.integerValue("DescribeEslDevicesResponse.EslDevices["+ i +"].BatteryLevel"));
			eslDeviceInfo.setItemBarCode(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemBarCode"));
			eslDeviceInfo.setItemId(_ctx.longValue("DescribeEslDevicesResponse.EslDevices["+ i +"].ItemId"));
			eslDeviceInfo.setCompanyId(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].CompanyId"));
			eslDeviceInfo.setVendor(_ctx.stringValue("DescribeEslDevicesResponse.EslDevices["+ i +"].Vendor"));

			eslDevices.add(eslDeviceInfo);
		}
		describeEslDevicesResponse.setEslDevices(eslDevices);
	 
	 	return describeEslDevicesResponse;
	}
}