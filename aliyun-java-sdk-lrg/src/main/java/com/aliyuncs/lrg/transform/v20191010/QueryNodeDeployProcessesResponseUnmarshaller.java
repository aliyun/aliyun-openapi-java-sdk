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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.QueryNodeDeployProcessesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNodeDeployProcessesResponseUnmarshaller {

	public static QueryNodeDeployProcessesResponse unmarshall(QueryNodeDeployProcessesResponse queryNodeDeployProcessesResponse, UnmarshallerContext _ctx) {
		
		queryNodeDeployProcessesResponse.setCode(_ctx.integerValue("QueryNodeDeployProcessesResponse.code"));
		queryNodeDeployProcessesResponse.setData(_ctx.mapValue("QueryNodeDeployProcessesResponse.data"));
		queryNodeDeployProcessesResponse.setMessage(_ctx.stringValue("QueryNodeDeployProcessesResponse.message"));
		queryNodeDeployProcessesResponse.setSuccess(_ctx.booleanValue("QueryNodeDeployProcessesResponse.success"));
	 
	 	return queryNodeDeployProcessesResponse;
	}
}