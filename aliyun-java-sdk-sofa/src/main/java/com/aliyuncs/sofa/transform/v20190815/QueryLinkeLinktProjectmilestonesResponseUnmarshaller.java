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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmilestonesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmilestonesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectmilestonesResponseUnmarshaller {

	public static QueryLinkeLinktProjectmilestonesResponse unmarshall(QueryLinkeLinktProjectmilestonesResponse queryLinkeLinktProjectmilestonesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectmilestonesResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.RequestId"));
		queryLinkeLinktProjectmilestonesResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.ResultCode"));
		queryLinkeLinktProjectmilestonesResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.ResultMessage"));
		queryLinkeLinktProjectmilestonesResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.ErrorCode"));
		queryLinkeLinktProjectmilestonesResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.ErrorMessage"));
		queryLinkeLinktProjectmilestonesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.ResponseStatusCode"));
		queryLinkeLinktProjectmilestonesResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectmilestonesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectmilestonesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActualEndDate(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].ActualEndDate"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Description"));
			dataItem.setExpectEndDate(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].ExpectEndDate"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Id"));
			dataItem.setManager(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Manager"));
			dataItem.setModifier(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Modifier"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Name"));
			dataItem.setStatus(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Status"));
			dataItem.setTarget(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].Target"));
			dataItem.setTargetType(_ctx.stringValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].TargetType"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktProjectmilestonesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		queryLinkeLinktProjectmilestonesResponse.setData(data);
	 
	 	return queryLinkeLinktProjectmilestonesResponse;
	}
}