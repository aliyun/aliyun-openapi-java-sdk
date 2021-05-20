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
import com.aliyuncs.rsimganalys.model.v20190801.ListTasksResponse.Data;
import com.aliyuncs.rsimganalys.model.v20190801.ListTasksResponse.Data.Contents;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setResultCode(_ctx.integerValue("ListTasksResponse.ResultCode"));
		listTasksResponse.setResultMessage(_ctx.stringValue("ListTasksResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListTasksResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListTasksResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListTasksResponse.Data.Total"));
		data.setPages(_ctx.integerValue("ListTasksResponse.Data.Pages"));

		List<Contents> content = new ArrayList<Contents>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Data.Content.Length"); i++) {
			Contents contents = new Contents();
			contents.setAppkey(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Appkey"));
			contents.setCreateTime(_ctx.longValue("ListTasksResponse.Data.Content["+ i +"].CreateTime"));
			contents.setEnableZoneIdentification(_ctx.integerValue("ListTasksResponse.Data.Content["+ i +"].EnableZoneIdentification"));
			contents.setJobId(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].JobId"));
			contents.setLastUpdateTime(_ctx.longValue("ListTasksResponse.Data.Content["+ i +"].LastUpdateTime"));
			contents.setNamespace(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Namespace"));
			contents.setProgress(_ctx.integerValue("ListTasksResponse.Data.Content["+ i +"].Progress"));
			contents.setPublishStatus(_ctx.integerValue("ListTasksResponse.Data.Content["+ i +"].PublishStatus"));
			contents.setRequest(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Request"));
			contents.setResponse(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Response"));
			contents.setStatus(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Status"));
			contents.setStatusCode(_ctx.integerValue("ListTasksResponse.Data.Content["+ i +"].StatusCode"));
			contents.setStatusMessage(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].StatusMessage"));
			contents.setUserId(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].UserId"));
			contents.setVersion(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].Version"));
			contents.setJobType(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].JobType"));
			contents.setJobMessage(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].JobMessage"));
			contents.setJobName(_ctx.stringValue("ListTasksResponse.Data.Content["+ i +"].JobName"));

			content.add(contents);
		}
		data.setContent(content);
		listTasksResponse.setData(data);
	 
	 	return listTasksResponse;
	}
}