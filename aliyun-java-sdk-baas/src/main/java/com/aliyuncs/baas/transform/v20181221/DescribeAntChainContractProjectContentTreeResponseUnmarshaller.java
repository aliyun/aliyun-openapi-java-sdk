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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectContentTreeResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectContentTreeResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainContractProjectContentTreeResponseUnmarshaller {

	public static DescribeAntChainContractProjectContentTreeResponse unmarshall(DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTreeResponse, UnmarshallerContext _ctx) {
		
		describeAntChainContractProjectContentTreeResponse.setRequestId(_ctx.stringValue("DescribeAntChainContractProjectContentTreeResponse.RequestId"));

		Result result = new Result();
		result.setProjectId(_ctx.stringValue("DescribeAntChainContractProjectContentTreeResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("DescribeAntChainContractProjectContentTreeResponse.Result.ProjectName"));
		result.setProjectVersion(_ctx.stringValue("DescribeAntChainContractProjectContentTreeResponse.Result.ProjectVersion"));
		result.setProjectDescription(_ctx.stringValue("DescribeAntChainContractProjectContentTreeResponse.Result.ProjectDescription"));

		List<Map<Object, Object>> children = _ctx.listMapValue("DescribeAntChainContractProjectContentTreeResponse.Result.Children");
		result.setChildren(children);
		describeAntChainContractProjectContentTreeResponse.setResult(result);
	 
	 	return describeAntChainContractProjectContentTreeResponse;
	}
}