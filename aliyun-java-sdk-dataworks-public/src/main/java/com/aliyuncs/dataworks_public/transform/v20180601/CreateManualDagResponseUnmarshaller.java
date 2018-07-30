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

package com.aliyuncs.dataworks_public.transform.v20180601;

import com.aliyuncs.dataworks_public.model.v20180601.CreateManualDagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateManualDagResponseUnmarshaller {

	public static CreateManualDagResponse unmarshall(CreateManualDagResponse createManualDagResponse, UnmarshallerContext context) {
		
		createManualDagResponse.setRequestId(context.stringValue("CreateManualDagResponse.RequestId"));
		createManualDagResponse.setReturnCode(context.stringValue("CreateManualDagResponse.ReturnCode"));
		createManualDagResponse.setReturnErrorSolution(context.stringValue("CreateManualDagResponse.ReturnErrorSolution"));
		createManualDagResponse.setReturnMessage(context.stringValue("CreateManualDagResponse.ReturnMessage"));
		createManualDagResponse.setReturnValue(context.longValue("CreateManualDagResponse.ReturnValue"));
	 
	 	return createManualDagResponse;
	}
}