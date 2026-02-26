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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAbolishApiTaskResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAbolishApiTaskResponse.ApiAbolishResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAbolishApiTaskResponseUnmarshaller {

	public static DescribeAbolishApiTaskResponse unmarshall(DescribeAbolishApiTaskResponse describeAbolishApiTaskResponse, UnmarshallerContext _ctx) {
		
		describeAbolishApiTaskResponse.setRequestId(_ctx.stringValue("DescribeAbolishApiTaskResponse.RequestId"));

		List<ApiAbolishResult> apiAbolishResults = new ArrayList<ApiAbolishResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAbolishApiTaskResponse.ApiAbolishResults.Length"); i++) {
			ApiAbolishResult apiAbolishResult = new ApiAbolishResult();
			apiAbolishResult.setStageId(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].StageId"));
			apiAbolishResult.setAbolishStatus(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].AbolishStatus"));
			apiAbolishResult.setGroupId(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].GroupId"));
			apiAbolishResult.setGroupName(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].GroupName"));
			apiAbolishResult.setApiUid(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].ApiUid"));
			apiAbolishResult.setErrorMsg(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].ErrorMsg"));
			apiAbolishResult.setStageName(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].StageName"));
			apiAbolishResult.setApiName(_ctx.stringValue("DescribeAbolishApiTaskResponse.ApiAbolishResults["+ i +"].ApiName"));

			apiAbolishResults.add(apiAbolishResult);
		}
		describeAbolishApiTaskResponse.setApiAbolishResults(apiAbolishResults);
	 
	 	return describeAbolishApiTaskResponse;
	}
}