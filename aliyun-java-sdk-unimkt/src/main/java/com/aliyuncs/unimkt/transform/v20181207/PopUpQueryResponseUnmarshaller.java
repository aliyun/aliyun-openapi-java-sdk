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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.PopUpQueryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PopUpQueryResponseUnmarshaller {

	public static PopUpQueryResponse unmarshall(PopUpQueryResponse popUpQueryResponse, UnmarshallerContext _ctx) {
		
		popUpQueryResponse.setRequestId(_ctx.stringValue("PopUpQueryResponse.RequestId"));
		popUpQueryResponse.setStatus(_ctx.booleanValue("PopUpQueryResponse.Status"));
		popUpQueryResponse.setMsg(_ctx.stringValue("PopUpQueryResponse.Msg"));
		popUpQueryResponse.setErrorCode(_ctx.stringValue("PopUpQueryResponse.ErrorCode"));
		popUpQueryResponse.setUrl(_ctx.stringValue("PopUpQueryResponse.Url"));
		popUpQueryResponse.setUnionAmount(_ctx.stringValue("PopUpQueryResponse.UnionAmount"));
	 
	 	return popUpQueryResponse;
	}
}