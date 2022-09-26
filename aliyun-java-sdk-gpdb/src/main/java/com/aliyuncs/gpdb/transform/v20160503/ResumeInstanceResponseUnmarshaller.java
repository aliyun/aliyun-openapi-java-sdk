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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.ResumeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeInstanceResponseUnmarshaller {

	public static ResumeInstanceResponse unmarshall(ResumeInstanceResponse resumeInstanceResponse, UnmarshallerContext _ctx) {
		
		resumeInstanceResponse.setRequestId(_ctx.stringValue("ResumeInstanceResponse.RequestId"));
		resumeInstanceResponse.setStatus(_ctx.booleanValue("ResumeInstanceResponse.Status"));
		resumeInstanceResponse.setErrorMessage(_ctx.stringValue("ResumeInstanceResponse.ErrorMessage"));
		resumeInstanceResponse.setDBInstanceId(_ctx.stringValue("ResumeInstanceResponse.DBInstanceId"));
	 
	 	return resumeInstanceResponse;
	}
}