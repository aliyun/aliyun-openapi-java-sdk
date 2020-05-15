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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeOriginalLogsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeOriginalLogsResponse.Log;
import com.aliyuncs.sddp.model.v20190103.DescribeOriginalLogsResponse.Log.LogContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOriginalLogsResponseUnmarshaller {

	public static DescribeOriginalLogsResponse unmarshall(DescribeOriginalLogsResponse describeOriginalLogsResponse, UnmarshallerContext _ctx) {
		
		describeOriginalLogsResponse.setRequestId(_ctx.stringValue("DescribeOriginalLogsResponse.RequestId"));
		describeOriginalLogsResponse.setPageSize(_ctx.integerValue("DescribeOriginalLogsResponse.PageSize"));
		describeOriginalLogsResponse.setCurrentPage(_ctx.integerValue("DescribeOriginalLogsResponse.CurrentPage"));
		describeOriginalLogsResponse.setTotalCount(_ctx.integerValue("DescribeOriginalLogsResponse.TotalCount"));

		List<Log> items = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOriginalLogsResponse.Items.Length"); i++) {
			Log log = new Log();

			List<LogContent> logContents = new ArrayList<LogContent>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOriginalLogsResponse.Items["+ i +"].LogContents.Length"); j++) {
				LogContent logContent = new LogContent();
				logContent.setKey(_ctx.stringValue("DescribeOriginalLogsResponse.Items["+ i +"].LogContents["+ j +"].Key"));
				logContent.setValue(_ctx.stringValue("DescribeOriginalLogsResponse.Items["+ i +"].LogContents["+ j +"].Value"));

				logContents.add(logContent);
			}
			log.setLogContents(logContents);

			items.add(log);
		}
		describeOriginalLogsResponse.setItems(items);
	 
	 	return describeOriginalLogsResponse;
	}
}