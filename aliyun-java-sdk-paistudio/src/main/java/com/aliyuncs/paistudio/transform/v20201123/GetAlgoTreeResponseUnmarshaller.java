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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.GetAlgoTreeResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlgoTreeResponseUnmarshaller {

	public static GetAlgoTreeResponse unmarshall(GetAlgoTreeResponse getAlgoTreeResponse, UnmarshallerContext _ctx) {
		
		getAlgoTreeResponse.setRequestId(_ctx.stringValue("GetAlgoTreeResponse.RequestId"));
		getAlgoTreeResponse.setCode(_ctx.stringValue("GetAlgoTreeResponse.Code"));
		getAlgoTreeResponse.setMessage(_ctx.stringValue("GetAlgoTreeResponse.Message"));
		getAlgoTreeResponse.setData(_ctx.mapValue("GetAlgoTreeResponse.Data"));
	 
	 	return getAlgoTreeResponse;
	}
}