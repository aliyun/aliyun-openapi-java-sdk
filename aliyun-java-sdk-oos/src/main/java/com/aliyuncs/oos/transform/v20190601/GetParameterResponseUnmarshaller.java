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

import com.aliyuncs.oos.model.v20190601.GetParameterResponse;
import com.aliyuncs.oos.model.v20190601.GetParameterResponse.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetParameterResponseUnmarshaller {

	public static GetParameterResponse unmarshall(GetParameterResponse getParameterResponse, UnmarshallerContext _ctx) {
		
		getParameterResponse.setRequestId(_ctx.stringValue("GetParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setId(_ctx.stringValue("GetParameterResponse.Parameter.Id"));
		parameter.setName(_ctx.stringValue("GetParameterResponse.Parameter.Name"));
		parameter.setCreatedDate(_ctx.stringValue("GetParameterResponse.Parameter.CreatedDate"));
		parameter.setCreatedBy(_ctx.stringValue("GetParameterResponse.Parameter.CreatedBy"));
		parameter.setUpdatedDate(_ctx.stringValue("GetParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("GetParameterResponse.Parameter.UpdatedBy"));
		parameter.setDescription(_ctx.stringValue("GetParameterResponse.Parameter.Description"));
		parameter.setShareType(_ctx.stringValue("GetParameterResponse.Parameter.ShareType"));
		parameter.setParameterVersion(_ctx.integerValue("GetParameterResponse.Parameter.ParameterVersion"));
		parameter.setType(_ctx.stringValue("GetParameterResponse.Parameter.Type"));
		parameter.setValue(_ctx.stringValue("GetParameterResponse.Parameter.Value"));
		parameter.setConstraints(_ctx.stringValue("GetParameterResponse.Parameter.Constraints"));
		parameter.setTags(_ctx.mapValue("GetParameterResponse.Parameter.Tags"));
		getParameterResponse.setParameter(parameter);
	 
	 	return getParameterResponse;
	}
}