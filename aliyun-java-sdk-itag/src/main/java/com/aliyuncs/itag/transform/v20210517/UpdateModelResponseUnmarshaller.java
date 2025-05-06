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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.UpdateModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModelResponseUnmarshaller {

	public static UpdateModelResponse unmarshall(UpdateModelResponse updateModelResponse, UnmarshallerContext _ctx) {
		
		updateModelResponse.setRequestId(_ctx.stringValue("UpdateModelResponse.RequestId"));
		updateModelResponse.setCode(_ctx.integerValue("UpdateModelResponse.Code"));
		updateModelResponse.setMsg(_ctx.stringValue("UpdateModelResponse.Msg"));
		updateModelResponse.setErrInfo(_ctx.stringValue("UpdateModelResponse.ErrInfo"));
		updateModelResponse.setSucc(_ctx.booleanValue("UpdateModelResponse.Succ"));
		updateModelResponse.setResult(_ctx.longValue("UpdateModelResponse.Result"));
		updateModelResponse.setRt(_ctx.longValue("UpdateModelResponse.Rt"));
		updateModelResponse.setHost(_ctx.stringValue("UpdateModelResponse.Host"));
		updateModelResponse.setErrorCode(_ctx.stringValue("UpdateModelResponse.ErrorCode"));
	 
	 	return updateModelResponse;
	}
}