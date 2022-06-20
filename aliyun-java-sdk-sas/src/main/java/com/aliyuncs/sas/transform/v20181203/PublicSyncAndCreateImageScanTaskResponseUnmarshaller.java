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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.PublicSyncAndCreateImageScanTaskResponse;
import com.aliyuncs.sas.model.v20181203.PublicSyncAndCreateImageScanTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublicSyncAndCreateImageScanTaskResponseUnmarshaller {

	public static PublicSyncAndCreateImageScanTaskResponse unmarshall(PublicSyncAndCreateImageScanTaskResponse publicSyncAndCreateImageScanTaskResponse, UnmarshallerContext _ctx) {
		
		publicSyncAndCreateImageScanTaskResponse.setRequestId(_ctx.stringValue("PublicSyncAndCreateImageScanTaskResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("PublicSyncAndCreateImageScanTaskResponse.Data.TaskId"));
		data.setTotalCount(_ctx.integerValue("PublicSyncAndCreateImageScanTaskResponse.Data.TotalCount"));
		data.setFinishCount(_ctx.integerValue("PublicSyncAndCreateImageScanTaskResponse.Data.FinishCount"));
		data.setCollectTime(_ctx.longValue("PublicSyncAndCreateImageScanTaskResponse.Data.CollectTime"));
		data.setExecTime(_ctx.longValue("PublicSyncAndCreateImageScanTaskResponse.Data.ExecTime"));
		data.setStatus(_ctx.stringValue("PublicSyncAndCreateImageScanTaskResponse.Data.Status"));
		data.setProgress(_ctx.integerValue("PublicSyncAndCreateImageScanTaskResponse.Data.Progress"));
		data.setResult(_ctx.stringValue("PublicSyncAndCreateImageScanTaskResponse.Data.Result"));
		data.setCanCreate(_ctx.booleanValue("PublicSyncAndCreateImageScanTaskResponse.Data.CanCreate"));
		publicSyncAndCreateImageScanTaskResponse.setData(data);
	 
	 	return publicSyncAndCreateImageScanTaskResponse;
	}
}