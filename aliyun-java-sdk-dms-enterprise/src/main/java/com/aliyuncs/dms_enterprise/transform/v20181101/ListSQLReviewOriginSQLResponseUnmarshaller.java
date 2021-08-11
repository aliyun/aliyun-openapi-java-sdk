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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListSQLReviewOriginSQLResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSQLReviewOriginSQLResponse.OriginSQLListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSQLReviewOriginSQLResponseUnmarshaller {

	public static ListSQLReviewOriginSQLResponse unmarshall(ListSQLReviewOriginSQLResponse listSQLReviewOriginSQLResponse, UnmarshallerContext _ctx) {
		
		listSQLReviewOriginSQLResponse.setRequestId(_ctx.stringValue("ListSQLReviewOriginSQLResponse.RequestId"));
		listSQLReviewOriginSQLResponse.setErrorCode(_ctx.stringValue("ListSQLReviewOriginSQLResponse.ErrorCode"));
		listSQLReviewOriginSQLResponse.setErrorMessage(_ctx.stringValue("ListSQLReviewOriginSQLResponse.ErrorMessage"));
		listSQLReviewOriginSQLResponse.setSuccess(_ctx.booleanValue("ListSQLReviewOriginSQLResponse.Success"));
		listSQLReviewOriginSQLResponse.setTotalCount(_ctx.integerValue("ListSQLReviewOriginSQLResponse.TotalCount"));

		List<OriginSQLListItem> originSQLList = new ArrayList<OriginSQLListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSQLReviewOriginSQLResponse.OriginSQLList.Length"); i++) {
			OriginSQLListItem originSQLListItem = new OriginSQLListItem();
			originSQLListItem.setSQLId(_ctx.longValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].SQLId"));
			originSQLListItem.setFileId(_ctx.longValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].FileId"));
			originSQLListItem.setFileName(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].FileName"));
			originSQLListItem.setSQLContent(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].SQLContent"));
			originSQLListItem.setCheckStatus(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].CheckStatus"));
			originSQLListItem.setStatusDesc(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].StatusDesc"));
			originSQLListItem.setCheckedTime(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].CheckedTime"));
			originSQLListItem.setSqlHash(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].SqlHash"));
			originSQLListItem.setReviewSummary(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].ReviewSummary"));
			originSQLListItem.setSQLReviewQueryKey(_ctx.stringValue("ListSQLReviewOriginSQLResponse.OriginSQLList["+ i +"].SQLReviewQueryKey"));

			originSQLList.add(originSQLListItem);
		}
		listSQLReviewOriginSQLResponse.setOriginSQLList(originSQLList);
	 
	 	return listSQLReviewOriginSQLResponse;
	}
}