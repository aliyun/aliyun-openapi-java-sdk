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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListAppUsageRangeResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListAppUsageRangeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppUsageRangeResponseUnmarshaller {

	public static ListAppUsageRangeResponse unmarshall(ListAppUsageRangeResponse listAppUsageRangeResponse, UnmarshallerContext _ctx) {
		
		listAppUsageRangeResponse.setRequestId(_ctx.stringValue("ListAppUsageRangeResponse.RequestId"));

		Data data = new Data();

		List<String> usageRangeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppUsageRangeResponse.Data.UsageRangeList.Length"); i++) {
			usageRangeList.add(_ctx.stringValue("ListAppUsageRangeResponse.Data.UsageRangeList["+ i +"]"));
		}
		data.setUsageRangeList(usageRangeList);
		listAppUsageRangeResponse.setData(data);
	 
	 	return listAppUsageRangeResponse;
	}
}