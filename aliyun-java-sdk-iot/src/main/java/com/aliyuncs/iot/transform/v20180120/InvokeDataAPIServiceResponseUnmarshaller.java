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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.InvokeDataAPIServiceResponse;
import com.aliyuncs.iot.model.v20180120.InvokeDataAPIServiceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvokeDataAPIServiceResponseUnmarshaller {

	public static InvokeDataAPIServiceResponse unmarshall(InvokeDataAPIServiceResponse invokeDataAPIServiceResponse, UnmarshallerContext _ctx) {
		
		invokeDataAPIServiceResponse.setRequestId(_ctx.stringValue("InvokeDataAPIServiceResponse.RequestId"));
		invokeDataAPIServiceResponse.setSuccess(_ctx.booleanValue("InvokeDataAPIServiceResponse.Success"));
		invokeDataAPIServiceResponse.setCode(_ctx.stringValue("InvokeDataAPIServiceResponse.Code"));
		invokeDataAPIServiceResponse.setErrorMessage(_ctx.stringValue("InvokeDataAPIServiceResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("InvokeDataAPIServiceResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("InvokeDataAPIServiceResponse.Data.PageSize"));
		data.setApiSrn(_ctx.stringValue("InvokeDataAPIServiceResponse.Data.ApiSrn"));

		List<String> fieldNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InvokeDataAPIServiceResponse.Data.FieldNameList.Length"); i++) {
			fieldNameList.add(_ctx.stringValue("InvokeDataAPIServiceResponse.Data.FieldNameList["+ i +"]"));
		}
		data.setFieldNameList(fieldNameList);

		List<Map<Object, Object>> resultList = _ctx.listMapValue("InvokeDataAPIServiceResponse.Data.ResultList");
		data.setResultList(resultList);
		invokeDataAPIServiceResponse.setData(data);
	 
	 	return invokeDataAPIServiceResponse;
	}
}