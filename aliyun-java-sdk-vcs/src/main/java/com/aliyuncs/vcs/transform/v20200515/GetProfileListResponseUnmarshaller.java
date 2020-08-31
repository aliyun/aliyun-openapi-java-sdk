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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetProfileListResponse;
import com.aliyuncs.vcs.model.v20200515.GetProfileListResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetProfileListResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProfileListResponseUnmarshaller {

	public static GetProfileListResponse unmarshall(GetProfileListResponse getProfileListResponse, UnmarshallerContext _ctx) {
		
		getProfileListResponse.setRequestId(_ctx.stringValue("GetProfileListResponse.RequestId"));
		getProfileListResponse.setCode(_ctx.stringValue("GetProfileListResponse.Code"));
		getProfileListResponse.setMessage(_ctx.stringValue("GetProfileListResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("GetProfileListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("GetProfileListResponse.Data.PageSize"));
		data.setSuccess(_ctx.longValue("GetProfileListResponse.Data.Success"));
		data.setTotal(_ctx.longValue("GetProfileListResponse.Data.Total"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProfileListResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setSceneType(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].SceneType"));
			recordsItem.setBizId(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].BizId"));
			recordsItem.setFaceUrl(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].FaceUrl"));
			recordsItem.setGender(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].Gender"));
			recordsItem.setIdNumber(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].IdNumber"));
			recordsItem.setIsvSubId(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].IsvSubId"));
			recordsItem.setSearchMatchingRate(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].SearchMatchingRate"));
			recordsItem.setPersonId(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].PersonId"));
			recordsItem.setCatalogId(_ctx.integerValue("GetProfileListResponse.Data.Records["+ i +"].CatalogId"));
			recordsItem.setProfileId(_ctx.integerValue("GetProfileListResponse.Data.Records["+ i +"].ProfileId"));
			recordsItem.setName(_ctx.stringValue("GetProfileListResponse.Data.Records["+ i +"].Name"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		getProfileListResponse.setData(data);
	 
	 	return getProfileListResponse;
	}
}