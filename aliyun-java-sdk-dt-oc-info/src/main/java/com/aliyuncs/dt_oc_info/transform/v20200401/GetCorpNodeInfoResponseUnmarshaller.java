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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import com.aliyuncs.dt_oc_info.model.v20200401.GetCorpNodeInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCorpNodeInfoResponseUnmarshaller {

	public static GetCorpNodeInfoResponse unmarshall(GetCorpNodeInfoResponse getCorpNodeInfoResponse, UnmarshallerContext _ctx) {
		
		getCorpNodeInfoResponse.setRequestId(_ctx.stringValue("GetCorpNodeInfoResponse.RequestId"));
		getCorpNodeInfoResponse.setCode(_ctx.integerValue("GetCorpNodeInfoResponse.Code"));
		getCorpNodeInfoResponse.setMessage(_ctx.stringValue("GetCorpNodeInfoResponse.Message"));
		getCorpNodeInfoResponse.setData(_ctx.mapValue("GetCorpNodeInfoResponse.Data"));
	 
	 	return getCorpNodeInfoResponse;
	}
}