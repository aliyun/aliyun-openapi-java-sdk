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

package com.aliyuncs.mpserverless.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190930.ListFunctionSpecsResponse;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionSpecsResponse.MemorySpec;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionSpecsResponse.RuntimeSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionSpecsResponseUnmarshaller {

	public static ListFunctionSpecsResponse unmarshall(ListFunctionSpecsResponse listFunctionSpecsResponse, UnmarshallerContext _ctx) {
		
		listFunctionSpecsResponse.setRequestId(_ctx.stringValue("ListFunctionSpecsResponse.RequestId"));
		listFunctionSpecsResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionSpecsResponse.HttpStatusCode"));
		listFunctionSpecsResponse.setSuccess(_ctx.booleanValue("ListFunctionSpecsResponse.Success"));
		listFunctionSpecsResponse.setCode(_ctx.stringValue("ListFunctionSpecsResponse.Code"));
		listFunctionSpecsResponse.setMessage(_ctx.stringValue("ListFunctionSpecsResponse.Message"));
		listFunctionSpecsResponse.setCode1(_ctx.stringValue("ListFunctionSpecsResponse.Code"));
		listFunctionSpecsResponse.setMessage2(_ctx.stringValue("ListFunctionSpecsResponse.Message"));

		List<RuntimeSpec> runtimeSpecs = new ArrayList<RuntimeSpec>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionSpecsResponse.RuntimeSpecs.Length"); i++) {
			RuntimeSpec runtimeSpec = new RuntimeSpec();
			runtimeSpec.setRuntimeId(_ctx.stringValue("ListFunctionSpecsResponse.RuntimeSpecs["+ i +"].RuntimeId"));
			runtimeSpec.setRuntimeName(_ctx.stringValue("ListFunctionSpecsResponse.RuntimeSpecs["+ i +"].RuntimeName"));

			runtimeSpecs.add(runtimeSpec);
		}
		listFunctionSpecsResponse.setRuntimeSpecs(runtimeSpecs);

		List<MemorySpec> memorySpecs = new ArrayList<MemorySpec>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionSpecsResponse.MemorySpecs.Length"); i++) {
			MemorySpec memorySpec = new MemorySpec();
			memorySpec.setMemoryId(_ctx.stringValue("ListFunctionSpecsResponse.MemorySpecs["+ i +"].MemoryId"));
			memorySpec.setMemoryName(_ctx.stringValue("ListFunctionSpecsResponse.MemorySpecs["+ i +"].MemoryName"));

			memorySpecs.add(memorySpec);
		}
		listFunctionSpecsResponse.setMemorySpecs(memorySpecs);
	 
	 	return listFunctionSpecsResponse;
	}
}