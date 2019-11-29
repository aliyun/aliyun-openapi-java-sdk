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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.RemoveReportsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveReportsResponseUnmarshaller {

	public static RemoveReportsResponse unmarshall(RemoveReportsResponse removeReportsResponse, UnmarshallerContext _ctx) {
		
		removeReportsResponse.setRequestId(_ctx.stringValue("RemoveReportsResponse.RequestId"));
		removeReportsResponse.setMessage(_ctx.stringValue("RemoveReportsResponse.Message"));
		removeReportsResponse.setCode(_ctx.stringValue("RemoveReportsResponse.Code"));
		removeReportsResponse.setSuccess(_ctx.booleanValue("RemoveReportsResponse.Success"));
		removeReportsResponse.setHttpStatusCode(_ctx.integerValue("RemoveReportsResponse.HttpStatusCode"));
	 
	 	return removeReportsResponse;
	}
}