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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListIpsecServerLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpsecServerLogsResponseUnmarshaller {

	public static ListIpsecServerLogsResponse unmarshall(ListIpsecServerLogsResponse listIpsecServerLogsResponse, UnmarshallerContext _ctx) {
		
		listIpsecServerLogsResponse.setRequestId(_ctx.stringValue("ListIpsecServerLogsResponse.RequestId"));
		listIpsecServerLogsResponse.setPageSize(_ctx.integerValue("ListIpsecServerLogsResponse.PageSize"));
		listIpsecServerLogsResponse.setPageNumber(_ctx.integerValue("ListIpsecServerLogsResponse.PageNumber"));
		listIpsecServerLogsResponse.setCount(_ctx.integerValue("ListIpsecServerLogsResponse.Count"));
		listIpsecServerLogsResponse.setIsCompleted(_ctx.booleanValue("ListIpsecServerLogsResponse.IsCompleted"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListIpsecServerLogsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListIpsecServerLogsResponse.Data["+ i +"]"));
		}
		listIpsecServerLogsResponse.setData(data);
	 
	 	return listIpsecServerLogsResponse;
	}
}