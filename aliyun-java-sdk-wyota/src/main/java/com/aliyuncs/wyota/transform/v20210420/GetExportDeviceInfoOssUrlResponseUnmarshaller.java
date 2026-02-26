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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetExportDeviceInfoOssUrlResponse;
import com.aliyuncs.wyota.model.v20210420.GetExportDeviceInfoOssUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExportDeviceInfoOssUrlResponseUnmarshaller {

	public static GetExportDeviceInfoOssUrlResponse unmarshall(GetExportDeviceInfoOssUrlResponse getExportDeviceInfoOssUrlResponse, UnmarshallerContext _ctx) {
		
		getExportDeviceInfoOssUrlResponse.setRequestId(_ctx.stringValue("GetExportDeviceInfoOssUrlResponse.RequestId"));
		getExportDeviceInfoOssUrlResponse.setMessage(_ctx.stringValue("GetExportDeviceInfoOssUrlResponse.Message"));
		getExportDeviceInfoOssUrlResponse.setCode(_ctx.stringValue("GetExportDeviceInfoOssUrlResponse.Code"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetExportDeviceInfoOssUrlResponse.Data.Url"));
		getExportDeviceInfoOssUrlResponse.setData(data);
	 
	 	return getExportDeviceInfoOssUrlResponse;
	}
}