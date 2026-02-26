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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListFunctionInstancesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListFunctionInstancesResponse.ResultItem;
import com.aliyuncs.opensearch.model.v20171225.ListFunctionInstancesResponse.ResultItem.Belongs;
import com.aliyuncs.opensearch.model.v20171225.ListFunctionInstancesResponse.ResultItem.CreateParametersItem;
import com.aliyuncs.opensearch.model.v20171225.ListFunctionInstancesResponse.ResultItem.UsageParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionInstancesResponseUnmarshaller {

	public static ListFunctionInstancesResponse unmarshall(ListFunctionInstancesResponse listFunctionInstancesResponse, UnmarshallerContext _ctx) {
		
		listFunctionInstancesResponse.setRequestId(_ctx.stringValue("ListFunctionInstancesResponse.RequestId"));
		listFunctionInstancesResponse.setStatus(_ctx.stringValue("ListFunctionInstancesResponse.Status"));
		listFunctionInstancesResponse.setHttpCode(_ctx.longValue("ListFunctionInstancesResponse.HttpCode"));
		listFunctionInstancesResponse.setTotalCount(_ctx.longValue("ListFunctionInstancesResponse.TotalCount"));
		listFunctionInstancesResponse.setMessage(_ctx.stringValue("ListFunctionInstancesResponse.Message"));
		listFunctionInstancesResponse.setCode(_ctx.stringValue("ListFunctionInstancesResponse.Code"));
		listFunctionInstancesResponse.setLatency(_ctx.longValue("ListFunctionInstancesResponse.Latency"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionInstancesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreateTime(_ctx.longValue("ListFunctionInstancesResponse.Result["+ i +"].CreateTime"));
			resultItem.setCron(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Cron"));
			resultItem.setDescription(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Description"));
			resultItem.setExtendInfo(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].ExtendInfo"));
			resultItem.setFunctionName(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].FunctionName"));
			resultItem.setFunctionType(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].FunctionType"));
			resultItem.setInstanceName(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].InstanceName"));
			resultItem.setModelType(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].ModelType"));
			resultItem.setSource(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Source"));
			resultItem.setStatus(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Status"));
			resultItem.setVersionId(_ctx.longValue("ListFunctionInstancesResponse.Result["+ i +"].VersionId"));

			Belongs belongs = new Belongs();
			belongs.setCategory(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Belongs.Category"));
			belongs.setDomain(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Belongs.Domain"));
			belongs.setLanguage(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].Belongs.Language"));
			resultItem.setBelongs(belongs);

			List<CreateParametersItem> createParameters = new ArrayList<CreateParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionInstancesResponse.Result["+ i +"].CreateParameters.Length"); j++) {
				CreateParametersItem createParametersItem = new CreateParametersItem();
				createParametersItem.setName(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].CreateParameters["+ j +"].Name"));
				createParametersItem.setValue(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].CreateParameters["+ j +"].Value"));

				createParameters.add(createParametersItem);
			}
			resultItem.setCreateParameters(createParameters);

			List<UsageParametersItem> usageParameters = new ArrayList<UsageParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionInstancesResponse.Result["+ i +"].UsageParameters.Length"); j++) {
				UsageParametersItem usageParametersItem = new UsageParametersItem();
				usageParametersItem.setName(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].UsageParameters["+ j +"].Name"));
				usageParametersItem.setValue(_ctx.stringValue("ListFunctionInstancesResponse.Result["+ i +"].UsageParameters["+ j +"].Value"));

				usageParameters.add(usageParametersItem);
			}
			resultItem.setUsageParameters(usageParameters);

			result.add(resultItem);
		}
		listFunctionInstancesResponse.setResult(result);
	 
	 	return listFunctionInstancesResponse;
	}
}