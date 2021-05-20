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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AbuseResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AbuseResult.AbuseAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AbuseResult.AbuseOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AbuseResult.AbuseText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult.AdAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult.AdImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult.AdOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult.AdText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.AdResult.AdVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.ContrabandResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.ContrabandResult.ContrabandAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.ContrabandResult.ContrabandOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.ContrabandResult.ContrabandText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LiveResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LiveResult.LiveImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LiveResult.LiveVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LogoResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LogoResult.LogoImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.LogoResult.LogoVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult.PoliticsAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult.PoliticsImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult.PoliticsOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult.PoliticsText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PoliticsResult.PoliticsVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult.PornAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult.PornImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult.PornOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult.PornText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.PornResult.PornVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.QrcodeResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.QrcodeResult.QrcodeImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.QrcodeResult.QrcodeVideo;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.SpamResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.SpamResult.SpamAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.SpamResult.SpamOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.SpamResult.SpamText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult.TerrorismAudio;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult.TerrorismImage;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult.TerrorismOcr;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult.TerrorismText;
import com.aliyuncs.mts.model.v20140618.QueryMCJobListResponse.Job.Result.TerrorismResult.TerrorismVideo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMCJobListResponseUnmarshaller {

	public static QueryMCJobListResponse unmarshall(QueryMCJobListResponse queryMCJobListResponse, UnmarshallerContext _ctx) {
		
		queryMCJobListResponse.setRequestId(_ctx.stringValue("QueryMCJobListResponse.RequestId"));
		queryMCJobListResponse.setNextPageToken(_ctx.stringValue("QueryMCJobListResponse.NextPageToken"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMCJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryMCJobListResponse.NonExistIds["+ i +"]"));
		}
		queryMCJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryMCJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setCreationTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].CreationTime"));
			job.setResultOutputFile(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].ResultOutputFile"));
			job.setState(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].State"));
			job.setJobId(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].JobId"));
			job.setUserData(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].UserData"));
			job.setCode(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Message"));
			job.setPipelineId(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].PipelineId"));

			Result result = new Result();
			result.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.Suggestion"));
			result.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.Score"));

			PornResult pornResult = new PornResult();

			List<PornText> pornTexts = new ArrayList<PornText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornTexts.Length"); j++) {
				PornText pornText = new PornText();
				pornText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornTexts["+ j +"].Suggestion"));
				pornText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornTexts["+ j +"].Score"));
				pornText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornTexts["+ j +"].Text"));

				pornTexts.add(pornText);
			}
			pornResult.setPornTexts(pornTexts);

			List<PornVideo> pornVideos = new ArrayList<PornVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornVideos.Length"); j++) {
				PornVideo pornVideo = new PornVideo();
				pornVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornVideos["+ j +"].Time"));
				pornVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornVideos["+ j +"].Suggestion"));
				pornVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornVideos["+ j +"].Score"));
				pornVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornVideos["+ j +"].Object"));

				pornVideos.add(pornVideo);
			}
			pornResult.setPornVideos(pornVideos);

			List<PornAudio> pornAudios = new ArrayList<PornAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios.Length"); j++) {
				PornAudio pornAudio = new PornAudio();
				pornAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].EndTime"));
				pornAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].StartTime"));
				pornAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].Suggestion"));
				pornAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].Score"));
				pornAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].Text"));
				pornAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornAudios["+ j +"].Object"));

				pornAudios.add(pornAudio);
			}
			pornResult.setPornAudios(pornAudios);

			List<PornImage> pornImages = new ArrayList<PornImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornImages.Length"); j++) {
				PornImage pornImage = new PornImage();
				pornImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornImages["+ j +"].Suggestion"));
				pornImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornImages["+ j +"].Score"));
				pornImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornImages["+ j +"].Url"));
				pornImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornImages["+ j +"].Text"));

				pornImages.add(pornImage);
			}
			pornResult.setPornImages(pornImages);

			List<PornOcr> pornOcrs = new ArrayList<PornOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs.Length"); j++) {
				PornOcr pornOcr = new PornOcr();
				pornOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs["+ j +"].Time"));
				pornOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs["+ j +"].Suggestion"));
				pornOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs["+ j +"].Score"));
				pornOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs["+ j +"].Text"));
				pornOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PornResult.PornOcrs["+ j +"].Object"));

				pornOcrs.add(pornOcr);
			}
			pornResult.setPornOcrs(pornOcrs);
			result.setPornResult(pornResult);

			AdResult adResult = new AdResult();

			List<AdOcr> adOcrs = new ArrayList<AdOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs.Length"); j++) {
				AdOcr adOcr = new AdOcr();
				adOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs["+ j +"].Time"));
				adOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs["+ j +"].Suggestion"));
				adOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs["+ j +"].Score"));
				adOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs["+ j +"].Text"));
				adOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdOcrs["+ j +"].Object"));

				adOcrs.add(adOcr);
			}
			adResult.setAdOcrs(adOcrs);

			List<AdText> adTexts = new ArrayList<AdText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdTexts.Length"); j++) {
				AdText adText = new AdText();
				adText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdTexts["+ j +"].Suggestion"));
				adText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdTexts["+ j +"].Score"));
				adText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdTexts["+ j +"].Text"));

				adTexts.add(adText);
			}
			adResult.setAdTexts(adTexts);

			List<AdImage> adImages = new ArrayList<AdImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdImages.Length"); j++) {
				AdImage adImage = new AdImage();
				adImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdImages["+ j +"].Suggestion"));
				adImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdImages["+ j +"].Score"));
				adImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdImages["+ j +"].Url"));
				adImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdImages["+ j +"].Text"));

				adImages.add(adImage);
			}
			adResult.setAdImages(adImages);

			List<AdAudio> adAudios = new ArrayList<AdAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios.Length"); j++) {
				AdAudio adAudio = new AdAudio();
				adAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].EndTime"));
				adAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].StartTime"));
				adAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].Suggestion"));
				adAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].Score"));
				adAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].Text"));
				adAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdAudios["+ j +"].Object"));

				adAudios.add(adAudio);
			}
			adResult.setAdAudios(adAudios);

			List<AdVideo> adVideos = new ArrayList<AdVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdVideos.Length"); j++) {
				AdVideo adVideo = new AdVideo();
				adVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdVideos["+ j +"].Time"));
				adVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdVideos["+ j +"].Suggestion"));
				adVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdVideos["+ j +"].Score"));
				adVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AdResult.AdVideos["+ j +"].Object"));

				adVideos.add(adVideo);
			}
			adResult.setAdVideos(adVideos);
			result.setAdResult(adResult);

			LogoResult logoResult = new LogoResult();

			List<LogoImage> logoImages = new ArrayList<LogoImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoImages.Length"); j++) {
				LogoImage logoImage = new LogoImage();
				logoImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoImages["+ j +"].Suggestion"));
				logoImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoImages["+ j +"].Score"));
				logoImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoImages["+ j +"].Url"));
				logoImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoImages["+ j +"].Text"));

				logoImages.add(logoImage);
			}
			logoResult.setLogoImages(logoImages);

			List<LogoVideo> logoVideos = new ArrayList<LogoVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoVideos.Length"); j++) {
				LogoVideo logoVideo = new LogoVideo();
				logoVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoVideos["+ j +"].Time"));
				logoVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoVideos["+ j +"].Suggestion"));
				logoVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoVideos["+ j +"].Score"));
				logoVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LogoResult.LogoVideos["+ j +"].Object"));

				logoVideos.add(logoVideo);
			}
			logoResult.setLogoVideos(logoVideos);
			result.setLogoResult(logoResult);

			QrcodeResult qrcodeResult = new QrcodeResult();

			List<QrcodeImage> qrcodeImages = new ArrayList<QrcodeImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeImages.Length"); j++) {
				QrcodeImage qrcodeImage = new QrcodeImage();
				qrcodeImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeImages["+ j +"].Suggestion"));
				qrcodeImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeImages["+ j +"].Score"));
				qrcodeImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeImages["+ j +"].Url"));
				qrcodeImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeImages["+ j +"].Text"));

				qrcodeImages.add(qrcodeImage);
			}
			qrcodeResult.setQrcodeImages(qrcodeImages);

			List<QrcodeVideo> qrcodeVideos = new ArrayList<QrcodeVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeVideos.Length"); j++) {
				QrcodeVideo qrcodeVideo = new QrcodeVideo();
				qrcodeVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeVideos["+ j +"].Time"));
				qrcodeVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeVideos["+ j +"].Suggestion"));
				qrcodeVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeVideos["+ j +"].Score"));
				qrcodeVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.QrcodeResult.QrcodeVideos["+ j +"].Object"));

				qrcodeVideos.add(qrcodeVideo);
			}
			qrcodeResult.setQrcodeVideos(qrcodeVideos);
			result.setQrcodeResult(qrcodeResult);

			PoliticsResult politicsResult = new PoliticsResult();

			List<PoliticsOcr> politicsOcrs = new ArrayList<PoliticsOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs.Length"); j++) {
				PoliticsOcr politicsOcr = new PoliticsOcr();
				politicsOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs["+ j +"].Time"));
				politicsOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs["+ j +"].Suggestion"));
				politicsOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs["+ j +"].Score"));
				politicsOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs["+ j +"].Text"));
				politicsOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsOcrs["+ j +"].Object"));

				politicsOcrs.add(politicsOcr);
			}
			politicsResult.setPoliticsOcrs(politicsOcrs);

			List<PoliticsVideo> politicsVideos = new ArrayList<PoliticsVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsVideos.Length"); j++) {
				PoliticsVideo politicsVideo = new PoliticsVideo();
				politicsVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsVideos["+ j +"].Time"));
				politicsVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsVideos["+ j +"].Suggestion"));
				politicsVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsVideos["+ j +"].Score"));
				politicsVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsVideos["+ j +"].Object"));

				politicsVideos.add(politicsVideo);
			}
			politicsResult.setPoliticsVideos(politicsVideos);

			List<PoliticsImage> politicsImages = new ArrayList<PoliticsImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsImages.Length"); j++) {
				PoliticsImage politicsImage = new PoliticsImage();
				politicsImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsImages["+ j +"].Suggestion"));
				politicsImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsImages["+ j +"].Score"));
				politicsImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsImages["+ j +"].Url"));
				politicsImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsImages["+ j +"].Text"));

				politicsImages.add(politicsImage);
			}
			politicsResult.setPoliticsImages(politicsImages);

			List<PoliticsText> politicsTexts = new ArrayList<PoliticsText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsTexts.Length"); j++) {
				PoliticsText politicsText = new PoliticsText();
				politicsText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsTexts["+ j +"].Suggestion"));
				politicsText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsTexts["+ j +"].Score"));
				politicsText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsTexts["+ j +"].Text"));

				politicsTexts.add(politicsText);
			}
			politicsResult.setPoliticsTexts(politicsTexts);

			List<PoliticsAudio> politicsAudios = new ArrayList<PoliticsAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios.Length"); j++) {
				PoliticsAudio politicsAudio = new PoliticsAudio();
				politicsAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].EndTime"));
				politicsAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].StartTime"));
				politicsAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].Suggestion"));
				politicsAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].Score"));
				politicsAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].Text"));
				politicsAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.PoliticsResult.PoliticsAudios["+ j +"].Object"));

				politicsAudios.add(politicsAudio);
			}
			politicsResult.setPoliticsAudios(politicsAudios);
			result.setPoliticsResult(politicsResult);

			LiveResult liveResult = new LiveResult();

			List<LiveImage> liveImages = new ArrayList<LiveImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveImages.Length"); j++) {
				LiveImage liveImage = new LiveImage();
				liveImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveImages["+ j +"].Suggestion"));
				liveImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveImages["+ j +"].Score"));
				liveImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveImages["+ j +"].Url"));
				liveImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveImages["+ j +"].Text"));

				liveImages.add(liveImage);
			}
			liveResult.setLiveImages(liveImages);

			List<LiveVideo> liveVideos = new ArrayList<LiveVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveVideos.Length"); j++) {
				LiveVideo liveVideo = new LiveVideo();
				liveVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveVideos["+ j +"].Time"));
				liveVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveVideos["+ j +"].Suggestion"));
				liveVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveVideos["+ j +"].Score"));
				liveVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.LiveResult.LiveVideos["+ j +"].Object"));

				liveVideos.add(liveVideo);
			}
			liveResult.setLiveVideos(liveVideos);
			result.setLiveResult(liveResult);

			AbuseResult abuseResult = new AbuseResult();

			List<AbuseOcr> abuseOcrs = new ArrayList<AbuseOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs.Length"); j++) {
				AbuseOcr abuseOcr = new AbuseOcr();
				abuseOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs["+ j +"].Time"));
				abuseOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs["+ j +"].Suggestion"));
				abuseOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs["+ j +"].Score"));
				abuseOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs["+ j +"].Text"));
				abuseOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseOcrs["+ j +"].Object"));

				abuseOcrs.add(abuseOcr);
			}
			abuseResult.setAbuseOcrs(abuseOcrs);

			List<AbuseAudio> abuseAudios = new ArrayList<AbuseAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios.Length"); j++) {
				AbuseAudio abuseAudio = new AbuseAudio();
				abuseAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].EndTime"));
				abuseAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].StartTime"));
				abuseAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].Suggestion"));
				abuseAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].Score"));
				abuseAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].Text"));
				abuseAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseAudios["+ j +"].Object"));

				abuseAudios.add(abuseAudio);
			}
			abuseResult.setAbuseAudios(abuseAudios);

			List<AbuseText> abuseTexts = new ArrayList<AbuseText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseTexts.Length"); j++) {
				AbuseText abuseText = new AbuseText();
				abuseText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseTexts["+ j +"].Suggestion"));
				abuseText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseTexts["+ j +"].Score"));
				abuseText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.AbuseResult.AbuseTexts["+ j +"].Text"));

				abuseTexts.add(abuseText);
			}
			abuseResult.setAbuseTexts(abuseTexts);
			result.setAbuseResult(abuseResult);

			SpamResult spamResult = new SpamResult();

			List<SpamText> spamTexts = new ArrayList<SpamText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamTexts.Length"); j++) {
				SpamText spamText = new SpamText();
				spamText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamTexts["+ j +"].Suggestion"));
				spamText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamTexts["+ j +"].Score"));
				spamText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamTexts["+ j +"].Text"));

				spamTexts.add(spamText);
			}
			spamResult.setSpamTexts(spamTexts);

			List<SpamAudio> spamAudios = new ArrayList<SpamAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios.Length"); j++) {
				SpamAudio spamAudio = new SpamAudio();
				spamAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].EndTime"));
				spamAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].StartTime"));
				spamAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].Suggestion"));
				spamAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].Score"));
				spamAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].Text"));
				spamAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamAudios["+ j +"].Object"));

				spamAudios.add(spamAudio);
			}
			spamResult.setSpamAudios(spamAudios);

			List<SpamOcr> spamOcrs = new ArrayList<SpamOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs.Length"); j++) {
				SpamOcr spamOcr = new SpamOcr();
				spamOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs["+ j +"].Time"));
				spamOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs["+ j +"].Suggestion"));
				spamOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs["+ j +"].Score"));
				spamOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs["+ j +"].Text"));
				spamOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.SpamResult.SpamOcrs["+ j +"].Object"));

				spamOcrs.add(spamOcr);
			}
			spamResult.setSpamOcrs(spamOcrs);
			result.setSpamResult(spamResult);

			ContrabandResult contrabandResult = new ContrabandResult();

			List<ContrabandAudio> contrabandAudios = new ArrayList<ContrabandAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios.Length"); j++) {
				ContrabandAudio contrabandAudio = new ContrabandAudio();
				contrabandAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].EndTime"));
				contrabandAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].StartTime"));
				contrabandAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].Suggestion"));
				contrabandAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].Score"));
				contrabandAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].Text"));
				contrabandAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandAudios["+ j +"].Object"));

				contrabandAudios.add(contrabandAudio);
			}
			contrabandResult.setContrabandAudios(contrabandAudios);

			List<ContrabandOcr> contrabandOcrs = new ArrayList<ContrabandOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs.Length"); j++) {
				ContrabandOcr contrabandOcr = new ContrabandOcr();
				contrabandOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs["+ j +"].Time"));
				contrabandOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs["+ j +"].Suggestion"));
				contrabandOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs["+ j +"].Score"));
				contrabandOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs["+ j +"].Text"));
				contrabandOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandOcrs["+ j +"].Object"));

				contrabandOcrs.add(contrabandOcr);
			}
			contrabandResult.setContrabandOcrs(contrabandOcrs);

			List<ContrabandText> contrabandTexts = new ArrayList<ContrabandText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandTexts.Length"); j++) {
				ContrabandText contrabandText = new ContrabandText();
				contrabandText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandTexts["+ j +"].Suggestion"));
				contrabandText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandTexts["+ j +"].Score"));
				contrabandText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.ContrabandResult.ContrabandTexts["+ j +"].Text"));

				contrabandTexts.add(contrabandText);
			}
			contrabandResult.setContrabandTexts(contrabandTexts);
			result.setContrabandResult(contrabandResult);

			TerrorismResult terrorismResult = new TerrorismResult();

			List<TerrorismOcr> terrorismOcrs = new ArrayList<TerrorismOcr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs.Length"); j++) {
				TerrorismOcr terrorismOcr = new TerrorismOcr();
				terrorismOcr.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs["+ j +"].Time"));
				terrorismOcr.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs["+ j +"].Suggestion"));
				terrorismOcr.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs["+ j +"].Score"));
				terrorismOcr.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs["+ j +"].Text"));
				terrorismOcr.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismOcrs["+ j +"].Object"));

				terrorismOcrs.add(terrorismOcr);
			}
			terrorismResult.setTerrorismOcrs(terrorismOcrs);

			List<TerrorismAudio> terrorismAudios = new ArrayList<TerrorismAudio>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios.Length"); j++) {
				TerrorismAudio terrorismAudio = new TerrorismAudio();
				terrorismAudio.setEndTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].EndTime"));
				terrorismAudio.setStartTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].StartTime"));
				terrorismAudio.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].Suggestion"));
				terrorismAudio.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].Score"));
				terrorismAudio.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].Text"));
				terrorismAudio.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismAudios["+ j +"].Object"));

				terrorismAudios.add(terrorismAudio);
			}
			terrorismResult.setTerrorismAudios(terrorismAudios);

			List<TerrorismVideo> terrorismVideos = new ArrayList<TerrorismVideo>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismVideos.Length"); j++) {
				TerrorismVideo terrorismVideo = new TerrorismVideo();
				terrorismVideo.setTime(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismVideos["+ j +"].Time"));
				terrorismVideo.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismVideos["+ j +"].Suggestion"));
				terrorismVideo.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismVideos["+ j +"].Score"));
				terrorismVideo.setObject(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismVideos["+ j +"].Object"));

				terrorismVideos.add(terrorismVideo);
			}
			terrorismResult.setTerrorismVideos(terrorismVideos);

			List<TerrorismText> terrorismTexts = new ArrayList<TerrorismText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismTexts.Length"); j++) {
				TerrorismText terrorismText = new TerrorismText();
				terrorismText.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismTexts["+ j +"].Suggestion"));
				terrorismText.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismTexts["+ j +"].Score"));
				terrorismText.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismTexts["+ j +"].Text"));

				terrorismTexts.add(terrorismText);
			}
			terrorismResult.setTerrorismTexts(terrorismTexts);

			List<TerrorismImage> terrorismImages = new ArrayList<TerrorismImage>();
			for (int j = 0; j < _ctx.lengthValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismImages.Length"); j++) {
				TerrorismImage terrorismImage = new TerrorismImage();
				terrorismImage.setSuggestion(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismImages["+ j +"].Suggestion"));
				terrorismImage.setScore(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismImages["+ j +"].Score"));
				terrorismImage.setUrl(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismImages["+ j +"].Url"));
				terrorismImage.setText(_ctx.stringValue("QueryMCJobListResponse.JobList["+ i +"].Result.TerrorismResult.TerrorismImages["+ j +"].Text"));

				terrorismImages.add(terrorismImage);
			}
			terrorismResult.setTerrorismImages(terrorismImages);
			result.setTerrorismResult(terrorismResult);
			job.setResult(result);

			jobList.add(job);
		}
		queryMCJobListResponse.setJobList(jobList);
	 
	 	return queryMCJobListResponse;
	}
}