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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.ReportStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportStatisticsResponseUnmarshaller {

	public static ReportStatisticsResponse unmarshall(ReportStatisticsResponse reportStatisticsResponse, UnmarshallerContext _ctx) {
		
		reportStatisticsResponse.setRequestId(_ctx.stringValue("ReportStatisticsResponse.RequestId"));
		reportStatisticsResponse.setSuccess(_ctx.booleanValue("ReportStatisticsResponse.Success"));
		reportStatisticsResponse.setCode(_ctx.stringValue("ReportStatisticsResponse.Code"));
		reportStatisticsResponse.setMessage(_ctx.stringValue("ReportStatisticsResponse.Message"));
	 
	 	return reportStatisticsResponse;
	}
}