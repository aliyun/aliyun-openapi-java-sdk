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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeGroupsResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeGroupsResponse unmarshall(DeleteLinkeantcodeAntcodeGroupsResponse deleteLinkeantcodeAntcodeGroupsResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeGroupsResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsResponse.RequestId"));
		deleteLinkeantcodeAntcodeGroupsResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsResponse.ResultCode"));
		deleteLinkeantcodeAntcodeGroupsResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeGroupsResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeGroupsResponse.Data"));
		deleteLinkeantcodeAntcodeGroupsResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsResponse.Message"));
		deleteLinkeantcodeAntcodeGroupsResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeGroupsResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeGroupsResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeGroupsResponse;
	}
}