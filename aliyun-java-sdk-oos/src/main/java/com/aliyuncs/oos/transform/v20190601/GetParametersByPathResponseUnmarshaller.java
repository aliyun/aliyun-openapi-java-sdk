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

import com.aliyuncs.oos.model.v20190601.GetParametersByPathResponse;
import com.aliyuncs.oos.model.v20190601.GetParametersByPathResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetParametersByPathResponseUnmarshaller {

	public static GetParametersByPathResponse unmarshall(GetParametersByPathResponse getParametersByPathResponse, UnmarshallerContext _ctx) {
		
		getParametersByPathResponse.setRequestId(_ctx.stringValue("GetParametersByPathResponse.RequestId"));
		getParametersByPathResponse.setNextToken(_ctx.stringValue("GetParametersByPathResponse.NextToken"));
		getParametersByPathResponse.setTotalCount(_ctx.integerValue("GetParametersByPathResponse.TotalCount"));
		getParametersByPathResponse.setMaxResults(_ctx.integerValue("GetParametersByPathResponse.MaxResults"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetParametersByPathResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setType(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Type"));
			parameter.setUpdatedDate(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setValue(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Value"));
			parameter.setDescription(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Description"));
			parameter.setConstraints(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Constraints"));
			parameter.setCreatedBy(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setCreatedDate(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setParameterVersion(_ctx.integerValue("GetParametersByPathResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setName(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Name"));
			parameter.setId(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].Id"));
			parameter.setShareType(_ctx.stringValue("GetParametersByPathResponse.Parameters["+ i +"].ShareType"));

			parameters.add(parameter);
		}
		getParametersByPathResponse.setParameters(parameters);
	 
	 	return getParametersByPathResponse;
	}
}