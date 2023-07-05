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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetTaskStatusResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetTaskStatusResponse.ProductTaskStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatusResponseUnmarshaller {

	public static GetTaskStatusResponse unmarshall(GetTaskStatusResponse getTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getTaskStatusResponse.setRequestId(_ctx.stringValue("GetTaskStatusResponse.RequestId"));

		List<ProductTaskStatus> data = new ArrayList<ProductTaskStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskStatusResponse.Data.Length"); i++) {
			ProductTaskStatus productTaskStatus = new ProductTaskStatus();
			productTaskStatus.setProduct(_ctx.stringValue("GetTaskStatusResponse.Data["+ i +"].Product"));
			productTaskStatus.setCheckTaskStatus(_ctx.stringValue("GetTaskStatusResponse.Data["+ i +"].CheckTaskStatus"));
			productTaskStatus.setCheckTaskDoingCount(_ctx.integerValue("GetTaskStatusResponse.Data["+ i +"].CheckTaskDoingCount"));
			productTaskStatus.setCheckTaskFailedCount(_ctx.integerValue("GetTaskStatusResponse.Data["+ i +"].CheckTaskFailedCount"));
			productTaskStatus.setCheckTaskDoneCount(_ctx.integerValue("GetTaskStatusResponse.Data["+ i +"].CheckTaskDoneCount"));
			productTaskStatus.setResourceSyncTaskStatus(_ctx.stringValue("GetTaskStatusResponse.Data["+ i +"].ResourceSyncTaskStatus"));

			data.add(productTaskStatus);
		}
		getTaskStatusResponse.setData(data);
	 
	 	return getTaskStatusResponse;
	}
}