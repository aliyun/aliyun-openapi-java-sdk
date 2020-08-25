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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktOperationlogsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktOperationlogsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktOperationlogsResponseUnmarshaller {

	public static ListLinkeLinktOperationlogsResponse unmarshall(ListLinkeLinktOperationlogsResponse listLinkeLinktOperationlogsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktOperationlogsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.RequestId"));
		listLinkeLinktOperationlogsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.ResultCode"));
		listLinkeLinktOperationlogsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.ResultMessage"));
		listLinkeLinktOperationlogsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktOperationlogsResponse.ErrorCode"));
		listLinkeLinktOperationlogsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.ErrorMessage"));
		listLinkeLinktOperationlogsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktOperationlogsResponse.ResponseStatusCode"));
		listLinkeLinktOperationlogsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktOperationlogsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktOperationlogsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCurrentValue(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].CurrentValue"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].Deleted"));
			dataItem.setDisplayContent(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].DisplayContent"));
			dataItem.setFieldName(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].FieldName"));
			dataItem.setFieldType(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].FieldType"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].Id"));
			dataItem.setLastValue(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].LastValue"));
			dataItem.setOperationType(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].OperationType"));
			dataItem.setOperator(_ctx.stringValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].Operator"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktOperationlogsResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		listLinkeLinktOperationlogsResponse.setData(data);
	 
	 	return listLinkeLinktOperationlogsResponse;
	}
}