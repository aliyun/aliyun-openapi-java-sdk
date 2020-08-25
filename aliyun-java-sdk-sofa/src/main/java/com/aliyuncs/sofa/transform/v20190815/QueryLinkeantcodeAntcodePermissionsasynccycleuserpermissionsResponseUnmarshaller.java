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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse unmarshall(QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.RequestId"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.ResultCode"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.ResultMessage"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setData(_ctx.booleanValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.Data"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.Message"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse;
	}
}