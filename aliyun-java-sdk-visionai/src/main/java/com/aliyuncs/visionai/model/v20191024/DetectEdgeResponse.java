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

package com.aliyuncs.visionai.model.v20191024;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.visionai.transform.v20191024.DetectEdgeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectEdgeResponse extends AcsResponse {

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

		private String objHeight;

		private String objWidth;

		private String imgWidth;

		private String top;

		private String left;

		private String imgHeight;

		public String getObjHeight() {
			return this.objHeight;
		}

		public void setObjHeight(String objHeight) {
			this.objHeight = objHeight;
		}

		public String getObjWidth() {
			return this.objWidth;
		}

		public void setObjWidth(String objWidth) {
			this.objWidth = objWidth;
		}

		public String getImgWidth() {
			return this.imgWidth;
		}

		public void setImgWidth(String imgWidth) {
			this.imgWidth = imgWidth;
		}

		public String getTop() {
			return this.top;
		}

		public void setTop(String top) {
			this.top = top;
		}

		public String getLeft() {
			return this.left;
		}

		public void setLeft(String left) {
			this.left = left;
		}

		public String getImgHeight() {
			return this.imgHeight;
		}

		public void setImgHeight(String imgHeight) {
			this.imgHeight = imgHeight;
		}
	}

	@Override
	public DetectEdgeResponse getInstance(UnmarshallerContext context) {
		return	DetectEdgeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
