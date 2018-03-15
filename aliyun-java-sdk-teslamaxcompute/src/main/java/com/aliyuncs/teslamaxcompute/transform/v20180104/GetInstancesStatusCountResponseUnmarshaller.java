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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.GetInstancesStatusCountResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetInstancesStatusCountResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstancesStatusCountResponseUnmarshaller {

	public static GetInstancesStatusCountResponse unmarshall(GetInstancesStatusCountResponse getInstancesStatusCountResponse, UnmarshallerContext context) {
		
		getInstancesStatusCountResponse.setRequestId(context.stringValue("GetInstancesStatusCountResponse.RequestId"));
		getInstancesStatusCountResponse.setCode(context.integerValue("GetInstancesStatusCountResponse.Code"));
		getInstancesStatusCountResponse.setMessage(context.stringValue("GetInstancesStatusCountResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("GetInstancesStatusCountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(context.stringValue("GetInstancesStatusCountResponse.Data["+ i +"].Status"));
			dataItem.setSize(context.integerValue("GetInstancesStatusCountResponse.Data["+ i +"].Size"));

			data.add(dataItem);
		}
		getInstancesStatusCountResponse.setData(data);
	 
	 	return getInstancesStatusCountResponse;
	}
}