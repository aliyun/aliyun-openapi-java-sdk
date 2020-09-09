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

package com.aliyuncs.et_industry_openapi.transform.v20200824;

import com.aliyuncs.et_industry_openapi.model.v20200824.UploadIndustryDeviceDataResponse;
import com.aliyuncs.et_industry_openapi.model.v20200824.UploadIndustryDeviceDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadIndustryDeviceDataResponseUnmarshaller {

	public static UploadIndustryDeviceDataResponse unmarshall(UploadIndustryDeviceDataResponse uploadIndustryDeviceDataResponse, UnmarshallerContext _ctx) {
		
		uploadIndustryDeviceDataResponse.setRequestId(_ctx.stringValue("UploadIndustryDeviceDataResponse.RequestId"));
		uploadIndustryDeviceDataResponse.setCode(_ctx.stringValue("UploadIndustryDeviceDataResponse.Code"));
		uploadIndustryDeviceDataResponse.setMessage(_ctx.stringValue("UploadIndustryDeviceDataResponse.Message"));
		uploadIndustryDeviceDataResponse.setSuccess(_ctx.booleanValue("UploadIndustryDeviceDataResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("UploadIndustryDeviceDataResponse.Data.Count"));
		uploadIndustryDeviceDataResponse.setData(data);
	 
	 	return uploadIndustryDeviceDataResponse;
	}
}