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

package com.aliyuncs.workbench_ide.transform.v20210121;

import com.aliyuncs.workbench_ide.model.v20210121.GetSolutionRepoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSolutionRepoResponseUnmarshaller {

	public static GetSolutionRepoResponse unmarshall(GetSolutionRepoResponse getSolutionRepoResponse, UnmarshallerContext _ctx) {
		
		getSolutionRepoResponse.setRequestId(_ctx.stringValue("GetSolutionRepoResponse.RequestId"));
		getSolutionRepoResponse.setCode(_ctx.stringValue("GetSolutionRepoResponse.Code"));
		getSolutionRepoResponse.setData(_ctx.mapValue("GetSolutionRepoResponse.Data"));
		getSolutionRepoResponse.setMessage(_ctx.stringValue("GetSolutionRepoResponse.Message"));
	 
	 	return getSolutionRepoResponse;
	}
}