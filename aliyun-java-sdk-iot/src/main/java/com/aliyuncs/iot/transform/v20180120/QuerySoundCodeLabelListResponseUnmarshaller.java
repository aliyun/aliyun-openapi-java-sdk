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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoundCodeLabelListResponseUnmarshaller {

	public static QuerySoundCodeLabelListResponse unmarshall(QuerySoundCodeLabelListResponse querySoundCodeLabelListResponse, UnmarshallerContext _ctx) {
		
		querySoundCodeLabelListResponse.setRequestId(_ctx.stringValue("QuerySoundCodeLabelListResponse.RequestId"));
		querySoundCodeLabelListResponse.setSuccess(_ctx.booleanValue("QuerySoundCodeLabelListResponse.Success"));
		querySoundCodeLabelListResponse.setCode(_ctx.stringValue("QuerySoundCodeLabelListResponse.Code"));
		querySoundCodeLabelListResponse.setErrorMessage(_ctx.stringValue("QuerySoundCodeLabelListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySoundCodeLabelListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySoundCodeLabelListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySoundCodeLabelListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySoundCodeLabelListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setSoundCode(_ctx.stringValue("QuerySoundCodeLabelListResponse.Data.List["+ i +"].SoundCode"));
			items.setLabel(_ctx.stringValue("QuerySoundCodeLabelListResponse.Data.List["+ i +"].Label"));

			list.add(items);
		}
		data.setList(list);
		querySoundCodeLabelListResponse.setData(data);
	 
	 	return querySoundCodeLabelListResponse;
	}
}