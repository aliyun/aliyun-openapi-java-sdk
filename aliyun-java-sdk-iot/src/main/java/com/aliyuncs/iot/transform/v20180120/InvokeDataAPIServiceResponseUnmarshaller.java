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

	public static InvokeDataAPIServiceResponse unmarshall(InvokeDataAPIServiceResponse invokeDataAPIServiceResponse, UnmarshallerContext context) {
		
		invokeDataAPIServiceResponse.setRequestId(context.stringValue("InvokeDataAPIServiceResponse.RequestId"));
		invokeDataAPIServiceResponse.setSuccess(context.booleanValue("InvokeDataAPIServiceResponse.Success"));
		invokeDataAPIServiceResponse.setErrorMessage(context.stringValue("InvokeDataAPIServiceResponse.ErrorMessage"));
		invokeDataAPIServiceResponse.setCode(context.stringValue("InvokeDataAPIServiceResponse.Code"));

		Data data = new Data();
		data.setPageNo(context.integerValue("InvokeDataAPIServiceResponse.Data.PageNo"));
		data.setPageSize(context.integerValue("InvokeDataAPIServiceResponse.Data.PageSize"));
		data.setApiSrn(context.stringValue("InvokeDataAPIServiceResponse.Data.ApiSrn"));

		List<String> fieldNameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InvokeDataAPIServiceResponse.Data.FieldNameList.Length"); i++) {
			fieldNameList.add(context.stringValue("InvokeDataAPIServiceResponse.Data.FieldNameList["+ i +"]"));
		}
		data.setFieldNameList(fieldNameList);

		List<Map<Object, Object>> resultList = context.listMapValue("InvokeDataAPIServiceResponse.Data.ResultList");
		data.setResultList(resultList);
		invokeDataAPIServiceResponse.setData(data);
	 
	 	return invokeDataAPIServiceResponse;
	}
}