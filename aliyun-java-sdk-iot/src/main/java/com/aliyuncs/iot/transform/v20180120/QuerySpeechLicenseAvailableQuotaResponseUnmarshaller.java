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

import com.aliyuncs.iot.model.v20180120.QuerySpeechLicenseAvailableQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechLicenseAvailableQuotaResponseUnmarshaller {

	public static QuerySpeechLicenseAvailableQuotaResponse unmarshall(QuerySpeechLicenseAvailableQuotaResponse querySpeechLicenseAvailableQuotaResponse, UnmarshallerContext _ctx) {
		
		querySpeechLicenseAvailableQuotaResponse.setRequestId(_ctx.stringValue("QuerySpeechLicenseAvailableQuotaResponse.RequestId"));
		querySpeechLicenseAvailableQuotaResponse.setSuccess(_ctx.booleanValue("QuerySpeechLicenseAvailableQuotaResponse.Success"));
		querySpeechLicenseAvailableQuotaResponse.setCode(_ctx.stringValue("QuerySpeechLicenseAvailableQuotaResponse.Code"));
		querySpeechLicenseAvailableQuotaResponse.setErrorMessage(_ctx.stringValue("QuerySpeechLicenseAvailableQuotaResponse.ErrorMessage"));
		querySpeechLicenseAvailableQuotaResponse.setData(_ctx.longValue("QuerySpeechLicenseAvailableQuotaResponse.Data"));
	 
	 	return querySpeechLicenseAvailableQuotaResponse;
	}
}