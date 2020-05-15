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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDSTBizLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTBizLogsResponseUnmarshaller {

	public static ListDSTBizLogsResponse unmarshall(ListDSTBizLogsResponse listDSTBizLogsResponse, UnmarshallerContext _ctx) {
		
		listDSTBizLogsResponse.setRequestId(_ctx.stringValue("ListDSTBizLogsResponse.RequestId"));
		listDSTBizLogsResponse.setResultCode(_ctx.stringValue("ListDSTBizLogsResponse.ResultCode"));
		listDSTBizLogsResponse.setResultMessage(_ctx.stringValue("ListDSTBizLogsResponse.ResultMessage"));
		listDSTBizLogsResponse.setHostName(_ctx.stringValue("ListDSTBizLogsResponse.HostName"));
		listDSTBizLogsResponse.setIp(_ctx.stringValue("ListDSTBizLogsResponse.Ip"));
		listDSTBizLogsResponse.setPageNumber(_ctx.longValue("ListDSTBizLogsResponse.PageNumber"));
		listDSTBizLogsResponse.setPageSize(_ctx.longValue("ListDSTBizLogsResponse.PageSize"));
		listDSTBizLogsResponse.setTotalCount(_ctx.longValue("ListDSTBizLogsResponse.TotalCount"));

		List<String> contents = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTBizLogsResponse.Contents.Length"); i++) {
			contents.add(_ctx.stringValue("ListDSTBizLogsResponse.Contents["+ i +"]"));
		}
		listDSTBizLogsResponse.setContents(contents);
	 
	 	return listDSTBizLogsResponse;
	}
}