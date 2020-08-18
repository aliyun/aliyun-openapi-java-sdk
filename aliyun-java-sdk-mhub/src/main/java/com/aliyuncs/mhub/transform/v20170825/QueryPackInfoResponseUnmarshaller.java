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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.QueryPackInfoResponse;
import com.aliyuncs.mhub.model.v20170825.QueryPackInfoResponse.PackInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPackInfoResponseUnmarshaller {

	public static QueryPackInfoResponse unmarshall(QueryPackInfoResponse queryPackInfoResponse, UnmarshallerContext _ctx) {
		
		queryPackInfoResponse.setRequestId(_ctx.stringValue("QueryPackInfoResponse.RequestId"));

		PackInfo packInfo = new PackInfo();
		packInfo.setOS(_ctx.stringValue("QueryPackInfoResponse.PackInfo.OS"));
		packInfo.setStatus(_ctx.integerValue("QueryPackInfoResponse.PackInfo.Status"));
		packInfo.setTaskId(_ctx.stringValue("QueryPackInfoResponse.PackInfo.TaskId"));
		packInfo.setCreateTime(_ctx.stringValue("QueryPackInfoResponse.PackInfo.CreateTime"));
		packInfo.setInfo(_ctx.stringValue("QueryPackInfoResponse.PackInfo.Info"));
		queryPackInfoResponse.setPackInfo(packInfo);
	 
	 	return queryPackInfoResponse;
	}
}