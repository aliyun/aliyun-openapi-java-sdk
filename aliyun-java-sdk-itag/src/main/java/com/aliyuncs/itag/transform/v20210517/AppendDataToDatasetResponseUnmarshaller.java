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

import com.aliyuncs.itag.model.v20210517.AppendDataToDatasetResponse;
import com.aliyuncs.itag.model.v20210517.AppendDataToDatasetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AppendDataToDatasetResponseUnmarshaller {

	public static AppendDataToDatasetResponse unmarshall(AppendDataToDatasetResponse appendDataToDatasetResponse, UnmarshallerContext _ctx) {
		
		appendDataToDatasetResponse.setRequestId(_ctx.stringValue("AppendDataToDatasetResponse.RequestId"));
		appendDataToDatasetResponse.setCode(_ctx.stringValue("AppendDataToDatasetResponse.Code"));
		appendDataToDatasetResponse.setErrInfo(_ctx.stringValue("AppendDataToDatasetResponse.ErrInfo"));
		appendDataToDatasetResponse.setMsg(_ctx.stringValue("AppendDataToDatasetResponse.Msg"));
		appendDataToDatasetResponse.setSucc(_ctx.booleanValue("AppendDataToDatasetResponse.Succ"));
		appendDataToDatasetResponse.setErrorCode(_ctx.stringValue("AppendDataToDatasetResponse.ErrorCode"));

		Result result = new Result();
		result.setAppendSize(_ctx.integerValue("AppendDataToDatasetResponse.Result.AppendSize"));

		List<String> ids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AppendDataToDatasetResponse.Result.Ids.Length"); i++) {
			ids.add(_ctx.stringValue("AppendDataToDatasetResponse.Result.Ids["+ i +"]"));
		}
		result.setIds(ids);
		appendDataToDatasetResponse.setResult(result);
	 
	 	return appendDataToDatasetResponse;
	}
}