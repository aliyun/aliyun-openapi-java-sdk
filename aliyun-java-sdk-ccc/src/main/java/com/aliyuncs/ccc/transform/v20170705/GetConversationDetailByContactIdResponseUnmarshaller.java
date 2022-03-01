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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetConversationDetailByContactIdResponse;
import com.aliyuncs.ccc.model.v20170705.GetConversationDetailByContactIdResponse.DataList;
import com.aliyuncs.ccc.model.v20170705.GetConversationDetailByContactIdResponse.DataList.QualityCheckPhrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConversationDetailByContactIdResponseUnmarshaller {

	public static GetConversationDetailByContactIdResponse unmarshall(GetConversationDetailByContactIdResponse getConversationDetailByContactIdResponse, UnmarshallerContext _ctx) {
		
		getConversationDetailByContactIdResponse.setRequestId(_ctx.stringValue("GetConversationDetailByContactIdResponse.RequestId"));
		getConversationDetailByContactIdResponse.setHttpStatusCode(_ctx.integerValue("GetConversationDetailByContactIdResponse.HttpStatusCode"));
		getConversationDetailByContactIdResponse.setCode(_ctx.stringValue("GetConversationDetailByContactIdResponse.Code"));
		getConversationDetailByContactIdResponse.setMessage(_ctx.stringValue("GetConversationDetailByContactIdResponse.Message"));
		getConversationDetailByContactIdResponse.setSuccess(_ctx.booleanValue("GetConversationDetailByContactIdResponse.Success"));

		DataList dataList = new DataList();
		dataList.setPageNumber(_ctx.integerValue("GetConversationDetailByContactIdResponse.DataList.PageNumber"));
		dataList.setPageSize(_ctx.integerValue("GetConversationDetailByContactIdResponse.DataList.PageSize"));
		dataList.setTotalCount(_ctx.integerValue("GetConversationDetailByContactIdResponse.DataList.TotalCount"));

		List<QualityCheckPhrase> list = new ArrayList<QualityCheckPhrase>();
		for (int i = 0; i < _ctx.lengthValue("GetConversationDetailByContactIdResponse.DataList.List.Length"); i++) {
			QualityCheckPhrase qualityCheckPhrase = new QualityCheckPhrase();
			qualityCheckPhrase.setEnd(_ctx.longValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].End"));
			qualityCheckPhrase.setWords(_ctx.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Words"));
			qualityCheckPhrase.setRole(_ctx.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Role"));
			qualityCheckPhrase.setBegin(_ctx.longValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Begin"));
			qualityCheckPhrase.setIdentity(_ctx.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Identity"));

			list.add(qualityCheckPhrase);
		}
		dataList.setList(list);
		getConversationDetailByContactIdResponse.setDataList(dataList);
	 
	 	return getConversationDetailByContactIdResponse;
	}
}