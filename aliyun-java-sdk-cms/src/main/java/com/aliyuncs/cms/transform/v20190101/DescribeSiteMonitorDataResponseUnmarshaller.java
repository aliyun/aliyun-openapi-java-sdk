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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteMonitorDataResponseUnmarshaller {

	public static DescribeSiteMonitorDataResponse unmarshall(DescribeSiteMonitorDataResponse describeSiteMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeSiteMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeSiteMonitorDataResponse.RequestId"));
		describeSiteMonitorDataResponse.setCode(_ctx.stringValue("DescribeSiteMonitorDataResponse.Code"));
		describeSiteMonitorDataResponse.setMessage(_ctx.stringValue("DescribeSiteMonitorDataResponse.Message"));
		describeSiteMonitorDataResponse.setSuccess(_ctx.stringValue("DescribeSiteMonitorDataResponse.Success"));
		describeSiteMonitorDataResponse.setNextToken(_ctx.stringValue("DescribeSiteMonitorDataResponse.NextToken"));
		describeSiteMonitorDataResponse.setData(_ctx.stringValue("DescribeSiteMonitorDataResponse.Data"));
	 
	 	return describeSiteMonitorDataResponse;
	}
}