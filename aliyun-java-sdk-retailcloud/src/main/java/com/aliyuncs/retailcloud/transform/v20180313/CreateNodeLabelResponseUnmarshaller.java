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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CreateNodeLabelResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreateNodeLabelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNodeLabelResponseUnmarshaller {

	public static CreateNodeLabelResponse unmarshall(CreateNodeLabelResponse createNodeLabelResponse, UnmarshallerContext _ctx) {
		
		createNodeLabelResponse.setRequestId(_ctx.stringValue("CreateNodeLabelResponse.RequestId"));
		createNodeLabelResponse.setCode(_ctx.integerValue("CreateNodeLabelResponse.Code"));
		createNodeLabelResponse.setErrMsg(_ctx.stringValue("CreateNodeLabelResponse.ErrMsg"));
		createNodeLabelResponse.setSuccess(_ctx.booleanValue("CreateNodeLabelResponse.Success"));

		Result result = new Result();
		result.setClusterId(_ctx.stringValue("CreateNodeLabelResponse.Result.ClusterId"));
		result.setId(_ctx.longValue("CreateNodeLabelResponse.Result.Id"));
		result.setLabelKey(_ctx.stringValue("CreateNodeLabelResponse.Result.LabelKey"));
		result.setLabelValue(_ctx.stringValue("CreateNodeLabelResponse.Result.LabelValue"));
		createNodeLabelResponse.setResult(result);
	 
	 	return createNodeLabelResponse;
	}
}