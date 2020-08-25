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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectcreatedstatusesgroupbystageResponseUnmarshaller {

	public static QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse unmarshall(QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse queryLinkeLinktProjectcreatedstatusesgroupbystageResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.RequestId"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.ResultCode"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.ResultMessage"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setData(_ctx.stringValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.Data"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.ErrorCode"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.ErrorMessage"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.ResponseStatusCode"));
		queryLinkeLinktProjectcreatedstatusesgroupbystageResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse.Success"));
	 
	 	return queryLinkeLinktProjectcreatedstatusesgroupbystageResponse;
	}
}