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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CountTSClientCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountTSClientCountResponseUnmarshaller {

	public static CountTSClientCountResponse unmarshall(CountTSClientCountResponse countTSClientCountResponse, UnmarshallerContext _ctx) {
		
		countTSClientCountResponse.setRequestId(_ctx.stringValue("CountTSClientCountResponse.RequestId"));
		countTSClientCountResponse.setResultCode(_ctx.stringValue("CountTSClientCountResponse.ResultCode"));
		countTSClientCountResponse.setResultMessage(_ctx.stringValue("CountTSClientCountResponse.ResultMessage"));
		countTSClientCountResponse.setData(_ctx.stringValue("CountTSClientCountResponse.Data"));
	 
	 	return countTSClientCountResponse;
	}
}