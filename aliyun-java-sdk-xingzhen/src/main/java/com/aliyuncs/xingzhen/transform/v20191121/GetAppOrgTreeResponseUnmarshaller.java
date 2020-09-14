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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgTreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppOrgTreeResponseUnmarshaller {

	public static GetAppOrgTreeResponse unmarshall(GetAppOrgTreeResponse getAppOrgTreeResponse, UnmarshallerContext _ctx) {
		
		getAppOrgTreeResponse.setRequestId(_ctx.stringValue("GetAppOrgTreeResponse.RequestId"));
		getAppOrgTreeResponse.setMessage(_ctx.stringValue("GetAppOrgTreeResponse.Message"));
		getAppOrgTreeResponse.setCode(_ctx.stringValue("GetAppOrgTreeResponse.Code"));
		getAppOrgTreeResponse.setData(_ctx.stringValue("GetAppOrgTreeResponse.Data"));
	 
	 	return getAppOrgTreeResponse;
	}
}