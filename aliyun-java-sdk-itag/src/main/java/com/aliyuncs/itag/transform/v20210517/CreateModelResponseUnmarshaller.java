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

import com.aliyuncs.itag.model.v20210517.CreateModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelResponseUnmarshaller {

	public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext _ctx) {
		
		createModelResponse.setRequestId(_ctx.stringValue("CreateModelResponse.RequestId"));
		createModelResponse.setCode(_ctx.integerValue("CreateModelResponse.Code"));
		createModelResponse.setMsg(_ctx.stringValue("CreateModelResponse.Msg"));
		createModelResponse.setErrInfo(_ctx.stringValue("CreateModelResponse.ErrInfo"));
		createModelResponse.setSucc(_ctx.booleanValue("CreateModelResponse.Succ"));
		createModelResponse.setResult(_ctx.longValue("CreateModelResponse.Result"));
		createModelResponse.setRt(_ctx.longValue("CreateModelResponse.Rt"));
		createModelResponse.setHost(_ctx.stringValue("CreateModelResponse.Host"));
		createModelResponse.setErrorCode(_ctx.stringValue("CreateModelResponse.ErrorCode"));
	 
	 	return createModelResponse;
	}
}