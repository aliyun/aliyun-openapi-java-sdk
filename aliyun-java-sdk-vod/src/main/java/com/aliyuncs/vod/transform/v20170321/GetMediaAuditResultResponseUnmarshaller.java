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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.ImageResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.ImageResultItem.ResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.TextResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterListItem3;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopListItem4;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterListItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaAuditResultResponseUnmarshaller {

	public static GetMediaAuditResultResponse unmarshall(GetMediaAuditResultResponse getMediaAuditResultResponse, UnmarshallerContext _ctx) {
		
		getMediaAuditResultResponse.setRequestId(_ctx.stringValue("GetMediaAuditResultResponse.RequestId"));

		MediaAuditResult mediaAuditResult = new MediaAuditResult();
		mediaAuditResult.setAbnormalModules(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AbnormalModules"));
		mediaAuditResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.Label"));
		mediaAuditResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.Suggestion"));

		VideoResult videoResult = new VideoResult();
		videoResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.Suggestion"));
		videoResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.Label"));

		TerrorismResult terrorismResult = new TerrorismResult();
		terrorismResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.Suggestion"));
		terrorismResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.Label"));
		terrorismResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.MaxScore"));
		terrorismResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.AverageScore"));

		List<CounterListItem> counterList = new ArrayList<CounterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList.Length"); i++) {
			CounterListItem counterListItem = new CounterListItem();
			counterListItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList["+ i +"].Label"));
			counterListItem.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList["+ i +"].Count"));

			counterList.add(counterListItem);
		}
		terrorismResult.setCounterList(counterList);

		List<TopListItem> topList = new ArrayList<TopListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList.Length"); i++) {
			TopListItem topListItem = new TopListItem();
			topListItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Label"));
			topListItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Score"));
			topListItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Timestamp"));
			topListItem.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Url"));

			topList.add(topListItem);
		}
		terrorismResult.setTopList(topList);
		videoResult.setTerrorismResult(terrorismResult);

		PornResult pornResult = new PornResult();
		pornResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.Suggestion"));
		pornResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.Label"));
		pornResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.MaxScore"));
		pornResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.AverageScore"));

		List<CounterListItem3> counterList1 = new ArrayList<CounterListItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList.Length"); i++) {
			CounterListItem3 counterListItem3 = new CounterListItem3();
			counterListItem3.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList["+ i +"].Label"));
			counterListItem3.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList["+ i +"].Count"));

			counterList1.add(counterListItem3);
		}
		pornResult.setCounterList1(counterList1);

		List<TopListItem4> topList2 = new ArrayList<TopListItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList.Length"); i++) {
			TopListItem4 topListItem4 = new TopListItem4();
			topListItem4.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Label"));
			topListItem4.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Score"));
			topListItem4.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Timestamp"));
			topListItem4.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Url"));

			topList2.add(topListItem4);
		}
		pornResult.setTopList2(topList2);
		videoResult.setPornResult(pornResult);
		mediaAuditResult.setVideoResult(videoResult);

		List<ImageResultItem> imageResult = new ArrayList<ImageResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult.Length"); i++) {
			ImageResultItem imageResultItem = new ImageResultItem();
			imageResultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Suggestion"));
			imageResultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Label"));
			imageResultItem.setType(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Type"));
			imageResultItem.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Url"));

			List<ResultItem> result = new ArrayList<ResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result.Length"); j++) {
				ResultItem resultItem = new ResultItem();
				resultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Suggestion"));
				resultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Label"));
				resultItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Score"));
				resultItem.setScene(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Scene"));

				result.add(resultItem);
			}
			imageResultItem.setResult(result);

			imageResult.add(imageResultItem);
		}
		mediaAuditResult.setImageResult(imageResult);

		List<TextResultItem> textResult = new ArrayList<TextResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult.Length"); i++) {
			TextResultItem textResultItem = new TextResultItem();
			textResultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Suggestion"));
			textResultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Label"));
			textResultItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Score"));
			textResultItem.setScene(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Scene"));
			textResultItem.setType(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Type"));
			textResultItem.setContent(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Content"));

			textResult.add(textResultItem);
		}
		mediaAuditResult.setTextResult(textResult);
		getMediaAuditResultResponse.setMediaAuditResult(mediaAuditResult);
	 
	 	return getMediaAuditResultResponse;
	}
}