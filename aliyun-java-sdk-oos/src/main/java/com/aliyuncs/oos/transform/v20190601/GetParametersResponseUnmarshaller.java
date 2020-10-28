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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.GetParametersResponse;
import com.aliyuncs.oos.model.v20190601.GetParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetParametersResponseUnmarshaller {

	public static GetParametersResponse unmarshall(GetParametersResponse getParametersResponse, UnmarshallerContext _ctx) {
		
		getParametersResponse.setRequestId(_ctx.stringValue("GetParametersResponse.RequestId"));

		List<String> invalidParameters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetParametersResponse.InvalidParameters.Length"); i++) {
			invalidParameters.add(_ctx.stringValue("GetParametersResponse.InvalidParameters["+ i +"]"));
		}
		getParametersResponse.setInvalidParameters(invalidParameters);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setId(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Id"));
			parameter.setName(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Name"));
			parameter.setCreatedDate(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setCreatedBy(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setUpdatedDate(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setDescription(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Description"));
			parameter.setShareType(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].ShareType"));
			parameter.setParameterVersion(_ctx.integerValue("GetParametersResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setType(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Type"));
			parameter.setValue(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Value"));
			parameter.setConstraints(_ctx.stringValue("GetParametersResponse.Parameters["+ i +"].Constraints"));

			parameters.add(parameter);
		}
		getParametersResponse.setParameters(parameters);
	 
	 	return getParametersResponse;
	}
}