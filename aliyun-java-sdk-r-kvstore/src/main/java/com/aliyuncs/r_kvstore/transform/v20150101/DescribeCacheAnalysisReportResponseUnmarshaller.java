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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeCacheAnalysisReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisReportResponseUnmarshaller {

	public static DescribeCacheAnalysisReportResponse unmarshall(DescribeCacheAnalysisReportResponse describeCacheAnalysisReportResponse, UnmarshallerContext _ctx) {
		
		describeCacheAnalysisReportResponse.setRequestId(_ctx.stringValue("DescribeCacheAnalysisReportResponse.RequestId"));
		describeCacheAnalysisReportResponse.setTotalRecordCount(_ctx.integerValue("DescribeCacheAnalysisReportResponse.TotalRecordCount"));
		describeCacheAnalysisReportResponse.setPageSize(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageSize"));
		describeCacheAnalysisReportResponse.setPageNumber(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageNumber"));
		describeCacheAnalysisReportResponse.setPageRecordCount(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageRecordCount"));
		describeCacheAnalysisReportResponse.setHotKeys(_ctx.stringValue("DescribeCacheAnalysisReportResponse.HotKeys"));
		describeCacheAnalysisReportResponse.setBigKeys(_ctx.stringValue("DescribeCacheAnalysisReportResponse.BigKeys"));
	 
	 	return describeCacheAnalysisReportResponse;
	}
}