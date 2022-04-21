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

import com.aliyuncs.cms.model.v20190101.BatchCreateIntantSiteMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateIntantSiteMonitorResponseUnmarshaller {

	public static BatchCreateIntantSiteMonitorResponse unmarshall(BatchCreateIntantSiteMonitorResponse batchCreateIntantSiteMonitorResponse, UnmarshallerContext _ctx) {
		
		batchCreateIntantSiteMonitorResponse.setRequestId(_ctx.stringValue("BatchCreateIntantSiteMonitorResponse.RequestId"));
		batchCreateIntantSiteMonitorResponse.setMessage(_ctx.stringValue("BatchCreateIntantSiteMonitorResponse.Message"));
		batchCreateIntantSiteMonitorResponse.setSuccess(_ctx.booleanValue("BatchCreateIntantSiteMonitorResponse.Success"));
		batchCreateIntantSiteMonitorResponse.setData(_ctx.stringValue("BatchCreateIntantSiteMonitorResponse.Data"));
		batchCreateIntantSiteMonitorResponse.setCode(_ctx.stringValue("BatchCreateIntantSiteMonitorResponse.Code"));
	 
	 	return batchCreateIntantSiteMonitorResponse;
	}
}