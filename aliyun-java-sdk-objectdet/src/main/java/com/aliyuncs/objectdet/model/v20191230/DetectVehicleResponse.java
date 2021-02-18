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

package com.aliyuncs.objectdet.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.objectdet.transform.v20191230.DetectVehicleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectVehicleResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer height;

		private Integer width;

		private List<DetectObjectInfo> detectObjectInfoList;

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public List<DetectObjectInfo> getDetectObjectInfoList() {
			return this.detectObjectInfoList;
		}

		public void setDetectObjectInfoList(List<DetectObjectInfo> detectObjectInfoList) {
			this.detectObjectInfoList = detectObjectInfoList;
		}

		public static class DetectObjectInfo {

			private Float score;

			private String type;

			private Integer id;

			private List<Integer> boxes;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public List<Integer> getBoxes() {
				return this.boxes;
			}

			public void setBoxes(List<Integer> boxes) {
				this.boxes = boxes;
			}
		}
	}

	@Override
	public DetectVehicleResponse getInstance(UnmarshallerContext context) {
		return	DetectVehicleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
