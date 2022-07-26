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

import com.aliyuncs.oos.model.v20190601.UpdateParameterResponse;
import com.aliyuncs.oos.model.v20190601.UpdateParameterResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateParameterResponseUnmarshaller {

	public static UpdateParameterResponse unmarshall(UpdateParameterResponse updateParameterResponse, UnmarshallerContext _ctx) {
		
		updateParameterResponse.setRequestId(_ctx.stringValue("UpdateParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setType(_ctx.stringValue("UpdateParameterResponse.Parameter.Type"));
		parameter.setUpdatedDate(_ctx.stringValue("UpdateParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("UpdateParameterResponse.Parameter.UpdatedBy"));
		parameter.setTags(_ctx.stringValue("UpdateParameterResponse.Parameter.Tags"));
		parameter.setDescription(_ctx.stringValue("UpdateParameterResponse.Parameter.Description"));
		parameter.setConstraints(_ctx.stringValue("UpdateParameterResponse.Parameter.Constraints"));
		parameter.setResourceGroupId(_ctx.stringValue("UpdateParameterResponse.Parameter.ResourceGroupId"));
		parameter.setCreatedBy(_ctx.stringValue("UpdateParameterResponse.Parameter.CreatedBy"));
		parameter.setCreatedDate(_ctx.stringValue("UpdateParameterResponse.Parameter.CreatedDate"));
		parameter.setParameterVersion(_ctx.integerValue("UpdateParameterResponse.Parameter.ParameterVersion"));
		parameter.setName(_ctx.stringValue("UpdateParameterResponse.Parameter.Name"));
		parameter.setId(_ctx.stringValue("UpdateParameterResponse.Parameter.Id"));
		parameter.setShareType(_ctx.stringValue("UpdateParameterResponse.Parameter.ShareType"));
		updateParameterResponse.setParameter(parameter);
	 
	 	return updateParameterResponse;
	}
}