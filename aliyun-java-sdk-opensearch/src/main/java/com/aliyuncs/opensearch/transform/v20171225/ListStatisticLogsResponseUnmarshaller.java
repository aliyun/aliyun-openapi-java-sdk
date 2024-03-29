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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListStatisticLogsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStatisticLogsResponseUnmarshaller {

	public static ListStatisticLogsResponse unmarshall(ListStatisticLogsResponse listStatisticLogsResponse, UnmarshallerContext _ctx) {
		
		listStatisticLogsResponse.setTotalCount(_ctx.longValue("ListStatisticLogsResponse.totalCount"));
		listStatisticLogsResponse.setRequestId(_ctx.stringValue("ListStatisticLogsResponse.requestId"));

		List<Map<Object, Object>> result = _ctx.listMapValue("ListStatisticLogsResponse.result");
		listStatisticLogsResponse.setResult(result);
	 
	 	return listStatisticLogsResponse;
	}
}