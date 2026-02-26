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

import com.aliyuncs.iot.model.v20180120.GetSpeechLicenseDeviceStatisticsResponse;
import com.aliyuncs.iot.model.v20180120.GetSpeechLicenseDeviceStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechLicenseDeviceStatisticsResponseUnmarshaller {

	public static GetSpeechLicenseDeviceStatisticsResponse unmarshall(GetSpeechLicenseDeviceStatisticsResponse getSpeechLicenseDeviceStatisticsResponse, UnmarshallerContext _ctx) {
		
		getSpeechLicenseDeviceStatisticsResponse.setRequestId(_ctx.stringValue("GetSpeechLicenseDeviceStatisticsResponse.RequestId"));
		getSpeechLicenseDeviceStatisticsResponse.setSuccess(_ctx.booleanValue("GetSpeechLicenseDeviceStatisticsResponse.Success"));
		getSpeechLicenseDeviceStatisticsResponse.setCode(_ctx.stringValue("GetSpeechLicenseDeviceStatisticsResponse.Code"));
		getSpeechLicenseDeviceStatisticsResponse.setErrorMessage(_ctx.stringValue("GetSpeechLicenseDeviceStatisticsResponse.ErrorMessage"));

		Data data = new Data();
		data.setAvailableQuota(_ctx.integerValue("GetSpeechLicenseDeviceStatisticsResponse.Data.AvailableQuota"));
		data.setExpiredQuota(_ctx.integerValue("GetSpeechLicenseDeviceStatisticsResponse.Data.ExpiredQuota"));
		data.setExpiringQuota(_ctx.integerValue("GetSpeechLicenseDeviceStatisticsResponse.Data.ExpiringQuota"));
		getSpeechLicenseDeviceStatisticsResponse.setData(data);
	 
	 	return getSpeechLicenseDeviceStatisticsResponse;
	}
}