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

import com.aliyuncs.dts.model.v20200101.DeleteDtsJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDtsJobsResponseUnmarshaller {

	public static DeleteDtsJobsResponse unmarshall(DeleteDtsJobsResponse deleteDtsJobsResponse, UnmarshallerContext _ctx) {
		
		deleteDtsJobsResponse.setRequestId(_ctx.stringValue("DeleteDtsJobsResponse.RequestId"));
		deleteDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("DeleteDtsJobsResponse.HttpStatusCode"));
		deleteDtsJobsResponse.setErrCode(_ctx.stringValue("DeleteDtsJobsResponse.ErrCode"));
		deleteDtsJobsResponse.setSuccess(_ctx.booleanValue("DeleteDtsJobsResponse.Success"));
		deleteDtsJobsResponse.setErrMessage(_ctx.stringValue("DeleteDtsJobsResponse.ErrMessage"));
		deleteDtsJobsResponse.setDynamicMessage(_ctx.stringValue("DeleteDtsJobsResponse.DynamicMessage"));
		deleteDtsJobsResponse.setDynamicCode(_ctx.stringValue("DeleteDtsJobsResponse.DynamicCode"));
	 
	 	return deleteDtsJobsResponse;
	}
}