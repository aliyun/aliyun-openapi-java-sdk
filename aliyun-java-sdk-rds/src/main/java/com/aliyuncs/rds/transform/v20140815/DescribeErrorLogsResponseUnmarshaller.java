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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeErrorLogsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeErrorLogsResponse.ErrorLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeErrorLogsResponseUnmarshaller {

	public static DescribeErrorLogsResponse unmarshall(DescribeErrorLogsResponse describeErrorLogsResponse, UnmarshallerContext _ctx) {
		
		describeErrorLogsResponse.setRequestId(_ctx.stringValue("DescribeErrorLogsResponse.RequestId"));
		describeErrorLogsResponse.setPageNumber(_ctx.integerValue("DescribeErrorLogsResponse.PageNumber"));
		describeErrorLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeErrorLogsResponse.PageRecordCount"));
		describeErrorLogsResponse.setTotalRecordCount(_ctx.integerValue("DescribeErrorLogsResponse.TotalRecordCount"));

		List<ErrorLog> items = new ArrayList<ErrorLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeErrorLogsResponse.Items.Length"); i++) {
			ErrorLog errorLog = new ErrorLog();
			errorLog.setCreateTime(_ctx.stringValue("DescribeErrorLogsResponse.Items["+ i +"].CreateTime"));
			errorLog.setErrorInfo(_ctx.stringValue("DescribeErrorLogsResponse.Items["+ i +"].ErrorInfo"));

			items.add(errorLog);
		}
		describeErrorLogsResponse.setItems(items);
	 
	 	return describeErrorLogsResponse;
	}
}