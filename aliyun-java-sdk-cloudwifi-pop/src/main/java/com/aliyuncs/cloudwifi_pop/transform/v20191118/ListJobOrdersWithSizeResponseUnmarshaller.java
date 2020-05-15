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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwifi_pop.model.v20191118.ListJobOrdersWithSizeResponse;
import com.aliyuncs.cloudwifi_pop.model.v20191118.ListJobOrdersWithSizeResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobOrdersWithSizeResponseUnmarshaller {

	public static ListJobOrdersWithSizeResponse unmarshall(ListJobOrdersWithSizeResponse listJobOrdersWithSizeResponse, UnmarshallerContext _ctx) {
		
		listJobOrdersWithSizeResponse.setRequestId(_ctx.stringValue("ListJobOrdersWithSizeResponse.RequestId"));
		listJobOrdersWithSizeResponse.setIsSuccess(_ctx.booleanValue("ListJobOrdersWithSizeResponse.IsSuccess"));
		listJobOrdersWithSizeResponse.setErrorCode(_ctx.integerValue("ListJobOrdersWithSizeResponse.ErrorCode"));
		listJobOrdersWithSizeResponse.setErrorMessage(_ctx.stringValue("ListJobOrdersWithSizeResponse.ErrorMessage"));

		Data data = new Data();
		data.setCount(_ctx.longValue("ListJobOrdersWithSizeResponse.Data.Count"));

		List<Map<Object, Object>> data1 = _ctx.listMapValue("ListJobOrdersWithSizeResponse.Data.Data");
		data.setData1(data1);
		listJobOrdersWithSizeResponse.setData(data);
	 
	 	return listJobOrdersWithSizeResponse;
	}
}