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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.ListDeployTaskByPageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployTaskByPageResponseUnmarshaller {

	public static ListDeployTaskByPageResponse unmarshall(ListDeployTaskByPageResponse listDeployTaskByPageResponse, UnmarshallerContext _ctx) {
		
		listDeployTaskByPageResponse.setRequestId(_ctx.stringValue("ListDeployTaskByPageResponse.RequestId"));
		listDeployTaskByPageResponse.setSuccess(_ctx.booleanValue("ListDeployTaskByPageResponse.Success"));
		listDeployTaskByPageResponse.setCode(_ctx.stringValue("ListDeployTaskByPageResponse.Code"));
		listDeployTaskByPageResponse.setErrorMessage(_ctx.stringValue("ListDeployTaskByPageResponse.ErrorMessage"));
		listDeployTaskByPageResponse.setData(_ctx.mapValue("ListDeployTaskByPageResponse.Data"));
	 
	 	return listDeployTaskByPageResponse;
	}
}