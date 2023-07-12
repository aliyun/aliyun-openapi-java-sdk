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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.AddDeviceToSharePromotionResponse;
import com.aliyuncs.iot.model.v20180120.AddDeviceToSharePromotionResponse.Data;
import com.aliyuncs.iot.model.v20180120.AddDeviceToSharePromotionResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDeviceToSharePromotionResponseUnmarshaller {

	public static AddDeviceToSharePromotionResponse unmarshall(AddDeviceToSharePromotionResponse addDeviceToSharePromotionResponse, UnmarshallerContext _ctx) {
		
		addDeviceToSharePromotionResponse.setRequestId(_ctx.stringValue("AddDeviceToSharePromotionResponse.RequestId"));
		addDeviceToSharePromotionResponse.setSuccess(_ctx.booleanValue("AddDeviceToSharePromotionResponse.Success"));
		addDeviceToSharePromotionResponse.setCode(_ctx.stringValue("AddDeviceToSharePromotionResponse.Code"));
		addDeviceToSharePromotionResponse.setErrorMessage(_ctx.stringValue("AddDeviceToSharePromotionResponse.ErrorMessage"));

		Data data = new Data();

		List<Item> failDeviceSimpleInfoList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("AddDeviceToSharePromotionResponse.Data.FailDeviceSimpleInfoList.Length"); i++) {
			Item item = new Item();
			item.setProductKey(_ctx.stringValue("AddDeviceToSharePromotionResponse.Data.FailDeviceSimpleInfoList["+ i +"].ProductKey"));
			item.setDeviceName(_ctx.stringValue("AddDeviceToSharePromotionResponse.Data.FailDeviceSimpleInfoList["+ i +"].DeviceName"));
			item.setFailCode(_ctx.integerValue("AddDeviceToSharePromotionResponse.Data.FailDeviceSimpleInfoList["+ i +"].FailCode"));
			item.setFailReason(_ctx.stringValue("AddDeviceToSharePromotionResponse.Data.FailDeviceSimpleInfoList["+ i +"].FailReason"));

			failDeviceSimpleInfoList.add(item);
		}
		data.setFailDeviceSimpleInfoList(failDeviceSimpleInfoList);
		addDeviceToSharePromotionResponse.setData(data);
	 
	 	return addDeviceToSharePromotionResponse;
	}
}