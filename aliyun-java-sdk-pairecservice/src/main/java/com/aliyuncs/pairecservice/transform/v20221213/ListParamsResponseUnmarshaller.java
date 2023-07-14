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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListParamsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListParamsResponse.ParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParamsResponseUnmarshaller {

	public static ListParamsResponse unmarshall(ListParamsResponse listParamsResponse, UnmarshallerContext _ctx) {
		
		listParamsResponse.setRequestId(_ctx.stringValue("ListParamsResponse.RequestId"));
		listParamsResponse.setTotalCount(_ctx.longValue("ListParamsResponse.TotalCount"));

		List<ParamsItem> params = new ArrayList<ParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListParamsResponse.Params.Length"); i++) {
			ParamsItem paramsItem = new ParamsItem();
			paramsItem.setParamId(_ctx.stringValue("ListParamsResponse.Params["+ i +"].ParamId"));
			paramsItem.setName(_ctx.stringValue("ListParamsResponse.Params["+ i +"].Name"));
			paramsItem.setValue(_ctx.stringValue("ListParamsResponse.Params["+ i +"].Value"));
			paramsItem.setEnvironment(_ctx.stringValue("ListParamsResponse.Params["+ i +"].Environment"));
			paramsItem.setGmtModifiedTime(_ctx.stringValue("ListParamsResponse.Params["+ i +"].GmtModifiedTime"));

			params.add(paramsItem);
		}
		listParamsResponse.setParams(params);
	 
	 	return listParamsResponse;
	}
}