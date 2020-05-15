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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.AddMsRcSyncBucketResponse;
import com.aliyuncs.sofa.model.v20190815.AddMsRcSyncBucketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMsRcSyncBucketResponseUnmarshaller {

	public static AddMsRcSyncBucketResponse unmarshall(AddMsRcSyncBucketResponse addMsRcSyncBucketResponse, UnmarshallerContext _ctx) {
		
		addMsRcSyncBucketResponse.setRequestId(_ctx.stringValue("AddMsRcSyncBucketResponse.RequestId"));
		addMsRcSyncBucketResponse.setResultCode(_ctx.stringValue("AddMsRcSyncBucketResponse.ResultCode"));
		addMsRcSyncBucketResponse.setResultMessage(_ctx.stringValue("AddMsRcSyncBucketResponse.ResultMessage"));

		Data data = new Data();
		data.setClusterTaskId(_ctx.stringValue("AddMsRcSyncBucketResponse.Data.ClusterTaskId"));
		data.setClusterTaskStatus(_ctx.stringValue("AddMsRcSyncBucketResponse.Data.ClusterTaskStatus"));
		data.setSourceClusterId(_ctx.stringValue("AddMsRcSyncBucketResponse.Data.SourceClusterId"));
		data.setTargetClusterId(_ctx.stringValue("AddMsRcSyncBucketResponse.Data.TargetClusterId"));
		addMsRcSyncBucketResponse.setData(data);
	 
	 	return addMsRcSyncBucketResponse;
	}
}