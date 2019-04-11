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

import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorQuotaResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSiteMonitorQuotaResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteMonitorQuotaResponseUnmarshaller {

	public static DescribeSiteMonitorQuotaResponse unmarshall(DescribeSiteMonitorQuotaResponse describeSiteMonitorQuotaResponse, UnmarshallerContext context) {
		
		describeSiteMonitorQuotaResponse.setRequestId(context.stringValue("DescribeSiteMonitorQuotaResponse.RequestId"));
		describeSiteMonitorQuotaResponse.setCode(context.stringValue("DescribeSiteMonitorQuotaResponse.Code"));
		describeSiteMonitorQuotaResponse.setMessage(context.stringValue("DescribeSiteMonitorQuotaResponse.Message"));
		describeSiteMonitorQuotaResponse.setSuccess(context.stringValue("DescribeSiteMonitorQuotaResponse.Success"));

		Data data = new Data();
		data.setSiteMonitorIdcQuota(context.integerValue("DescribeSiteMonitorQuotaResponse.Data.SiteMonitorIdcQuota"));
		data.setSiteMonitorOperatorQuotaQuota(context.integerValue("DescribeSiteMonitorQuotaResponse.Data.SiteMonitorOperatorQuotaQuota"));
		data.setSiteMonitorTaskQuota(context.integerValue("DescribeSiteMonitorQuotaResponse.Data.SiteMonitorTaskQuota"));
		data.setSiteMonitorQuotaTaskUsed(context.integerValue("DescribeSiteMonitorQuotaResponse.Data.SiteMonitorQuotaTaskUsed"));
		data.setSiteMonitorVersion(context.stringValue("DescribeSiteMonitorQuotaResponse.Data.SiteMonitorVersion"));
		describeSiteMonitorQuotaResponse.setData(data);
	 
	 	return describeSiteMonitorQuotaResponse;
	}
}