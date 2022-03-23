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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeCacheAnalysisReportResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisReportResponseUnmarshaller {

	public static DescribeCacheAnalysisReportResponse unmarshall(DescribeCacheAnalysisReportResponse describeCacheAnalysisReportResponse, UnmarshallerContext _ctx) {
		
		describeCacheAnalysisReportResponse.setRequestId(_ctx.stringValue("DescribeCacheAnalysisReportResponse.RequestId"));
		describeCacheAnalysisReportResponse.setPageNumber(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageNumber"));
		describeCacheAnalysisReportResponse.setPageSize(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageSize"));
		describeCacheAnalysisReportResponse.setPageRecordCount(_ctx.integerValue("DescribeCacheAnalysisReportResponse.PageRecordCount"));
		describeCacheAnalysisReportResponse.setTotalRecordCount(_ctx.integerValue("DescribeCacheAnalysisReportResponse.TotalRecordCount"));

		List<Map<Object, Object>> bigKeys = _ctx.listMapValue("DescribeCacheAnalysisReportResponse.BigKeys");
		describeCacheAnalysisReportResponse.setBigKeys(bigKeys);

		List<Map<Object, Object>> hotKeys = _ctx.listMapValue("DescribeCacheAnalysisReportResponse.HotKeys");
		describeCacheAnalysisReportResponse.setHotKeys(hotKeys);
	 
	 	return describeCacheAnalysisReportResponse;
	}
}