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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeDsReportsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDsReportsResponseUnmarshaller {

	public static DescribeDsReportsResponse unmarshall(DescribeDsReportsResponse describeDsReportsResponse, UnmarshallerContext _ctx) {
		
		describeDsReportsResponse.setRequestId(_ctx.stringValue("DescribeDsReportsResponse.RequestId"));
		describeDsReportsResponse.setSuccess(_ctx.booleanValue("DescribeDsReportsResponse.Success"));
		describeDsReportsResponse.setCode(_ctx.stringValue("DescribeDsReportsResponse.Code"));
		describeDsReportsResponse.setMessage(_ctx.stringValue("DescribeDsReportsResponse.Message"));
		describeDsReportsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDsReportsResponse.HttpStatusCode"));
		describeDsReportsResponse.setDsReports(_ctx.stringValue("DescribeDsReportsResponse.DsReports"));
	 
	 	return describeDsReportsResponse;
	}
}