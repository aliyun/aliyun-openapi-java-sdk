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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListWarningStrategyConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListWarningStrategyConfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWarningStrategyConfigResponseUnmarshaller {

	public static ListWarningStrategyConfigResponse unmarshall(ListWarningStrategyConfigResponse listWarningStrategyConfigResponse, UnmarshallerContext _ctx) {
		
		listWarningStrategyConfigResponse.setRequestId(_ctx.stringValue("ListWarningStrategyConfigResponse.RequestId"));
		listWarningStrategyConfigResponse.setMessage(_ctx.stringValue("ListWarningStrategyConfigResponse.Message"));
		listWarningStrategyConfigResponse.setCode(_ctx.stringValue("ListWarningStrategyConfigResponse.Code"));
		listWarningStrategyConfigResponse.setSuccess(_ctx.booleanValue("ListWarningStrategyConfigResponse.Success"));
		listWarningStrategyConfigResponse.setCount(_ctx.integerValue("ListWarningStrategyConfigResponse.Count"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWarningStrategyConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListWarningStrategyConfigResponse.Data["+ i +"].Id"));
			dataItem.setIntervalTime(_ctx.longValue("ListWarningStrategyConfigResponse.Data["+ i +"].IntervalTime"));
			dataItem.setLambda(_ctx.stringValue("ListWarningStrategyConfigResponse.Data["+ i +"].Lambda"));
			dataItem.setLevel(_ctx.longValue("ListWarningStrategyConfigResponse.Data["+ i +"].Level"));
			dataItem.setMaxNumber(_ctx.longValue("ListWarningStrategyConfigResponse.Data["+ i +"].MaxNumber"));
			dataItem.setName(_ctx.stringValue("ListWarningStrategyConfigResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		listWarningStrategyConfigResponse.setData(data);
	 
	 	return listWarningStrategyConfigResponse;
	}
}