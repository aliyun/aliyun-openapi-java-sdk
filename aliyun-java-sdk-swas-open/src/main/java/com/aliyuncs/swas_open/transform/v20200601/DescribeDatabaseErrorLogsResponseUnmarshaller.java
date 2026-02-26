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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseErrorLogsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseErrorLogsResponse.ErrorLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseErrorLogsResponseUnmarshaller {

	public static DescribeDatabaseErrorLogsResponse unmarshall(DescribeDatabaseErrorLogsResponse describeDatabaseErrorLogsResponse, UnmarshallerContext _ctx) {
		
		describeDatabaseErrorLogsResponse.setRequestId(_ctx.stringValue("DescribeDatabaseErrorLogsResponse.RequestId"));
		describeDatabaseErrorLogsResponse.setPageNumber(_ctx.integerValue("DescribeDatabaseErrorLogsResponse.PageNumber"));
		describeDatabaseErrorLogsResponse.setPageSize(_ctx.integerValue("DescribeDatabaseErrorLogsResponse.PageSize"));
		describeDatabaseErrorLogsResponse.setTotalCount(_ctx.integerValue("DescribeDatabaseErrorLogsResponse.TotalCount"));

		List<ErrorLog> errorLogs = new ArrayList<ErrorLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabaseErrorLogsResponse.ErrorLogs.Length"); i++) {
			ErrorLog errorLog = new ErrorLog();
			errorLog.setErrorInfo(_ctx.stringValue("DescribeDatabaseErrorLogsResponse.ErrorLogs["+ i +"].ErrorInfo"));
			errorLog.setCreateTime(_ctx.stringValue("DescribeDatabaseErrorLogsResponse.ErrorLogs["+ i +"].CreateTime"));

			errorLogs.add(errorLog);
		}
		describeDatabaseErrorLogsResponse.setErrorLogs(errorLogs);
	 
	 	return describeDatabaseErrorLogsResponse;
	}
}