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

import com.aliyuncs.imm.model.v20170906.CreateOfficeConversionTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOfficeConversionTaskResponseUnmarshaller {

	public static CreateOfficeConversionTaskResponse unmarshall(CreateOfficeConversionTaskResponse createOfficeConversionTaskResponse, UnmarshallerContext context) {
		
		createOfficeConversionTaskResponse.setRequestId(context.stringValue("CreateOfficeConversionTaskResponse.RequestId"));
		createOfficeConversionTaskResponse.setTaskId(context.stringValue("CreateOfficeConversionTaskResponse.TaskId"));
		createOfficeConversionTaskResponse.setTgtLoc(context.stringValue("CreateOfficeConversionTaskResponse.TgtLoc"));
		createOfficeConversionTaskResponse.setStatus(context.stringValue("CreateOfficeConversionTaskResponse.Status"));
		createOfficeConversionTaskResponse.setCreateTime(context.stringValue("CreateOfficeConversionTaskResponse.CreateTime"));
		createOfficeConversionTaskResponse.setPercent(context.integerValue("CreateOfficeConversionTaskResponse.Percent"));
	 
	 	return createOfficeConversionTaskResponse;
	}
}