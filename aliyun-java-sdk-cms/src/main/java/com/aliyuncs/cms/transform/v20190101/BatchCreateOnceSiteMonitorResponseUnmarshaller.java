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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.BatchCreateOnceSiteMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateOnceSiteMonitorResponseUnmarshaller {

	public static BatchCreateOnceSiteMonitorResponse unmarshall(BatchCreateOnceSiteMonitorResponse batchCreateOnceSiteMonitorResponse, UnmarshallerContext _ctx) {
		
		batchCreateOnceSiteMonitorResponse.setRequestId(_ctx.stringValue("BatchCreateOnceSiteMonitorResponse.RequestId"));
		batchCreateOnceSiteMonitorResponse.setMessage(_ctx.stringValue("BatchCreateOnceSiteMonitorResponse.Message"));
		batchCreateOnceSiteMonitorResponse.setSuccess(_ctx.booleanValue("BatchCreateOnceSiteMonitorResponse.Success"));
		batchCreateOnceSiteMonitorResponse.setData(_ctx.stringValue("BatchCreateOnceSiteMonitorResponse.Data"));
		batchCreateOnceSiteMonitorResponse.setCode(_ctx.stringValue("BatchCreateOnceSiteMonitorResponse.Code"));
	 
	 	return batchCreateOnceSiteMonitorResponse;
	}
}