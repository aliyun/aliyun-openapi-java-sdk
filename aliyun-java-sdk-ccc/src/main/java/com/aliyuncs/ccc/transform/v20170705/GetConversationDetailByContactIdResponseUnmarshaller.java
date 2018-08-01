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

	public static GetConversationDetailByContactIdResponse unmarshall(GetConversationDetailByContactIdResponse getConversationDetailByContactIdResponse, UnmarshallerContext context) {
		
		getConversationDetailByContactIdResponse.setRequestId(context.stringValue("GetConversationDetailByContactIdResponse.RequestId"));
		getConversationDetailByContactIdResponse.setSuccess(context.booleanValue("GetConversationDetailByContactIdResponse.Success"));
		getConversationDetailByContactIdResponse.setCode(context.stringValue("GetConversationDetailByContactIdResponse.Code"));
		getConversationDetailByContactIdResponse.setMessage(context.stringValue("GetConversationDetailByContactIdResponse.Message"));
		getConversationDetailByContactIdResponse.setHttpStatusCode(context.integerValue("GetConversationDetailByContactIdResponse.HttpStatusCode"));

		DataList dataList = new DataList();
		dataList.setTotalCount(context.integerValue("GetConversationDetailByContactIdResponse.DataList.TotalCount"));
		dataList.setPageNumber(context.integerValue("GetConversationDetailByContactIdResponse.DataList.PageNumber"));
		dataList.setPageSize(context.integerValue("GetConversationDetailByContactIdResponse.DataList.PageSize"));

		List<QualityCheckPhrase> list = new ArrayList<QualityCheckPhrase>();
		for (int i = 0; i < context.lengthValue("GetConversationDetailByContactIdResponse.DataList.List.Length"); i++) {
			QualityCheckPhrase qualityCheckPhrase = new QualityCheckPhrase();
			qualityCheckPhrase.setIdentity(context.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Identity"));
			qualityCheckPhrase.setRole(context.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Role"));
			qualityCheckPhrase.setWords(context.stringValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Words"));
			qualityCheckPhrase.setBegin(context.longValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].Begin"));
			qualityCheckPhrase.setEnd(context.longValue("GetConversationDetailByContactIdResponse.DataList.List["+ i +"].End"));

			list.add(qualityCheckPhrase);
		}
		dataList.setList(list);
		getConversationDetailByContactIdResponse.setDataList(dataList);
	 
	 	return getConversationDetailByContactIdResponse;
	}
}