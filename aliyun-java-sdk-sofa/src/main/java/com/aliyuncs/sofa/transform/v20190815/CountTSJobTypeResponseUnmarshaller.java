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

import com.aliyuncs.sofa.model.v20190815.CountTSJobTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountTSJobTypeResponseUnmarshaller {

	public static CountTSJobTypeResponse unmarshall(CountTSJobTypeResponse countTSJobTypeResponse, UnmarshallerContext _ctx) {
		
		countTSJobTypeResponse.setRequestId(_ctx.stringValue("CountTSJobTypeResponse.RequestId"));
		countTSJobTypeResponse.setResultCode(_ctx.stringValue("CountTSJobTypeResponse.ResultCode"));
		countTSJobTypeResponse.setResultMessage(_ctx.stringValue("CountTSJobTypeResponse.ResultMessage"));
		countTSJobTypeResponse.setData(_ctx.stringValue("CountTSJobTypeResponse.Data"));
	 
	 	return countTSJobTypeResponse;
	}
}