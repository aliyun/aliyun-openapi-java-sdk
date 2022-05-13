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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeFotaTasksResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeFotaTasksResponse.FotaTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFotaTasksResponseUnmarshaller {

	public static DescribeFotaTasksResponse unmarshall(DescribeFotaTasksResponse describeFotaTasksResponse, UnmarshallerContext _ctx) {
		
		describeFotaTasksResponse.setRequestId(_ctx.stringValue("DescribeFotaTasksResponse.RequestId"));

		List<FotaTask> fotaTasks = new ArrayList<FotaTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFotaTasksResponse.FotaTasks.Length"); i++) {
			FotaTask fotaTask = new FotaTask();
			fotaTask.setTaskUid(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].TaskUid"));
			fotaTask.setFotaProject(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].FotaProject"));
			fotaTask.setAppVersion(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].AppVersion"));
			fotaTask.setStatus(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].Status"));
			fotaTask.setPublishTime(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].PublishTime"));
			fotaTask.setPendingDesktopCount(_ctx.integerValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].PendingDesktopCount"));
			fotaTask.setReleaseNote(_ctx.stringValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].ReleaseNote"));
			fotaTask.setSize(_ctx.integerValue("DescribeFotaTasksResponse.FotaTasks["+ i +"].Size"));

			fotaTasks.add(fotaTask);
		}
		describeFotaTasksResponse.setFotaTasks(fotaTasks);
	 
	 	return describeFotaTasksResponse;
	}
}