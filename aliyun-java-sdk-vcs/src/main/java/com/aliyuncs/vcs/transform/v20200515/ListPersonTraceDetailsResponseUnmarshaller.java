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

import com.aliyuncs.vcs.model.v20200515.ListPersonTraceDetailsResponse;
import com.aliyuncs.vcs.model.v20200515.ListPersonTraceDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTraceDetailsResponseUnmarshaller {

	public static ListPersonTraceDetailsResponse unmarshall(ListPersonTraceDetailsResponse listPersonTraceDetailsResponse, UnmarshallerContext _ctx) {
		
		listPersonTraceDetailsResponse.setRequestId(_ctx.stringValue("ListPersonTraceDetailsResponse.RequestId"));
		listPersonTraceDetailsResponse.setCode(_ctx.stringValue("ListPersonTraceDetailsResponse.Code"));
		listPersonTraceDetailsResponse.setMessage(_ctx.stringValue("ListPersonTraceDetailsResponse.Message"));
		listPersonTraceDetailsResponse.setPageNumber(_ctx.longValue("ListPersonTraceDetailsResponse.PageNumber"));
		listPersonTraceDetailsResponse.setPageSize(_ctx.longValue("ListPersonTraceDetailsResponse.PageSize"));
		listPersonTraceDetailsResponse.setTotalCount(_ctx.longValue("ListPersonTraceDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTraceDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setTargetPicUrlPath(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].TargetPicUrlPath"));
			datas.setDataSourceId(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].DataSourceId"));
			datas.setPersonId(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].PersonId"));
			datas.setPicUrlPath(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].PicUrlPath"));
			datas.setRightBottomY(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].RightBottomY"));
			datas.setRightBottomX(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].RightBottomX"));
			datas.setShotTime(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].ShotTime"));
			datas.setCorpId(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].CorpId"));
			datas.setSubId(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].SubId"));
			datas.setLeftTopY(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].LeftTopY"));
			datas.setLeftTopX(_ctx.stringValue("ListPersonTraceDetailsResponse.Data["+ i +"].LeftTopX"));

			data.add(datas);
		}
		listPersonTraceDetailsResponse.setData(data);
	 
	 	return listPersonTraceDetailsResponse;
	}
}