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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetAKSPlanStatesResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSPlanStatesResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.GetAKSPlanStatesResponse.DataItem.Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSPlanStatesResponseUnmarshaller {

	public static GetAKSPlanStatesResponse unmarshall(GetAKSPlanStatesResponse getAKSPlanStatesResponse, UnmarshallerContext _ctx) {
		
		getAKSPlanStatesResponse.setRequestId(_ctx.stringValue("GetAKSPlanStatesResponse.RequestId"));
		getAKSPlanStatesResponse.setResultCode(_ctx.stringValue("GetAKSPlanStatesResponse.ResultCode"));
		getAKSPlanStatesResponse.setResultMessage(_ctx.stringValue("GetAKSPlanStatesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSPlanStatesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("GetAKSPlanStatesResponse.Data["+ i +"].Key"));

			Value value = new Value();
			value.setCount(_ctx.longValue("GetAKSPlanStatesResponse.Data["+ i +"].Value.Count"));
			value.setState(_ctx.stringValue("GetAKSPlanStatesResponse.Data["+ i +"].Value.State"));
			dataItem.setValue(value);

			data.add(dataItem);
		}
		getAKSPlanStatesResponse.setData(data);
	 
	 	return getAKSPlanStatesResponse;
	}
}