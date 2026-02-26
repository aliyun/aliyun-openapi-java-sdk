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

package com.aliyuncs.osssddp.transform.v20240222;

import com.aliyuncs.osssddp.model.v20240222.GetSddpVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSddpVersionResponseUnmarshaller {

	public static GetSddpVersionResponse unmarshall(GetSddpVersionResponse getSddpVersionResponse, UnmarshallerContext _ctx) {
		
		getSddpVersionResponse.setRequestId(_ctx.stringValue("GetSddpVersionResponse.RequestId"));
		getSddpVersionResponse.setContent(_ctx.integerValue("GetSddpVersionResponse.Content"));
	 
	 	return getSddpVersionResponse;
	}
}