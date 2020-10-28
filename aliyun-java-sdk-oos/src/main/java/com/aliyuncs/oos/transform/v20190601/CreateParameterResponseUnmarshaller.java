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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.CreateParameterResponse;
import com.aliyuncs.oos.model.v20190601.CreateParameterResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateParameterResponseUnmarshaller {

	public static CreateParameterResponse unmarshall(CreateParameterResponse createParameterResponse, UnmarshallerContext _ctx) {
		
		createParameterResponse.setRequestId(_ctx.stringValue("CreateParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setId(_ctx.stringValue("CreateParameterResponse.Parameter.Id"));
		parameter.setName(_ctx.stringValue("CreateParameterResponse.Parameter.Name"));
		parameter.setCreatedDate(_ctx.stringValue("CreateParameterResponse.Parameter.CreatedDate"));
		parameter.setCreatedBy(_ctx.stringValue("CreateParameterResponse.Parameter.CreatedBy"));
		parameter.setUpdatedDate(_ctx.stringValue("CreateParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("CreateParameterResponse.Parameter.UpdatedBy"));
		parameter.setDescription(_ctx.stringValue("CreateParameterResponse.Parameter.Description"));
		parameter.setShareType(_ctx.stringValue("CreateParameterResponse.Parameter.ShareType"));
		parameter.setParameterVersion(_ctx.integerValue("CreateParameterResponse.Parameter.ParameterVersion"));
		parameter.setType(_ctx.stringValue("CreateParameterResponse.Parameter.Type"));
		parameter.setConstraints(_ctx.stringValue("CreateParameterResponse.Parameter.Constraints"));
		createParameterResponse.setParameter(parameter);
	 
	 	return createParameterResponse;
	}
}