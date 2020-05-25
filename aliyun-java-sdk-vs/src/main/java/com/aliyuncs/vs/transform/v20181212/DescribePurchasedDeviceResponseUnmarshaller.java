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

import com.aliyuncs.vs.model.v20181212.DescribePurchasedDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedDeviceResponseUnmarshaller {

	public static DescribePurchasedDeviceResponse unmarshall(DescribePurchasedDeviceResponse describePurchasedDeviceResponse, UnmarshallerContext _ctx) {
		
		describePurchasedDeviceResponse.setRequestId(_ctx.stringValue("DescribePurchasedDeviceResponse.RequestId"));
		describePurchasedDeviceResponse.setId(_ctx.stringValue("DescribePurchasedDeviceResponse.Id"));
		describePurchasedDeviceResponse.setName(_ctx.stringValue("DescribePurchasedDeviceResponse.Name"));
		describePurchasedDeviceResponse.setDescription(_ctx.stringValue("DescribePurchasedDeviceResponse.Description"));
		describePurchasedDeviceResponse.setType(_ctx.stringValue("DescribePurchasedDeviceResponse.Type"));
		describePurchasedDeviceResponse.setSubType(_ctx.stringValue("DescribePurchasedDeviceResponse.SubType"));
		describePurchasedDeviceResponse.setRegisterCode(_ctx.stringValue("DescribePurchasedDeviceResponse.RegisterCode"));
		describePurchasedDeviceResponse.setVendor(_ctx.stringValue("DescribePurchasedDeviceResponse.Vendor"));
		describePurchasedDeviceResponse.setOrderId(_ctx.stringValue("DescribePurchasedDeviceResponse.OrderId"));
		describePurchasedDeviceResponse.setRegion(_ctx.stringValue("DescribePurchasedDeviceResponse.Region"));
		describePurchasedDeviceResponse.setGroupId(_ctx.stringValue("DescribePurchasedDeviceResponse.GroupId"));
		describePurchasedDeviceResponse.setGroupName(_ctx.stringValue("DescribePurchasedDeviceResponse.GroupName"));
		describePurchasedDeviceResponse.setCreatedTime(_ctx.stringValue("DescribePurchasedDeviceResponse.CreatedTime"));
	 
	 	return describePurchasedDeviceResponse;
	}
}