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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetOutbounNumListResponse;
import com.aliyuncs.aiccs.model.v20191015.GetOutbounNumListResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetOutbounNumListResponse.Data.NumGroupItem;
import com.aliyuncs.aiccs.model.v20191015.GetOutbounNumListResponse.Data.NumItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOutbounNumListResponseUnmarshaller {

	public static GetOutbounNumListResponse unmarshall(GetOutbounNumListResponse getOutbounNumListResponse, UnmarshallerContext _ctx) {
		
		getOutbounNumListResponse.setRequestId(_ctx.stringValue("GetOutbounNumListResponse.RequestId"));
		getOutbounNumListResponse.setSuccess(_ctx.booleanValue("GetOutbounNumListResponse.Success"));
		getOutbounNumListResponse.setCode(_ctx.stringValue("GetOutbounNumListResponse.Code"));
		getOutbounNumListResponse.setMessage(_ctx.stringValue("GetOutbounNumListResponse.Message"));

		Data data = new Data();

		List<NumItem> num = new ArrayList<NumItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOutbounNumListResponse.Data.Num.Length"); i++) {
			NumItem numItem = new NumItem();
			numItem.setType(_ctx.integerValue("GetOutbounNumListResponse.Data.Num["+ i +"].Type"));
			numItem.setValue(_ctx.stringValue("GetOutbounNumListResponse.Data.Num["+ i +"].Value"));
			numItem.setDescription(_ctx.stringValue("GetOutbounNumListResponse.Data.Num["+ i +"].Description"));

			num.add(numItem);
		}
		data.setNum(num);

		List<NumGroupItem> numGroup = new ArrayList<NumGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOutbounNumListResponse.Data.NumGroup.Length"); i++) {
			NumGroupItem numGroupItem = new NumGroupItem();
			numGroupItem.setType(_ctx.integerValue("GetOutbounNumListResponse.Data.NumGroup["+ i +"].Type"));
			numGroupItem.setValue(_ctx.stringValue("GetOutbounNumListResponse.Data.NumGroup["+ i +"].Value"));
			numGroupItem.setDescription(_ctx.stringValue("GetOutbounNumListResponse.Data.NumGroup["+ i +"].Description"));

			numGroup.add(numGroupItem);
		}
		data.setNumGroup(numGroup);
		getOutbounNumListResponse.setData(data);
	 
	 	return getOutbounNumListResponse;
	}
}