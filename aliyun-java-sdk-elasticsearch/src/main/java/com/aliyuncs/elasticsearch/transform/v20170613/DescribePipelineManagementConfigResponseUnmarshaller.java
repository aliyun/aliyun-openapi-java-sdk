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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribePipelineManagementConfigResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribePipelineManagementConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePipelineManagementConfigResponseUnmarshaller {

	public static DescribePipelineManagementConfigResponse unmarshall(DescribePipelineManagementConfigResponse describePipelineManagementConfigResponse, UnmarshallerContext _ctx) {
		
		describePipelineManagementConfigResponse.setRequestId(_ctx.stringValue("DescribePipelineManagementConfigResponse.RequestId"));

		Result result = new Result();
		result.setPipelineManagementType(_ctx.stringValue("DescribePipelineManagementConfigResponse.Result.pipelineManagementType"));
		result.setEndpoints(_ctx.stringValue("DescribePipelineManagementConfigResponse.Result.endpoints"));
		result.setUserName(_ctx.stringValue("DescribePipelineManagementConfigResponse.Result.userName"));
		result.setEsInstanceId(_ctx.stringValue("DescribePipelineManagementConfigResponse.Result.esInstanceId"));

		List<String> pipelineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePipelineManagementConfigResponse.Result.pipelineIds.Length"); i++) {
			pipelineIds.add(_ctx.stringValue("DescribePipelineManagementConfigResponse.Result.pipelineIds["+ i +"]"));
		}
		result.setPipelineIds(pipelineIds);
		describePipelineManagementConfigResponse.setResult(result);
	 
	 	return describePipelineManagementConfigResponse;
	}
}