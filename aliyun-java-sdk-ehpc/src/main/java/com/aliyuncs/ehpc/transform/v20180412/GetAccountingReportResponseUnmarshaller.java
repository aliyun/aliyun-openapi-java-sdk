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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetAccountingReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountingReportResponseUnmarshaller {

	public static GetAccountingReportResponse unmarshall(GetAccountingReportResponse getAccountingReportResponse, UnmarshallerContext _ctx) {
		
		getAccountingReportResponse.setRequestId(_ctx.stringValue("GetAccountingReportResponse.RequestId"));
		getAccountingReportResponse.setMetrics(_ctx.stringValue("GetAccountingReportResponse.Metrics"));
		getAccountingReportResponse.setTotalCoreTime(_ctx.integerValue("GetAccountingReportResponse.TotalCoreTime"));
		getAccountingReportResponse.setTotalCount(_ctx.integerValue("GetAccountingReportResponse.TotalCount"));
		getAccountingReportResponse.setPageSize(_ctx.integerValue("GetAccountingReportResponse.PageSize"));
		getAccountingReportResponse.setPageNumber(_ctx.integerValue("GetAccountingReportResponse.PageNumber"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountingReportResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetAccountingReportResponse.Data["+ i +"]"));
		}
		getAccountingReportResponse.setData(data);
	 
	 	return getAccountingReportResponse;
	}
}