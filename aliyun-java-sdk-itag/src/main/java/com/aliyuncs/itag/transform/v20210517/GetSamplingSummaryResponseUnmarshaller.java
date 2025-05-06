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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.GetSamplingSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetSamplingSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetSamplingSummaryResponse.Result.PersonSummaryDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSamplingSummaryResponseUnmarshaller {

	public static GetSamplingSummaryResponse unmarshall(GetSamplingSummaryResponse getSamplingSummaryResponse, UnmarshallerContext _ctx) {
		
		getSamplingSummaryResponse.setRequestId(_ctx.stringValue("GetSamplingSummaryResponse.RequestId"));
		getSamplingSummaryResponse.setCode(_ctx.integerValue("GetSamplingSummaryResponse.Code"));
		getSamplingSummaryResponse.setMsg(_ctx.stringValue("GetSamplingSummaryResponse.Msg"));
		getSamplingSummaryResponse.setErrInfo(_ctx.stringValue("GetSamplingSummaryResponse.ErrInfo"));
		getSamplingSummaryResponse.setSucc(_ctx.booleanValue("GetSamplingSummaryResponse.Succ"));
		getSamplingSummaryResponse.setRt(_ctx.longValue("GetSamplingSummaryResponse.Rt"));
		getSamplingSummaryResponse.setHost(_ctx.stringValue("GetSamplingSummaryResponse.Host"));
		getSamplingSummaryResponse.setErrorCode(_ctx.stringValue("GetSamplingSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalSubTask(_ctx.integerValue("GetSamplingSummaryResponse.Result.TotalSubTask"));
		result.setTotalItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.TotalItem"));
		result.setActualItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.ActualItem"));
		result.setActualSubTask(_ctx.integerValue("GetSamplingSummaryResponse.Result.ActualSubTask"));
		result.setAccuracy(_ctx.floatValue("GetSamplingSummaryResponse.Result.Accuracy"));
		result.setErrorItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.ErrorItem"));
		result.setNoFixedItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.NoFixedItem"));

		List<PersonSummaryDTOListItem> personSummaryDTOList = new ArrayList<PersonSummaryDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList.Length"); i++) {
			PersonSummaryDTOListItem personSummaryDTOListItem = new PersonSummaryDTOListItem();
			personSummaryDTOListItem.setUserName(_ctx.stringValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].UserName"));
			personSummaryDTOListItem.setUserId(_ctx.stringValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].UserId"));
			personSummaryDTOListItem.setPersonTotalItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].PersonTotalItem"));
			personSummaryDTOListItem.setPersonActualItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].PersonActualItem"));
			personSummaryDTOListItem.setPersonErrorItem(_ctx.integerValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].PersonErrorItem"));
			personSummaryDTOListItem.setPersonAccuracy(_ctx.floatValue("GetSamplingSummaryResponse.Result.PersonSummaryDTOList["+ i +"].PersonAccuracy"));

			personSummaryDTOList.add(personSummaryDTOListItem);
		}
		result.setPersonSummaryDTOList(personSummaryDTOList);
		getSamplingSummaryResponse.setResult(result);
	 
	 	return getSamplingSummaryResponse;
	}
}