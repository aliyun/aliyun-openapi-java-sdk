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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageenhan.transform.v20190930.ChangeImageSizeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChangeImageSizeResponse extends AcsResponse {

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

		private String url;

		private RetainLocation retainLocation;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public RetainLocation getRetainLocation() {
			return this.retainLocation;
		}

		public void setRetainLocation(RetainLocation retainLocation) {
			this.retainLocation = retainLocation;
		}

		public static class RetainLocation {

			private Integer x;

			private Integer y;

			private Integer width;

			private Integer height;

			public Integer getX() {
				return this.x;
			}

			public void setX(Integer x) {
				this.x = x;
			}

			public Integer getY() {
				return this.y;
			}

			public void setY(Integer y) {
				this.y = y;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}
		}
	}

	@Override
	public ChangeImageSizeResponse getInstance(UnmarshallerContext context) {
		return	ChangeImageSizeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
