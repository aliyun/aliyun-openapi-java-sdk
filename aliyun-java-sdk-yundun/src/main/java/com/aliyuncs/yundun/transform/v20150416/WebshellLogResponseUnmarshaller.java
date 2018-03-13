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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.WebshellLogResponse;
import com.aliyuncs.yundun.model.v20150416.WebshellLogResponse.WebshellLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class WebshellLogResponseUnmarshaller {

	public static WebshellLogResponse unmarshall(WebshellLogResponse webshellLogResponse, UnmarshallerContext context) {
		
		webshellLogResponse.setRequestId(context.stringValue("WebshellLogResponse.RequestId"));
		webshellLogResponse.setPageNumber(context.integerValue("WebshellLogResponse.PageNumber"));
		webshellLogResponse.setPageSize(context.integerValue("WebshellLogResponse.PageSize"));
		webshellLogResponse.setTotalCount(context.integerValue("WebshellLogResponse.TotalCount"));

		List<WebshellLog> logList = new ArrayList<WebshellLog>();
		for (int i = 0; i < context.lengthValue("WebshellLogResponse.LogList.Length"); i++) {
			WebshellLog  webshellLog = new WebshellLog();
			webshellLog.setId(context.stringValue("WebshellLogResponse.LogList["+ i +"].Id"));
			webshellLog.setPath(context.stringValue("WebshellLogResponse.LogList["+ i +"].Path"));
			webshellLog.setStatus(context.integerValue("WebshellLogResponse.LogList["+ i +"].Status"));
			webshellLog.setTime(context.stringValue("WebshellLogResponse.LogList["+ i +"].Time"));

			logList.add(webshellLog);
		}
		webshellLogResponse.setLogList(logList);
	 
	 	return webshellLogResponse;
	}
}