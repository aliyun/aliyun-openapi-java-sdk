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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.GetTaskStatTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatTypesResponseUnmarshaller {

	public static GetTaskStatTypesResponse unmarshall(GetTaskStatTypesResponse getTaskStatTypesResponse, UnmarshallerContext _ctx) {
		
		getTaskStatTypesResponse.setRequestId(_ctx.stringValue("GetTaskStatTypesResponse.RequestId"));
		getTaskStatTypesResponse.setCode(_ctx.integerValue("GetTaskStatTypesResponse.Code"));
		getTaskStatTypesResponse.setMsg(_ctx.stringValue("GetTaskStatTypesResponse.Msg"));
		getTaskStatTypesResponse.setErrInfo(_ctx.stringValue("GetTaskStatTypesResponse.ErrInfo"));
		getTaskStatTypesResponse.setSucc(_ctx.booleanValue("GetTaskStatTypesResponse.Succ"));
		getTaskStatTypesResponse.setRt(_ctx.longValue("GetTaskStatTypesResponse.Rt"));
		getTaskStatTypesResponse.setHost(_ctx.stringValue("GetTaskStatTypesResponse.Host"));
		getTaskStatTypesResponse.setErrorCode(_ctx.stringValue("GetTaskStatTypesResponse.ErrorCode"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskStatTypesResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetTaskStatTypesResponse.Result["+ i +"]"));
		}
		getTaskStatTypesResponse.setResult(result);
	 
	 	return getTaskStatTypesResponse;
	}
}