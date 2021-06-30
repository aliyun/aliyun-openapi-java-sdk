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

package com.aliyuncs.workbench_inner.transform.v20210121;

import com.aliyuncs.workbench_inner.model.v20210121.InnerGetAppRepositoryResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetAppRepositoryResponseUnmarshaller {

	public static InnerGetAppRepositoryResponse unmarshall(InnerGetAppRepositoryResponse innerGetAppRepositoryResponse, UnmarshallerContext _ctx) {
		
		innerGetAppRepositoryResponse.setRequestId(_ctx.stringValue("InnerGetAppRepositoryResponse.RequestId"));
		innerGetAppRepositoryResponse.setCode(_ctx.stringValue("InnerGetAppRepositoryResponse.Code"));
		innerGetAppRepositoryResponse.setData(_ctx.mapValue("InnerGetAppRepositoryResponse.Data"));
		innerGetAppRepositoryResponse.setMessage(_ctx.stringValue("InnerGetAppRepositoryResponse.Message"));
	 
	 	return innerGetAppRepositoryResponse;
	}
}