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

import com.aliyuncs.sas.model.v20181203.PublicCreateImageScanTaskResponse;
import com.aliyuncs.sas.model.v20181203.PublicCreateImageScanTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublicCreateImageScanTaskResponseUnmarshaller {

	public static PublicCreateImageScanTaskResponse unmarshall(PublicCreateImageScanTaskResponse publicCreateImageScanTaskResponse, UnmarshallerContext _ctx) {
		
		publicCreateImageScanTaskResponse.setRequestId(_ctx.stringValue("PublicCreateImageScanTaskResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("PublicCreateImageScanTaskResponse.Data.TaskId"));
		data.setTotalCount(_ctx.integerValue("PublicCreateImageScanTaskResponse.Data.TotalCount"));
		data.setFinishCount(_ctx.integerValue("PublicCreateImageScanTaskResponse.Data.FinishCount"));
		data.setCollectTime(_ctx.longValue("PublicCreateImageScanTaskResponse.Data.CollectTime"));
		data.setExecTime(_ctx.longValue("PublicCreateImageScanTaskResponse.Data.ExecTime"));
		data.setStatus(_ctx.stringValue("PublicCreateImageScanTaskResponse.Data.Status"));
		data.setProgress(_ctx.integerValue("PublicCreateImageScanTaskResponse.Data.Progress"));
		data.setResult(_ctx.stringValue("PublicCreateImageScanTaskResponse.Data.Result"));
		data.setCanCreate(_ctx.booleanValue("PublicCreateImageScanTaskResponse.Data.CanCreate"));
		publicCreateImageScanTaskResponse.setData(data);
	 
	 	return publicCreateImageScanTaskResponse;
	}
}