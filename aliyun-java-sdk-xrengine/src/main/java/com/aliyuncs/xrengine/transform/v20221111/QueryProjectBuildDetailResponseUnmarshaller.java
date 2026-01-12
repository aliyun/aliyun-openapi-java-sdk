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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.QueryProjectBuildDetailResponse;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectBuildDetailResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectBuildDetailResponse.Data.InstanceDetailResponseListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectBuildDetailResponseUnmarshaller {

	public static QueryProjectBuildDetailResponse unmarshall(QueryProjectBuildDetailResponse queryProjectBuildDetailResponse, UnmarshallerContext _ctx) {
		
		queryProjectBuildDetailResponse.setRequestId(_ctx.stringValue("QueryProjectBuildDetailResponse.RequestId"));
		queryProjectBuildDetailResponse.setSuccess(_ctx.booleanValue("QueryProjectBuildDetailResponse.Success"));
		queryProjectBuildDetailResponse.setCode(_ctx.stringValue("QueryProjectBuildDetailResponse.Code"));
		queryProjectBuildDetailResponse.setMessage(_ctx.stringValue("QueryProjectBuildDetailResponse.Message"));

		Data data = new Data();
		data.setGmtCreate(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryProjectBuildDetailResponse.Data.Id"));
		data.setTitle(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.Title"));
		data.setUserId(_ctx.longValue("QueryProjectBuildDetailResponse.Data.UserId"));
		data.setStatus(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.Status"));

		List<InstanceDetailResponseListItem> instanceDetailResponseList = new ArrayList<InstanceDetailResponseListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList.Length"); i++) {
			InstanceDetailResponseListItem instanceDetailResponseListItem = new InstanceDetailResponseListItem();
			instanceDetailResponseListItem.setGmtCreate(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].GmtCreate"));
			instanceDetailResponseListItem.setGmtModified(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].GmtModified"));
			instanceDetailResponseListItem.setId(_ctx.longValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].Id"));
			instanceDetailResponseListItem.setParams(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].Params"));
			instanceDetailResponseListItem.setStatus(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].Status"));
			instanceDetailResponseListItem.setSubmitTime(_ctx.stringValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].SubmitTime"));
			instanceDetailResponseListItem.setTemplateId(_ctx.longValue("QueryProjectBuildDetailResponse.Data.InstanceDetailResponseList["+ i +"].TemplateId"));

			instanceDetailResponseList.add(instanceDetailResponseListItem);
		}
		data.setInstanceDetailResponseList(instanceDetailResponseList);
		queryProjectBuildDetailResponse.setData(data);
	 
	 	return queryProjectBuildDetailResponse;
	}
}