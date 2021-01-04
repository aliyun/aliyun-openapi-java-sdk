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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.GetModelDetailResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelDetailResponseUnmarshaller {

	public static GetModelDetailResponse unmarshall(GetModelDetailResponse getModelDetailResponse, UnmarshallerContext _ctx) {
		
		getModelDetailResponse.setRequestId(_ctx.stringValue("GetModelDetailResponse.RequestId"));
		getModelDetailResponse.setSuccess(_ctx.booleanValue("GetModelDetailResponse.Success"));
		getModelDetailResponse.setCode(_ctx.stringValue("GetModelDetailResponse.Code"));
		getModelDetailResponse.setErrorMessage(_ctx.stringValue("GetModelDetailResponse.ErrorMessage"));
		getModelDetailResponse.setData(_ctx.mapValue("GetModelDetailResponse.Data"));
	 
	 	return getModelDetailResponse;
	}
}