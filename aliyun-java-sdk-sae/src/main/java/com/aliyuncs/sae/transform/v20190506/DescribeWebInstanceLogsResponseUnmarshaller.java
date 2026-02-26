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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeWebInstanceLogsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebInstanceLogsResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeWebInstanceLogsResponse.Data.WebLogEntrysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebInstanceLogsResponseUnmarshaller {

	public static DescribeWebInstanceLogsResponse unmarshall(DescribeWebInstanceLogsResponse describeWebInstanceLogsResponse, UnmarshallerContext _ctx) {
		
		describeWebInstanceLogsResponse.setRequestId(_ctx.stringValue("DescribeWebInstanceLogsResponse.RequestId"));
		describeWebInstanceLogsResponse.setCode(_ctx.integerValue("DescribeWebInstanceLogsResponse.Code"));
		describeWebInstanceLogsResponse.setMessage(_ctx.stringValue("DescribeWebInstanceLogsResponse.Message"));
		describeWebInstanceLogsResponse.setSuccess(_ctx.booleanValue("DescribeWebInstanceLogsResponse.Success"));

		Data data = new Data();

		List<WebLogEntrysItem> webLogEntrys = new ArrayList<WebLogEntrysItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebInstanceLogsResponse.Data.WebLogEntrys.Length"); i++) {
			WebLogEntrysItem webLogEntrysItem = new WebLogEntrysItem();
			webLogEntrysItem.setMessage(_ctx.stringValue("DescribeWebInstanceLogsResponse.Data.WebLogEntrys["+ i +"].Message"));

			webLogEntrys.add(webLogEntrysItem);
		}
		data.setWebLogEntrys(webLogEntrys);
		describeWebInstanceLogsResponse.setData(data);
	 
	 	return describeWebInstanceLogsResponse;
	}
}