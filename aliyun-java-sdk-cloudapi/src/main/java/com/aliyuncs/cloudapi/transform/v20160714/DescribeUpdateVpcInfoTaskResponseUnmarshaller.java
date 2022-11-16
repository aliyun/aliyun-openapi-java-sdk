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

import com.aliyuncs.cloudapi.model.v20160714.DescribeUpdateVpcInfoTaskResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpdateVpcInfoTaskResponseUnmarshaller {

	public static DescribeUpdateVpcInfoTaskResponse unmarshall(DescribeUpdateVpcInfoTaskResponse describeUpdateVpcInfoTaskResponse, UnmarshallerContext _ctx) {
		
		describeUpdateVpcInfoTaskResponse.setRequestId(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.RequestId"));

		List<ApiUpdateVpcInfoResult> apiUpdateVpcInfoResults = new ArrayList<ApiUpdateVpcInfoResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults.Length"); i++) {
			ApiUpdateVpcInfoResult apiUpdateVpcInfoResult = new ApiUpdateVpcInfoResult();
			apiUpdateVpcInfoResult.setStageId(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].StageId"));
			apiUpdateVpcInfoResult.setUpdateStatus(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].UpdateStatus"));
			apiUpdateVpcInfoResult.setGroupId(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].GroupId"));
			apiUpdateVpcInfoResult.setGroupName(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].GroupName"));
			apiUpdateVpcInfoResult.setApiUid(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].ApiUid"));
			apiUpdateVpcInfoResult.setErrorMsg(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].ErrorMsg"));
			apiUpdateVpcInfoResult.setStageName(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].StageName"));
			apiUpdateVpcInfoResult.setApiName(_ctx.stringValue("DescribeUpdateVpcInfoTaskResponse.ApiUpdateVpcInfoResults["+ i +"].ApiName"));

			apiUpdateVpcInfoResults.add(apiUpdateVpcInfoResult);
		}
		describeUpdateVpcInfoTaskResponse.setApiUpdateVpcInfoResults(apiUpdateVpcInfoResults);
	 
	 	return describeUpdateVpcInfoTaskResponse;
	}
}