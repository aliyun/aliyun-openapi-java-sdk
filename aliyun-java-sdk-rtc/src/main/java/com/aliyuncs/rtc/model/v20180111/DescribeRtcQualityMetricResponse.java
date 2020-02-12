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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcQualityMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcQualityMetricResponse extends AcsResponse {

	private String requestId;

	private QualityMetric qualityMetric;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QualityMetric getQualityMetric() {
		return this.qualityMetric;
	}

	public void setQualityMetric(QualityMetric qualityMetric) {
		this.qualityMetric = qualityMetric;
	}

	public static class QualityMetric {

		private SubInfo subInfo;

		private PubInfo pubInfo;

		public SubInfo getSubInfo() {
			return this.subInfo;
		}

		public void setSubInfo(SubInfo subInfo) {
			this.subInfo = subInfo;
		}

		public PubInfo getPubInfo() {
			return this.pubInfo;
		}

		public void setPubInfo(PubInfo pubInfo) {
			this.pubInfo = pubInfo;
		}

		public static class SubInfo {

			private List<DataItem> data;

			private List<EventsItem> events;

			private User user;

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public List<EventsItem> getEvents() {
				return this.events;
			}

			public void setEvents(List<EventsItem> events) {
				this.events = events;
			}

			public User getUser() {
				return this.user;
			}

			public void setUser(User user) {
				this.user = user;
			}

			public static class DataItem {

				private String time;

				private Fps fps;

				private Resolution resolution;

				private BitRate bitRate;

				private Network network;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public Fps getFps() {
					return this.fps;
				}

				public void setFps(Fps fps) {
					this.fps = fps;
				}

				public Resolution getResolution() {
					return this.resolution;
				}

				public void setResolution(Resolution resolution) {
					this.resolution = resolution;
				}

				public BitRate getBitRate() {
					return this.bitRate;
				}

				public void setBitRate(BitRate bitRate) {
					this.bitRate = bitRate;
				}

				public Network getNetwork() {
					return this.network;
				}

				public void setNetwork(Network network) {
					this.network = network;
				}

				public static class Fps {

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class Resolution {

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class BitRate {

					private Long audio;

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getAudio() {
						return this.audio;
					}

					public void setAudio(Long audio) {
						this.audio = audio;
					}

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class Network {

					private Float loss;

					private Long rtt;

					public Float getLoss() {
						return this.loss;
					}

					public void setLoss(Float loss) {
						this.loss = loss;
					}

					public Long getRtt() {
						return this.rtt;
					}

					public void setRtt(Long rtt) {
						this.rtt = rtt;
					}
				}
			}

			public static class EventsItem {

				private String time;

				private Long eventId;

				private String name;

				private String category;

				private String result;

				private String description;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public Long getEventId() {
					return this.eventId;
				}

				public void setEventId(Long eventId) {
					this.eventId = eventId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}

			public static class User {

				private String userId;

				private String sDKVersion;

				private String oS;

				private String province;

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getSDKVersion() {
					return this.sDKVersion;
				}

				public void setSDKVersion(String sDKVersion) {
					this.sDKVersion = sDKVersion;
				}

				public String getOS() {
					return this.oS;
				}

				public void setOS(String oS) {
					this.oS = oS;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}
			}
		}

		public static class PubInfo {

			private List<DataItem4> data2;

			private List<EventsItem9> events3;

			private User1 user1;

			public List<DataItem4> getData2() {
				return this.data2;
			}

			public void setData2(List<DataItem4> data2) {
				this.data2 = data2;
			}

			public List<EventsItem9> getEvents3() {
				return this.events3;
			}

			public void setEvents3(List<EventsItem9> events3) {
				this.events3 = events3;
			}

			public User1 getUser1() {
				return this.user1;
			}

			public void setUser1(User1 user1) {
				this.user1 = user1;
			}

			public static class DataItem4 {

				private String time;

				private Fps5 fps5;

				private Resolution6 resolution6;

				private BitRate7 bitRate7;

				private Network8 network8;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public Fps5 getFps5() {
					return this.fps5;
				}

				public void setFps5(Fps5 fps5) {
					this.fps5 = fps5;
				}

				public Resolution6 getResolution6() {
					return this.resolution6;
				}

				public void setResolution6(Resolution6 resolution6) {
					this.resolution6 = resolution6;
				}

				public BitRate7 getBitRate7() {
					return this.bitRate7;
				}

				public void setBitRate7(BitRate7 bitRate7) {
					this.bitRate7 = bitRate7;
				}

				public Network8 getNetwork8() {
					return this.network8;
				}

				public void setNetwork8(Network8 network8) {
					this.network8 = network8;
				}

				public static class Fps5 {

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class Resolution6 {

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class BitRate7 {

					private Long audio;

					private Long small;

					private Long large;

					private Long _super;

					private Long share;

					public Long getAudio() {
						return this.audio;
					}

					public void setAudio(Long audio) {
						this.audio = audio;
					}

					public Long getSmall() {
						return this.small;
					}

					public void setSmall(Long small) {
						this.small = small;
					}

					public Long getLarge() {
						return this.large;
					}

					public void setLarge(Long large) {
						this.large = large;
					}

					public Long get_Super() {
						return this._super;
					}

					public void set_Super(Long _super) {
						this._super = _super;
					}

					public Long getShare() {
						return this.share;
					}

					public void setShare(Long share) {
						this.share = share;
					}
				}

				public static class Network8 {

					private Float loss;

					private Long rtt;

					public Float getLoss() {
						return this.loss;
					}

					public void setLoss(Float loss) {
						this.loss = loss;
					}

					public Long getRtt() {
						return this.rtt;
					}

					public void setRtt(Long rtt) {
						this.rtt = rtt;
					}
				}
			}

			public static class EventsItem9 {

				private String time;

				private Long eventId;

				private String name;

				private String category;

				private String result;

				private String description;

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}

				public Long getEventId() {
					return this.eventId;
				}

				public void setEventId(Long eventId) {
					this.eventId = eventId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}

			public static class User1 {

				private String userId;

				private String sDKVersion;

				private String oS;

				private String province;

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getSDKVersion() {
					return this.sDKVersion;
				}

				public void setSDKVersion(String sDKVersion) {
					this.sDKVersion = sDKVersion;
				}

				public String getOS() {
					return this.oS;
				}

				public void setOS(String oS) {
					this.oS = oS;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}
			}
		}
	}

	@Override
	public DescribeRtcQualityMetricResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcQualityMetricResponseUnmarshaller.unmarshall(this, context);
	}
}
