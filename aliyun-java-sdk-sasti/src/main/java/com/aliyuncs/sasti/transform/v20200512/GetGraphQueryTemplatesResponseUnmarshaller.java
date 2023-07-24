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

package com.aliyuncs.sasti.transform.v20200512;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sasti.model.v20200512.GetGraphQueryTemplatesResponse;
import com.aliyuncs.sasti.model.v20200512.GetGraphQueryTemplatesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGraphQueryTemplatesResponseUnmarshaller {

	public static GetGraphQueryTemplatesResponse unmarshall(GetGraphQueryTemplatesResponse getGraphQueryTemplatesResponse, UnmarshallerContext _ctx) {
		
		getGraphQueryTemplatesResponse.setRequestId(_ctx.stringValue("GetGraphQueryTemplatesResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGraphQueryTemplatesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("GetGraphQueryTemplatesResponse.Data["+ i +"].Id"));
			dataItem.setGmtCreate(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].GmtModified"));
			dataItem.setScenario(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].Scenario"));
			dataItem.setGremlinTemplate(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].GremlinTemplate"));
			dataItem.setLastModifier(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].LastModifier"));
			dataItem.setStatus(_ctx.integerValue("GetGraphQueryTemplatesResponse.Data["+ i +"].Status"));
			dataItem.setScenarioDesc(_ctx.stringValue("GetGraphQueryTemplatesResponse.Data["+ i +"].ScenarioDesc"));

			data.add(dataItem);
		}
		getGraphQueryTemplatesResponse.setData(data);
	 
	 	return getGraphQueryTemplatesResponse;
	}
}