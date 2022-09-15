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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.GetMessageAppResponse;
import com.aliyuncs.live.model.v20161101.GetMessageAppResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMessageAppResponseUnmarshaller {

	public static GetMessageAppResponse unmarshall(GetMessageAppResponse getMessageAppResponse, UnmarshallerContext _ctx) {
		
		getMessageAppResponse.setRequestId(_ctx.stringValue("GetMessageAppResponse.RequestId"));

		Result result = new Result();
		result.setAppId(_ctx.stringValue("GetMessageAppResponse.Result.AppId"));
		result.setCreateTime(_ctx.longValue("GetMessageAppResponse.Result.CreateTime"));
		result.setStatus(_ctx.integerValue("GetMessageAppResponse.Result.Status"));
		result.setAppConfig(_ctx.mapValue("GetMessageAppResponse.Result.AppConfig"));
		result.setExtension(_ctx.mapValue("GetMessageAppResponse.Result.Extension"));
		getMessageAppResponse.setResult(result);
	 
	 	return getMessageAppResponse;
	}
}