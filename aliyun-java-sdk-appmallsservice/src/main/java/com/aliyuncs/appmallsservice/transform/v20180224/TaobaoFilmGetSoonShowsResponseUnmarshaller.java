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

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSoonShowsResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSoonShowsResponse.ShowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetSoonShowsResponseUnmarshaller {

	public static TaobaoFilmGetSoonShowsResponse unmarshall(TaobaoFilmGetSoonShowsResponse taobaoFilmGetSoonShowsResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetSoonShowsResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.RequestId"));
		taobaoFilmGetSoonShowsResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.ErrorCode"));
		taobaoFilmGetSoonShowsResponse.setMsg(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Msg"));
		taobaoFilmGetSoonShowsResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.SubCode"));
		taobaoFilmGetSoonShowsResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.SubMsg"));
		taobaoFilmGetSoonShowsResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.LogsId"));

		List<ShowsItem> shows = new ArrayList<ShowsItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetSoonShowsResponse.Shows.Length"); i++) {
			ShowsItem showsItem = new ShowsItem();
			showsItem.setBackgroundPicture(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].BackgroundPicture"));
			showsItem.setCountry(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Country"));
			showsItem.setDescription(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Description"));
			showsItem.setDirector(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Director"));
			showsItem.setDuration(_ctx.longValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Duration"));
			showsItem.setHighlight(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Highlight"));
			showsItem.setId(_ctx.longValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Id"));
			showsItem.setLanguage(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Language"));
			showsItem.setLeadingRole(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].LeadingRole"));
			showsItem.setOpenDay(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].OpenDay"));
			showsItem.setOpenTime(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].OpenTime"));
			showsItem.setPoster(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Poster"));
			showsItem.setRemark(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Remark"));
			showsItem.setShowMark(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].ShowMark"));
			showsItem.setShowName(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].ShowName"));
			showsItem.setShowNameEn(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].ShowNameEn"));
			showsItem.setType(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].Type"));

			List<String> showVersionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].ShowVersionList.Length"); j++) {
				showVersionList.add(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].ShowVersionList["+ j +"]"));
			}
			showsItem.setShowVersionList(showVersionList);

			List<String> trailerList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].TrailerList.Length"); j++) {
				trailerList.add(_ctx.stringValue("TaobaoFilmGetSoonShowsResponse.Shows["+ i +"].TrailerList["+ j +"]"));
			}
			showsItem.setTrailerList(trailerList);

			shows.add(showsItem);
		}
		taobaoFilmGetSoonShowsResponse.setShows(shows);
	 
	 	return taobaoFilmGetSoonShowsResponse;
	}
}