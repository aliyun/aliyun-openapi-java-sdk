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

import com.aliyuncs.sofa.model.v20190815.ExistBuildpackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExistBuildpackResponseUnmarshaller {

	public static ExistBuildpackResponse unmarshall(ExistBuildpackResponse existBuildpackResponse, UnmarshallerContext _ctx) {
		
		existBuildpackResponse.setRequestId(_ctx.stringValue("ExistBuildpackResponse.RequestId"));
		existBuildpackResponse.setResultCode(_ctx.stringValue("ExistBuildpackResponse.ResultCode"));
		existBuildpackResponse.setResultMessage(_ctx.stringValue("ExistBuildpackResponse.ResultMessage"));
		existBuildpackResponse.setResult(_ctx.booleanValue("ExistBuildpackResponse.Result"));
	 
	 	return existBuildpackResponse;
	}
}