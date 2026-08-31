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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateNodeOpsOwnerResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateNodeOpsOwnerResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNodeOpsOwnerResponseUnmarshaller {

	public static UpdateNodeOpsOwnerResponse unmarshall(UpdateNodeOpsOwnerResponse updateNodeOpsOwnerResponse, UnmarshallerContext _ctx) {
		
		updateNodeOpsOwnerResponse.setRequestId(_ctx.stringValue("UpdateNodeOpsOwnerResponse.RequestId"));
		updateNodeOpsOwnerResponse.setMessage(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Message"));
		updateNodeOpsOwnerResponse.setHttpStatusCode(_ctx.integerValue("UpdateNodeOpsOwnerResponse.HttpStatusCode"));
		updateNodeOpsOwnerResponse.setCode(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Code"));
		updateNodeOpsOwnerResponse.setSuccess(_ctx.booleanValue("UpdateNodeOpsOwnerResponse.Success"));

		List<Result> data = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("UpdateNodeOpsOwnerResponse.Data.Length"); i++) {
			Result result = new Result();
			result.setStatus(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Data["+ i +"].Status"));
			result.setNodeFromType(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Data["+ i +"].NodeFromType"));
			result.setErrorInfo(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Data["+ i +"].ErrorInfo"));
			result.setId(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Data["+ i +"].Id"));
			result.setName(_ctx.stringValue("UpdateNodeOpsOwnerResponse.Data["+ i +"].Name"));

			data.add(result);
		}
		updateNodeOpsOwnerResponse.setData(data);
	 
	 	return updateNodeOpsOwnerResponse;
	}
}