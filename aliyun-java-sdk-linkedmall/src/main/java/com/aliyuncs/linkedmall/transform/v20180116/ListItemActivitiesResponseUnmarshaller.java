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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.ListItemActivitiesResponse;
import com.aliyuncs.linkedmall.model.v20180116.ListItemActivitiesResponse.LmItemActivityModel;
import com.aliyuncs.linkedmall.model.v20180116.ListItemActivitiesResponse.LmItemActivityModel.LmActivityPopModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListItemActivitiesResponseUnmarshaller {

	public static ListItemActivitiesResponse unmarshall(ListItemActivitiesResponse listItemActivitiesResponse, UnmarshallerContext _ctx) {
		
		listItemActivitiesResponse.setRequestId(_ctx.stringValue("ListItemActivitiesResponse.RequestId"));
		listItemActivitiesResponse.setCode(_ctx.stringValue("ListItemActivitiesResponse.Code"));
		listItemActivitiesResponse.setMessage(_ctx.stringValue("ListItemActivitiesResponse.Message"));

		List<LmItemActivityModel> lmItemActivityModelList = new ArrayList<LmItemActivityModel>();
		for (int i = 0; i < _ctx.lengthValue("ListItemActivitiesResponse.LmItemActivityModelList.Length"); i++) {
			LmItemActivityModel lmItemActivityModel = new LmItemActivityModel();
			lmItemActivityModel.setItemId(_ctx.longValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].ItemId"));
			lmItemActivityModel.setLmItemId(_ctx.stringValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmItemId"));

			LmActivityPopModel lmActivityPopModel = new LmActivityPopModel();
			lmActivityPopModel.setId(_ctx.longValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.Id"));
			lmActivityPopModel.setBizId(_ctx.stringValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.BizId"));
			lmActivityPopModel.setSubBizCode(_ctx.stringValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.SubBizCode"));
			lmActivityPopModel.setTitle(_ctx.stringValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.Title"));
			lmActivityPopModel.setDisplayDate(_ctx.longValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.DisplayDate"));
			lmActivityPopModel.setStartDate(_ctx.longValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.StartDate"));
			lmActivityPopModel.setEndDate(_ctx.longValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.EndDate"));
			lmActivityPopModel.setExtInfo(_ctx.mapValue("ListItemActivitiesResponse.LmItemActivityModelList["+ i +"].LmActivityPopModel.ExtInfo"));
			lmItemActivityModel.setLmActivityPopModel(lmActivityPopModel);

			lmItemActivityModelList.add(lmItemActivityModel);
		}
		listItemActivitiesResponse.setLmItemActivityModelList(lmItemActivityModelList);
	 
	 	return listItemActivitiesResponse;
	}
}