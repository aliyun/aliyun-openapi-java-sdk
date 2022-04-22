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

import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelBatchListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelBatchListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelBatchListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoundCodeLabelBatchListResponseUnmarshaller {

	public static QuerySoundCodeLabelBatchListResponse unmarshall(QuerySoundCodeLabelBatchListResponse querySoundCodeLabelBatchListResponse, UnmarshallerContext _ctx) {
		
		querySoundCodeLabelBatchListResponse.setRequestId(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.RequestId"));
		querySoundCodeLabelBatchListResponse.setSuccess(_ctx.booleanValue("QuerySoundCodeLabelBatchListResponse.Success"));
		querySoundCodeLabelBatchListResponse.setCode(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.Code"));
		querySoundCodeLabelBatchListResponse.setErrorMessage(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySoundCodeLabelBatchListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySoundCodeLabelBatchListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySoundCodeLabelBatchListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySoundCodeLabelBatchListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setBatchCode(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].BatchCode"));
			items.setDescription(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].Description"));
			items.setTotal(_ctx.integerValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].Total"));
			items.setSuccessNum(_ctx.integerValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].SuccessNum"));
			items.setStatus(_ctx.stringValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].Status"));
			items.setGmtCreate(_ctx.longValue("QuerySoundCodeLabelBatchListResponse.Data.List["+ i +"].GmtCreate"));

			list.add(items);
		}
		data.setList(list);
		querySoundCodeLabelBatchListResponse.setData(data);
	 
	 	return querySoundCodeLabelBatchListResponse;
	}
}