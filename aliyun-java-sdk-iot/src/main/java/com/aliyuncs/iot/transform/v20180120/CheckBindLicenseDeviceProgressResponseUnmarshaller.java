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

import com.aliyuncs.iot.model.v20180120.CheckBindLicenseDeviceProgressResponse;
import com.aliyuncs.iot.model.v20180120.CheckBindLicenseDeviceProgressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckBindLicenseDeviceProgressResponseUnmarshaller {

	public static CheckBindLicenseDeviceProgressResponse unmarshall(CheckBindLicenseDeviceProgressResponse checkBindLicenseDeviceProgressResponse, UnmarshallerContext _ctx) {
		
		checkBindLicenseDeviceProgressResponse.setRequestId(_ctx.stringValue("CheckBindLicenseDeviceProgressResponse.RequestId"));
		checkBindLicenseDeviceProgressResponse.setSuccess(_ctx.booleanValue("CheckBindLicenseDeviceProgressResponse.Success"));
		checkBindLicenseDeviceProgressResponse.setCode(_ctx.stringValue("CheckBindLicenseDeviceProgressResponse.Code"));
		checkBindLicenseDeviceProgressResponse.setErrorMessage(_ctx.stringValue("CheckBindLicenseDeviceProgressResponse.ErrorMessage"));

		Data data = new Data();
		data.setSuccessSum(_ctx.longValue("CheckBindLicenseDeviceProgressResponse.Data.SuccessSum"));
		data.setFailSum(_ctx.longValue("CheckBindLicenseDeviceProgressResponse.Data.FailSum"));
		data.setResultCsvFile(_ctx.stringValue("CheckBindLicenseDeviceProgressResponse.Data.ResultCsvFile"));
		data.setProgress(_ctx.integerValue("CheckBindLicenseDeviceProgressResponse.Data.Progress"));
		checkBindLicenseDeviceProgressResponse.setData(data);
	 
	 	return checkBindLicenseDeviceProgressResponse;
	}
}