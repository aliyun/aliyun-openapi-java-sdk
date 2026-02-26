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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushStoreSpeechDataRequest extends RoaAcsRequest<PushStoreSpeechDataResponse> {
	   

	private String country;

	private String storeId;

	@SerializedName("speech")
	private List<Speech> speech;
	public PushStoreSpeechDataRequest() {
		super("cd", "2021-12-7", "PushStoreSpeechData");
		setUriPattern("/PushStoreSpeechData");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("country", country);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public List<Speech> getSpeech() {
		return this.speech;
	}

	public void setSpeech(List<Speech> speech) {
		this.speech = speech;	
		if (speech != null) {
			putBodyParameter("Speech" , new Gson().toJson(speech));
		}	
	}

	public static class Speech {

		@SerializedName("Voice")
		private String voice;

		@SerializedName("Volume")
		private Integer volume;

		@SerializedName("Speech")
		private Boolean speech;

		@SerializedName("Contents")
		private List<ContentsItem> contents;

		@SerializedName("Type")
		private String type;

		@SerializedName("Speed")
		private String speed;

		public String getVoice() {
			return this.voice;
		}

		public void setVoice(String voice) {
			this.voice = voice;
		}

		public Integer getVolume() {
			return this.volume;
		}

		public void setVolume(Integer volume) {
			this.volume = volume;
		}

		public Boolean getSpeech() {
			return this.speech;
		}

		public void setSpeech(Boolean speech) {
			this.speech = speech;
		}

		public List<ContentsItem> getContents() {
			return this.contents;
		}

		public void setContents(List<ContentsItem> contents) {
			this.contents = contents;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public static class ContentsItem {

			@SerializedName("Placeholder")
			private String placeholder;

			@SerializedName("Content")
			private String content;

			public String getPlaceholder() {
				return this.placeholder;
			}

			public void setPlaceholder(String placeholder) {
				this.placeholder = placeholder;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public Class<PushStoreSpeechDataResponse> getResponseClass() {
		return PushStoreSpeechDataResponse.class;
	}

}
