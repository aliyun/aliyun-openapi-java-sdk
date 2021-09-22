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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribePdnsOperateLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsOperateLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsOperateLogsResponseUnmarshaller {

	public static DescribePdnsOperateLogsResponse unmarshall(DescribePdnsOperateLogsResponse describePdnsOperateLogsResponse, UnmarshallerContext _ctx) {
		
		describePdnsOperateLogsResponse.setRequestId(_ctx.stringValue("DescribePdnsOperateLogsResponse.RequestId"));
		describePdnsOperateLogsResponse.setTotalCount(_ctx.longValue("DescribePdnsOperateLogsResponse.TotalCount"));
		describePdnsOperateLogsResponse.setPageSize(_ctx.longValue("DescribePdnsOperateLogsResponse.PageSize"));
		describePdnsOperateLogsResponse.setPageNumber(_ctx.longValue("DescribePdnsOperateLogsResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsOperateLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setOperateTime(_ctx.stringValue("DescribePdnsOperateLogsResponse.Logs["+ i +"].OperateTime"));
			log.setAction(_ctx.stringValue("DescribePdnsOperateLogsResponse.Logs["+ i +"].Action"));
			log.setType(_ctx.stringValue("DescribePdnsOperateLogsResponse.Logs["+ i +"].Type"));
			log.setContent(_ctx.stringValue("DescribePdnsOperateLogsResponse.Logs["+ i +"].content"));

			logs.add(log);
		}
		describePdnsOperateLogsResponse.setLogs(logs);
	 
	 	return describePdnsOperateLogsResponse;
	}
}