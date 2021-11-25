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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetUserPatentStatisticsStatusResponse;
import com.aliyuncs.copyright.model.v20190123.GetUserPatentStatisticsStatusResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserPatentStatisticsStatusResponseUnmarshaller {

	public static GetUserPatentStatisticsStatusResponse unmarshall(GetUserPatentStatisticsStatusResponse getUserPatentStatisticsStatusResponse, UnmarshallerContext _ctx) {
		
		getUserPatentStatisticsStatusResponse.setRequestId(_ctx.stringValue("GetUserPatentStatisticsStatusResponse.RequestId"));
		getUserPatentStatisticsStatusResponse.setSuccess(_ctx.booleanValue("GetUserPatentStatisticsStatusResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserPatentStatisticsStatusResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.integerValue("GetUserPatentStatisticsStatusResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		getUserPatentStatisticsStatusResponse.setData(data);
	 
	 	return getUserPatentStatisticsStatusResponse;
	}
}