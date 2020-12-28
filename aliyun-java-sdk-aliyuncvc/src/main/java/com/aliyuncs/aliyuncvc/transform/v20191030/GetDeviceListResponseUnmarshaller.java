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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.GetDeviceListResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetDeviceListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceListResponseUnmarshaller {

	public static GetDeviceListResponse unmarshall(GetDeviceListResponse getDeviceListResponse, UnmarshallerContext _ctx) {
		
		getDeviceListResponse.setRequestId(_ctx.stringValue("GetDeviceListResponse.RequestId"));
		getDeviceListResponse.setErrorCode(_ctx.integerValue("GetDeviceListResponse.ErrorCode"));
		getDeviceListResponse.setMessage(_ctx.stringValue("GetDeviceListResponse.Message"));
		getDeviceListResponse.setSuccess(_ctx.booleanValue("GetDeviceListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActivationCode(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].ActivationCode"));
			dataItem.setCastScreenCode(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].CastScreenCode"));
			dataItem.setIP(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].IP"));
			dataItem.setMac(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].Mac"));
			dataItem.setSN(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].SN"));
			dataItem.setStatus(_ctx.integerValue("GetDeviceListResponse.Data["+ i +"].Status"));
			dataItem.setPort(_ctx.stringValue("GetDeviceListResponse.Data["+ i +"].Port"));

			data.add(dataItem);
		}
		getDeviceListResponse.setData(data);
	 
	 	return getDeviceListResponse;
	}
}