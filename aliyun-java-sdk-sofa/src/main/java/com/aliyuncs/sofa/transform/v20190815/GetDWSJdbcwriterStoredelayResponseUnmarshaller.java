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

import com.aliyuncs.sofa.model.v20190815.GetDWSJdbcwriterStoredelayResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSJdbcwriterStoredelayResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSJdbcwriterStoredelayResponseUnmarshaller {

	public static GetDWSJdbcwriterStoredelayResponse unmarshall(GetDWSJdbcwriterStoredelayResponse getDWSJdbcwriterStoredelayResponse, UnmarshallerContext _ctx) {
		
		getDWSJdbcwriterStoredelayResponse.setRequestId(_ctx.stringValue("GetDWSJdbcwriterStoredelayResponse.RequestId"));
		getDWSJdbcwriterStoredelayResponse.setResultCode(_ctx.stringValue("GetDWSJdbcwriterStoredelayResponse.ResultCode"));
		getDWSJdbcwriterStoredelayResponse.setResultMessage(_ctx.stringValue("GetDWSJdbcwriterStoredelayResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSJdbcwriterStoredelayResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.longValue("GetDWSJdbcwriterStoredelayResponse.Data["+ i +"].Timestamp"));
			dataItem.setValue(_ctx.stringValue("GetDWSJdbcwriterStoredelayResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getDWSJdbcwriterStoredelayResponse.setData(data);
	 
	 	return getDWSJdbcwriterStoredelayResponse;
	}
}