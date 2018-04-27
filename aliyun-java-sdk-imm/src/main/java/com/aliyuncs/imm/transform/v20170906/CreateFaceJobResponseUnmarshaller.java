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

import com.aliyuncs.imm.model.v20170906.CreateFaceJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFaceJobResponseUnmarshaller {

	public static CreateFaceJobResponse unmarshall(CreateFaceJobResponse createFaceJobResponse, UnmarshallerContext context) {
		
		createFaceJobResponse.setRequestId(context.stringValue("CreateFaceJobResponse.RequestId"));
		createFaceJobResponse.setJobId(context.stringValue("CreateFaceJobResponse.JobId"));
		createFaceJobResponse.setSetId(context.stringValue("CreateFaceJobResponse.SetId"));
		createFaceJobResponse.setSrcUri(context.stringValue("CreateFaceJobResponse.SrcUri"));
		createFaceJobResponse.setPercent(context.integerValue("CreateFaceJobResponse.Percent"));
		createFaceJobResponse.setCreateTime(context.stringValue("CreateFaceJobResponse.CreateTime"));
		createFaceJobResponse.setFinishTime(context.stringValue("CreateFaceJobResponse.FinishTime"));
		createFaceJobResponse.setStatus(context.stringValue("CreateFaceJobResponse.Status"));
	 
	 	return createFaceJobResponse;
	}
}