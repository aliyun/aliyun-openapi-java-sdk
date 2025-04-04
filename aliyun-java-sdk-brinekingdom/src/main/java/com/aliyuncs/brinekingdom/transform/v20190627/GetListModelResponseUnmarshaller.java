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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.GetListModelResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetListModelResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListModelResponseUnmarshaller {

	public static GetListModelResponse unmarshall(GetListModelResponse getListModelResponse, UnmarshallerContext _ctx) {
		
		getListModelResponse.setRequestId(_ctx.stringValue("GetListModelResponse.RequestId"));
		getListModelResponse.set_Class(_ctx.stringValue("GetListModelResponse.Class"));
		getListModelResponse.setErrorMessage(_ctx.stringValue("GetListModelResponse.ErrorMessage"));
		getListModelResponse.setSuccess(_ctx.booleanValue("GetListModelResponse.Success"));
		getListModelResponse.setResultCode(_ctx.stringValue("GetListModelResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetListModelResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setKey(_ctx.stringValue("GetListModelResponse.Result["+ i +"].Key"));
			resultItem.setValue(_ctx.stringValue("GetListModelResponse.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		getListModelResponse.setResult(result);
	 
	 	return getListModelResponse;
	}
}