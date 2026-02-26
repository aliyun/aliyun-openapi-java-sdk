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

import com.aliyuncs.itag.model.v20210517.GetTntConfListValueResponse;
import com.aliyuncs.itag.model.v20210517.GetTntConfListValueResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTntConfListValueResponseUnmarshaller {

	public static GetTntConfListValueResponse unmarshall(GetTntConfListValueResponse getTntConfListValueResponse, UnmarshallerContext _ctx) {
		
		getTntConfListValueResponse.setRequestId(_ctx.stringValue("GetTntConfListValueResponse.RequestId"));
		getTntConfListValueResponse.setCode(_ctx.stringValue("GetTntConfListValueResponse.Code"));
		getTntConfListValueResponse.setErrInfo(_ctx.stringValue("GetTntConfListValueResponse.ErrInfo"));
		getTntConfListValueResponse.setMsg(_ctx.stringValue("GetTntConfListValueResponse.Msg"));
		getTntConfListValueResponse.setSucc(_ctx.booleanValue("GetTntConfListValueResponse.Succ"));
		getTntConfListValueResponse.setErrorCode(_ctx.stringValue("GetTntConfListValueResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTntConfListValueResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPropKey(_ctx.stringValue("GetTntConfListValueResponse.Result["+ i +"].PropKey"));
			resultItem.setTntInstId(_ctx.stringValue("GetTntConfListValueResponse.Result["+ i +"].TntInstId"));
			resultItem.setPropValue(_ctx.stringValue("GetTntConfListValueResponse.Result["+ i +"].PropValue"));

			List<String> propListValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTntConfListValueResponse.Result["+ i +"].PropListValue.Length"); j++) {
				propListValue.add(_ctx.stringValue("GetTntConfListValueResponse.Result["+ i +"].PropListValue["+ j +"]"));
			}
			resultItem.setPropListValue(propListValue);

			result.add(resultItem);
		}
		getTntConfListValueResponse.setResult(result);
	 
	 	return getTntConfListValueResponse;
	}
}