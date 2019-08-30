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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.PhotoProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhotoProcessResponseUnmarshaller {

	public static PhotoProcessResponse unmarshall(PhotoProcessResponse photoProcessResponse, UnmarshallerContext _ctx) {
		
		photoProcessResponse.setRequestId(_ctx.stringValue("PhotoProcessResponse.RequestId"));
		photoProcessResponse.setTaskId(_ctx.stringValue("PhotoProcessResponse.TaskId"));
		photoProcessResponse.setTgtLoc(_ctx.stringValue("PhotoProcessResponse.TgtLoc"));
		photoProcessResponse.setStatus(_ctx.stringValue("PhotoProcessResponse.Status"));
		photoProcessResponse.setCreateTime(_ctx.stringValue("PhotoProcessResponse.CreateTime"));
		photoProcessResponse.setPercent(_ctx.integerValue("PhotoProcessResponse.Percent"));
	 
	 	return photoProcessResponse;
	}
}