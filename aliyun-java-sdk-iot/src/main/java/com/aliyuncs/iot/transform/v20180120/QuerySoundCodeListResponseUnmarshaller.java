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

import com.aliyuncs.iot.model.v20180120.QuerySoundCodeListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoundCodeListResponseUnmarshaller {

	public static QuerySoundCodeListResponse unmarshall(QuerySoundCodeListResponse querySoundCodeListResponse, UnmarshallerContext _ctx) {
		
		querySoundCodeListResponse.setRequestId(_ctx.stringValue("QuerySoundCodeListResponse.RequestId"));
		querySoundCodeListResponse.setSuccess(_ctx.booleanValue("QuerySoundCodeListResponse.Success"));
		querySoundCodeListResponse.setCode(_ctx.stringValue("QuerySoundCodeListResponse.Code"));
		querySoundCodeListResponse.setErrorMessage(_ctx.stringValue("QuerySoundCodeListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySoundCodeListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySoundCodeListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySoundCodeListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySoundCodeListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setSoundCode(_ctx.stringValue("QuerySoundCodeListResponse.Data.List["+ i +"].SoundCode"));
			items.setSoundCodeContent(_ctx.stringValue("QuerySoundCodeListResponse.Data.List["+ i +"].SoundCodeContent"));
			items.setDuration(_ctx.integerValue("QuerySoundCodeListResponse.Data.List["+ i +"].Duration"));
			items.setGmtCreate(_ctx.longValue("QuerySoundCodeListResponse.Data.List["+ i +"].GmtCreate"));
			items.setOpenType(_ctx.stringValue("QuerySoundCodeListResponse.Data.List["+ i +"].OpenType"));
			items.setName(_ctx.stringValue("QuerySoundCodeListResponse.Data.List["+ i +"].Name"));

			list.add(items);
		}
		data.setList(list);
		querySoundCodeListResponse.setData(data);
	 
	 	return querySoundCodeListResponse;
	}
}