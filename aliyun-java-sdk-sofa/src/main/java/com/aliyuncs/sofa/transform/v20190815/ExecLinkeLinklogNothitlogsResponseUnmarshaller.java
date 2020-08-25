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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinklogNothitlogsResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinklogNothitlogsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinklogNothitlogsResponseUnmarshaller {

	public static ExecLinkeLinklogNothitlogsResponse unmarshall(ExecLinkeLinklogNothitlogsResponse execLinkeLinklogNothitlogsResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinklogNothitlogsResponse.setRequestId(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.RequestId"));
		execLinkeLinklogNothitlogsResponse.setResultCode(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.ResultCode"));
		execLinkeLinklogNothitlogsResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.ResultMessage"));
		execLinkeLinklogNothitlogsResponse.setErrorMsg(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.ErrorMsg"));
		execLinkeLinklogNothitlogsResponse.setResponseContentRange(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.ResponseContentRange"));
		execLinkeLinklogNothitlogsResponse.setResponseContentType(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.ResponseContentType"));
		execLinkeLinklogNothitlogsResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinklogNothitlogsResponse.ResponseStatusCode"));
		execLinkeLinklogNothitlogsResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinklogNothitlogsResponse.Success"));

		Result result = new Result();
		result.setPagination(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.Result.Pagination"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinklogNothitlogsResponse.Result.List.Length"); i++) {
			list.add(_ctx.stringValue("ExecLinkeLinklogNothitlogsResponse.Result.List["+ i +"]"));
		}
		result.setList(list);
		execLinkeLinklogNothitlogsResponse.setResult(result);
	 
	 	return execLinkeLinklogNothitlogsResponse;
	}
}