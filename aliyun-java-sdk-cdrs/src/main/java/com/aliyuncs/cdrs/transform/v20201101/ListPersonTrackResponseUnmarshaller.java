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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListPersonTrackResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonTrackResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTrackResponseUnmarshaller {

	public static ListPersonTrackResponse unmarshall(ListPersonTrackResponse listPersonTrackResponse, UnmarshallerContext _ctx) {
		
		listPersonTrackResponse.setRequestId(_ctx.stringValue("ListPersonTrackResponse.RequestId"));
		listPersonTrackResponse.setCode(_ctx.stringValue("ListPersonTrackResponse.Code"));
		listPersonTrackResponse.setMessage(_ctx.stringValue("ListPersonTrackResponse.Message"));
		listPersonTrackResponse.setPageNumber(_ctx.longValue("ListPersonTrackResponse.PageNumber"));
		listPersonTrackResponse.setPageSize(_ctx.longValue("ListPersonTrackResponse.PageSize"));
		listPersonTrackResponse.setTotalCount(_ctx.longValue("ListPersonTrackResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTrackResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPersonId(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].PersonId"));
			datas.setCorpId(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].CorpId"));
			datas.setDataSourceId(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].DataSourceId"));
			datas.setDataSourceName(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].DataSourceName"));
			datas.setPicUrlPath(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].PicUrlPath"));
			datas.setTargetPicUrlPath(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].TargetPicUrlPath"));
			datas.setRightBottomY(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].RightBottomY"));
			datas.setRightBottomX(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].RightBottomX"));
			datas.setLeftTopY(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].LeftTopY"));
			datas.setLeftTopX(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].LeftTopX"));
			datas.setShotTime(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].ShotTime"));
			datas.setOrder(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].Order"));
			datas.setLongitude(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].Longitude"));
			datas.setLatitude(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].Latitude"));
			datas.setSourceUrl(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].SourceUrl"));
			datas.setTargetUrl(_ctx.stringValue("ListPersonTrackResponse.Data["+ i +"].TargetUrl"));

			data.add(datas);
		}
		listPersonTrackResponse.setData(data);
	 
	 	return listPersonTrackResponse;
	}
}