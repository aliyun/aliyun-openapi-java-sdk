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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.BatchAddFeishuUsersResponse;
import com.aliyuncs.quickbi_public.model.v20220101.BatchAddFeishuUsersResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.BatchAddFeishuUsersResponse.Result.FailResultsItem;
import com.aliyuncs.quickbi_public.model.v20220101.BatchAddFeishuUsersResponse.Result.FailResultsItem.FailInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddFeishuUsersResponseUnmarshaller {

	public static BatchAddFeishuUsersResponse unmarshall(BatchAddFeishuUsersResponse batchAddFeishuUsersResponse, UnmarshallerContext _ctx) {
		
		batchAddFeishuUsersResponse.setRequestId(_ctx.stringValue("BatchAddFeishuUsersResponse.RequestId"));
		batchAddFeishuUsersResponse.setSuccess(_ctx.booleanValue("BatchAddFeishuUsersResponse.Success"));

		Result result = new Result();
		result.setFailCount(_ctx.integerValue("BatchAddFeishuUsersResponse.Result.FailCount"));
		result.setOkCount(_ctx.integerValue("BatchAddFeishuUsersResponse.Result.OkCount"));

		List<FailResultsItem> failResults = new ArrayList<FailResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchAddFeishuUsersResponse.Result.FailResults.Length"); i++) {
			FailResultsItem failResultsItem = new FailResultsItem();

			List<FailInfosItem> failInfos = new ArrayList<FailInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchAddFeishuUsersResponse.Result.FailResults["+ i +"].FailInfos.Length"); j++) {
				FailInfosItem failInfosItem = new FailInfosItem();
				failInfosItem.setCode(_ctx.stringValue("BatchAddFeishuUsersResponse.Result.FailResults["+ i +"].FailInfos["+ j +"].Code"));
				failInfosItem.setCodeDesc(_ctx.stringValue("BatchAddFeishuUsersResponse.Result.FailResults["+ i +"].FailInfos["+ j +"].CodeDesc"));
				failInfosItem.setInput(_ctx.stringValue("BatchAddFeishuUsersResponse.Result.FailResults["+ i +"].FailInfos["+ j +"].Input"));

				failInfos.add(failInfosItem);
			}
			failResultsItem.setFailInfos(failInfos);

			failResults.add(failResultsItem);
		}
		result.setFailResults(failResults);
		batchAddFeishuUsersResponse.setResult(result);
	 
	 	return batchAddFeishuUsersResponse;
	}
}