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

import com.aliyuncs.airec.model.v20181012.ListInstanceTaskResponse;
import com.aliyuncs.airec.model.v20181012.ListInstanceTaskResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.ListInstanceTaskResponse.ResultItem.SubProgressInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceTaskResponseUnmarshaller {

	public static ListInstanceTaskResponse unmarshall(ListInstanceTaskResponse listInstanceTaskResponse, UnmarshallerContext context) {
		
		listInstanceTaskResponse.setRequestId(context.stringValue("ListInstanceTaskResponse.RequestId"));
		listInstanceTaskResponse.setCode(context.stringValue("ListInstanceTaskResponse.Code"));
		listInstanceTaskResponse.setMessage(context.stringValue("ListInstanceTaskResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("ListInstanceTaskResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(context.stringValue("ListInstanceTaskResponse.Result["+ i +"].Name"));
			resultItem.setTotalProgress(context.integerValue("ListInstanceTaskResponse.Result["+ i +"].TotalProgress"));

			List<SubProgressInfosItem> subProgressInfos = new ArrayList<SubProgressInfosItem>();
			for (int j = 0; j < context.lengthValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos.Length"); j++) {
				SubProgressInfosItem subProgressInfosItem = new SubProgressInfosItem();
				subProgressInfosItem.setType(context.stringValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos["+ j +"].Type"));
				subProgressInfosItem.setProgress(context.integerValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos["+ j +"].Progress"));
				subProgressInfosItem.setDetail(context.stringValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos["+ j +"].Detail"));
				subProgressInfosItem.setTotalNum(context.integerValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos["+ j +"].TotalNum"));
				subProgressInfosItem.setFinishedNum(context.integerValue("ListInstanceTaskResponse.Result["+ i +"].SubProgressInfos["+ j +"].FinishedNum"));

				subProgressInfos.add(subProgressInfosItem);
			}
			resultItem.setSubProgressInfos(subProgressInfos);

			result.add(resultItem);
		}
		listInstanceTaskResponse.setResult(result);
	 
	 	return listInstanceTaskResponse;
	}
}