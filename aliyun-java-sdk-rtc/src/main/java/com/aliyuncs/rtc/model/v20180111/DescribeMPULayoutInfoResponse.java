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
import com.aliyuncs.rtc.transform.v20180111.DescribeMPULayoutInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMPULayoutInfoResponse extends AcsResponse {

	private String requestId;

	private Layout layout;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Layout getLayout() {
		return this.layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public static class Layout {

		private Long layoutId;

		private Integer audioMixCount;

		private List<PanesItem> panes;

		public Long getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(Long layoutId) {
			this.layoutId = layoutId;
		}

		public Integer getAudioMixCount() {
			return this.audioMixCount;
		}

		public void setAudioMixCount(Integer audioMixCount) {
			this.audioMixCount = audioMixCount;
		}

		public List<PanesItem> getPanes() {
			return this.panes;
		}

		public void setPanes(List<PanesItem> panes) {
			this.panes = panes;
		}

		public static class PanesItem {

			private Integer paneId;

			private Integer majorPane;

			private Float x;

			private Float y;

			private Float width;

			private Float height;

			private Integer zOrder;

			public Integer getPaneId() {
				return this.paneId;
			}

			public void setPaneId(Integer paneId) {
				this.paneId = paneId;
			}

			public Integer getMajorPane() {
				return this.majorPane;
			}

			public void setMajorPane(Integer majorPane) {
				this.majorPane = majorPane;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}
	}

	@Override
	public DescribeMPULayoutInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMPULayoutInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
