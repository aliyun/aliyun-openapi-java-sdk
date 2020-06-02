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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetRepoTagScanSummaryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoTagScanSummaryResponseUnmarshaller {

	public static GetRepoTagScanSummaryResponse unmarshall(GetRepoTagScanSummaryResponse getRepoTagScanSummaryResponse, UnmarshallerContext _ctx) {
		
		getRepoTagScanSummaryResponse.setRequestId(_ctx.stringValue("GetRepoTagScanSummaryResponse.RequestId"));
		getRepoTagScanSummaryResponse.setIsSuccess(_ctx.booleanValue("GetRepoTagScanSummaryResponse.IsSuccess"));
		getRepoTagScanSummaryResponse.setCode(_ctx.stringValue("GetRepoTagScanSummaryResponse.Code"));
		getRepoTagScanSummaryResponse.setLowSeverity(_ctx.integerValue("GetRepoTagScanSummaryResponse.LowSeverity"));
		getRepoTagScanSummaryResponse.setMediumSeverity(_ctx.integerValue("GetRepoTagScanSummaryResponse.MediumSeverity"));
		getRepoTagScanSummaryResponse.setHighSeverity(_ctx.integerValue("GetRepoTagScanSummaryResponse.HighSeverity"));
		getRepoTagScanSummaryResponse.setUnknownSeverity(_ctx.integerValue("GetRepoTagScanSummaryResponse.UnknownSeverity"));
		getRepoTagScanSummaryResponse.setTotalSeverity(_ctx.integerValue("GetRepoTagScanSummaryResponse.TotalSeverity"));
	 
	 	return getRepoTagScanSummaryResponse;
	}
}