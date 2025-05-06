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

import com.aliyuncs.itag.model.v20210517.CreateDatasetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatasetResponseUnmarshaller {

	public static CreateDatasetResponse unmarshall(CreateDatasetResponse createDatasetResponse, UnmarshallerContext _ctx) {
		
		createDatasetResponse.setRequestId(_ctx.stringValue("CreateDatasetResponse.RequestId"));
		createDatasetResponse.setCode(_ctx.integerValue("CreateDatasetResponse.Code"));
		createDatasetResponse.setMsg(_ctx.stringValue("CreateDatasetResponse.Msg"));
		createDatasetResponse.setErrInfo(_ctx.stringValue("CreateDatasetResponse.ErrInfo"));
		createDatasetResponse.setSucc(_ctx.booleanValue("CreateDatasetResponse.Succ"));
		createDatasetResponse.setResult(_ctx.stringValue("CreateDatasetResponse.Result"));
		createDatasetResponse.setErrorCode(_ctx.stringValue("CreateDatasetResponse.ErrorCode"));
	 
	 	return createDatasetResponse;
	}
}