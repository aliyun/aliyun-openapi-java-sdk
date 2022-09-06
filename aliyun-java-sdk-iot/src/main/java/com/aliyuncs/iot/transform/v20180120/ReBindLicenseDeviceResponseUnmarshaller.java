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

import com.aliyuncs.iot.model.v20180120.ReBindLicenseDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ReBindLicenseDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReBindLicenseDeviceResponseUnmarshaller {

	public static ReBindLicenseDeviceResponse unmarshall(ReBindLicenseDeviceResponse reBindLicenseDeviceResponse, UnmarshallerContext _ctx) {
		
		reBindLicenseDeviceResponse.setRequestId(_ctx.stringValue("ReBindLicenseDeviceResponse.RequestId"));
		reBindLicenseDeviceResponse.setSuccess(_ctx.booleanValue("ReBindLicenseDeviceResponse.Success"));
		reBindLicenseDeviceResponse.setCode(_ctx.stringValue("ReBindLicenseDeviceResponse.Code"));
		reBindLicenseDeviceResponse.setErrorMessage(_ctx.stringValue("ReBindLicenseDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setSuccessSum(_ctx.longValue("ReBindLicenseDeviceResponse.Data.SuccessSum"));
		data.setFailSum(_ctx.longValue("ReBindLicenseDeviceResponse.Data.FailSum"));
		data.setResultCsvFile(_ctx.stringValue("ReBindLicenseDeviceResponse.Data.ResultCsvFile"));
		data.setProgress(_ctx.integerValue("ReBindLicenseDeviceResponse.Data.Progress"));
		data.setCheckProgressId(_ctx.stringValue("ReBindLicenseDeviceResponse.Data.CheckProgressId"));
		reBindLicenseDeviceResponse.setData(data);
	 
	 	return reBindLicenseDeviceResponse;
	}
}