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

package com.aliyuncs.rsimganalys.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rsimganalys.model.v20190801.ListTasksResponse;
import com.aliyuncs.rsimganalys.model.v20190801.ListTasksResponse.Contents;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setResultCode(_ctx.integerValue("ListTasksResponse.ResultCode"));
		listTasksResponse.setTotalCount(_ctx.integerValue("ListTasksResponse.TotalCount"));
		listTasksResponse.setPageNumber(_ctx.integerValue("ListTasksResponse.PageNumber"));
		listTasksResponse.setPageSize(_ctx.integerValue("ListTasksResponse.PageSize"));
		listTasksResponse.setResultMessage(_ctx.stringValue("ListTasksResponse.ResultMessage"));

		List<Contents> data = new ArrayList<Contents>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Data.Length"); i++) {
			Contents contents = new Contents();
			contents.setAppkey(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Appkey"));
			contents.setUserId(_ctx.stringValue("ListTasksResponse.Data["+ i +"].UserId"));
			contents.setJobId(_ctx.stringValue("ListTasksResponse.Data["+ i +"].JobId"));
			contents.setStatus(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Status"));
			contents.setRequest(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Request"));
			contents.setProgress(_ctx.integerValue("ListTasksResponse.Data["+ i +"].Progress"));
			contents.setNamespace(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Namespace"));
			contents.setVersion(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Version"));
			contents.setCreateTime(_ctx.longValue("ListTasksResponse.Data["+ i +"].CreateTime"));
			contents.setLastUpdateTime(_ctx.longValue("ListTasksResponse.Data["+ i +"].LastUpdateTime"));
			contents.setResponse(_ctx.stringValue("ListTasksResponse.Data["+ i +"].Response"));
			contents.setStatusMessage(_ctx.stringValue("ListTasksResponse.Data["+ i +"].StatusMessage"));
			contents.setStatusCode(_ctx.stringValue("ListTasksResponse.Data["+ i +"].StatusCode"));

			data.add(contents);
		}
		listTasksResponse.setData(data);
	 
	 	return listTasksResponse;
	}
}