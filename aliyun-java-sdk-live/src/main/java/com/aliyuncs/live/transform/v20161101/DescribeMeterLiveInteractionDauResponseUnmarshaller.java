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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeMeterLiveInteractionDauResponse;
import com.aliyuncs.live.model.v20161101.DescribeMeterLiveInteractionDauResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMeterLiveInteractionDauResponseUnmarshaller {

	public static DescribeMeterLiveInteractionDauResponse unmarshall(DescribeMeterLiveInteractionDauResponse describeMeterLiveInteractionDauResponse, UnmarshallerContext _ctx) {
		
		describeMeterLiveInteractionDauResponse.setRequestId(_ctx.stringValue("DescribeMeterLiveInteractionDauResponse.RequestId"));
		describeMeterLiveInteractionDauResponse.setPeakDau(_ctx.doubleValue("DescribeMeterLiveInteractionDauResponse.PeakDau"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMeterLiveInteractionDauResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.longValue("DescribeMeterLiveInteractionDauResponse.Data["+ i +"].Timestamp"));
			dataItem.setDau(_ctx.doubleValue("DescribeMeterLiveInteractionDauResponse.Data["+ i +"].Dau"));

			data.add(dataItem);
		}
		describeMeterLiveInteractionDauResponse.setData(data);
	 
	 	return describeMeterLiveInteractionDauResponse;
	}
}