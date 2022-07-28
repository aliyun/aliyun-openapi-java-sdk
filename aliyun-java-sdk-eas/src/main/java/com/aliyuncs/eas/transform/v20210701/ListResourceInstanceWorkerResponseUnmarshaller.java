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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListResourceInstanceWorkerResponse;
import com.aliyuncs.eas.model.v20210701.ListResourceInstanceWorkerResponse.PodsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceInstanceWorkerResponseUnmarshaller {

	public static ListResourceInstanceWorkerResponse unmarshall(ListResourceInstanceWorkerResponse listResourceInstanceWorkerResponse, UnmarshallerContext _ctx) {
		
		listResourceInstanceWorkerResponse.setRequestId(_ctx.stringValue("ListResourceInstanceWorkerResponse.RequestId"));
		listResourceInstanceWorkerResponse.setPageNumber(_ctx.integerValue("ListResourceInstanceWorkerResponse.PageNumber"));
		listResourceInstanceWorkerResponse.setPageSize(_ctx.integerValue("ListResourceInstanceWorkerResponse.PageSize"));
		listResourceInstanceWorkerResponse.setTotalCount(_ctx.integerValue("ListResourceInstanceWorkerResponse.TotalCount"));

		List<PodsItem> pods = new ArrayList<PodsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceInstanceWorkerResponse.Pods.Length"); i++) {
			PodsItem podsItem = new PodsItem();
			podsItem.setName(_ctx.stringValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].Name"));
			podsItem.setServiceName(_ctx.stringValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].ServiceName"));
			podsItem.setStatus(_ctx.stringValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].Status"));
			podsItem.setReady(_ctx.booleanValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].Ready"));
			podsItem.setCpuRequest(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].CpuRequest"));
			podsItem.setGpuRequest(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].GpuRequest"));
			podsItem.setMemoryRquest(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].MemoryRquest"));
			podsItem.setCpuLimit(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].CpuLimit"));
			podsItem.setGpuLimit(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].GpuLimit"));
			podsItem.setMemoryLimit(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].MemoryLimit"));
			podsItem.setRestartCount(_ctx.integerValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].RestartCount"));
			podsItem.setStartTime(_ctx.stringValue("ListResourceInstanceWorkerResponse.Pods["+ i +"].StartTime"));

			pods.add(podsItem);
		}
		listResourceInstanceWorkerResponse.setPods(pods);
	 
	 	return listResourceInstanceWorkerResponse;
	}
}