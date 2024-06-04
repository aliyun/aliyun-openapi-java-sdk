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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.DsgWhiteListQueryListResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgWhiteListQueryListResponse.PageData;
import com.aliyuncs.dataworks_public.model.v20200518.DsgWhiteListQueryListResponse.PageData.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgWhiteListQueryListResponseUnmarshaller {

	public static DsgWhiteListQueryListResponse unmarshall(DsgWhiteListQueryListResponse dsgWhiteListQueryListResponse, UnmarshallerContext _ctx) {
		
		dsgWhiteListQueryListResponse.setRequestId(_ctx.stringValue("DsgWhiteListQueryListResponse.RequestId"));
		dsgWhiteListQueryListResponse.setSuccess(_ctx.booleanValue("DsgWhiteListQueryListResponse.Success"));
		dsgWhiteListQueryListResponse.setErrorCode(_ctx.stringValue("DsgWhiteListQueryListResponse.ErrorCode"));
		dsgWhiteListQueryListResponse.setErrorMessage(_ctx.stringValue("DsgWhiteListQueryListResponse.ErrorMessage"));
		dsgWhiteListQueryListResponse.setHttpStatusCode(_ctx.integerValue("DsgWhiteListQueryListResponse.HttpStatusCode"));

		PageData pageData = new PageData();
		pageData.setPageNumber(_ctx.integerValue("DsgWhiteListQueryListResponse.PageData.PageNumber"));
		pageData.setPageSize(_ctx.integerValue("DsgWhiteListQueryListResponse.PageData.PageSize"));
		pageData.setTotalCount(_ctx.integerValue("DsgWhiteListQueryListResponse.PageData.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgWhiteListQueryListResponse.PageData.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setId(_ctx.longValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].Id"));
			datas.setType(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].Type"));
			datas.setGmtCreate(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].GmtCreate"));
			datas.setGmtModified(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].GmtModified"));
			datas.setRuleId(_ctx.longValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].RuleId"));
			datas.setSceneId(_ctx.longValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].SceneId"));
			datas.setStartTime(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].StartTime"));
			datas.setEndTime(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].EndTime"));

			List<String> userGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].UserGroups.Length"); j++) {
				userGroups.add(_ctx.stringValue("DsgWhiteListQueryListResponse.PageData.Data["+ i +"].UserGroups["+ j +"]"));
			}
			datas.setUserGroups(userGroups);

			data.add(datas);
		}
		pageData.setData(data);
		dsgWhiteListQueryListResponse.setPageData(pageData);
	 
	 	return dsgWhiteListQueryListResponse;
	}
}