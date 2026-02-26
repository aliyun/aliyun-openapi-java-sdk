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

import com.aliyuncs.brinekingdom.model.v20190627.GetListNetBandResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetListNetBandResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListNetBandResponseUnmarshaller {

	public static GetListNetBandResponse unmarshall(GetListNetBandResponse getListNetBandResponse, UnmarshallerContext _ctx) {
		
		getListNetBandResponse.setRequestId(_ctx.stringValue("GetListNetBandResponse.RequestId"));
		getListNetBandResponse.set_Class(_ctx.stringValue("GetListNetBandResponse.Class"));
		getListNetBandResponse.setErrorMessage(_ctx.stringValue("GetListNetBandResponse.ErrorMessage"));
		getListNetBandResponse.setSuccess(_ctx.booleanValue("GetListNetBandResponse.Success"));
		getListNetBandResponse.setResultCode(_ctx.stringValue("GetListNetBandResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetListNetBandResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.set_Class(_ctx.stringValue("GetListNetBandResponse.Result["+ i +"].Class"));
			resultItem.setKey(_ctx.stringValue("GetListNetBandResponse.Result["+ i +"].Key"));
			resultItem.setValue(_ctx.stringValue("GetListNetBandResponse.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		getListNetBandResponse.setResult(result);
	 
	 	return getListNetBandResponse;
	}
}