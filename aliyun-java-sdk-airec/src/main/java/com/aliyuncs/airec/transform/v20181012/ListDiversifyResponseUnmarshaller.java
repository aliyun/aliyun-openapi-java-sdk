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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDiversifyResponse;
import com.aliyuncs.airec.model.v20181012.ListDiversifyResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.ListDiversifyResponse.ResultItem.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiversifyResponseUnmarshaller {

	public static ListDiversifyResponse unmarshall(ListDiversifyResponse listDiversifyResponse, UnmarshallerContext context) {
		
		listDiversifyResponse.setRequestId(context.stringValue("ListDiversifyResponse.RequestId"));
		listDiversifyResponse.setCode(context.stringValue("ListDiversifyResponse.Code"));
		listDiversifyResponse.setMessage(context.stringValue("ListDiversifyResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("ListDiversifyResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(context.stringValue("ListDiversifyResponse.Result["+ i +"].Name"));
			resultItem.setGmtCreate(context.stringValue("ListDiversifyResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(context.stringValue("ListDiversifyResponse.Result["+ i +"].GmtModified"));

			Parameter parameter = new Parameter();
			parameter.setCategoryIndex(context.integerValue("ListDiversifyResponse.Result["+ i +"].Parameter.CategoryIndex"));
			parameter.setWindow(context.integerValue("ListDiversifyResponse.Result["+ i +"].Parameter.Window"));
			resultItem.setParameter(parameter);

			result.add(resultItem);
		}
		listDiversifyResponse.setResult(result);
	 
	 	return listDiversifyResponse;
	}
}