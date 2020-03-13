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

import com.aliyuncs.sofa.model.v20190815.GetDTXAppsBiztypeResponse;
import com.aliyuncs.sofa.model.v20190815.GetDTXAppsBiztypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDTXAppsBiztypeResponseUnmarshaller {

	public static GetDTXAppsBiztypeResponse unmarshall(GetDTXAppsBiztypeResponse getDTXAppsBiztypeResponse, UnmarshallerContext _ctx) {
		
		getDTXAppsBiztypeResponse.setRequestId(_ctx.stringValue("GetDTXAppsBiztypeResponse.RequestId"));
		getDTXAppsBiztypeResponse.setResultCode(_ctx.stringValue("GetDTXAppsBiztypeResponse.ResultCode"));
		getDTXAppsBiztypeResponse.setResultMessage(_ctx.stringValue("GetDTXAppsBiztypeResponse.ResultMessage"));
		getDTXAppsBiztypeResponse.setAppName(_ctx.stringValue("GetDTXAppsBiztypeResponse.AppName"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDTXAppsBiztypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActionMode(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].ActionMode"));
			dataItem.setActionName(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].ActionName"));
			dataItem.setAppName(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].AppName"));
			dataItem.setCommit(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].Commit"));
			dataItem.setRollback(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].Rollback"));
			dataItem.setWsTr(_ctx.stringValue("GetDTXAppsBiztypeResponse.Data["+ i +"].WsTr"));

			data.add(dataItem);
		}
		getDTXAppsBiztypeResponse.setData(data);
	 
	 	return getDTXAppsBiztypeResponse;
	}
}