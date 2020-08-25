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

import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeLinktSimpleprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeLinktSimpleprojectsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryLinkeLinktSimpleprojectsResponseUnmarshaller {

	public static BatchqueryLinkeLinktSimpleprojectsResponse unmarshall(BatchqueryLinkeLinktSimpleprojectsResponse batchqueryLinkeLinktSimpleprojectsResponse, UnmarshallerContext _ctx) {
		
		batchqueryLinkeLinktSimpleprojectsResponse.setRequestId(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.RequestId"));
		batchqueryLinkeLinktSimpleprojectsResponse.setResultCode(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.ResultCode"));
		batchqueryLinkeLinktSimpleprojectsResponse.setResultMessage(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.ResultMessage"));
		batchqueryLinkeLinktSimpleprojectsResponse.setErrorCode(_ctx.longValue("BatchqueryLinkeLinktSimpleprojectsResponse.ErrorCode"));
		batchqueryLinkeLinktSimpleprojectsResponse.setErrorMessage(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.ErrorMessage"));
		batchqueryLinkeLinktSimpleprojectsResponse.setResponseStatusCode(_ctx.longValue("BatchqueryLinkeLinktSimpleprojectsResponse.ResponseStatusCode"));
		batchqueryLinkeLinktSimpleprojectsResponse.setSuccess(_ctx.booleanValue("BatchqueryLinkeLinktSimpleprojectsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setArchive(_ctx.booleanValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Archive"));
			dataItem.setAsPublic(_ctx.booleanValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].AsPublic"));
			dataItem.setCreatedAt(_ctx.longValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Id"));
			dataItem.setLink(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Link"));
			dataItem.setName(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Name"));
			dataItem.setParentSign(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].ParentSign"));
			dataItem.setSign(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].SignPath"));
			dataItem.setUpdatedAt(_ctx.longValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setUrl(_ctx.stringValue("BatchqueryLinkeLinktSimpleprojectsResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		batchqueryLinkeLinktSimpleprojectsResponse.setData(data);
	 
	 	return batchqueryLinkeLinktSimpleprojectsResponse;
	}
}