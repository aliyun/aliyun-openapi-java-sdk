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

import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelBatchFailedResultResponse;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeLabelBatchFailedResultResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoundCodeLabelBatchFailedResultResponseUnmarshaller {

	public static QuerySoundCodeLabelBatchFailedResultResponse unmarshall(QuerySoundCodeLabelBatchFailedResultResponse querySoundCodeLabelBatchFailedResultResponse, UnmarshallerContext _ctx) {
		
		querySoundCodeLabelBatchFailedResultResponse.setRequestId(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.RequestId"));
		querySoundCodeLabelBatchFailedResultResponse.setSuccess(_ctx.booleanValue("QuerySoundCodeLabelBatchFailedResultResponse.Success"));
		querySoundCodeLabelBatchFailedResultResponse.setCode(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.Code"));
		querySoundCodeLabelBatchFailedResultResponse.setErrorMessage(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.ErrorMessage"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySoundCodeLabelBatchFailedResultResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setResultCode(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.Data["+ i +"].ResultCode"));
			items.setLabel(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.Data["+ i +"].Label"));
			items.setErrorMessage(_ctx.stringValue("QuerySoundCodeLabelBatchFailedResultResponse.Data["+ i +"].ErrorMessage"));

			data.add(items);
		}
		querySoundCodeLabelBatchFailedResultResponse.setData(data);
	 
	 	return querySoundCodeLabelBatchFailedResultResponse;
	}
}