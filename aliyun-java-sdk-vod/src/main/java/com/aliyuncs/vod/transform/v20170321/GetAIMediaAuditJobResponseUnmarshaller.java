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

import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem.ResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterListItem7;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopListItem8;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterListItem11;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopListItem12;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterListItem15;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopListItem16;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterListItem3;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopListItem4;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterListItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIMediaAuditJobResponseUnmarshaller {

	public static GetAIMediaAuditJobResponse unmarshall(GetAIMediaAuditJobResponse getAIMediaAuditJobResponse, UnmarshallerContext _ctx) {
		
		getAIMediaAuditJobResponse.setRequestId(_ctx.stringValue("GetAIMediaAuditJobResponse.RequestId"));

		MediaAuditJob mediaAuditJob = new MediaAuditJob();
		mediaAuditJob.setCreationTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CreationTime"));
		mediaAuditJob.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Type"));
		mediaAuditJob.setStatus(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Status"));
		mediaAuditJob.setCompleteTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CompleteTime"));
		mediaAuditJob.setJobId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.JobId"));
		mediaAuditJob.setCode(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Code"));
		mediaAuditJob.setMessage(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Message"));
		mediaAuditJob.setMediaId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.MediaId"));

		Data data = new Data();
		data.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Suggestion"));
		data.setAbnormalModules(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AbnormalModules"));
		data.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Label"));

		VideoResult videoResult = new VideoResult();
		videoResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Label"));
		videoResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Suggestion"));

		TerrorismResult terrorismResult = new TerrorismResult();
		terrorismResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Suggestion"));
		terrorismResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.AverageScore"));
		terrorismResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Label"));
		terrorismResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.MaxScore"));

		List<CounterListItem> counterList = new ArrayList<CounterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList.Length"); i++) {
			CounterListItem counterListItem = new CounterListItem();
			counterListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Label"));
			counterListItem.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Count"));

			counterList.add(counterListItem);
		}
		terrorismResult.setCounterList(counterList);

		List<TopListItem> topList = new ArrayList<TopListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList.Length"); i++) {
			TopListItem topListItem = new TopListItem();
			topListItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Url"));
			topListItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Score"));
			topListItem.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Timestamp"));
			topListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Label"));

			topList.add(topListItem);
		}
		terrorismResult.setTopList(topList);
		videoResult.setTerrorismResult(terrorismResult);

		PornResult pornResult = new PornResult();
		pornResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Suggestion"));
		pornResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.AverageScore"));
		pornResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Label"));
		pornResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.MaxScore"));

		List<CounterListItem3> counterList1 = new ArrayList<CounterListItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList.Length"); i++) {
			CounterListItem3 counterListItem3 = new CounterListItem3();
			counterListItem3.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Label"));
			counterListItem3.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Count"));

			counterList1.add(counterListItem3);
		}
		pornResult.setCounterList1(counterList1);

		List<TopListItem4> topList2 = new ArrayList<TopListItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList.Length"); i++) {
			TopListItem4 topListItem4 = new TopListItem4();
			topListItem4.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Url"));
			topListItem4.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Score"));
			topListItem4.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Timestamp"));
			topListItem4.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Label"));

			topList2.add(topListItem4);
		}
		pornResult.setTopList2(topList2);
		videoResult.setPornResult(pornResult);

		AdResult adResult = new AdResult();
		adResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.Suggestion"));
		adResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.AverageScore"));
		adResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.Label"));
		adResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.MaxScore"));

		List<CounterListItem7> counterList5 = new ArrayList<CounterListItem7>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList.Length"); i++) {
			CounterListItem7 counterListItem7 = new CounterListItem7();
			counterListItem7.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList["+ i +"].Label"));
			counterListItem7.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList["+ i +"].Count"));

			counterList5.add(counterListItem7);
		}
		adResult.setCounterList5(counterList5);

		List<TopListItem8> topList6 = new ArrayList<TopListItem8>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList.Length"); i++) {
			TopListItem8 topListItem8 = new TopListItem8();
			topListItem8.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Url"));
			topListItem8.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Score"));
			topListItem8.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Timestamp"));
			topListItem8.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Label"));

			topList6.add(topListItem8);
		}
		adResult.setTopList6(topList6);
		videoResult.setAdResult(adResult);

		LiveResult liveResult = new LiveResult();
		liveResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.Suggestion"));
		liveResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.AverageScore"));
		liveResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.Label"));
		liveResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.MaxScore"));

		List<CounterListItem11> counterList9 = new ArrayList<CounterListItem11>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList.Length"); i++) {
			CounterListItem11 counterListItem11 = new CounterListItem11();
			counterListItem11.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList["+ i +"].Label"));
			counterListItem11.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList["+ i +"].Count"));

			counterList9.add(counterListItem11);
		}
		liveResult.setCounterList9(counterList9);

		List<TopListItem12> topList10 = new ArrayList<TopListItem12>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList.Length"); i++) {
			TopListItem12 topListItem12 = new TopListItem12();
			topListItem12.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Url"));
			topListItem12.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Score"));
			topListItem12.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Timestamp"));
			topListItem12.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Label"));

			topList10.add(topListItem12);
		}
		liveResult.setTopList10(topList10);
		videoResult.setLiveResult(liveResult);

		LogoResult logoResult = new LogoResult();
		logoResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.Suggestion"));
		logoResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.AverageScore"));
		logoResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.Label"));
		logoResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.MaxScore"));

		List<CounterListItem15> counterList13 = new ArrayList<CounterListItem15>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList.Length"); i++) {
			CounterListItem15 counterListItem15 = new CounterListItem15();
			counterListItem15.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList["+ i +"].Label"));
			counterListItem15.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList["+ i +"].Count"));

			counterList13.add(counterListItem15);
		}
		logoResult.setCounterList13(counterList13);

		List<TopListItem16> topList14 = new ArrayList<TopListItem16>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList.Length"); i++) {
			TopListItem16 topListItem16 = new TopListItem16();
			topListItem16.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Url"));
			topListItem16.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Score"));
			topListItem16.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Timestamp"));
			topListItem16.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Label"));

			topList14.add(topListItem16);
		}
		logoResult.setTopList14(topList14);
		videoResult.setLogoResult(logoResult);
		data.setVideoResult(videoResult);

		List<ImageResultItem> imageResult = new ArrayList<ImageResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult.Length"); i++) {
			ImageResultItem imageResultItem = new ImageResultItem();
			imageResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Type"));
			imageResultItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Url"));
			imageResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Suggestion"));
			imageResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Label"));

			List<ResultItem> result = new ArrayList<ResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result.Length"); j++) {
				ResultItem resultItem = new ResultItem();
				resultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Score"));
				resultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Suggestion"));
				resultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Label"));
				resultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Scene"));

				result.add(resultItem);
			}
			imageResultItem.setResult(result);

			imageResult.add(imageResultItem);
		}
		data.setImageResult(imageResult);

		List<TextResultItem> textResult = new ArrayList<TextResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult.Length"); i++) {
			TextResultItem textResultItem = new TextResultItem();
			textResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Type"));
			textResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Suggestion"));
			textResultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Score"));
			textResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Label"));
			textResultItem.setContent(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Content"));
			textResultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Scene"));

			textResult.add(textResultItem);
		}
		data.setTextResult(textResult);

		List<AudioResultItem> audioResult = new ArrayList<AudioResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResult.Length"); i++) {
			AudioResultItem audioResultItem = new AudioResultItem();
			audioResultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResult["+ i +"].Score"));
			audioResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResult["+ i +"].Suggestion"));
			audioResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResult["+ i +"].Label"));
			audioResultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AudioResult["+ i +"].Scene"));

			audioResult.add(audioResultItem);
		}
		data.setAudioResult(audioResult);
		mediaAuditJob.setData(data);
		getAIMediaAuditJobResponse.setMediaAuditJob(mediaAuditJob);
	 
	 	return getAIMediaAuditJobResponse;
	}
}