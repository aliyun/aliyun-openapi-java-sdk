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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktRelatedlinkeiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktRelatedlinkeiterationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktRelatedlinkeiterationsResponseUnmarshaller {

	public static ListLinkeLinktRelatedlinkeiterationsResponse unmarshall(ListLinkeLinktRelatedlinkeiterationsResponse listLinkeLinktRelatedlinkeiterationsResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktRelatedlinkeiterationsResponse.setRequestId(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.RequestId"));
		listLinkeLinktRelatedlinkeiterationsResponse.setResultCode(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.ResultCode"));
		listLinkeLinktRelatedlinkeiterationsResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.ResultMessage"));
		listLinkeLinktRelatedlinkeiterationsResponse.setErrorCode(_ctx.longValue("ListLinkeLinktRelatedlinkeiterationsResponse.ErrorCode"));
		listLinkeLinktRelatedlinkeiterationsResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.ErrorMessage"));
		listLinkeLinktRelatedlinkeiterationsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktRelatedlinkeiterationsResponse.ResponseStatusCode"));
		listLinkeLinktRelatedlinkeiterationsResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktRelatedlinkeiterationsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktRelatedlinkeiterationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.Data["+ i +"].Key"));
			dataItem.setLabel(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.Data["+ i +"].Label"));
			dataItem.setUrl(_ctx.stringValue("ListLinkeLinktRelatedlinkeiterationsResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		listLinkeLinktRelatedlinkeiterationsResponse.setData(data);
	 
	 	return listLinkeLinktRelatedlinkeiterationsResponse;
	}
}