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

import com.aliyuncs.oos.model.v20190601.ListParameterVersionsResponse;
import com.aliyuncs.oos.model.v20190601.ListParameterVersionsResponse.ParameterVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParameterVersionsResponseUnmarshaller {

	public static ListParameterVersionsResponse unmarshall(ListParameterVersionsResponse listParameterVersionsResponse, UnmarshallerContext _ctx) {
		
		listParameterVersionsResponse.setRequestId(_ctx.stringValue("ListParameterVersionsResponse.RequestId"));
		listParameterVersionsResponse.setMaxResults(_ctx.integerValue("ListParameterVersionsResponse.MaxResults"));
		listParameterVersionsResponse.setNextToken(_ctx.stringValue("ListParameterVersionsResponse.NextToken"));
		listParameterVersionsResponse.setTotalCount(_ctx.integerValue("ListParameterVersionsResponse.TotalCount"));
		listParameterVersionsResponse.setName(_ctx.stringValue("ListParameterVersionsResponse.Name"));
		listParameterVersionsResponse.setId(_ctx.stringValue("ListParameterVersionsResponse.Id"));
		listParameterVersionsResponse.setType(_ctx.stringValue("ListParameterVersionsResponse.Type"));
		listParameterVersionsResponse.setDescription(_ctx.stringValue("ListParameterVersionsResponse.Description"));
		listParameterVersionsResponse.setCreatedDate(_ctx.stringValue("ListParameterVersionsResponse.CreatedDate"));
		listParameterVersionsResponse.setCreatedBy(_ctx.stringValue("ListParameterVersionsResponse.CreatedBy"));

		List<ParameterVersion> parameterVersions = new ArrayList<ParameterVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListParameterVersionsResponse.ParameterVersions.Length"); i++) {
			ParameterVersion parameterVersion = new ParameterVersion();
			parameterVersion.setUpdatedDate(_ctx.stringValue("ListParameterVersionsResponse.ParameterVersions["+ i +"].UpdatedDate"));
			parameterVersion.setUpdatedBy(_ctx.stringValue("ListParameterVersionsResponse.ParameterVersions["+ i +"].UpdatedBy"));
			parameterVersion.setParameterVersion(_ctx.integerValue("ListParameterVersionsResponse.ParameterVersions["+ i +"].ParameterVersion"));
			parameterVersion.setValue(_ctx.stringValue("ListParameterVersionsResponse.ParameterVersions["+ i +"].Value"));

			parameterVersions.add(parameterVersion);
		}
		listParameterVersionsResponse.setParameterVersions(parameterVersions);
	 
	 	return listParameterVersionsResponse;
	}
}