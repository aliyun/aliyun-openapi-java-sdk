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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.PageQueryWhiteListSettingResponse;
import com.aliyuncs.cloudauth.model.v20190307.PageQueryWhiteListSettingResponse.ResultObjectItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageQueryWhiteListSettingResponseUnmarshaller {

	public static PageQueryWhiteListSettingResponse unmarshall(PageQueryWhiteListSettingResponse pageQueryWhiteListSettingResponse, UnmarshallerContext _ctx) {
		
		pageQueryWhiteListSettingResponse.setRequestId(_ctx.stringValue("PageQueryWhiteListSettingResponse.RequestId"));
		pageQueryWhiteListSettingResponse.setCode(_ctx.stringValue("PageQueryWhiteListSettingResponse.Code"));
		pageQueryWhiteListSettingResponse.setMessage(_ctx.stringValue("PageQueryWhiteListSettingResponse.Message"));
		pageQueryWhiteListSettingResponse.setSuccess(_ctx.booleanValue("PageQueryWhiteListSettingResponse.Success"));
		pageQueryWhiteListSettingResponse.setTotalItem(_ctx.integerValue("PageQueryWhiteListSettingResponse.TotalItem"));
		pageQueryWhiteListSettingResponse.setTotalPage(_ctx.integerValue("PageQueryWhiteListSettingResponse.TotalPage"));
		pageQueryWhiteListSettingResponse.setCurrentPage(_ctx.integerValue("PageQueryWhiteListSettingResponse.CurrentPage"));
		pageQueryWhiteListSettingResponse.setPageSize(_ctx.integerValue("PageQueryWhiteListSettingResponse.PageSize"));

		List<ResultObjectItem> resultObject = new ArrayList<ResultObjectItem>();
		for (int i = 0; i < _ctx.lengthValue("PageQueryWhiteListSettingResponse.ResultObject.Length"); i++) {
			ResultObjectItem resultObjectItem = new ResultObjectItem();
			resultObjectItem.setId(_ctx.longValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].Id"));
			resultObjectItem.setGmtCreate(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].GmtCreate"));
			resultObjectItem.setGmtModified(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].GmtModified"));
			resultObjectItem.setServiceCode(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].ServiceCode"));
			resultObjectItem.setCertifyId(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].CertifyId"));
			resultObjectItem.setCertNo(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].CertNo"));
			resultObjectItem.setSceneId(_ctx.longValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].SceneId"));
			resultObjectItem.setValidStartDate(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].ValidStartDate"));
			resultObjectItem.setValidEndDate(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].ValidEndDate"));
			resultObjectItem.setStatus(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].Status"));
			resultObjectItem.setRemark(_ctx.stringValue("PageQueryWhiteListSettingResponse.ResultObject["+ i +"].Remark"));

			resultObject.add(resultObjectItem);
		}
		pageQueryWhiteListSettingResponse.setResultObject(resultObject);
	 
	 	return pageQueryWhiteListSettingResponse;
	}
}