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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetWorkitemTimeTypeListResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkitemTimeTypeListResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemTimeTypeListResponseUnmarshaller {

	public static GetWorkitemTimeTypeListResponse unmarshall(GetWorkitemTimeTypeListResponse getWorkitemTimeTypeListResponse, UnmarshallerContext _ctx) {
		
		getWorkitemTimeTypeListResponse.setRequestId(_ctx.stringValue("GetWorkitemTimeTypeListResponse.requestId"));
		getWorkitemTimeTypeListResponse.setErrorMsg(_ctx.stringValue("GetWorkitemTimeTypeListResponse.errorMsg"));
		getWorkitemTimeTypeListResponse.setErrorCode(_ctx.stringValue("GetWorkitemTimeTypeListResponse.errorCode"));
		getWorkitemTimeTypeListResponse.setSuccess(_ctx.stringValue("GetWorkitemTimeTypeListResponse.success"));

		List<Result> timeType = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkitemTimeTypeListResponse.timeType.Length"); i++) {
			Result result = new Result();
			result.setIdentifier(_ctx.stringValue("GetWorkitemTimeTypeListResponse.timeType["+ i +"].identifier"));
			result.setName(_ctx.stringValue("GetWorkitemTimeTypeListResponse.timeType["+ i +"].name"));
			result.setDisplayName(_ctx.stringValue("GetWorkitemTimeTypeListResponse.timeType["+ i +"].displayName"));
			result.setDescription(_ctx.stringValue("GetWorkitemTimeTypeListResponse.timeType["+ i +"].description"));
			result.setPosition(_ctx.longValue("GetWorkitemTimeTypeListResponse.timeType["+ i +"].position"));

			timeType.add(result);
		}
		getWorkitemTimeTypeListResponse.setTimeType(timeType);
	 
	 	return getWorkitemTimeTypeListResponse;
	}
}