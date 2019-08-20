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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetHotShowsResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetHotShowsResponse.ShowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetHotShowsResponseUnmarshaller {

	public static TaobaoFilmGetHotShowsResponse unmarshall(TaobaoFilmGetHotShowsResponse taobaoFilmGetHotShowsResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetHotShowsResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.RequestId"));
		taobaoFilmGetHotShowsResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.ErrorCode"));
		taobaoFilmGetHotShowsResponse.setMsg(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Msg"));
		taobaoFilmGetHotShowsResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.SubCode"));
		taobaoFilmGetHotShowsResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.SubMsg"));
		taobaoFilmGetHotShowsResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.LogsId"));

		List<ShowsItem> shows = new ArrayList<ShowsItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetHotShowsResponse.Shows.Length"); i++) {
			ShowsItem showsItem = new ShowsItem();
			showsItem.setBackgroundPicture(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].BackgroundPicture"));
			showsItem.setCountry(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Country"));
			showsItem.setDescription(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Description"));
			showsItem.setDirector(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Director"));
			showsItem.setDuration(_ctx.longValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Duration"));
			showsItem.setHighlight(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Highlight"));
			showsItem.setId(_ctx.longValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Id"));
			showsItem.setLanguage(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Language"));
			showsItem.setLeadingRole(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].LeadingRole"));
			showsItem.setOpenDay(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].OpenDay"));
			showsItem.setOpenTime(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].OpenTime"));
			showsItem.setPoster(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Poster"));
			showsItem.setRemark(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Remark"));
			showsItem.setShowMark(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].ShowMark"));
			showsItem.setShowName(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].ShowName"));
			showsItem.setShowNameEn(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].ShowNameEn"));
			showsItem.setType(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].Type"));

			List<String> showVersionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].ShowVersionList.Length"); j++) {
				showVersionList.add(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].ShowVersionList["+ j +"]"));
			}
			showsItem.setShowVersionList(showVersionList);

			List<String> trailerList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].TrailerList.Length"); j++) {
				trailerList.add(_ctx.stringValue("TaobaoFilmGetHotShowsResponse.Shows["+ i +"].TrailerList["+ j +"]"));
			}
			showsItem.setTrailerList(trailerList);

			shows.add(showsItem);
		}
		taobaoFilmGetHotShowsResponse.setShows(shows);
	 
	 	return taobaoFilmGetHotShowsResponse;
	}
}