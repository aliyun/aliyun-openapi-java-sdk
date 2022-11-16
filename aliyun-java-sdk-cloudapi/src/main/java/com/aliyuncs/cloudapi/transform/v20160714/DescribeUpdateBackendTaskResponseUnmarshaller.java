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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeUpdateBackendTaskResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeUpdateBackendTaskResponse.ApiUpdateBackendResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpdateBackendTaskResponseUnmarshaller {

	public static DescribeUpdateBackendTaskResponse unmarshall(DescribeUpdateBackendTaskResponse describeUpdateBackendTaskResponse, UnmarshallerContext _ctx) {
		
		describeUpdateBackendTaskResponse.setRequestId(_ctx.stringValue("DescribeUpdateBackendTaskResponse.RequestId"));

		List<ApiUpdateBackendResult> apiUpdateBackendResults = new ArrayList<ApiUpdateBackendResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults.Length"); i++) {
			ApiUpdateBackendResult apiUpdateBackendResult = new ApiUpdateBackendResult();
			apiUpdateBackendResult.setStageId(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].StageId"));
			apiUpdateBackendResult.setUpdateStatus(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].UpdateStatus"));
			apiUpdateBackendResult.setGroupName(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].GroupName"));
			apiUpdateBackendResult.setGroupId(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].GroupId"));
			apiUpdateBackendResult.setApiUid(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].ApiUid"));
			apiUpdateBackendResult.setErrorMsg(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].ErrorMsg"));
			apiUpdateBackendResult.setStageName(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].StageName"));
			apiUpdateBackendResult.setApiName(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].ApiName"));
			apiUpdateBackendResult.setBackendId(_ctx.stringValue("DescribeUpdateBackendTaskResponse.ApiUpdateBackendResults["+ i +"].BackendId"));

			apiUpdateBackendResults.add(apiUpdateBackendResult);
		}
		describeUpdateBackendTaskResponse.setApiUpdateBackendResults(apiUpdateBackendResults);
	 
	 	return describeUpdateBackendTaskResponse;
	}
}