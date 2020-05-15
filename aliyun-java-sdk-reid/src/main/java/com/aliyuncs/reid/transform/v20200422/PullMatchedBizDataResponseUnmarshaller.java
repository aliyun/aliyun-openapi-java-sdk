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

package com.aliyuncs.reid.transform.v20200422;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20200422.PullMatchedBizDataResponse;
import com.aliyuncs.reid.model.v20200422.PullMatchedBizDataResponse.MatchedBizData;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullMatchedBizDataResponseUnmarshaller {

	public static PullMatchedBizDataResponse unmarshall(PullMatchedBizDataResponse pullMatchedBizDataResponse, UnmarshallerContext _ctx) {
		
		pullMatchedBizDataResponse.setRequestId(_ctx.stringValue("PullMatchedBizDataResponse.RequestId"));
		pullMatchedBizDataResponse.setErrorCode(_ctx.stringValue("PullMatchedBizDataResponse.ErrorCode"));
		pullMatchedBizDataResponse.setErrorMessage(_ctx.stringValue("PullMatchedBizDataResponse.ErrorMessage"));
		pullMatchedBizDataResponse.setMessage(_ctx.stringValue("PullMatchedBizDataResponse.Message"));
		pullMatchedBizDataResponse.setCode(_ctx.stringValue("PullMatchedBizDataResponse.Code"));
		pullMatchedBizDataResponse.setDynamicCode(_ctx.stringValue("PullMatchedBizDataResponse.DynamicCode"));
		pullMatchedBizDataResponse.setSuccess(_ctx.booleanValue("PullMatchedBizDataResponse.Success"));
		pullMatchedBizDataResponse.setDynamicMessage(_ctx.stringValue("PullMatchedBizDataResponse.DynamicMessage"));

		List<MatchedBizData> matchedDataList = new ArrayList<MatchedBizData>();
		for (int i = 0; i < _ctx.lengthValue("PullMatchedBizDataResponse.MatchedDataList.Length"); i++) {
			MatchedBizData matchedBizData = new MatchedBizData();
			matchedBizData.setStartTimestamp(_ctx.longValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].StartTimestamp"));
			matchedBizData.setStoreId(_ctx.longValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].StoreId"));
			matchedBizData.setDeviceId(_ctx.stringValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].DeviceId"));
			matchedBizData.setEndTimestamp(_ctx.longValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].EndTimestamp"));
			matchedBizData.setRecordId(_ctx.stringValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].RecordId"));
			matchedBizData.setBizDataType(_ctx.stringValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].BizDataType"));
			matchedBizData.setUkId(_ctx.longValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].UkId"));
			matchedBizData.setAttirbute(_ctx.stringValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].Attirbute"));
			matchedBizData.setDeviceType(_ctx.stringValue("PullMatchedBizDataResponse.MatchedDataList["+ i +"].DeviceType"));

			matchedDataList.add(matchedBizData);
		}
		pullMatchedBizDataResponse.setMatchedDataList(matchedDataList);
	 
	 	return pullMatchedBizDataResponse;
	}
}