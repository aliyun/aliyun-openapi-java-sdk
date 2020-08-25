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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktUnmatchedstatusbetweentemplateResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktUnmatchedstatusbetweentemplateResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktUnmatchedstatusbetweentemplateResponseUnmarshaller {

	public static ListLinkeLinktUnmatchedstatusbetweentemplateResponse unmarshall(ListLinkeLinktUnmatchedstatusbetweentemplateResponse listLinkeLinktUnmatchedstatusbetweentemplateResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setRequestId(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.RequestId"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setResultCode(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.ResultCode"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.ResultMessage"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setErrorCode(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.ErrorCode"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.ErrorMessage"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.ResponseStatusCode"));
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktUnmatchedstatusbetweentemplateResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		listLinkeLinktUnmatchedstatusbetweentemplateResponse.setData(data);
	 
	 	return listLinkeLinktUnmatchedstatusbetweentemplateResponse;
	}
}