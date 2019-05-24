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

import com.aliyuncs.cms.model.v20190101.EnableSiteMonitorsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableSiteMonitorsResponseUnmarshaller {

	public static EnableSiteMonitorsResponse unmarshall(EnableSiteMonitorsResponse enableSiteMonitorsResponse, UnmarshallerContext context) {
		
		enableSiteMonitorsResponse.setRequestId(context.stringValue("EnableSiteMonitorsResponse.RequestId"));
		enableSiteMonitorsResponse.setCode(context.stringValue("EnableSiteMonitorsResponse.Code"));
		enableSiteMonitorsResponse.setMessage(context.stringValue("EnableSiteMonitorsResponse.Message"));
		enableSiteMonitorsResponse.setSuccess(context.stringValue("EnableSiteMonitorsResponse.Success"));
		enableSiteMonitorsResponse.setData(context.stringValue("EnableSiteMonitorsResponse.Data"));
	 
	 	return enableSiteMonitorsResponse;
	}
}