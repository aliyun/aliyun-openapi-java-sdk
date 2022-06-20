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

import com.aliyuncs.iot.model.v20180120.BindLicenseDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BindLicenseDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindLicenseDeviceResponseUnmarshaller {

	public static BindLicenseDeviceResponse unmarshall(BindLicenseDeviceResponse bindLicenseDeviceResponse, UnmarshallerContext _ctx) {
		
		bindLicenseDeviceResponse.setRequestId(_ctx.stringValue("BindLicenseDeviceResponse.RequestId"));
		bindLicenseDeviceResponse.setSuccess(_ctx.booleanValue("BindLicenseDeviceResponse.Success"));
		bindLicenseDeviceResponse.setCode(_ctx.stringValue("BindLicenseDeviceResponse.Code"));
		bindLicenseDeviceResponse.setErrorMessage(_ctx.stringValue("BindLicenseDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setSuccessSum(_ctx.longValue("BindLicenseDeviceResponse.Data.SuccessSum"));
		data.setFailSum(_ctx.longValue("BindLicenseDeviceResponse.Data.FailSum"));
		data.setResultCsvFile(_ctx.stringValue("BindLicenseDeviceResponse.Data.ResultCsvFile"));
		data.setProgress(_ctx.integerValue("BindLicenseDeviceResponse.Data.Progress"));
		data.setCheckProgressId(_ctx.stringValue("BindLicenseDeviceResponse.Data.CheckProgressId"));
		bindLicenseDeviceResponse.setData(data);
	 
	 	return bindLicenseDeviceResponse;
	}
}