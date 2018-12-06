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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterSceneAudioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterSceneAudioResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private Integer followEnable;

	private List<AudioLayer> audioLayers;

	private List<String> mixList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public Integer getFollowEnable() {
		return this.followEnable;
	}

	public void setFollowEnable(Integer followEnable) {
		this.followEnable = followEnable;
	}

	public List<AudioLayer> getAudioLayers() {
		return this.audioLayers;
	}

	public void setAudioLayers(List<AudioLayer> audioLayers) {
		this.audioLayers = audioLayers;
	}

	public List<String> getMixList() {
		return this.mixList;
	}

	public void setMixList(List<String> mixList) {
		this.mixList = mixList;
	}

	public static class AudioLayer {

		private Float volumeRate;

		private String validChannel;

		private Integer fixedDelayDuration;

		public Float getVolumeRate() {
			return this.volumeRate;
		}

		public void setVolumeRate(Float volumeRate) {
			this.volumeRate = volumeRate;
		}

		public String getValidChannel() {
			return this.validChannel;
		}

		public void setValidChannel(String validChannel) {
			this.validChannel = validChannel;
		}

		public Integer getFixedDelayDuration() {
			return this.fixedDelayDuration;
		}

		public void setFixedDelayDuration(Integer fixedDelayDuration) {
			this.fixedDelayDuration = fixedDelayDuration;
		}
	}

	@Override
	public DescribeCasterSceneAudioResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterSceneAudioResponseUnmarshaller.unmarshall(this, context);
	}
}
