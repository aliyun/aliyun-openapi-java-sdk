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

import com.aliyuncs.imm.model.v20170906.CreateCADConversionTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCADConversionTaskResponseUnmarshaller {

	public static CreateCADConversionTaskResponse unmarshall(CreateCADConversionTaskResponse createCADConversionTaskResponse, UnmarshallerContext _ctx) {
		
		createCADConversionTaskResponse.setRequestId(_ctx.stringValue("CreateCADConversionTaskResponse.RequestId"));
		createCADConversionTaskResponse.setTaskId(_ctx.stringValue("CreateCADConversionTaskResponse.TaskId"));
		createCADConversionTaskResponse.setTgtLoc(_ctx.stringValue("CreateCADConversionTaskResponse.TgtLoc"));
		createCADConversionTaskResponse.setStatus(_ctx.stringValue("CreateCADConversionTaskResponse.Status"));
		createCADConversionTaskResponse.setCreateTime(_ctx.stringValue("CreateCADConversionTaskResponse.CreateTime"));
		createCADConversionTaskResponse.setPercent(_ctx.integerValue("CreateCADConversionTaskResponse.Percent"));
	 
	 	return createCADConversionTaskResponse;
	}
}