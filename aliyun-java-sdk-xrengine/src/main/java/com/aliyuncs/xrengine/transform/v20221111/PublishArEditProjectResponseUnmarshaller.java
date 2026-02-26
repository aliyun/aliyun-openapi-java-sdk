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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.PublishArEditProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishArEditProjectResponseUnmarshaller {

	public static PublishArEditProjectResponse unmarshall(PublishArEditProjectResponse publishArEditProjectResponse, UnmarshallerContext _ctx) {
		
		publishArEditProjectResponse.setRequestId(_ctx.stringValue("PublishArEditProjectResponse.RequestId"));
		publishArEditProjectResponse.setSuccess(_ctx.booleanValue("PublishArEditProjectResponse.Success"));
		publishArEditProjectResponse.setCode(_ctx.stringValue("PublishArEditProjectResponse.Code"));
		publishArEditProjectResponse.setMessage(_ctx.stringValue("PublishArEditProjectResponse.Message"));
		publishArEditProjectResponse.setErrorName(_ctx.stringValue("PublishArEditProjectResponse.ErrorName"));
		publishArEditProjectResponse.setHttpCode(_ctx.integerValue("PublishArEditProjectResponse.HttpCode"));
		publishArEditProjectResponse.setData(_ctx.booleanValue("PublishArEditProjectResponse.Data"));
	 
	 	return publishArEditProjectResponse;
	}
}