/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterLayoutsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterLayoutsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<Layout> layouts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Layout> getLayouts() {
		return this.layouts;
	}

	public void setLayouts(List<Layout> layouts) {
		this.layouts = layouts;
	}

	public static class Layout {

		private String layoutId;

		private List<VideoLayer> videoLayers;

		private List<AudioLayer> audioLayers;

		private List<String> blendList;

		private List<String> mixList;

		public String getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(String layoutId) {
			this.layoutId = layoutId;
		}

		public List<VideoLayer> getVideoLayers() {
			return this.videoLayers;
		}

		public void setVideoLayers(List<VideoLayer> videoLayers) {
			this.videoLayers = videoLayers;
		}

		public List<AudioLayer> getAudioLayers() {
			return this.audioLayers;
		}

		public void setAudioLayers(List<AudioLayer> audioLayers) {
			this.audioLayers = audioLayers;
		}

		public List<String> getBlendList() {
			return this.blendList;
		}

		public void setBlendList(List<String> blendList) {
			this.blendList = blendList;
		}

		public List<String> getMixList() {
			return this.mixList;
		}

		public void setMixList(List<String> mixList) {
			this.mixList = mixList;
		}

		public static class VideoLayer {

			private Float heightNormalized;

			private Float widthNormalized;

			private String positionRefer;

			private List<String> positionNormalizeds;

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

			public Float getWidthNormalized() {
				return this.widthNormalized;
			}

			public void setWidthNormalized(Float widthNormalized) {
				this.widthNormalized = widthNormalized;
			}

			public String getPositionRefer() {
				return this.positionRefer;
			}

			public void setPositionRefer(String positionRefer) {
				this.positionRefer = positionRefer;
			}

			public List<String> getPositionNormalizeds() {
				return this.positionNormalizeds;
			}

			public void setPositionNormalizeds(List<String> positionNormalizeds) {
				this.positionNormalizeds = positionNormalizeds;
			}
		}

		public static class AudioLayer {

			private Float volumeRate;

			private String validChannel;

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
		}
	}

	@Override
	public DescribeCasterLayoutsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterLayoutsResponseUnmarshaller.unmarshall(this, context);
	}
}
