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

import com.aliyuncs.itag.model.v20210517.CheckModelResponse;
import com.aliyuncs.itag.model.v20210517.CheckModelResponse.Result;
import com.aliyuncs.itag.model.v20210517.CheckModelResponse.Result.Param;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckModelResponseUnmarshaller {

	public static CheckModelResponse unmarshall(CheckModelResponse checkModelResponse, UnmarshallerContext _ctx) {
		
		checkModelResponse.setRequestId(_ctx.stringValue("CheckModelResponse.RequestId"));
		checkModelResponse.setCode(_ctx.integerValue("CheckModelResponse.Code"));
		checkModelResponse.setMsg(_ctx.stringValue("CheckModelResponse.Msg"));
		checkModelResponse.setErrInfo(_ctx.stringValue("CheckModelResponse.ErrInfo"));
		checkModelResponse.setSucc(_ctx.booleanValue("CheckModelResponse.Succ"));
		checkModelResponse.setRt(_ctx.longValue("CheckModelResponse.Rt"));
		checkModelResponse.setHost(_ctx.stringValue("CheckModelResponse.Host"));
		checkModelResponse.setErrorCode(_ctx.stringValue("CheckModelResponse.ErrorCode"));

		Result result = new Result();
		result.setAvailable(_ctx.booleanValue("CheckModelResponse.Result.Available"));
		result.setIsCommon(_ctx.booleanValue("CheckModelResponse.Result.IsCommon"));

		List<Param> params = new ArrayList<Param>();
		for (int i = 0; i < _ctx.lengthValue("CheckModelResponse.Result.Params.Length"); i++) {
			Param param = new Param();
			param.setName(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].Name"));
			param.setAlias(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].Alias"));
			param.setType(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].Type"));
			param.setCodec(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].Codec"));
			param.setValue(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].Value"));
			param.setDefaultValue(_ctx.stringValue("CheckModelResponse.Result.Params["+ i +"].DefaultValue"));

			params.add(param);
		}
		result.setParams(params);
		checkModelResponse.setResult(result);
	 
	 	return checkModelResponse;
	}
}