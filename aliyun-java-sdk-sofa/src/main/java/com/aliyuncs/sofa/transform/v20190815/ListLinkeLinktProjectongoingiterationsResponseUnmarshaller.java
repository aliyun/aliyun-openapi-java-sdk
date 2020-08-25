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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectongoingiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectongoingiterationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktProjectongoingiterationsResponseUnmarshaller {

	public static ListLinkeLinktProjectongoingiterationsResponse unmarshall(ListLinkeLinktProjectongoingiterationsResponse listLinkeLinktProjectongoingiterationsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktProjectongoingiterationsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.RequestId"));
		listLinkeLinktProjectongoingiterationsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.ResultCode"));
		listLinkeLinktProjectongoingiterationsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.ResultMessage"));
		listLinkeLinktProjectongoingiterationsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.ErrorCode"));
		listLinkeLinktProjectongoingiterationsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.ErrorMessage"));
		listLinkeLinktProjectongoingiterationsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.ResponseStatusCode"));
		listLinkeLinktProjectongoingiterationsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktProjectongoingiterationsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktProjectongoingiterationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBeginDate(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].BeginDate"));
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Deleted"));
			dataItem.setEndDate(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].EndDate"));
			dataItem.setFinishWorkItem(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].FinishWorkItem"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Id"));
			dataItem.setLocked(_ctx.booleanValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Locked"));
			dataItem.setModifier(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Modifier"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Name"));
			dataItem.setOwner(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Owner"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setSign(_ctx.stringValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].Sign"));
			dataItem.setTotalWorkItem(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].TotalWorkItem"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktProjectongoingiterationsResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		listLinkeLinktProjectongoingiterationsResponse.setData(data);
	 
	 	return listLinkeLinktProjectongoingiterationsResponse;
	}
}