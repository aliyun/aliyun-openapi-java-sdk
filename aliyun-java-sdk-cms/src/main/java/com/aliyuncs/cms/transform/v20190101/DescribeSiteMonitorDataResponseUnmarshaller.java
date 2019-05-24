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

	public static DescribeSiteMonitorDataResponse unmarshall(DescribeSiteMonitorDataResponse describeSiteMonitorDataResponse, UnmarshallerContext context) {
		
		describeSiteMonitorDataResponse.setRequestId(context.stringValue("DescribeSiteMonitorDataResponse.RequestId"));
		describeSiteMonitorDataResponse.setCode(context.stringValue("DescribeSiteMonitorDataResponse.Code"));
		describeSiteMonitorDataResponse.setMessage(context.stringValue("DescribeSiteMonitorDataResponse.Message"));
		describeSiteMonitorDataResponse.setSuccess(context.stringValue("DescribeSiteMonitorDataResponse.Success"));
		describeSiteMonitorDataResponse.setData(context.stringValue("DescribeSiteMonitorDataResponse.Data"));
		describeSiteMonitorDataResponse.setNextToken(context.stringValue("DescribeSiteMonitorDataResponse.NextToken"));
	 
	 	return describeSiteMonitorDataResponse;
	}
}