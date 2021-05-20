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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.DeleteDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDtsJobResponseUnmarshaller {

	public static DeleteDtsJobResponse unmarshall(DeleteDtsJobResponse deleteDtsJobResponse, UnmarshallerContext _ctx) {
		
		deleteDtsJobResponse.setRequestId(_ctx.stringValue("DeleteDtsJobResponse.RequestId"));
		deleteDtsJobResponse.setDynamicCode(_ctx.stringValue("DeleteDtsJobResponse.DynamicCode"));
		deleteDtsJobResponse.setDynamicMessage(_ctx.stringValue("DeleteDtsJobResponse.DynamicMessage"));
		deleteDtsJobResponse.setErrCode(_ctx.stringValue("DeleteDtsJobResponse.ErrCode"));
		deleteDtsJobResponse.setErrMessage(_ctx.stringValue("DeleteDtsJobResponse.ErrMessage"));
		deleteDtsJobResponse.setHttpStatusCode(_ctx.integerValue("DeleteDtsJobResponse.HttpStatusCode"));
		deleteDtsJobResponse.setSuccess(_ctx.booleanValue("DeleteDtsJobResponse.Success"));
	 
	 	return deleteDtsJobResponse;
	}
}