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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataSourceDependenciesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataSourceDependenciesResponse.Dependency;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSourceDependenciesResponseUnmarshaller {

	public static GetDataSourceDependenciesResponse unmarshall(GetDataSourceDependenciesResponse getDataSourceDependenciesResponse, UnmarshallerContext _ctx) {
		
		getDataSourceDependenciesResponse.setRequestId(_ctx.stringValue("GetDataSourceDependenciesResponse.RequestId"));
		getDataSourceDependenciesResponse.setSuccess(_ctx.booleanValue("GetDataSourceDependenciesResponse.Success"));
		getDataSourceDependenciesResponse.setHttpStatusCode(_ctx.integerValue("GetDataSourceDependenciesResponse.HttpStatusCode"));
		getDataSourceDependenciesResponse.setCode(_ctx.stringValue("GetDataSourceDependenciesResponse.Code"));
		getDataSourceDependenciesResponse.setMessage(_ctx.stringValue("GetDataSourceDependenciesResponse.Message"));

		List<Dependency> dependencyList = new ArrayList<Dependency>();
		for (int i = 0; i < _ctx.lengthValue("GetDataSourceDependenciesResponse.DependencyList.Length"); i++) {
			Dependency dependency = new Dependency();
			dependency.setType(_ctx.stringValue("GetDataSourceDependenciesResponse.DependencyList["+ i +"].Type"));
			dependency.setTypeCode(_ctx.stringValue("GetDataSourceDependenciesResponse.DependencyList["+ i +"].TypeCode"));
			dependency.setId(_ctx.stringValue("GetDataSourceDependenciesResponse.DependencyList["+ i +"].Id"));
			dependency.setName(_ctx.stringValue("GetDataSourceDependenciesResponse.DependencyList["+ i +"].Name"));

			dependencyList.add(dependency);
		}
		getDataSourceDependenciesResponse.setDependencyList(dependencyList);
	 
	 	return getDataSourceDependenciesResponse;
	}
}