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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeSummaryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSummaryResponseUnmarshaller {

	public static DescribeSummaryResponse unmarshall(DescribeSummaryResponse describeSummaryResponse, UnmarshallerContext _ctx) {
		
		describeSummaryResponse.setRequestId(_ctx.stringValue("DescribeSummaryResponse.RequestId"));
		describeSummaryResponse.setSuccess(_ctx.booleanValue("DescribeSummaryResponse.Success"));
		describeSummaryResponse.setCode(_ctx.stringValue("DescribeSummaryResponse.Code"));
		describeSummaryResponse.setMessage(_ctx.stringValue("DescribeSummaryResponse.Message"));
		describeSummaryResponse.setServerCount(_ctx.longValue("DescribeSummaryResponse.ServerCount"));
		describeSummaryResponse.setDbServerCount(_ctx.longValue("DescribeSummaryResponse.DbServerCount"));
		describeSummaryResponse.setSiteCount(_ctx.longValue("DescribeSummaryResponse.SiteCount"));
		describeSummaryResponse.setTotalSize(_ctx.longValue("DescribeSummaryResponse.TotalSize"));
	 
	 	return describeSummaryResponse;
	}
}