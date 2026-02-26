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

import com.aliyuncs.itag.model.v20210517.ListTntConfigResponse;
import com.aliyuncs.itag.model.v20210517.ListTntConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTntConfigResponseUnmarshaller {

	public static ListTntConfigResponse unmarshall(ListTntConfigResponse listTntConfigResponse, UnmarshallerContext _ctx) {
		
		listTntConfigResponse.setRequestId(_ctx.stringValue("ListTntConfigResponse.RequestId"));
		listTntConfigResponse.setCode(_ctx.stringValue("ListTntConfigResponse.Code"));
		listTntConfigResponse.setErrInfo(_ctx.stringValue("ListTntConfigResponse.ErrInfo"));
		listTntConfigResponse.setMsg(_ctx.stringValue("ListTntConfigResponse.Msg"));
		listTntConfigResponse.setSucc(_ctx.booleanValue("ListTntConfigResponse.Succ"));
		listTntConfigResponse.setErrorCode(_ctx.stringValue("ListTntConfigResponse.ErrorCode"));

		Result result = new Result();
		result.setPropKey(_ctx.stringValue("ListTntConfigResponse.Result.PropKey"));
		result.setTntInstId(_ctx.stringValue("ListTntConfigResponse.Result.TntInstId"));
		result.setPropValue(_ctx.stringValue("ListTntConfigResponse.Result.PropValue"));

		List<String> propListValue = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTntConfigResponse.Result.PropListValue.Length"); i++) {
			propListValue.add(_ctx.stringValue("ListTntConfigResponse.Result.PropListValue["+ i +"]"));
		}
		result.setPropListValue(propListValue);
		listTntConfigResponse.setResult(result);
	 
	 	return listTntConfigResponse;
	}
}