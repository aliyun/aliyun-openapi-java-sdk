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

package com.aliyuncs.alinlp.transform.v20200629;

import com.aliyuncs.alinlp.model.v20200629.GetPosChEcomResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPosChEcomResponseUnmarshaller {

	public static GetPosChEcomResponse unmarshall(GetPosChEcomResponse getPosChEcomResponse, UnmarshallerContext _ctx) {
		
		getPosChEcomResponse.setRequestId(_ctx.stringValue("GetPosChEcomResponse.RequestId"));
		getPosChEcomResponse.setData(_ctx.stringValue("GetPosChEcomResponse.Data"));
	 
	 	return getPosChEcomResponse;
	}
}