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

import com.aliyuncs.lrg.model.v20191010.GetNodeInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeInfoResponseUnmarshaller {

	public static GetNodeInfoResponse unmarshall(GetNodeInfoResponse getNodeInfoResponse, UnmarshallerContext _ctx) {
		
		getNodeInfoResponse.setCode(_ctx.integerValue("GetNodeInfoResponse.code"));
		getNodeInfoResponse.setSuccess(_ctx.booleanValue("GetNodeInfoResponse.success"));
		getNodeInfoResponse.setMessage(_ctx.stringValue("GetNodeInfoResponse.message"));
		getNodeInfoResponse.setData(_ctx.mapValue("GetNodeInfoResponse.data"));
	 
	 	return getNodeInfoResponse;
	}
}