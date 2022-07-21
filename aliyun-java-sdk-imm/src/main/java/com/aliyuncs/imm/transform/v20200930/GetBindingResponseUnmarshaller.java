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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.GetBindingResponse;
import com.aliyuncs.imm.model.v20200930.GetBindingResponse.Binding;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBindingResponseUnmarshaller {

	public static GetBindingResponse unmarshall(GetBindingResponse getBindingResponse, UnmarshallerContext _ctx) {
		
		getBindingResponse.setRequestId(_ctx.stringValue("GetBindingResponse.RequestId"));

		Binding binding = new Binding();
		binding.setProjectName(_ctx.stringValue("GetBindingResponse.Binding.ProjectName"));
		binding.setDatasetName(_ctx.stringValue("GetBindingResponse.Binding.DatasetName"));
		binding.setURI(_ctx.stringValue("GetBindingResponse.Binding.URI"));
		binding.setState(_ctx.stringValue("GetBindingResponse.Binding.State"));
		binding.setPhase(_ctx.stringValue("GetBindingResponse.Binding.Phase"));
		binding.setDetail(_ctx.stringValue("GetBindingResponse.Binding.Detail"));
		binding.setCreateTime(_ctx.stringValue("GetBindingResponse.Binding.CreateTime"));
		binding.setUpdateTime(_ctx.stringValue("GetBindingResponse.Binding.UpdateTime"));
		getBindingResponse.setBinding(binding);
	 
	 	return getBindingResponse;
	}
}