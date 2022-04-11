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
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.AudioResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.ImageResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.ImageResultItem.ResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.TextResultItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.CounterListItem3;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopListItem4;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.CounterListItem11;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopListItem12;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.CounterListItem7;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopListItem8;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterListItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopListItem;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterListItem15;
import com.aliyuncs.vod.model.v20170321.GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopListItem16;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaAuditResultResponseUnmarshaller {

	public static GetMediaAuditResultResponse unmarshall(GetMediaAuditResultResponse getMediaAuditResultResponse, UnmarshallerContext _ctx) {
		
		getMediaAuditResultResponse.setRequestId(_ctx.stringValue("GetMediaAuditResultResponse.RequestId"));

		MediaAuditResult mediaAuditResult = new MediaAuditResult();
		mediaAuditResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.Suggestion"));
		mediaAuditResult.setAbnormalModules(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AbnormalModules"));
		mediaAuditResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.Label"));

		VideoResult videoResult = new VideoResult();
		videoResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.Label"));
		videoResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.Suggestion"));

		PornResult pornResult = new PornResult();
		pornResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.Suggestion"));
		pornResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.AverageScore"));
		pornResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.Label"));
		pornResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.MaxScore"));

		List<CounterListItem> counterList = new ArrayList<CounterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList.Length"); i++) {
			CounterListItem counterListItem = new CounterListItem();
			counterListItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList["+ i +"].Label"));
			counterListItem.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.CounterList["+ i +"].Count"));

			counterList.add(counterListItem);
		}
		pornResult.setCounterList(counterList);

		List<TopListItem> topList = new ArrayList<TopListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList.Length"); i++) {
			TopListItem topListItem = new TopListItem();
			topListItem.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Url"));
			topListItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Score"));
			topListItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Timestamp"));
			topListItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.PornResult.TopList["+ i +"].Label"));

			topList.add(topListItem);
		}
		pornResult.setTopList(topList);
		videoResult.setPornResult(pornResult);

		AdResult adResult = new AdResult();
		adResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.Suggestion"));
		adResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.AverageScore"));
		adResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.Label"));
		adResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.MaxScore"));

		List<CounterListItem3> counterList1 = new ArrayList<CounterListItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.CounterList.Length"); i++) {
			CounterListItem3 counterListItem3 = new CounterListItem3();
			counterListItem3.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.CounterList["+ i +"].Label"));
			counterListItem3.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.CounterList["+ i +"].Count"));

			counterList1.add(counterListItem3);
		}
		adResult.setCounterList1(counterList1);

		List<TopListItem4> topList2 = new ArrayList<TopListItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopList.Length"); i++) {
			TopListItem4 topListItem4 = new TopListItem4();
			topListItem4.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopList["+ i +"].Url"));
			topListItem4.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopList["+ i +"].Score"));
			topListItem4.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopList["+ i +"].Timestamp"));
			topListItem4.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.AdResult.TopList["+ i +"].Label"));

			topList2.add(topListItem4);
		}
		adResult.setTopList2(topList2);
		videoResult.setAdResult(adResult);

		LogoResult logoResult = new LogoResult();
		logoResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.Suggestion"));
		logoResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.AverageScore"));
		logoResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.Label"));
		logoResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.MaxScore"));

		List<CounterListItem7> counterList5 = new ArrayList<CounterListItem7>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.CounterList.Length"); i++) {
			CounterListItem7 counterListItem7 = new CounterListItem7();
			counterListItem7.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.CounterList["+ i +"].Label"));
			counterListItem7.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.CounterList["+ i +"].Count"));

			counterList5.add(counterListItem7);
		}
		logoResult.setCounterList5(counterList5);

		List<TopListItem8> topList6 = new ArrayList<TopListItem8>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopList.Length"); i++) {
			TopListItem8 topListItem8 = new TopListItem8();
			topListItem8.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopList["+ i +"].Url"));
			topListItem8.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopList["+ i +"].Score"));
			topListItem8.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopList["+ i +"].Timestamp"));
			topListItem8.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LogoResult.TopList["+ i +"].Label"));

			topList6.add(topListItem8);
		}
		logoResult.setTopList6(topList6);
		videoResult.setLogoResult(logoResult);

		LiveResult liveResult = new LiveResult();
		liveResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.Suggestion"));
		liveResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.AverageScore"));
		liveResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.Label"));
		liveResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.MaxScore"));

		List<CounterListItem11> counterList9 = new ArrayList<CounterListItem11>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.CounterList.Length"); i++) {
			CounterListItem11 counterListItem11 = new CounterListItem11();
			counterListItem11.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.CounterList["+ i +"].Label"));
			counterListItem11.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.CounterList["+ i +"].Count"));

			counterList9.add(counterListItem11);
		}
		liveResult.setCounterList9(counterList9);

		List<TopListItem12> topList10 = new ArrayList<TopListItem12>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopList.Length"); i++) {
			TopListItem12 topListItem12 = new TopListItem12();
			topListItem12.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopList["+ i +"].Url"));
			topListItem12.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopList["+ i +"].Score"));
			topListItem12.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopList["+ i +"].Timestamp"));
			topListItem12.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.LiveResult.TopList["+ i +"].Label"));

			topList10.add(topListItem12);
		}
		liveResult.setTopList10(topList10);
		videoResult.setLiveResult(liveResult);

		TerrorismResult terrorismResult = new TerrorismResult();
		terrorismResult.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.Suggestion"));
		terrorismResult.setAverageScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.AverageScore"));
		terrorismResult.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.Label"));
		terrorismResult.setMaxScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.MaxScore"));

		List<CounterListItem15> counterList13 = new ArrayList<CounterListItem15>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList.Length"); i++) {
			CounterListItem15 counterListItem15 = new CounterListItem15();
			counterListItem15.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList["+ i +"].Label"));
			counterListItem15.setCount(_ctx.integerValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.CounterList["+ i +"].Count"));

			counterList13.add(counterListItem15);
		}
		terrorismResult.setCounterList13(counterList13);

		List<TopListItem16> topList14 = new ArrayList<TopListItem16>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList.Length"); i++) {
			TopListItem16 topListItem16 = new TopListItem16();
			topListItem16.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Url"));
			topListItem16.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Score"));
			topListItem16.setTimestamp(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Timestamp"));
			topListItem16.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.VideoResult.TerrorismResult.TopList["+ i +"].Label"));

			topList14.add(topListItem16);
		}
		terrorismResult.setTopList14(topList14);
		videoResult.setTerrorismResult(terrorismResult);
		mediaAuditResult.setVideoResult(videoResult);

		List<AudioResultItem> audioResult = new ArrayList<AudioResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.AudioResult.Length"); i++) {
			AudioResultItem audioResultItem = new AudioResultItem();
			audioResultItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AudioResult["+ i +"].Score"));
			audioResultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AudioResult["+ i +"].Suggestion"));
			audioResultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AudioResult["+ i +"].Label"));
			audioResultItem.setScene(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.AudioResult["+ i +"].Scene"));

			audioResult.add(audioResultItem);
		}
		mediaAuditResult.setAudioResult(audioResult);

		List<ImageResultItem> imageResult = new ArrayList<ImageResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult.Length"); i++) {
			ImageResultItem imageResultItem = new ImageResultItem();
			imageResultItem.setType(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Type"));
			imageResultItem.setUrl(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Url"));
			imageResultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Suggestion"));
			imageResultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Label"));

			List<ResultItem> result = new ArrayList<ResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result.Length"); j++) {
				ResultItem resultItem = new ResultItem();
				resultItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Score"));
				resultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Suggestion"));
				resultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.ImageResult["+ i +"].Result["+ j +"].Label"));
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
			textResultItem.setType(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Type"));
			textResultItem.setSuggestion(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Suggestion"));
			textResultItem.setScore(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Score"));
			textResultItem.setLabel(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Label"));
			textResultItem.setContent(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Content"));
			textResultItem.setScene(_ctx.stringValue("GetMediaAuditResultResponse.MediaAuditResult.TextResult["+ i +"].Scene"));

			textResult.add(textResultItem);
		}
		mediaAuditResult.setTextResult(textResult);
		getMediaAuditResultResponse.setMediaAuditResult(mediaAuditResult);
	 
	 	return getMediaAuditResultResponse;
	}
}