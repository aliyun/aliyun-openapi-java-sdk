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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryMCJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMCJobListResponse extends AcsResponse {

	private String requestId;

	private String nextPageToken;

	private List<Job> jobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<Job> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class Job {

		private String jobId;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String message;

		private String creationTime;

		private String resultOutputFile;

		private Result result;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getResultOutputFile() {
			return this.resultOutputFile;
		}

		public void setResultOutputFile(String resultOutputFile) {
			this.resultOutputFile = resultOutputFile;
		}

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

			private String suggestion;

			private String score;

			private PornResult pornResult;

			private TerrorismResult terrorismResult;

			private PoliticsResult politicsResult;

			private AdResult adResult;

			private QrcodeResult qrcodeResult;

			private LiveResult liveResult;

			private LogoResult logoResult;

			private AbuseResult abuseResult;

			private ContrabandResult contrabandResult;

			private SpamResult spamResult;

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public PornResult getPornResult() {
				return this.pornResult;
			}

			public void setPornResult(PornResult pornResult) {
				this.pornResult = pornResult;
			}

			public TerrorismResult getTerrorismResult() {
				return this.terrorismResult;
			}

			public void setTerrorismResult(TerrorismResult terrorismResult) {
				this.terrorismResult = terrorismResult;
			}

			public PoliticsResult getPoliticsResult() {
				return this.politicsResult;
			}

			public void setPoliticsResult(PoliticsResult politicsResult) {
				this.politicsResult = politicsResult;
			}

			public AdResult getAdResult() {
				return this.adResult;
			}

			public void setAdResult(AdResult adResult) {
				this.adResult = adResult;
			}

			public QrcodeResult getQrcodeResult() {
				return this.qrcodeResult;
			}

			public void setQrcodeResult(QrcodeResult qrcodeResult) {
				this.qrcodeResult = qrcodeResult;
			}

			public LiveResult getLiveResult() {
				return this.liveResult;
			}

			public void setLiveResult(LiveResult liveResult) {
				this.liveResult = liveResult;
			}

			public LogoResult getLogoResult() {
				return this.logoResult;
			}

			public void setLogoResult(LogoResult logoResult) {
				this.logoResult = logoResult;
			}

			public AbuseResult getAbuseResult() {
				return this.abuseResult;
			}

			public void setAbuseResult(AbuseResult abuseResult) {
				this.abuseResult = abuseResult;
			}

			public ContrabandResult getContrabandResult() {
				return this.contrabandResult;
			}

			public void setContrabandResult(ContrabandResult contrabandResult) {
				this.contrabandResult = contrabandResult;
			}

			public SpamResult getSpamResult() {
				return this.spamResult;
			}

			public void setSpamResult(SpamResult spamResult) {
				this.spamResult = spamResult;
			}

			public static class PornResult {

				private List<PornVideo> pornVideos;

				private List<PornAudio> pornAudios;

				private List<PornText> pornTexts;

				private List<PornImage> pornImages;

				private List<PornOcr> pornOcrs;

				public List<PornVideo> getPornVideos() {
					return this.pornVideos;
				}

				public void setPornVideos(List<PornVideo> pornVideos) {
					this.pornVideos = pornVideos;
				}

				public List<PornAudio> getPornAudios() {
					return this.pornAudios;
				}

				public void setPornAudios(List<PornAudio> pornAudios) {
					this.pornAudios = pornAudios;
				}

				public List<PornText> getPornTexts() {
					return this.pornTexts;
				}

				public void setPornTexts(List<PornText> pornTexts) {
					this.pornTexts = pornTexts;
				}

				public List<PornImage> getPornImages() {
					return this.pornImages;
				}

				public void setPornImages(List<PornImage> pornImages) {
					this.pornImages = pornImages;
				}

				public List<PornOcr> getPornOcrs() {
					return this.pornOcrs;
				}

				public void setPornOcrs(List<PornOcr> pornOcrs) {
					this.pornOcrs = pornOcrs;
				}

				public static class PornVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class PornAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class PornText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class PornImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class PornOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class TerrorismResult {

				private List<TerrorismVideo> terrorismVideos;

				private List<TerrorismAudio> terrorismAudios;

				private List<TerrorismText> terrorismTexts;

				private List<TerrorismImage> terrorismImages;

				private List<TerrorismOcr> terrorismOcrs;

				public List<TerrorismVideo> getTerrorismVideos() {
					return this.terrorismVideos;
				}

				public void setTerrorismVideos(List<TerrorismVideo> terrorismVideos) {
					this.terrorismVideos = terrorismVideos;
				}

				public List<TerrorismAudio> getTerrorismAudios() {
					return this.terrorismAudios;
				}

				public void setTerrorismAudios(List<TerrorismAudio> terrorismAudios) {
					this.terrorismAudios = terrorismAudios;
				}

				public List<TerrorismText> getTerrorismTexts() {
					return this.terrorismTexts;
				}

				public void setTerrorismTexts(List<TerrorismText> terrorismTexts) {
					this.terrorismTexts = terrorismTexts;
				}

				public List<TerrorismImage> getTerrorismImages() {
					return this.terrorismImages;
				}

				public void setTerrorismImages(List<TerrorismImage> terrorismImages) {
					this.terrorismImages = terrorismImages;
				}

				public List<TerrorismOcr> getTerrorismOcrs() {
					return this.terrorismOcrs;
				}

				public void setTerrorismOcrs(List<TerrorismOcr> terrorismOcrs) {
					this.terrorismOcrs = terrorismOcrs;
				}

				public static class TerrorismVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class TerrorismAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class TerrorismText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class TerrorismImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class TerrorismOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class PoliticsResult {

				private List<PoliticsVideo> politicsVideos;

				private List<PoliticsAudio> politicsAudios;

				private List<PoliticsText> politicsTexts;

				private List<PoliticsImage> politicsImages;

				private List<PoliticsOcr> politicsOcrs;

				public List<PoliticsVideo> getPoliticsVideos() {
					return this.politicsVideos;
				}

				public void setPoliticsVideos(List<PoliticsVideo> politicsVideos) {
					this.politicsVideos = politicsVideos;
				}

				public List<PoliticsAudio> getPoliticsAudios() {
					return this.politicsAudios;
				}

				public void setPoliticsAudios(List<PoliticsAudio> politicsAudios) {
					this.politicsAudios = politicsAudios;
				}

				public List<PoliticsText> getPoliticsTexts() {
					return this.politicsTexts;
				}

				public void setPoliticsTexts(List<PoliticsText> politicsTexts) {
					this.politicsTexts = politicsTexts;
				}

				public List<PoliticsImage> getPoliticsImages() {
					return this.politicsImages;
				}

				public void setPoliticsImages(List<PoliticsImage> politicsImages) {
					this.politicsImages = politicsImages;
				}

				public List<PoliticsOcr> getPoliticsOcrs() {
					return this.politicsOcrs;
				}

				public void setPoliticsOcrs(List<PoliticsOcr> politicsOcrs) {
					this.politicsOcrs = politicsOcrs;
				}

				public static class PoliticsVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class PoliticsAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class PoliticsText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class PoliticsImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class PoliticsOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class AdResult {

				private List<AdVideo> adVideos;

				private List<AdAudio> adAudios;

				private List<AdText> adTexts;

				private List<AdImage> adImages;

				private List<AdOcr> adOcrs;

				public List<AdVideo> getAdVideos() {
					return this.adVideos;
				}

				public void setAdVideos(List<AdVideo> adVideos) {
					this.adVideos = adVideos;
				}

				public List<AdAudio> getAdAudios() {
					return this.adAudios;
				}

				public void setAdAudios(List<AdAudio> adAudios) {
					this.adAudios = adAudios;
				}

				public List<AdText> getAdTexts() {
					return this.adTexts;
				}

				public void setAdTexts(List<AdText> adTexts) {
					this.adTexts = adTexts;
				}

				public List<AdImage> getAdImages() {
					return this.adImages;
				}

				public void setAdImages(List<AdImage> adImages) {
					this.adImages = adImages;
				}

				public List<AdOcr> getAdOcrs() {
					return this.adOcrs;
				}

				public void setAdOcrs(List<AdOcr> adOcrs) {
					this.adOcrs = adOcrs;
				}

				public static class AdVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class AdAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class AdText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class AdImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class AdOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class QrcodeResult {

				private List<QrcodeVideo> qrcodeVideos;

				private List<QrcodeImage> qrcodeImages;

				public List<QrcodeVideo> getQrcodeVideos() {
					return this.qrcodeVideos;
				}

				public void setQrcodeVideos(List<QrcodeVideo> qrcodeVideos) {
					this.qrcodeVideos = qrcodeVideos;
				}

				public List<QrcodeImage> getQrcodeImages() {
					return this.qrcodeImages;
				}

				public void setQrcodeImages(List<QrcodeImage> qrcodeImages) {
					this.qrcodeImages = qrcodeImages;
				}

				public static class QrcodeVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class QrcodeImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class LiveResult {

				private List<LiveVideo> liveVideos;

				private List<LiveImage> liveImages;

				public List<LiveVideo> getLiveVideos() {
					return this.liveVideos;
				}

				public void setLiveVideos(List<LiveVideo> liveVideos) {
					this.liveVideos = liveVideos;
				}

				public List<LiveImage> getLiveImages() {
					return this.liveImages;
				}

				public void setLiveImages(List<LiveImage> liveImages) {
					this.liveImages = liveImages;
				}

				public static class LiveVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class LiveImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class LogoResult {

				private List<LogoVideo> logoVideos;

				private List<LogoImage> logoImages;

				public List<LogoVideo> getLogoVideos() {
					return this.logoVideos;
				}

				public void setLogoVideos(List<LogoVideo> logoVideos) {
					this.logoVideos = logoVideos;
				}

				public List<LogoImage> getLogoImages() {
					return this.logoImages;
				}

				public void setLogoImages(List<LogoImage> logoImages) {
					this.logoImages = logoImages;
				}

				public static class LogoVideo {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class LogoImage {

					private String suggestion;

					private String score;

					private String url;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getBizUrl() {
						return this.url;
					}

					public void setBizUrl(String url) {
						this.url = url;
					}

					/**
					 * @deprecated use getBizUrl instead of this.
					 */
					@Deprecated
					public String getUrl() {
						return this.url;
					}

					/**
					 * @deprecated use setBizUrl instead of this.
					 */
					@Deprecated
					public void setUrl(String url) {
						this.url = url;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class AbuseResult {

				private List<AbuseAudio> abuseAudios;

				private List<AbuseText> abuseTexts;

				private List<AbuseOcr> abuseOcrs;

				public List<AbuseAudio> getAbuseAudios() {
					return this.abuseAudios;
				}

				public void setAbuseAudios(List<AbuseAudio> abuseAudios) {
					this.abuseAudios = abuseAudios;
				}

				public List<AbuseText> getAbuseTexts() {
					return this.abuseTexts;
				}

				public void setAbuseTexts(List<AbuseText> abuseTexts) {
					this.abuseTexts = abuseTexts;
				}

				public List<AbuseOcr> getAbuseOcrs() {
					return this.abuseOcrs;
				}

				public void setAbuseOcrs(List<AbuseOcr> abuseOcrs) {
					this.abuseOcrs = abuseOcrs;
				}

				public static class AbuseAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class AbuseText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class AbuseOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class ContrabandResult {

				private List<ContrabandAudio> contrabandAudios;

				private List<ContrabandText> contrabandTexts;

				private List<ContrabandOcr> contrabandOcrs;

				public List<ContrabandAudio> getContrabandAudios() {
					return this.contrabandAudios;
				}

				public void setContrabandAudios(List<ContrabandAudio> contrabandAudios) {
					this.contrabandAudios = contrabandAudios;
				}

				public List<ContrabandText> getContrabandTexts() {
					return this.contrabandTexts;
				}

				public void setContrabandTexts(List<ContrabandText> contrabandTexts) {
					this.contrabandTexts = contrabandTexts;
				}

				public List<ContrabandOcr> getContrabandOcrs() {
					return this.contrabandOcrs;
				}

				public void setContrabandOcrs(List<ContrabandOcr> contrabandOcrs) {
					this.contrabandOcrs = contrabandOcrs;
				}

				public static class ContrabandAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class ContrabandText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class ContrabandOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class SpamResult {

				private List<SpamAudio> spamAudios;

				private List<SpamText> spamTexts;

				private List<SpamOcr> spamOcrs;

				public List<SpamAudio> getSpamAudios() {
					return this.spamAudios;
				}

				public void setSpamAudios(List<SpamAudio> spamAudios) {
					this.spamAudios = spamAudios;
				}

				public List<SpamText> getSpamTexts() {
					return this.spamTexts;
				}

				public void setSpamTexts(List<SpamText> spamTexts) {
					this.spamTexts = spamTexts;
				}

				public List<SpamOcr> getSpamOcrs() {
					return this.spamOcrs;
				}

				public void setSpamOcrs(List<SpamOcr> spamOcrs) {
					this.spamOcrs = spamOcrs;
				}

				public static class SpamAudio {

					private String suggestion;

					private String score;

					private String startTime;

					private String endTime;

					private String text;

					private String object;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class SpamText {

					private String suggestion;

					private String score;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}

				public static class SpamOcr {

					private String suggestion;

					private String score;

					private String time;

					private String object;

					private String text;

					public String getSuggestion() {
						return this.suggestion;
					}

					public void setSuggestion(String suggestion) {
						this.suggestion = suggestion;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTime() {
						return this.time;
					}

					public void setTime(String time) {
						this.time = time;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}
		}
	}

	@Override
	public QueryMCJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryMCJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
